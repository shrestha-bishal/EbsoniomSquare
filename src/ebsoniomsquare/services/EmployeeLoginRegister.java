/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare.services;

/**
 *
 * @author Bishal Shrestha
 */
//Interface for Registration of Employee
public interface EmployeeLoginRegister {
    public boolean userLogin(String username,String password);
    public boolean userRegister(String branchName,String todayDate,String title,String name,String gender,String maritialStatus,String nationality,
            String date1,String education,String fatherName,String motherName,String permanentAddress,String temporaryAddress,
            String contact,String email,String username,String password,String department,String designation);

    public boolean userUpdate(String branchName, String todayDate, String title, String name, String gender, String maritialStatus, String nationality, String date1, String education, String fatherName, String motherName, String permanentAddress, String temporaryAddress, String contact, String email, String username, String department, String designation);

    public boolean userDelete(String username);
}
