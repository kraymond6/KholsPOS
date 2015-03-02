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
public interface DatabaseAccessStrategy {
    public Product findProduct(String productId);
    public Customer findCustomer(String customerId);
}
