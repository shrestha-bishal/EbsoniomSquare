/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare.services;

import ebsoniomsquare.model.ProductModel;
import java.util.List;

/**
 *
 * @author Bishal Shrestha
 */
/*Interface defining Product with the methods for adding, updating and deleting the porducts from the database to the
table*/
public interface ProductServices {
    public List<ProductModel> showAllProduct();
    public List<ProductModel> showAllProductDescription();
    public ProductModel getById(String pid);
    public boolean addProduct(ProductModel product);
    public boolean updateProduct(ProductModel product);
    public boolean deleteProduct(ProductModel product);
}
