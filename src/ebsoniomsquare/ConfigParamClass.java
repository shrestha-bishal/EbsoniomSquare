/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Bishal Shrestha
 */

/* Class to define the configuration parameters
*/
public class ConfigParamClass {
    public void invokeFrameDisplay(){
        
    }
    //show date
    public void showDate(){
      Date dateT= new Date();
      SimpleDateFormat s= new SimpleDateFormat("yyyy-MM-dd");
      String dateToday = s.format(dateT);
    }
    //show time
    public void showTime(){
           new Timer(0, new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                         Date dateT= new Date();
      SimpleDateFormat dateFormat= new SimpleDateFormat("hh:mm:ss a");
               }
           }).start();
       }
}
