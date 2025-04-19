/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare.servicesImpl;

import ebsoniomsquare.DBConnClass;
import ebsoniomsquare.model.CategoryModel;
import ebsoniomsquare.services.CategoryServices;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bishal Shrestha
 */
/*The database query are defined here for query relating to the category. This class implements the inheritance
defined in the CategoryServices */
public class CategoryServicesImpl implements CategoryServices {

    @Override
    public List<CategoryModel> getCategoryName() {
        List<CategoryModel> comboItems=new ArrayList<CategoryModel>();
         String sql="SELECT * FROM CATEGORY_DETAILS"; //Selecting data from CATEGORY_DETAILS
		try {
			System.out.println("Query:"+sql);
			ResultSet rs=DBConnClass.getData(sql);
			while(rs.next()) {
				CategoryModel category=new CategoryModel();
                                category.setCid(rs.getString("CID"));
                                category.setCategoryName(rs.getString("CATEGORY_NAME"));
                                category.setCategoryDescription("CATEGORY_DESCRIPTION");
                                comboItems.add(category);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
        return comboItems;
    }

    @Override
    public boolean addCategory(CategoryModel category) {
        //Inserting data into CATEGORY_DETAILS
        String sql="INSERT INTO CATEGORY_DETAILS(CID, CATEGORY_NAME, CATEGORY_DESCRIPTION) VALUES('"+category.getCid()
                +"' , '"+ category.getCategoryName()+"' , '"+category.getCategoryDescription()+"') ";
        System.out.println(sql);
        try{
            DBConnClass.setData(sql);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
}
