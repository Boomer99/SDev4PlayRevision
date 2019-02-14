package models;

public class ItemOnSale extends Model {
 

    // Properties
    private Long id;
    private String name;
     private String description;
    private int stock;
    private double price;
 
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
        this description = descriptionIn;
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
}
