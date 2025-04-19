/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare.services;

import ebsoniomsquare.model.CategoryModel;
import java.util.List;

/**
 *
 * @author Bishal Shrestha
 */

//Defining Interface of Category
public interface CategoryServices {
  public List<CategoryModel> getCategoryName();
  public boolean addCategory(CategoryModel category);
}
