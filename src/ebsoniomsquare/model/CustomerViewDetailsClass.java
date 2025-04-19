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
//Class definition for retriving Customer Details through the database to the variables defined 
public class CustomerViewDetailsClass {
    private int sno, customerStatus;
    private String salutation, name, gender, nationality, contact, contactOptional, emailId, residentalAddressLine1,
            residentalAddressLine2, residentalSuburb, residentalTown, residentalState, residentalPostCode, 
            residentalCountry, deliveryAddressLine1, deliveryAddressLine2, deliverySuburb, deliveryTown, deliveryState,
            deliveryPostCode, deliveryCountry, postalAddressLine1, postalAddressLine2, postalSuburb, postalTown,
            postalState, postalPostCode, postalCountry, customerId;
    
    public CustomerViewDetailsClass(int sno, String salutation, String name, String gender, String nationality, 
            String contact, String contactOptional, String emailId, String residentalAddressLine1,
            String residentalAddressLine2, String residentalSuburb, String residentalTown, 
            String residentalState, String residentalPostCode, String residentalCountry, 
            String deliveryAddressLine1, String deliveryAddressLine2, String deliverySuburb, 
            String deliveryTown, String deliveryState, String deliveryPostCode, String deliveryCountry, 
            String postalAddressLine1, String postalAddressLine2, String postalSuburb, String postalTown,
            String postalState, String postalPostCode, String postalCountry, String customerId, int customerStatus){
        
        this.sno = sno;
        this.salutation = salutation;
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.contact = contact;
        this.contactOptional = contactOptional;
        this.emailId = emailId;
        this.residentalAddressLine1 = residentalAddressLine1;
        this.residentalAddressLine2 = residentalAddressLine2;
        this.residentalSuburb = residentalSuburb;
        this.residentalTown = residentalTown;
        this.residentalState = residentalState;
        this.residentalPostCode = residentalPostCode;
        this.residentalCountry = residentalCountry;
        this.deliveryAddressLine1 = deliveryAddressLine1;
        this.deliveryAddressLine2 = deliveryAddressLine2;
        this.deliverySuburb = deliverySuburb;
        this.deliveryTown = deliveryTown;
        this.deliveryState = deliveryState;
        this.deliveryPostCode = deliveryPostCode;
        this.deliveryCountry = deliveryCountry;
        this.postalAddressLine1 = postalAddressLine1;
        this.postalAddressLine2 = postalAddressLine2;
        this.postalSuburb = postalSuburb;
        this.postalTown = postalTown;
        this.postalState = postalState;
        this.postalPostCode = postalPostCode;
        this.postalCountry = postalCountry;
        this.customerId = customerId;
        this.customerStatus = customerStatus;
    }
     public int getSno(){
        return sno;
     }
     public String getSalutation(){
        return salutation;
     }
     public String getName(){
        return name;
     }
     public String getGender(){
        return gender;
     }
     public String getNationality(){
        return nationality;
     }
     public String getContact(){
        return contact;
     }
     public String getContactOptional(){
        return contactOptional;
     }
     public String getEmailId(){
        return emailId;
     }
     public String getResidentalAddressLine1(){
        return residentalAddressLine1;
     }
     public String getResidentalAddressLine2(){
        return residentalAddressLine2;
     }
     public String getResidentalSuburb(){
        return residentalSuburb;
     }
     public String getResidentalTown(){
        return residentalTown;
     }
     public String getResidentalState(){
        return residentalState;
     }
     public String getResidentalPostCode(){
        return residentalPostCode;
     }
     public String getResidentalCountry(){
        return residentalCountry;
     }
     public String getDeliveryAddressLine1(){
        return deliveryAddressLine1;
     }
     public String getDeliveryAddressLine2(){
        return deliveryAddressLine2;
     }
     public String getDeliverySuburb(){
        return deliverySuburb;
     }   
     public String getDeliveryTown(){
        return deliveryTown;
     }
     public String getDeliveryState(){
        return deliveryState;
     }
     public String getDeliveryPostCode(){
        return deliveryPostCode;
     }
     public String getDeliveryCountry(){
        return deliveryCountry;
     }
     public String getPostalAddressLine1(){
        return postalAddressLine1;
     }
     public String getPostalAddressLine2(){
        return postalAddressLine2;
     }
     public String getPostalSuburb(){
        return postalSuburb;
     }
     public String getPostalTown(){
        return postalTown;
     }
     public String getPostalState(){
        return postalState;
     }
     public String getPostalPostCode(){
        return postalPostCode;
     }
     public String getPostalCountry(){
        return postalCountry;
     }
     public String getCustomerId(){
        return customerId;
     }
     public int getCustomerStatus(){
        return customerStatus;
     }      
}
