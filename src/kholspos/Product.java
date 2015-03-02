
package kholspos;

/**
 *
 * @author Kallie
 */
public class Product {
    private String description;
    private String productId;
    private double price;
    private double discountedPrice;
    private int qty;
    private Discount discountType;

    public Product(String description, double price, String productId, int qty, Discount discountType){
        this.description = description;
        this.price = price;
        this.productId = productId;
        this.qty = qty;
        this.discountType = discountType;
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
    
    public double getDiscountedPrice(){
        discountedPrice = price - discountType.getDiscountAmt();
        return discountedPrice;
    }
    
    @Override
    //Add more to this later!
    public String toString(){
        return "ID " + productId + " Desc " + description + " Price " + price + " You paid " + getDiscountedPrice();
    }
}
