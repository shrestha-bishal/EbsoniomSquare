/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare.servicesImpl;

import ebsoniomsquare.DBConnClass;
import ebsoniomsquare.model.CheckoutModel;
import ebsoniomsquare.services.ReturnProductServices;
import java.sql.ResultSet;

/**
 *
 * @author Bishal Shrestha
 */
/*The database query are defined here for query relating to the Product Services and Inventory for Return Products. 
This class implements the inheritance defined in the ProductServices */
public class ReturnProductServicesImpl implements ReturnProductServices {
    @Override
    //Inserting the calues in the Temporary Table TEMP_TABLE
    public boolean addToTable(CheckoutModel checkOut) {
        //validate pid not done;//null input check//auto generate
          String sqlQuery="INSERT INTO TEMP_TABLE(PID,QUANTITY,BILL_NO,CUSTOMER_ID) "
                + "values('"+checkOut.getPid()+"', '"+checkOut.getQuantity()+"','"
                +checkOut.getBillingNo()+"', '"+checkOut.getCustomerID()+"')";
        try{
            System.out.println(sqlQuery);
            DBConnClass.setData(sqlQuery);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    //Deleting the values from Temporary Table TEMP_TABLE
    public boolean deleteFromTable(CheckoutModel checkOut) {
        String sqlQuery="DELETE FROM TEMP_TABLE WHERE BILL_NO = '"+checkOut.getBillingNo()+"' "+ ""
                + "and PID = '"+checkOut.getPid()+"'";
        try{ 
            System.out.println(sqlQuery);
            DBConnClass.setData(sqlQuery);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false; 
    }
  
    //Inserting into the table PRODUCT_RETURN_DETAILS
        public boolean returnProductsAll(CheckoutModel checkoutModel) {
        boolean increaseProductCount = increaseCount(checkoutModel);
        System.out.println(increaseProductCount);
        if(increaseProductCount){
         String sqlQuery="INSERT INTO PRODUCT_RETURN_DETAILS(BILL_NUMBER, CUSTOMER_ID, CURRENTDATE,"
             + "TOTAL_AMOUNT, GRAND_TOTAL_AMOUNT, DISCOUNT_APPLICABLE_AMOUNT, RECEIVED_AMOUNT, RETURN_AMOUNT) "
                + "values('"+checkoutModel.getBillingNo()+"', '"+checkoutModel.getCustomerID()+"','"
                +checkoutModel.getCurrentDate()+"', '"+checkoutModel.getTotalAmount()+"', '"
             +checkoutModel.getGrandTot()+"', '"+checkoutModel.getDiscount()
             +"', '"+checkoutModel.getReceivedAmount()+"', '"+checkoutModel.getReturnAmount()+"')";
         try{
            System.out.println(sqlQuery);
            DBConnClass.setData(sqlQuery);
            return true;
            }catch(Exception e){
            e.printStackTrace();
            }
        }
        return false; 
    }
        //Retriving the quantity details from PRODUCT_DETAILS
    private boolean increaseCount(CheckoutModel checkoutModel){
        String sqlQuery = "SELECT QUANTITY FROM PRODUCT_DETAILS WHERE PID ='"+checkoutModel.getPid()+"'";
        int quantity=0;
        try{
        ResultSet rs=DBConnClass.getData(sqlQuery);
			while(rs.next()) {
                            quantity = Integer.valueOf(rs.getString("QUANTITY"));
                            System.out.println(quantity);
                        }
                        if(quantity<1){
                            return false;
                        }else{
                            System.out.println(checkoutModel.getQuantity());
                            //Updating the PRODUCT_DETAILS
                            String sql = "UPDATE PRODUCT_DETAILS SET QUANTITY ='"
                                    +(quantity + Integer.valueOf(checkoutModel.getQuantity())) 
                                    +"' WHERE PID ='"+checkoutModel.getPid()+"'";
                           try{   
                               DBConnClass.setData(sql);
                                return true;
                           }catch(Exception e){
                               e.printStackTrace();
                           }
                        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false; 
    }
}
