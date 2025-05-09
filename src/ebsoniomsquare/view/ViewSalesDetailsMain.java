/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare.view;

import ebsoniomsquare.DBConnClass;
import ebsoniomsquare.MessageParamClass;
import ebsoniomsquare.model.CustomerViewDetailsClass;
import ebsoniomsquare.model.SalesReportClass;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bishal Shrestha
 */
public class ViewSalesDetailsMain extends javax.swing.JFrame {

    /**
     * Creates new form ViewSalesDetailsMain
     */
    public ViewSalesDetailsMain() {
        initComponents();
        SalesReportClass();
    }
    public ArrayList<SalesReportClass> reportList(){
        ArrayList<SalesReportClass> reportList = new ArrayList<>(); //Create Object named Arraylist
        //Select Data from the Database
    try{
            //Query for selecting data from the database
            String sqlQuery = "SELECT * FROM CHECKOUT_DETAILS "; 
            //Invoking DBConnClass to View the data in the database
            ResultSet rs = DBConnClass.getData(sqlQuery); 
            //Create Object for EmployeeDetails
            SalesReportClass reportViewDetails;
             while(rs.next()){ 
                 reportViewDetails = new SalesReportClass(rs.getInt("SNO"), rs.getString("BILL_NUMBER"), 
                         rs.getString("CUSTOMER_ID"), rs.getString("CURRENTDATE"), rs.getString("TOTAL_AMOUNT"), 
                         rs.getString("GRAND_TOTAL_AMOUNT"), rs.getString("DISCOUNT_APPLICABLE_AMOUNT"), 
                         rs.getString("RECEIVED_AMOUNT"), rs.getString("RETURN_AMOUNT"));
                 reportList.add(reportViewDetails);
             }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
            } 
    return reportList; //Return Customer Details
    }
public void SalesReportClass(){
    ArrayList<SalesReportClass> list = reportList();
        DefaultTableModel model = (DefaultTableModel)salesReportTbl.getModel();//typecast with default table model
        Object[] row = new Object[9]; 
        for(int i=0; i<list.size();i++){
            row[0] = list.get(i).getSno();
            row[1] = list.get(i).getBillNumber();
            row[2] = list.get(i).getCustomerId();
            row[3] = list.get(i).getDateTime();
            row[4] = list.get(i).getTotalAmount();
            row[5] = list.get(i).getGrandTotalAmount();
            row[6] = list.get(i).getDiscountApplicableAmount();
            row[7] = list.get(i).getReceivedAmount();
            row[8] = list.get(i).getReturnAmount();
            model.addRow(row);
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesReportTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        salesReportTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "Bill Number", "Customer ID", "Date Time", "Total  Amount", "Grand Total  Amount", "Discount Amount", "Received Amount", "Return Amount"
            }
        ));
        jScrollPane1.setViewportView(salesReportTbl);

        jLabel1.setText("EbsoniomSquare Sales Report");

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(528, 528, 528)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBtn)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cancelBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
         //Objects to Show Cancel Product View Message
        MessageParamClass message = new MessageParamClass("Sure to Cancel?", "EbsoniomSquare Message");
        int returnOptionValue = message.showConfirmDialog(); 
        if(returnOptionValue==0){  //value of yes = 0
            setVisible(false);
            SalesManagementPanelMain frame = new SalesManagementPanelMain();
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(ManagementMain.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewSalesDetailsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSalesDetailsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSalesDetailsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSalesDetailsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSalesDetailsMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable salesReportTbl;
    // End of variables declaration//GEN-END:variables
}
