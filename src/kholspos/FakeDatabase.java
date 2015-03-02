/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kholspos;

/**
 *
 * @author Kallie
 */
public class FakeDatabase implements DatabaseAccessStrategy{
    private Customer[] customerList = {
        new Customer("001", "Clark Smith"),
        new Customer("002", "Rebecca Miller"),
        new Customer("003", "Xander Newgard")
    };
    
    private Product[] productList ={
        //String description, double price, String productId, Discount discountType
      new Product("Tee Shirt", 5.99, "S001", new PercentDiscount(.25, 5.99)),
      new Product("Blue Jeans", 40.00, "P001", new QuantityDiscount(2, .5, 2)),
      new Product ("Girl's Socks", 7.00, "S001", new NoDiscount())
    };
    @Override
     public final Customer findCustomer(String custId) {
        if(custId == null || custId.length() == 0) {
            System.out.println("Customer Not Found");
            return null;
        }
        
       Customer customer = null;
        for(Customer c : customerList) {
            if(custId.equals(c.getCustomerId())) {
                customer = c;
                break;
            }
        }
        
        return customer;
    }
        @Override
        public final Product findProduct(String productId) {
        // validation is needed for method parameter
        if(productId == null || productId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
        Product product = null;
        for(Product p : productList) {
            if(productId.equals(p.getProductId())) {
                product = p;
                break;
            }
        }
        
        return product;
    }
}
