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
public class NoDiscount implements Discount{
 
    public NoDiscount(){
        
    }
    @Override
    public double getDiscountAmt(){
        return 0;
    }
}
