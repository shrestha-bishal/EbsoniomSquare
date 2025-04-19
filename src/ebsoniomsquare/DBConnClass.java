/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Bishal Shrestha
 */
/* Class to define the connection string for the database MS-SQL using JDBC */
public class DBConnClass {  
    static private Connection dbConnection;
    
    public static Connection getDbConn() throws Exception{
        if(dbConnection == null){
            String dbUsername, dbPassword, dbName; //String Variable Definition
            dbUsername = "sa";
            dbPassword = "bishal";
            dbName = "EbsoniomSquare";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //Configuring JDBC to MS_SQL Server
            String dbConnectionUrl = "jdbc:sqlserver://localhost:1433;databaseName="+dbName+";user="+dbUsername+
                    ";password="+dbPassword; //Defining the DB Connection Path and authentication
                    dbConnection = DriverManager.getConnection(dbConnectionUrl);      
        }
        return dbConnection;
    }
    public static void setData(String query)throws Exception{ //Insert/Update/Delete Data from the Database
        DBConnClass.getDbConn().createStatement().executeUpdate(query);
        //System.out.println(query);
    } 
    public static void preparedStatement(String query) throws Exception{
        DBConnClass.getDbConn().prepareStatement(query).executeQuery(query);
    }  
    public static ResultSet getData(String query)throws Exception{ //Search Data from the Database
        return DBConnClass.getDbConn().createStatement().executeQuery(query);
    }
}
