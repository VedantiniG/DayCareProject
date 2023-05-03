/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayCareUI;

import controllers.StudentController;
import models.Student;
import models.StudentFactory;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import utility.ClearUtility;
import utility.Validation;

/**
 *
 * 
 */
public class AddStudentInfo extends javax.swing.JPanel {

    /**
     * Creates new form AddStudentInfo
     */
    public AddStudentInfo() {
        initComponents();
        Vvaccine1.setVisible(false);
         Vvaccine2.setVisible(false);
         txtContactName.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbDataOfBirth = new javax.swing.JLabel();
        jTFDOB = new javax.swing.JTextField();
        lbDataOfBirth1 = new javax.swing.JLabel();
        txtGPA = new javax.swing.JTextField();
        txtContactName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMMR1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMMR2 = new javax.swing.JTextField();
        Vvaccine1 = new javax.swing.JTextField();
        Vvaccine2 = new javax.swing.JTextField();
        jTFAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        teacherAssigned = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        lbName.setText("Name :");

        lbDataOfBirth.setText("Date of Birth :");

        lbDataOfBirth1.setText("GPA :");

        txtContactName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Contact Phone :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add Student Details ");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-user.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Vaccine 1st Dose :");

        jLabel5.setText("Vaccine 2nd Dose :");

        jTFAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFAgeFocusLost(evt);
            }
        });
        jTFAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAgeActionPerformed(evt);
            }
        });

        jLabel8.setText("Age :");

        jTFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIDActionPerformed(evt);
            }
        });

        jLabel9.setText("Student ID :");

        jLabel10.setText("Teacher Assigned");

        teacherAssigned.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDataOfBirth1)
                            .addComponent(lbDataOfBirth)
                            .addComponent(lbName)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFAge, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(38, 38, 38))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel9))
                                        .addGap(34, 34, 34)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMMR1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMMR2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teacherAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContactName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Vvaccine1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Vvaccine2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbName)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMMR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDataOfBirth)
                            .addComponent(jTFDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtMMR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vvaccine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataOfBirth1)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vvaccine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTFAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNameActionPerformed

    private void jTFAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAgeActionPerformed
        System.out.println(jTFAge.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAgeActionPerformed

    private void jTFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //        int id, Date dob, int age, String name, double gpa
        boolean validateStudentId = Validation.validateStudentID(jTFID);
        boolean validateStudentName = Validation.validateName(txtName);
//        String studentName = txtName.getText();
        boolean validateStudentGpa = Validation.validateGpa(txtGPA);
//        Double GPA = Double.parseDouble(txtGPA.getText());
        boolean validateStudentAge = Validation.validateAge(jTFAge);
//        Integer Age = Integer.parseInt(jTFAge.getText());
        String dateOfBirthStudent = jTFDOB.getText();
        boolean validateDateOfBirth = Validation.validateDateOfBirth(dateOfBirthStudent);
        boolean validateContactName = Validation.validateName(txtContactName);
        boolean validateContactPhone = Validation.validatePhoneNumber(txtPhone);
        
        Date dob = null;
        try {
            dob = new SimpleDateFormat("MM-dd-yyyy").parse(dateOfBirthStudent);
        } catch (Exception e) {
            System.err.println("Exception ocurred : " + e);
        }
        if(validateStudentId && validateStudentName && 
                validateStudentGpa && validateDateOfBirth && validateContactName
                && validateContactPhone){
               System.out.println("Inside IF block for adding student to system");
            int studentId =  Integer.parseInt(jTFID.getText());
            int studentAge = Integer.parseInt(jTFAge.getText());
            String stundentName = txtName.getText();
            Double stundentGpa = Double.parseDouble(txtGPA.getText());
            String contactName = txtContactName.getText();
            String contactPhone = txtPhone.getText();
            String mmrVacc1 = txtMMR1.getText();
            String mmrVacc2 = txtMMR2.getText();
            String varicella1 = Vvaccine1.getText();
            String varicella2 = Vvaccine2.getText();
            String teacherAssigned1 = teacherAssigned.getSelectedItem().toString();
            Date mmrVaccine1 = null;
            try {
                mmrVaccine1 = new SimpleDateFormat("MM-dd-yyyy").parse(mmrVacc1);
            } catch (Exception e) {
                System.err.println("Exception ocurred : " + e);
            }
            
            Date mmrVaccine2 = null;
            try {
                mmrVaccine2 = new SimpleDateFormat("MM-dd-yyyy").parse(mmrVacc2);
            } catch (Exception e) {
                System.err.println("Exception ocurred : " + e);
            }
            
            Date varicellaDate1 = null;
            try {
                varicellaDate1 = new SimpleDateFormat("MM-dd-yyyy").parse(varicella1);
            } catch (Exception e) {
                System.err.println("Exception ocurred : " + e);
            }
            
            Date varicellaDate2 = null;
            try {
                varicellaDate2 = new SimpleDateFormat("MM-dd-yyyy").parse(varicella2);
            } catch (Exception e) {
                System.err.println("Exception ocurred : " + e);
            }
            
            Student studentObj = StudentController.getInstance().getObject(studentId, dob,
                    studentAge, stundentName, stundentGpa, contactName, contactPhone,
                    mmrVaccine1, mmrVaccine2, varicellaDate1, varicellaDate2,teacherAssigned1
                    );
            
            
            JOptionPane.showMessageDialog(this, "Added Stundet Details Successfully");
            JTextField[] jk = new JTextField[] {txtName, txtContactName, txtGPA, txtMMR1, txtMMR2, txtGPA,
                        txtPhone, jTFID, jTFDOB, jTFAge, Vvaccine1, Vvaccine2};
            
            ClearUtility.clearTextField(jk);
            clearTeacherAssign();
        }else {
            String errorMessage = String.format("Teacher info NOT SAVED!!! \n"
                    + "Student-ID valid: %s \n Student Name Valid : %s \n"
                    + "Gpa Valid : %s\n Date Of Birth Valid : %s \n"
                    + "contactPhoneValidation Valid : %s \n" + "Contact Name Validation : %s \n"
                    ,
                    validateStudentId, validateStudentName, validateStudentGpa,
                    validateDateOfBirth, validateContactPhone, validateContactName
            );
            UIManager.put("OptionPane.minimumSize", new Dimension(300, 300));
            JOptionPane.showMessageDialog(this, errorMessage);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTFAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFAgeFocusLost
        System.out.println("lost "+jTFAge.getText());   
        List<String> teacherList  =
                StudentController.getInstance().teachList(Integer.parseInt(jTFAge.getText()));// TODO add
        // your handling code here:
        Vector<String> teacherVector = new Vector<>(); 
        for (String tk : teacherList ){
            teacherVector.add(tk);
        }
        teacherAssigned.setModel(new DefaultComboBoxModel(teacherVector));
    }//GEN-LAST:event_jTFAgeFocusLost

    public void clearTeacherAssign(){
        Vector<String> teacherVector = new Vector<>(); 
        teacherVector.add("enter Age First");
        teacherAssigned.setModel(new DefaultComboBoxModel(teacherVector));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Vvaccine1;
    private javax.swing.JTextField Vvaccine2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFAge;
    private javax.swing.JTextField jTFDOB;
    private javax.swing.JTextField jTFID;
    private javax.swing.JLabel lbDataOfBirth;
    private javax.swing.JLabel lbDataOfBirth1;
    private javax.swing.JLabel lbName;
    private javax.swing.JComboBox<String> teacherAssigned;
    private javax.swing.JTextField txtContactName;
    private javax.swing.JTextField txtGPA;
    private javax.swing.JTextField txtMMR1;
    private javax.swing.JTextField txtMMR2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
