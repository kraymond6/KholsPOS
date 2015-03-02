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
        new Customer("001", "Clark Studwell"),
        new Customer("002", "Rebecca Makowski"),
        new Customer("003", "Xander Newgard")
    };
    
    private Product[] productList ={
        //String description, double price, String productId, Discount discountType
      new Product("Tee Shirt", 5.99, "S001", new PercentDiscount(.25, 5.99)),
      new Product("Blue Jeans", 40.00, "P001", new QuantityDiscount(2, .5, 2)),
      new Product ("Girl's Socks", 7.00, "S001", new NoDiscount())
    };

}
