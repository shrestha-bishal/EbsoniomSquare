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
/*Interface defining Return Product with the methods for adding, updating and deleting the porducts from the database to the
table*/
public interface ReturnProductServices {
    public boolean addToTable(CheckoutModel checkOut);
    public boolean deleteFromTable(CheckoutModel checkOut);
    public boolean returnProductsAll(CheckoutModel checkoutModel);
}
