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
public class QuantityDiscount implements Discount{
    private int qtyNeeded;
    private double discountAmt;
    private Product item;
    public QuantityDiscount(int qtyNeeded, double discountAmt){
        this.qtyNeeded = qtyNeeded;
        this.discountAmt = discountAmt;
    }
    
    @Override
    public double getDiscountAmt(){
        if (qtyNeeded >= item.getQty())
            return item.getPrice() * discountAmt;
        else
            return item.getPrice();
    }
}
