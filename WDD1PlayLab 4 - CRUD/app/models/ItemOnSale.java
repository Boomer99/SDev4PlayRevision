package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

//Define the class as an Object entity for ORM mapping to Ebean
@Entity
public class ItemOnSale extends Model {
 

    // Properties

    @Id //PK
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String description;

    @Constraints.Required
    private int stock;

    @Constraints.Required
    private double price;

    @ManyToOne
    private Category category;

    
    // Default Constructor
    public ItemOnSale() {

    }
 
    // Constructor to initialise object
    public ItemOnSale(Long id, String name, String description, int stock, double price) {
 
        this.id = id;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    //Tells Ebean ORM to use Find method of type Finder
    //to return data from itemOnSale class
    public static final Finder<Long, ItemOnSale> find = new Finder<>(ItemOnSale.class);

    //Using the above Ebean "query", this method tells Ebean
    //to return items in a List format
    public static final List<ItemOnSale> findAll() {
        return ItemOnSale.find.all();
    }
 
    // Accessor methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String descriptionIn){
        this.description = descriptionIn;
    }

    public int getStock(){
        return this.stock;
    }

    public void setStock(int stockIn){
        this.stock = stockIn;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double priceIn){
        this.price = priceIn;
    }

    public Category getCategory(){
        return this.category;
    }

    public void setCategory(Category category){
        this.category = category;
    }
}
