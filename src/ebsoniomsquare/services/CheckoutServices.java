/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare.services;

import ebsoniomsquare.model.CheckoutModel;

/**
 *
 * @author Bishal Shrestha
 */
//Defining interface of CheckOut with the methods for adding, deleting to the table and checkOut 
public interface CheckoutServices {
    public boolean addToTable(CheckoutModel checkOut);
    public boolean deleteFromTable(CheckoutModel checkOut);
    public boolean checkoutAll(CheckoutModel checkoutModel);
}
