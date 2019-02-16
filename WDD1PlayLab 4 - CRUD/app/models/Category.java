package models;
import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


    // Product entity managed by Ebean
    @Entity
    public class Category extends Model {
 
        // Fields
        // Annotate id as primary key
        @Id
        private Long id;
 
        @Constraints.Required
        private String name;
 
        // Category contains many products
        @OneToMany
        private List<ItemOnSale> items;
 
 
    // Default constructor
    public Category() {
    }

    public Category(Long id, String name, List<ItemOnSale> items) {
        this.id = id;
        this.name = name;
        this.items = items;
    }


    //Getters & setters
    public long getId(){
        return this.id;
    }

    public void setId(long newId){
        this.id = newId;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public List<ItemOnSale> getItemList(){
        return this.items;
    }

    public void setItemList(List<ItemOnSale>items){
        this.items = items;
    }


        //Generic query helper for entity Computer with id Long
        public static Finder<Long,Category> find = new Finder<Long,Category>(Category.class);

        //Find all Products in the database
        public static List<Category> findAll() {
        return Category.find.query().where().orderBy("name asc").findList();
        }
    }