/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare;

import ebsoniomsquare.view.LoginMain;
import static com.sun.glass.ui.Cursor.setVisible;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bishal Shrestha
 */
public class EbsoniomSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Driver Class (Application Class) initiating application from Login Form
      LoginMain managementForm = new LoginMain();  //Invoking Login Panel Form
      managementForm.setVisible(true);
    }
    
}
