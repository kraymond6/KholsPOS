
package kholspos;

/**
 *
 * @author Kallie
 */
public class Startup {

    public static void main(String[] args) {
        CashRegister KholsRegister = new CashRegister();
        FakeDatabase KholsDatabase = new FakeDatabase();
        
        
        KholsRegister.beginTransaction(KholsDatabase.findCustomer("001"), "3/2/15");
        KholsRegister.addItem(KholsDatabase.findProduct("S001"));
        KholsRegister.endTransaction();
    }
    
}
