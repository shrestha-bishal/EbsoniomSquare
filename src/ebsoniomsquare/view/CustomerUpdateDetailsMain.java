/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsoniomsquare.view;

import ebsoniomsquare.model.CustomerViewDetailsClass;
import ebsoniomsquare.DBConnClass;
import ebsoniomsquare.MessageParamClass;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Bishal Shrestha
 */
public class CustomerUpdateDetailsMain extends javax.swing.JFrame {

    /**
     * Creates new form CustomerViewDetailsMain
     */
    public CustomerUpdateDetailsMain() {
        initComponents();
        CustomerViewDetailsClass();
    }
    
    public ArrayList<CustomerViewDetailsClass> userList(){
    ArrayList<CustomerViewDetailsClass> customerList = new ArrayList<>(); //Create Object named Arraylist
    //Select Data from the Database
    try{
            //Query for selecting data from the database
            String sqlQuery = "SELECT * FROM CUSTOMER_DETAILS "; 
            //Invoking DBConnClass to View the data in the database
            ResultSet rs = DBConnClass.getData(sqlQuery); 
            //Create Object for EmployeeDetails
            CustomerViewDetailsClass customerViewDetails;
             while(rs.next()){ 
                 customerViewDetails = new CustomerViewDetailsClass(rs.getInt("SNO"), rs.getString("SALUTATION"), rs.getString("FULL_NAME"), rs.getString("GENDER"), rs.getString("NATIONALITY"), 
                         rs.getString("CONTACT"), rs.getString("CONTACT_OPTIONAL"), rs.getString("EMAIL_ID"), 
                         rs.getString("R_ADDRESS_LINE_1"), rs.getString("R_ADDRESS_LINE_2"), rs.getString("R_SUBURB"), 
                         rs.getString("R_TOWN"), rs.getString("R_STATE"), rs.getString("R_POSTCODE"), 
                         rs.getString("R_COUNTRY"), rs.getString("D_ADDRESS_LINE_1"), rs.getString("D_ADDRESS_LINE_2"), 
                         rs.getString("D_SUBURB"), rs.getString("D_TOWN"), rs.getString("D_STATE"), 
                         rs.getString("D_POSTCODE"), rs.getString("D_COUNTRY"), rs.getString("P_ADDRESS_LINE_1"), 
                         rs.getString("P_ADDRESS_LINE_2"), rs.getString("P_SUBURB"), rs.getString("P_TOWN"), 
                         rs.getString("P_STATE"), rs.getString("P_POSTCODE"), rs.getString("P_COUNTRY"), rs.getString("CUSTOMER_ID"),
                         rs.getInt("IS_DEL"));
             customerList.add(customerViewDetails);
             }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
            } 
    return customerList; //Return Customer Details
    }
    
