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
//Class definition for retriving Sales Details through the database to the variables defined 
public class SalesReportClass {
     private int sno;
     private String billNumber, customerId, dateTime, totalAmount, grandTotalAmount, discountApplicableAmount,
             receivedAmount, returnAmount;
     public SalesReportClass(int sno, String billNumber, String customerId, String dateTime, String totalAmount, 
             String grandTotalAmount, String discountApplicableAmount, String receivedAmount, String returnAmount){
                 this.sno = sno;
                 this.billNumber = billNumber;
                 this.customerId = customerId; 
                 this.dateTime = dateTime; 
                 this.totalAmount = totalAmount; 
                 this.grandTotalAmount = grandTotalAmount; 
                 this.discountApplicableAmount = discountApplicableAmount; 
                 this.receivedAmount = receivedAmount; 
                 this.returnAmount = returnAmount; 
     }
     public int getSno(){
        return sno;
     }
     public String getBillNumber(){
        return billNumber;
     }
     public String getCustomerId(){
        return customerId;
     }
     public String getDateTime(){
        return dateTime;
     }
     public String getTotalAmount(){
        return totalAmount;
     }
     public String getGrandTotalAmount(){
        return grandTotalAmount;
     }
     public String getDiscountApplicableAmount(){
        return discountApplicableAmount;
     }
     public String getReceivedAmount(){
        return receivedAmount;
     }
     public String getReturnAmount(){
        return returnAmount;
     }
}
