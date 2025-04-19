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
//Class definition for retriving Employee Details through the database to the variables defined 
public class EmployeeViewDetailsClass {
    private int sno;
    private String branch, title, name, gender, maritial, nationality, dateOfBirth, education, father, mother, 
            permanentAddress, temporaryAddress, contact, email, userName, department, designation;
    
    public EmployeeViewDetailsClass(int sno, String branch, String title, String name, String gender, 
            String maritial, String nationality, String dateOfBirth, String education, String father, String mother, 
            String permanentAddress, String temporaryAddress, String contact, String email, String userName, 
            String department, String designation){
        
        this.sno = sno;
        this.branch = branch;
        this.title = title;
        this.name = name;
        this.gender = gender;
        this.maritial = maritial;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.education = education;
        this.father = father;
        this.mother = mother;
        this.permanentAddress = permanentAddress;
        this.temporaryAddress = temporaryAddress;
        this.contact = contact;
        this.email = email;
        this.userName = userName;
        this.department = department;
        this.designation = designation;
    }
     public int getSno(){
        return sno;
     }
     public String getBranch(){
        return branch;
     }
     public String getTitle(){
        return title;
     }
     public String getName(){
        return name;
     }
     public String getGender(){
        return gender;
     }
     public String getMaritial(){
        return maritial;
     }
     public String getNationality(){
        return nationality;
     }
     public String getDateOfBirth(){
        return dateOfBirth;
     }
     public String getEducation(){
        return education;
     }
     public String getFather(){
        return father;
     }
     public String getMother(){
        return mother;
     }
     public String getPermanentAddress(){
        return permanentAddress;
     }
     public String getTemporaryAddress(){
        return temporaryAddress;
     }
     public String getContact(){
        return contact;
     }
     public String getEmail(){
        return email;
     }
     public String getUserName(){
        return userName;
     }
     public String getDepartment(){
        return department;
     }
     public String getDesignation(){
        return designation;
     }   
}
