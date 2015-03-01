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
  
    public void beginTransaction(String custId, String date){
        customerId = custId;
        this.date = date;
    }
    
    public void addItem(Product item){
        receipt.addItem(item);
    }
}
