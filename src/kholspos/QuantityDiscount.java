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
    private double itemPrice;
    private int itemQty;
    public QuantityDiscount(int qtyNeeded, double discountAmt, int itemQty){
        this.qtyNeeded = qtyNeeded;
        this.discountAmt = discountAmt;
        this.itemPrice = itemPrice;
    }
    
    @Override
    public double getDiscountAmt(){
        if (qtyNeeded >= itemQty)
            return itemPrice * discountAmt;
        else
            return itemPrice;
    }
}
