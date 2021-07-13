package encapsulamento;

public class ProductConstrutor {

    private String name;
    private double price;
    private int quantity;

    public ProductConstrutor(String name,double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public ProductConstrutor(String name,double price){
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity = this.quantity + quantity;
    }

    public void removeProducts(int quantity){
        this.quantity = this.quantity - quantity;
    }

    public void printData(){
        System.out.println("Product data: ");
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }
}
