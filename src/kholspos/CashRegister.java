package kholspos;
/**
 *
 * @author Kallie
 */
public class CashRegister {
    public String customerId;
    public String date;
    Receipt receipt =  new Receipt(date, customerId);
    public CashRegister(){
 
    }
  
    public void beginTransaction(Customer cust, String date){
        this.date = date;
    }
    
    public void addItem(Product item){
        receipt.addItem(item);
    }
    public void endTransaction(){
        System.out.println("Customer " + customerId + " Date " + date);
        receipt.printItemList();
    }
}
