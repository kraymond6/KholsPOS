package kholspos;


/**
 *
 * @author Kallie
 */
public class CashRegister {
    public String customerId;
    public String date;
    public CashRegister(){
        
    }
    public void beginTransaction(String custId, String date){
        customerId = custId;
        this.date = date;
        Receipt newReceipt =  new Receipt(date, customerId);
    }
}
