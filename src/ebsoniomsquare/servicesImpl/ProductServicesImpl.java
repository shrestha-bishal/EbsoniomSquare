/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare.servicesImpl;

import ebsoniomsquare.DBConnClass;
import ebsoniomsquare.MessageParamClass;
import ebsoniomsquare.model.ProductModel;
import ebsoniomsquare.services.ProductServices;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bishal Shrestha
 */

/*The database query are defined here for query relating to the Product Services and Inventory. 
This class implements the inheritance defined in the ProductServices */
public class ProductServicesImpl implements ProductServices{

    @Override
    public List<ProductModel> showAllProduct() {
        List<ProductModel> productList=new ArrayList<ProductModel>();
        //Retriving the values form PRODUCT_DETAILS
        String sql="SELECT * FROM PRODUCT_DETAILS";
		try {
			System.out.println("Query:"+sql);
			ResultSet rs=DBConnClass.getData(sql);
			while(rs.next()) {
				ProductModel product=new ProductModel();
				product.setPid(rs.getString("PID"));
				product.setPrice(rs.getString("PRICE"));
				product.setProductName(rs.getString("PRODUCT_NAME"));
				product.setQuantity(rs.getString("QUANTITY"));
				productList.add(product);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
        return productList;
    }

 //Making a array of list for all the retrieved Product Description 
    @Override
    public List<ProductModel> showAllProductDescription() {
        List<ProductModel> productList=new ArrayList<ProductModel>();
        String sql="SELECT * FROM PRODUCT_DETAILS";
		try {
			System.out.println("Query:"+sql);
			ResultSet rs=DBConnClass.getData(sql);
			while(rs.next()) {
				ProductModel product=new ProductModel();
				product.setPid(rs.getString("PID"));
				product.setPrice(rs.getString("PRICE"));
				product.setProductName(rs.getString("PRODUCT_NAME"));
				product.setQuantity(rs.getString("QUANTITY"));
                                product.setProductDescription(rs.getString("PRODUCT_DESCRIPTION"));
                                product.setCategoryid(rs.getString("CID"));
				productList.add(product);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
        return productList;
    }

    @Override
    //Query related to retrieving, inserting  the data in the PRODUCT_DETAILS
    public boolean addProduct(ProductModel product) {
        try{
        String duplicateCheck="SELECT * FROM PRODUCT_DETAILS WHERE PRODUCT_NAME = '"+product.getProductName()+"'";
        ResultSet rs=DBConnClass.getData(duplicateCheck);
            System.out.println(rs.next());
        if(!rs.next()){
        String sqlQuery="INSERT INTO PRODUCT_DETAILS(PID, PRODUCT_NAME, QUANTITY, PRICE, CID, PRODUCT_DESCRIPTION) "
                + "values('"+product.getPid()+"', '"+product.getProductName()+"','"+product.getQuantity()+"','"
                +product.getPrice()+"', '"+product.getCategoryid()+"', '"+product.getProductDescription()+"')";
        try{
            System.out.println(sqlQuery);
            DBConnClass.setData(sqlQuery);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        }else{
            MessageParamClass message = new MessageParamClass("Duplicate Product Name",
                         "EbsoniomSquare Message"); 
                 message.showMessageDialog();
            return false;
        }
        }catch(Exception e){
            MessageParamClass message = new MessageParamClass("Exception of Duplicate Name",
                         "EbsoniomSquare Message"); 
                 message.showMessageDialog();
            e.printStackTrace();
        }
        return false;
    }

    @Override
     //Query related to updating  the data in the PRODUCT_DETAILS
    public boolean updateProduct(ProductModel product) {
        String sql="UPDATE PRODUCT_DETAILS SET PRODUCT_NAME='"+product.getProductName()+"' ,"
                +"QUANTITY='"+product.getQuantity()+"' ,"+"PRICE='"+product.getPrice()+"' ,"
                +"CID='"+product.getCategoryid()+"' ,"+"PRODUCT_DESCRIPTION='"+product.getProductDescription()+"' "
                +" where PID ='"+product.getPid()+"'";
        try{
            DBConnClass.setData(sql);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }   
        return false;
    }

    @Override
     //Query related to deleting  the data in the PRODUCT_DETAILS
    public boolean deleteProduct(ProductModel product) {
        String sql="DELETE FROM PRODUCT_DETAILS WHERE PID='"+product.getPid()+"'";
        System.out.println(sql);
        try{
            DBConnClass.setData(sql);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
     //Query related to retrieving the data in the PRODUCT_DETAILS
    public ProductModel getById(String pid) {
        ProductModel product = new ProductModel();
		String sql="SELECT * FROM PRODUCT_DETAILS WHERE PID='"+pid+"'";
		try {
                    ResultSet rs=DBConnClass.getData(sql);
			while(rs.next()) {
				product.setPid(rs.getString("PID"));
				product.setProductName(rs.getString("PRODUCT_NAME"));
				product.setQuantity(rs.getString("QUANTITY"));
				product.setPrice(rs.getString("PRICE"));
                                product.setCategoryid(rs.getString("CID"));
                                product.setProductDescription(rs.getString("PRODUCT_DESCRIPTION"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return product;
    }
    
}