    public void CustomerViewDetailsClass(){
        ArrayList<CustomerViewDetailsClass> list = userList();
        DefaultTableModel model = (DefaultTableModel)viewCustomerDetailsTbl.getModel();//typecast with default table model
        Object[] row = new Object[31]; 
        for(int i=0; i<list.size();i++){
            row[0] = list.get(i).getSno();
            row[1] = list.get(i).getSalutation();
            row[2] = list.get(i).getName();
            row[3] = list.get(i).getGender();
            row[4] = list.get(i).getNationality();
            row[5] = list.get(i).getContact();
            row[6] = list.get(i).getContactOptional();
            row[7] = list.get(i).getEmailId();
            row[8] = list.get(i).getCustomerId();
            int customerStatusA = list.get(i).getCustomerStatus();
            System.out.println(customerStatusA);
            if(customerStatusA == 0){
                row[9] = "Active";
            }else if(customerStatusA == 1){
                row[9] = "InActive";
            }else if(customerStatusA == 2){
                row[9] = "InActive";
            }else{
                row[9] = "No Data";
            } 
            row[10] = list.get(i).getResidentalAddressLine1();
            row[11] = list.get(i).getResidentalAddressLine2();
            row[12] = list.get(i).getResidentalSuburb();
            row[13] = list.get(i).getResidentalTown();
            row[14] = list.get(i).getResidentalState();
            row[15] = list.get(i).getResidentalPostCode();
            row[16] = list.get(i).getResidentalCountry();
            row[17] = list.get(i).getDeliveryAddressLine1();
            row[18] = list.get(i).getDeliveryAddressLine2();
            row[19] = list.get(i).getDeliverySuburb();
            row[20] = list.get(i).getDeliveryTown();
            row[21] = list.get(i).getDeliveryState();
            row[22] = list.get(i).getDeliveryPostCode();
            row[23] = list.get(i).getDeliveryCountry();
            row[24] = list.get(i).getPostalAddressLine1();
            row[25] = list.get(i).getPostalAddressLine2();
            row[26] = list.get(i).getPostalSuburb();
            row[27] = list.get(i).getPostalTown();
            row[28] = list.get(i).getPostalState();
            row[29] = list.get(i).getPostalPostCode();
            row[30] = list.get(i).getPostalCountry();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewCustomerDetailsTbl = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        titleMrOp = new javax.swing.JRadioButton();
        titleMrsOp = new javax.swing.JRadioButton();
        titleMsOp = new javax.swing.JRadioButton();
        titleOtherOp = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        nameFld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        genderMaleOp = new javax.swing.JRadioButton();
        genderFemaleOp = new javax.swing.JRadioButton();
        genderOtherOp = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        nationalityFld = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contactNumberOptionalFLd = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        emailIdFld = new javax.swing.JTextField();
        mobileNumberLbl = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        deliveryResidentalChk = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        postalResidentalChk = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        residentalCountryFld = new javax.swing.JTextField();
        residentalPostalCodeFLd = new javax.swing.JTextField();
        residentalStateFld = new javax.swing.JTextField();
        residentalTownFld = new javax.swing.JTextField();
        residentalSuburbFld = new javax.swing.JTextField();
        residentalAddressLine2Fld = new javax.swing.JTextField();
        residentalAddressLine1Fld = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        customerIDFld = new javax.swing.JTextField();
        customerStatusActiveOp = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        customerStatusInactiveOp = new javax.swing.JRadioButton();
        customerStatusDisabledOp = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        deliveryAddressLine1Fld = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        deliveryAddressLine2Fld = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        deliverySuburbFld = new javax.swing.JTextField();
        deliveryTownFld = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        deliveryCountryFld = new javax.swing.JTextField();
        deliveryPostalCodeFLd = new javax.swing.JTextField();
        deliveryStateFld = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        postalCountryFld = new javax.swing.JTextField();
        postalPostalCodeFLd = new javax.swing.JTextField();
        postalStateFld = new javax.swing.JTextField();
        postalTownFld = new javax.swing.JTextField();
        postalSuburbFld = new javax.swing.JTextField();
        postalAddressLine2Fld = new javax.swing.JTextField();
        postalAddressLine1Fld = new javax.swing.JTextField();
        updateUserDetailsBtn = new javax.swing.JButton();
        deleteUserDetailsBtn = new javax.swing.JButton();
        cancelUserDetailsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewCustomerDetailsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "Salutation", "Full Name", "Gender", "Nationality", "Contact", "Contact (Optional)", "Email ID", "Customer ID", "Customer Status", "Residental Address Line 1", "Residental Address Line 2", "Residental Suburb", "Residental Town", "Residental State", "Residental PostCode", "Residental Country", "Delivery Address Line 1", "Delivery Address Line 2", "Delivery Suburb", "Delivery Town", "Delivery State", "Delivery PostCode", "Delivery Country", "Postal Address Line 1", "Postal Address Line 2", "Postal Suburb", "Postal Town", "Postal State", "Postal PostCode", "Postal Country"
            }
        ));
        viewCustomerDetailsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCustomerDetailsTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewCustomerDetailsTbl);
        if (viewCustomerDetailsTbl.getColumnModel().getColumnCount() > 0) {
            viewCustomerDetailsTbl.getColumnModel().getColumn(6).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(6).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(6).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(7).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(7).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(7).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(10).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(10).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(10).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(11).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(11).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(11).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(12).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(12).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(12).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(13).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(13).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(13).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(14).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(14).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(14).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(15).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(15).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(15).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(16).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(16).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(16).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(17).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(17).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(17).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(18).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(18).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(18).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(19).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(19).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(19).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(20).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(20).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(20).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(21).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(21).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(21).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(22).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(22).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(22).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(23).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(23).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(23).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(24).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(24).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(24).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(25).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(25).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(25).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(26).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(26).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(26).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(27).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(27).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(27).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(28).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(28).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(28).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(29).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(29).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(29).setMaxWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(30).setMinWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(30).setPreferredWidth(0);
            viewCustomerDetailsTbl.getColumnModel().getColumn(30).setMaxWidth(0);
        }

        jLabel4.setText("Salutation: ");

        buttonGroup1.add(titleMrOp);
        titleMrOp.setText("Mr.");

        buttonGroup1.add(titleMrsOp);
        titleMrsOp.setText("Mrs.");

        buttonGroup1.add(titleMsOp);
        titleMsOp.setText("Ms.");

        buttonGroup1.add(titleOtherOp);
        titleOtherOp.setText("Other");

        jLabel5.setText("Full Name:");

        jLabel6.setText("Gender:");

        buttonGroup2.add(genderMaleOp);
        genderMaleOp.setText("Male");

        buttonGroup2.add(genderFemaleOp);
        genderFemaleOp.setText("Female");

        buttonGroup2.add(genderOtherOp);
        genderOtherOp.setText("Other");

        jLabel10.setText("Nationality:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Contact Information");

        jLabel23.setText("Mobile Number:");

        jLabel8.setText("Contact Number (Optional): ");

        jLabel24.setText("Email ID:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Address Details");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Residental Address Details");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Delivery Address Details");

        deliveryResidentalChk.setText("Same as Residental Address: ");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Postal Address Details");

        postalResidentalChk.setText("Same as Residental Address: ");

        jLabel1.setText("Address Line 1: ");

        jLabel3.setText("Address Line 2:");

        jLabel7.setText("Suburb: ");

        jLabel9.setText("Town: ");

        jLabel11.setText("State: ");

        jLabel13.setText("PostCode: ");

        jLabel12.setText("Country: ");

        jLabel36.setText("Customer ID: ");

        customerIDFld.setEditable(false);

        buttonGroup3.add(customerStatusActiveOp);
        customerStatusActiveOp.setText("Active");

        jLabel2.setText("Customer Status: ");

        buttonGroup3.add(customerStatusInactiveOp);
        customerStatusInactiveOp.setText("Inactive");

        buttonGroup3.add(customerStatusDisabledOp);
        customerStatusDisabledOp.setText("Disabled");

        jLabel15.setText("Address Line 1: ");

        jLabel16.setText("Address Line 2:");

        jLabel17.setText("Suburb: ");

        jLabel18.setText("Town: ");

        jLabel19.setText("State: ");

        jLabel20.setText("PostCode: ");

        jLabel21.setText("Country: ");

        jLabel22.setText("Address Line 1: ");

        jLabel26.setText("Address Line 2:");

        jLabel28.setText("Suburb: ");

        jLabel29.setText("Town: ");

        jLabel30.setText("State: ");

        jLabel31.setText("PostCode: ");

        jLabel34.setText("Country: ");

        updateUserDetailsBtn.setForeground(new java.awt.Color(102, 204, 0));
        updateUserDetailsBtn.setText("Update");
        updateUserDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserDetailsBtnActionPerformed(evt);
            }
        });

        deleteUserDetailsBtn.setForeground(new java.awt.Color(255, 0, 0));
        deleteUserDetailsBtn.setText("Delete");
        deleteUserDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserDetailsBtnActionPerformed(evt);
            }
        });

        cancelUserDetailsBtn.setText("Cancel");
        cancelUserDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelUserDetailsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleMrOp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleMrsOp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleMsOp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleOtherOp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameFld)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(genderMaleOp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genderFemaleOp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genderOtherOp)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nationalityFld, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel11))
                                    .addGap(29, 29, 29)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(residentalSuburbFld)
                                        .addComponent(residentalTownFld)
                                        .addComponent(residentalStateFld)
                                        .addComponent(residentalPostalCodeFLd)
                                        .addComponent(residentalCountryFld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(residentalAddressLine1Fld, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(residentalAddressLine2Fld, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(65, 65, 65)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel19))
                                    .addGap(29, 29, 29)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(deliverySuburbFld)
                                        .addComponent(deliveryTownFld)
                                        .addComponent(deliveryStateFld)
                                        .addComponent(deliveryPostalCodeFLd)
                                        .addComponent(deliveryCountryFld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(deliveryAddressLine2Fld, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(deliveryAddressLine1Fld, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(121, 121, 121)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel29)
                                        .addComponent(jLabel34)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel30))
                                    .addGap(29, 29, 29)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(postalSuburbFld)
                                        .addComponent(postalTownFld)
                                        .addComponent(postalStateFld)
                                        .addComponent(postalPostalCodeFLd)
                                        .addComponent(postalCountryFld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(postalAddressLine1Fld, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(postalAddressLine2Fld, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(deleteUserDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateUserDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelUserDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel36)
                            .addGap(18, 18, 18)
                            .addComponent(customerIDFld, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(customerStatusActiveOp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(customerStatusInactiveOp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(customerStatusDisabledOp))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel25))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mobileNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(contactNumberOptionalFLd, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(emailIdFld, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(jLabel32)
                            .addGap(232, 232, 232)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(deliveryResidentalChk)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel33)))
                            .addGap(247, 247, 247)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel35))
                                .addComponent(postalResidentalChk)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(titleOtherOp)
                    .addComponent(titleMsOp)
                    .addComponent(titleMrsOp)
                    .addComponent(titleMrOp)
                    .addComponent(jLabel4)
                    .addComponent(nameFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(genderMaleOp)
                    .addComponent(genderFemaleOp)
                    .addComponent(genderOtherOp)
                    .addComponent(jLabel10)
                    .addComponent(nationalityFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel27))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(customerIDFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerStatusActiveOp)
                            .addComponent(jLabel2)
                            .addComponent(customerStatusInactiveOp)
                            .addComponent(customerStatusDisabledOp))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel8)
                            .addComponent(contactNumberOptionalFLd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(emailIdFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deliveryResidentalChk))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(postalResidentalChk)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(residentalAddressLine1Fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(residentalAddressLine2Fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(residentalSuburbFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(residentalTownFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(residentalStateFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(residentalPostalCodeFLd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(residentalCountryFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel22)
                                            .addComponent(postalAddressLine1Fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(postalAddressLine2Fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(updateUserDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(postalSuburbFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(postalTownFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(postalStateFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(postalPostalCodeFLd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(postalCountryFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(deliveryAddressLine1Fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deliveryAddressLine2Fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(deliverySuburbFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(deliveryTownFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(deliveryStateFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(deliveryPostalCodeFLd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(deliveryCountryFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(deleteUserDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelUserDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewCustomerDetailsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustomerDetailsTblMouseClicked
        //Display the selected fields in the Text Box
        int i = viewCustomerDetailsTbl.getSelectedRow();
        TableModel model= viewCustomerDetailsTbl.getModel();
        
        String salutation = model.getValueAt(i,1).toString();
        if(salutation.equals("Mr")){
            titleMrOp.setSelected(true);
            titleMrsOp.setSelected(false);
            titleMsOp.setSelected(false);
            titleOtherOp.setSelected(false);
        }if(salutation.equals("Mrs")){
            titleMrOp.setSelected(false);
            titleMrsOp.setSelected(true);
            titleMsOp.setSelected(false);
            titleOtherOp.setSelected(false);
        }if(salutation.equals("Ms")){
            titleMrOp.setSelected(false);
            titleMrsOp.setSelected(false);
            titleMsOp.setSelected(true);
            titleOtherOp.setSelected(false);
        }if(salutation.equals("Other")){
            titleMrOp.setSelected(false);
            titleMrsOp.setSelected(false);
            titleMsOp.setSelected(false);
            titleOtherOp.setSelected(true);
        }
        nameFld.setText(model.getValueAt(i,2).toString());
        String gender = model.getValueAt(i,3).toString();
        if(gender.equals("Male")){
            genderMaleOp.setSelected(true);
            genderFemaleOp.setSelected(false);
            genderOtherOp.setSelected(false);
        }if(gender.equals("Female")){
            genderMaleOp.setSelected(false);
            genderFemaleOp.setSelected(true);
            genderOtherOp.setSelected(false);
        }if(gender.equals("other")){
            genderMaleOp.setSelected(false);
            genderFemaleOp.setSelected(false);
            genderOtherOp.setSelected(true);
        }
        nationalityFld.setText(model.getValueAt(i,4).toString());
        mobileNumberLbl.setText(model.getValueAt(i,5).toString());
        contactNumberOptionalFLd.setText(model.getValueAt(i,6).toString());
        emailIdFld.setText(model.getValueAt(i,7).toString());
        customerIDFld.setText(model.getValueAt(i,8).toString());
        String customerStatus = model.getValueAt(i,9).toString();
        if(customerStatus.equals("Active")){
            customerStatusActiveOp.setSelected(true);
            customerStatusInactiveOp.setSelected(false);
            customerStatusDisabledOp.setSelected(false);
        }if(customerStatus.equals("Inactive")){
            customerStatusActiveOp.setSelected(false);
            customerStatusInactiveOp.setSelected(true);
            customerStatusDisabledOp.setSelected(false);
        }if(customerStatus.equals("Disabled")){
            customerStatusActiveOp.setSelected(false);
            customerStatusInactiveOp.setSelected(false);
            customerStatusDisabledOp.setSelected(true);
        }
        residentalAddressLine1Fld.setText(model.getValueAt(i,10).toString());
        residentalAddressLine2Fld.setText(model.getValueAt(i,11).toString());
        residentalSuburbFld.setText(model.getValueAt(i,12).toString());
        residentalTownFld.setText(model.getValueAt(i,13).toString());
        residentalStateFld.setText(model.getValueAt(i,14).toString());
        residentalPostalCodeFLd.setText(model.getValueAt(i,15).toString());
        residentalCountryFld.setText(model.getValueAt(i,16).toString());
        deliveryAddressLine1Fld.setText(model.getValueAt(i,17).toString());
        deliveryAddressLine2Fld.setText(model.getValueAt(i,18).toString());
        deliverySuburbFld.setText(model.getValueAt(i,19).toString());
        deliveryTownFld.setText(model.getValueAt(i,20).toString());
        deliveryStateFld.setText(model.getValueAt(i,21).toString());
        deliveryPostalCodeFLd.setText(model.getValueAt(i,22).toString());
        deliveryCountryFld.setText(model.getValueAt(i,23).toString());
        postalAddressLine1Fld.setText(model.getValueAt(i,24).toString());
        postalAddressLine2Fld.setText(model.getValueAt(i,25).toString());
        postalSuburbFld.setText(model.getValueAt(i,26).toString());
        postalTownFld.setText(model.getValueAt(i,27).toString());
        postalStateFld.setText(model.getValueAt(i,28).toString());
        postalPostalCodeFLd.setText(model.getValueAt(i,29).toString());
        postalCountryFld.setText(model.getValueAt(i,30).toString());
    }//GEN-LAST:event_viewCustomerDetailsTblMouseClicked

    private void updateUserDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserDetailsBtnActionPerformed
        //Objects to Show Cancel Employee Registration Message 
        MessageParamClass message = new MessageParamClass("Update Customer Details?", "EbsoniomSquare Message?"); 
        int returnOptionValue = message.showConfirmDialog();
        if(returnOptionValue==0){ //value of yes = 0
            try {
                //defining datatypes and variables
                String salutation = null;
                if(titleMrOp.isSelected()){
                    salutation="Mr";
                }if(titleMrsOp.isSelected()){
                    salutation="Mrs";
                }if(titleMsOp.isSelected()){
                    salutation="Ms";
                }if(titleOtherOp.isSelected()){
                    salutation= "Other";
                }
                String name = nameFld.getText();
                String gender = null;
                if(genderMaleOp.isSelected()){
                    gender="Male";
                }if(genderFemaleOp.isSelected()){
                    gender="Female";
                }if(genderOtherOp.isSelected()){
                    gender="Other";
                }

                String nationality= nationalityFld.getText();
                String contact = mobileNumberLbl.getText();
                String contactOptional = contactNumberOptionalFLd.getText();
                String email = emailIdFld.getText();
                String residentalAddressLine1 = residentalAddressLine1Fld.getText();
                String residentalAddressLine2 = residentalAddressLine2Fld.getText();
                String residentalSuburb = residentalSuburbFld.getText();
                String residentalTown = residentalTownFld.getText();
                String residentalState = residentalStateFld.getText();
                String residentalPostalCode = residentalPostalCodeFLd.getText();
                String residentalCountry = residentalCountryFld.getText();
                String deliveryAddressLine1, deliveryAddressLine2, deliverySuburb, deliveryTown,
                        deliveryState, deliveryPostalCode, deliveryCountry, postalAddressLine1, 
                        postalAddressLine2, postalSuburb, postalTown, postalState, 
                        postalPostalCode, postalCountry;
                if(deliveryResidentalChk.isSelected()){
                    deliveryAddressLine1 = residentalAddressLine1;
                    deliveryAddressLine2 = residentalAddressLine2;
                    deliverySuburb = residentalSuburb;
                    deliveryTown = residentalTown;
                    deliveryState = residentalState;
                    deliveryPostalCode = residentalPostalCode;
                    deliveryCountry = residentalCountry;
                }else{
                    deliveryAddressLine1 = deliveryAddressLine1Fld.getText();
                    deliveryAddressLine2 = deliveryAddressLine2Fld.getText();
                    deliverySuburb = deliverySuburbFld.getText();
                    deliveryTown = deliveryTownFld.getText();
                    deliveryState = deliveryStateFld.getText();
                    deliveryPostalCode = deliveryPostalCodeFLd.getText();
                    deliveryCountry = deliveryCountryFld.getText();
                }
                if(postalResidentalChk.isSelected()){
                    postalAddressLine1 = residentalAddressLine1;
                    postalAddressLine2 = residentalAddressLine2;
                    postalSuburb = residentalSuburb;
                    postalTown = residentalTown;
                    postalState = residentalState;
                    postalPostalCode = residentalPostalCode;
                    postalCountry = residentalCountry;
                }else{
                    postalAddressLine1 = postalAddressLine1Fld.getText();
                    postalAddressLine2 = postalAddressLine2Fld.getText();
                    postalSuburb = postalSuburbFld.getText();
                    postalTown = postalTownFld.getText();
                    postalState = postalStateFld.getText();
                    postalPostalCode = postalPostalCodeFLd.getText();
                    postalCountry = postalCountryFld.getText();
                }
                String customerStatus = null;
                if(customerStatusActiveOp.isSelected()){
                    customerStatus="0";
                }if(customerStatusInactiveOp.isSelected()){
                    customerStatus="1";
                }if(customerStatusDisabledOp.isSelected()){
                    customerStatus="2";
                }
                String customerID = customerIDFld.getText();

                //Inserting the values in the CUSTOMER_DETAILS table to register a new user                             
                String sqlQuery = "UPDATE CUSTOMER_DETAILS SET SALUTATION = '"+salutation+"', "
                        + " FULL_NAME = '"+name+"', GENDER = '"+gender+"', NATIONALITY = '"+nationality+"', "
                        + " CONTACT = '"+contact+"', CONTACT_OPTIONAL = '"+contactOptional+"', EMAIL_ID = '"+email+"',"
                        + " R_ADDRESS_LINE_1 = '"+residentalAddressLine1+"', R_ADDRESS_LINE_2 = '"+residentalAddressLine2+"', "
                        + " R_SUBURB = '"+residentalSuburb+"', R_TOWN = '"+residentalTown+"', R_STATE = '"+residentalState+"', "
                        + " R_POSTCODE = '"+residentalPostalCode+"', R_COUNTRY = '"+residentalCountry+"', "
                        + " D_ADDRESS_LINE_1 = '"+deliveryAddressLine1+"', D_ADDRESS_LINE_2 = '"+deliveryAddressLine2+"', "
                        + " D_SUBURB = '"+deliverySuburb+"', D_TOWN = '"+deliveryTown+"', D_STATE = '"+deliveryState+"', "
                        + " D_POSTCODE = '"+deliveryPostalCode+"', D_COUNTRY = '"+deliveryCountry+"', "
                        + " P_ADDRESS_LINE_1 = '"+postalAddressLine1+"', P_ADDRESS_LINE_2 = '"+postalAddressLine2+"', "
                        + " P_SUBURB = '"+postalSuburb+"', P_TOWN = '"+postalTown+"', P_STATE = '"+postalState+"', "
                        + " P_POSTCODE = '"+postalPostalCode+"', P_COUNTRY = '"+postalCountry+"', IS_DEL = '"+customerStatus+"' "
                        + " WHERE CUSTOMER_ID = '"+customerID+"' ";
                
                //Invoking DBConnClass to Insert the data in the database
                DBConnClass.setData(sqlQuery);

                //Objects to Show Successful Message Registration
                message = new MessageParamClass("Customer Updated Successfully", "EbsoniomSquare Message");
                message.showMessageDialog();

                //Invoking the Customer Main Panel 
                setVisible(false);
                CustomerPanelMain frame = new CustomerPanelMain();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(ManagementMain.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_updateUserDetailsBtnActionPerformed

    private void cancelUserDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelUserDetailsBtnActionPerformed
        //Objects to Show Cancel Customer Details Update Message 
        MessageParamClass message = new MessageParamClass("Sure to Cancel?", "EbsoniomSsquare Message"); 
        int returnOptionValue = message.showConfirmDialog();
       
      if(returnOptionValue==0){  //value of yes = 0
        CustomerPanelMain frame = new CustomerPanelMain();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(ManagementMain.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        setVisible(false);
      }
    }//GEN-LAST:event_cancelUserDetailsBtnActionPerformed

    private void deleteUserDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserDetailsBtnActionPerformed
        //Objects to Show Delete Employee Registration Message 
        MessageParamClass message = new MessageParamClass("Delete Customer Details?", "EbsoniomSquare Message?"); 
        int returnOptionValue = message.showConfirmDialog();
        if(returnOptionValue==0){ //value of yes = 0
            try {
                String customerID = customerIDFld.getText();
                String sqlQuery = "DELETE FROM CUSTOMER_DETAILS WHERE CUSTOMER_ID = '"+customerID+"' ";
                
                //Invoking DBConnClass to Insert the data in the database
                DBConnClass.setData(sqlQuery);

                //Objects to Show Successful Message Registration
                message = new MessageParamClass("Customer Deleted Successfully", "EbsoniomSquare Message");
                message.showMessageDialog();

                //Invoking the Customer Main Panel 
                setVisible(false);
                CustomerPanelMain frame = new CustomerPanelMain();
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(ManagementMain.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
            }catch (Exception ex) {
                System.out.println(ex);
            }
        } 
    }//GEN-LAST:event_deleteUserDetailsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerViewDetailsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerViewDetailsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerViewDetailsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerViewDetailsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerViewDetailsMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton cancelUserDetailsBtn;
    private javax.swing.JTextField contactNumberOptionalFLd;
    private javax.swing.JTextField customerIDFld;
    private javax.swing.JRadioButton customerStatusActiveOp;
    private javax.swing.JRadioButton customerStatusDisabledOp;
    private javax.swing.JRadioButton customerStatusInactiveOp;
    private javax.swing.JButton deleteUserDetailsBtn;
    private javax.swing.JTextField deliveryAddressLine1Fld;
    private javax.swing.JTextField deliveryAddressLine2Fld;
    private javax.swing.JTextField deliveryCountryFld;
    private javax.swing.JTextField deliveryPostalCodeFLd;
    private javax.swing.JCheckBox deliveryResidentalChk;
    private javax.swing.JTextField deliveryStateFld;
    private javax.swing.JTextField deliverySuburbFld;
    private javax.swing.JTextField deliveryTownFld;
    private javax.swing.JTextField emailIdFld;
    private javax.swing.JRadioButton genderFemaleOp;
    private javax.swing.JRadioButton genderMaleOp;
    private javax.swing.JRadioButton genderOtherOp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobileNumberLbl;
    private javax.swing.JTextField nameFld;
    private javax.swing.JTextField nationalityFld;
    private javax.swing.JTextField postalAddressLine1Fld;
    private javax.swing.JTextField postalAddressLine2Fld;
    private javax.swing.JTextField postalCountryFld;
    private javax.swing.JTextField postalPostalCodeFLd;
    private javax.swing.JCheckBox postalResidentalChk;
    private javax.swing.JTextField postalStateFld;
    private javax.swing.JTextField postalSuburbFld;
    private javax.swing.JTextField postalTownFld;
    private javax.swing.JTextField residentalAddressLine1Fld;
    private javax.swing.JTextField residentalAddressLine2Fld;
    private javax.swing.JTextField residentalCountryFld;
    private javax.swing.JTextField residentalPostalCodeFLd;
    private javax.swing.JTextField residentalStateFld;
    private javax.swing.JTextField residentalSuburbFld;
    private javax.swing.JTextField residentalTownFld;
    private javax.swing.JRadioButton titleMrOp;
    private javax.swing.JRadioButton titleMrsOp;
    private javax.swing.JRadioButton titleMsOp;
    private javax.swing.JRadioButton titleOtherOp;
    private javax.swing.JButton updateUserDetailsBtn;
    private javax.swing.JTable viewCustomerDetailsTbl;
    // End of variables declaration//GEN-END:variables
}
