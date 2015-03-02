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
public class LineItem {
    private Product item;
    private int qty;
    private double subtotal;
    
    public LineItem(Product item, int qty){
        this.item = item;
        this.qty = qty;
    }
    public double getSubtotal(){
        subtotal = item.getDiscountedPrice() * qty;
        return subtotal;
    }
    
}
