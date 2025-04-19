/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare;

import javax.swing.JOptionPane;

/**
 *
 * @author Bishal Shrestha
 */
/* Class defining the Message Parameter used in the system for user dialogs, alerts and confirmation */
public class MessageParamClass {
    String message, messageHeader;
    //Constructor Definition
    public MessageParamClass(String message, String messageHeader){
        super();
        this.message = message;
        this.messageHeader = messageHeader;
    }
    
    //method definitions for showing popup messages
    public void showMessageDialog(){
        JOptionPane.showMessageDialog(null, message, messageHeader, JOptionPane.INFORMATION_MESSAGE);
    }
    //method definitions for showing confirmation dialog
    public int showConfirmDialog(){
       int OptionMessage =  JOptionPane.showConfirmDialog(null, message, messageHeader, JOptionPane.YES_NO_OPTION);
       return OptionMessage;
    }
}
