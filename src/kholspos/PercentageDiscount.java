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
    private double percentOff;
    private Product item;
    public PercentageDiscount(double percentOff, Product item){
        this.percentOff = percentOff;
        this.item = item;
    }
    public double getDiscountAmt(){
        return item.getPrice() * percentOff;
    }
}
