
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
    private Product[] receiptList = new Product[0];
    
    public Receipt(String date, String custId){
        this.date = date;
        this.custId = custId;
    }
    
    public void addItem(Product item){
       
        Product[] tempList = new Product[receiptList.length + 1];
        System.arraycopy(receiptList, 0, tempList, 0, receiptList.length + 1);
        tempList[receiptList.length] = item;
        receiptList = tempList;
    }
    
    public void printItemList(){
        for (int i=0; i<receiptList.length; i++){
            System.out.println(receiptList[i].toString());
            total += receiptList[i].getDiscountedPrice();
        }
    }
}
