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
public class PercentageDiscount implements Discount{
    private double discount;
    private double discountAmt;
    public Product item;
    
    public PercentageDiscount(double discount){
        this.discount = discount;
        
    }
    
    private void calculateDiscount(){
     discountAmt = discount * item.getPrice();
    }
    @Override
    public double getDiscountAmt(){
        calculateDiscount();
        return discountAmt;
    }
}
