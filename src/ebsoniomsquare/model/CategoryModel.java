/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare.model;

/**
 *
 * @author Bishal Shrestha
 */
/*class definition for the categories and returning the categories varibales from the database connection string*/
public class CategoryModel {
    private String categoryName;
    private String cid;
    private String categoryDescription;

    public String getCategoryName() {
        return categoryName; //return category Name
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCid() {
        return cid; //return category ID
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCategoryDescription() {
        return categoryDescription; //return category description
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
}
