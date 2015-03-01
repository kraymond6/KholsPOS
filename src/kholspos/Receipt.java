
package kholspos;

/**
 *
 * @author Kallie
 */
public class Receipt {
    private String date;
    private String custId;
    private double total;
    private double tax;
    private double grandTotal;
    private Product[] receiptList;
    
    public Receipt(String date, String custId){
        this.date = date;
        this.custId = custId;
    }
    
    public void addItem(Product item){
        //resize array to one larger and add item
    }
}
