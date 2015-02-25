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
public class percentageDiscount implements Discount{
    private double discount;
    private double itemPrice;
    private double discountAmt;
    public Product item;
    
    public percentageDiscount(Product item, double discount){
        this.discount = discount;
        this.item = item;
    }
    
    private void calculateDiscount(){
        discount * item.getPrice() = discountAmt;
    }
    @Override
    public double getDiscountAmt(){
        calculateDiscount();
        return discountAmt;
    }
}
