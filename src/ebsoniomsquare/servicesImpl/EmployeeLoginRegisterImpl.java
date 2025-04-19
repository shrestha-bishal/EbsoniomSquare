/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare.servicesImpl;

import ebsoniomsquare.DBConnClass;
import java.sql.ResultSet;
import ebsoniomsquare.services.EmployeeLoginRegister;
import ebsoniomsquare.view.EmployeeRegistrationMain;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bishal Shrestha
 */
/*The database query are defined here for query relating to the Employee Registration. 
This class implements the inheritance defined in the EmployeeLoginRegister */
public class EmployeeLoginRegisterImpl implements EmployeeLoginRegister{

    @Override
    public boolean userLogin(String username, String password) {
        try{
             //Query for checking the User credentials in the database
             String sqlQuery = "SELECT * FROM MANAGEMENT WHERE USERNAME='"+username+"'and PASSWORD ='"+password+"' "; 
             //Invoking DBConnClass to View the data in the database
             //System.out.println(sqlQuery);
              ResultSet rs = DBConnClass.getData(sqlQuery);
              return (rs.next());
  
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }   

    @Override
    //Inserting the value in the MANAGEMENT Table
    public boolean userRegister(String branchName,String todayDate, String title, String name, String gender,
            String maritialStatus, String nationality, String date1, String education, String fatherName, 
            String motherName, String permanentAddress, String temporaryAddress, String contact, String email, 
            String username, String password, String department, String designation) {
    try{
           String sqlQuery = "INSERT INTO MANAGEMENT(BRANCH, DATE, TITLE, NAME, GENDER, MARITIAL, NATIONALITY, DOB, "
                   + " EDUCATION, FATHER, MOTHER, PADDRESS, TADDRESS, CONTACT, EMAIL, USERNAME, PASSWORD, DEPARTMENT, "
                   + " DESIGNATION) values ('"+branchName+"', '"+todayDate+"','"+title+"','"+name+"', '"+gender+"', "
                   + " '"+maritialStatus+"', '"+nationality+"', '"+date1+"', '"+education+"', '"+fatherName+"', "
                   + " '"+motherName+"', '"+permanentAddress+"', '"+temporaryAddress+"', '"+contact+"', '"+email+"', "
                   + " '"+username+"', '"+password+"', '"+department+"', '"+designation+"')"; 
        System.out.println(sqlQuery);
          //Invoking DBConnClass to Insert the data in the database
        DBConnClass.setData(sqlQuery);
        return true;
    } catch (Exception ex) {
             Logger.getLogger(EmployeeRegistrationMain.class.getName()).log(Level.SEVERE, null, ex);
         }
    
     return false;
    }
    
    //Updating the values in the MANAGEMENT Table
    public boolean userUpdate(String branchName,String todayDate, String title, String name, String gender, 
            String maritialStatus, String nationality, String date1, String education, String fatherName, 
            String motherName, String permanentAddress, String temporaryAddress, String contact, String email, 
            String username, String department, String designation) {
    try{
           String sqlQuery = "UPDATE MANAGEMENT SET BRANCH = '"+branchName+"', DATE = '"+todayDate+"', "
                   + " TITLE = '"+title+"', NAME = '"+name+"', GENDER = '"+gender+"', MARITIAL = '"+maritialStatus+"', "
                   + " NATIONALITY = '"+nationality+"', DOB = '"+date1+"', EDUCATION = '"+education+"', "
                   + " FATHER = '"+fatherName+"', MOTHER = '"+motherName+"', PADDRESS = '"+permanentAddress+"',"
                   + " TADDRESS = '"+temporaryAddress+"', CONTACT = '"+contact+"', EMAIL = '"+email+"', "
                   + " DEPARTMENT = '"+department+"', DESIGNATION = '"+designation+"' " 
                   + " WHERE USERNAME = '"+username+"' ";
        System.out.println(sqlQuery);
          //Invoking DBConnClass to Update the data in the database
        DBConnClass.setData(sqlQuery); 
        return true;
    } catch (Exception ex) {
             Logger.getLogger(EmployeeRegistrationMain.class.getName()).log(Level.SEVERE, null, ex);
         }
    
     return false;
    }
    
    //Deleting the values from the MANAGEMENT Table
    public boolean userDelete(String username) {
    try{
           String sqlQuery = "DELETE FROM MANAGEMENT WHERE USERNAME = '"+username+"' ";
        System.out.println(sqlQuery);
          //Invoking DBConnClass to Update the data in the database
        DBConnClass.setData(sqlQuery); 
        return true;
    } catch (Exception ex) {
             Logger.getLogger(EmployeeRegistrationMain.class.getName()).log(Level.SEVERE, null, ex);
         }
    
     return false;
    }
}
