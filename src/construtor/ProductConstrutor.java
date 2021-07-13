package construtor;

public class ProductConstrutor {

    public String name;
    public double price;
    public int quantity;

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
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
    }
}
