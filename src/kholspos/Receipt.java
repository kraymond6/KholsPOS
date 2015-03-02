
package kholspos;

/**
 *
 * @author Kallie
 */
public class Receipt {
    private String date;
    private String custId;
    private double total = 0;
    private double tax;
    private double grandTotal;
    private Product[] receiptList = new Product[1];
    
    public Receipt(String date, String custId){
        this.date = date;
        this.custId = custId;
    }
    
    public void addItem(Product item){
       
        Product[] tempList = new Product[receiptList.length + 1];
        System.arraycopy(receiptList, 0, tempList, 0, receiptList.length);
        receiptList = tempList;
        
    }
    
    public void printItemList(){
        for (Product receiptList1 : receiptList) {
            System.out.println(receiptList1.toString());
            total += receiptList1.getDiscountedPrice();
        }
        tax = total * .051;
        grandTotal = total + tax;
        System.out.println("Total " + total + " Tax " + tax + " Grand Total " + grandTotal);
    }
}
