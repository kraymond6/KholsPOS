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
public class PercentDiscount implements Discount{
     private double itemPrice;
    private double percentDiscount;
    
    public PercentDiscount(double percentDiscount, double itemPrice){
    this.percentDiscount = percentDiscount;
    this.itemPrice = itemPrice;
}
    @Override
    public double getDiscountAmt(){
        return itemPrice * percentDiscount;
    }
}
