
package kholspos;

/**
 *
 * @author Kallie
 */
public class Product {
    private String description;
    private double price;
    private String productId;
    private int qty;

    public Product(String description, double price, String productId, int qty){
        this.description = description;
        this.price = price;
        this.productId = productId;
        this.qty = qty;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
}
