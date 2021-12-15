package shop;

public class Product {
    String name;
    int productID;
    String productManufacturer;
    double productPrice;
    int productQuantity;

    public Product(String name, int productID, String productManufacturer, double productPrice, int productQuantity) {
        this.name = name;
        this.productID = productID;
        this.productManufacturer = productManufacturer;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getName (){
        return name;
    }

    public int getProductID () {
        return productID;
    }

    public String getProductManufacturer(){
        return productManufacturer;
    }

    public double getProductPrice(){
        return productPrice;
    }

    public int getProductQuantity(){
        return productQuantity;
    }
}

