/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayCareUI;

import controllers.StudentController;
import models.School;
import models.Student;
import models.StudentFactory;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import utility.ClearUtility;
import utility.Validation;

/**
 *
 * 
 */
public class ViewStudent1 extends javax.swing.JPanel {

    /**
     * Creates new form ViewStudent
     */
    School instance;
    public ViewStudent1() {
        initComponents();
        
        txtContactName.setVisible(false);
        jTFDOB.setVisible(false);
        
        this.instance = School.getInstance();
        this.populateTable();
//        this.populateVaccineTable();
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblStudent.getModel();
        dtm.setRowCount(0);
        for(Student pk : this.instance.students){
            Object [] row = new Object[5];
            row[0] = pk;
            row[1] = pk.getID();
            row[2] = pk.getAge();
            row[3] = String.valueOf(pk.getDOB());
            row[4] = pk.getGPA();
            dtm.addRow(row);
        }
    }
    
    

    
//    public void populateVaccineTable() {
//        DefaultTableModel dtm = (DefaultTableModel) tblVaccineInfo.getModel();
//        dtm.setRowCount(0);
//        for(Student pk : this.instance.studentlist){
//            Object [] row = new Object[6];
//            row[0] = pk;
//            row[1] = pk.getId();
//            row[2] = pk.getMmrVaccine1stDose();
//            row[3] = pk.getMmrVaccine2ndDose();
//            row[4] = pk.getVaricella1stDose();
//            row[5] = pk.getVaricella2ndDose();
//            dtm.addRow(row);
//        }
//    }
    
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
        tblStudent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFAge = new javax.swing.JTextField();
        txtGPA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        saveStudent = new javax.swing.JButton();
        txtPhone = new javax.swing.JTextField();
        updateStudent = new javax.swing.JButton();
        deleteStudent = new javax.swing.JButton();
        txtContactName = new javax.swing.JTextField();
        jTFDOB = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Id", "Age", "DataOfBirth", "Gpa"
            }
        ));
        jScrollPane1.setViewportView(tblStudent);
        if (tblStudent.getColumnModel().getColumnCount() > 0) {
            tblStudent.getColumnModel().getColumn(3).setMinWidth(0);
            tblStudent.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblStudent.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" VIEW STUDENT DETAILS");

        jLabel2.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        jLabel4.setText("Age");

        jTFAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAgeActionPerformed(evt);
            }
        });

        txtGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGPAActionPerformed(evt);
            }
        });

        jLabel7.setText("GPA");

        jLabel8.setText("PhoneNumber");

        saveStudent.setBackground(new java.awt.Color(102, 102, 102));
        saveStudent.setForeground(new java.awt.Color(255, 255, 255));
        saveStudent.setText("Save");
        saveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(saveStudent))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(122, 122, 122)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(jTFAge)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(76, 76, 76)
                                .addComponent(txtPhone)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(saveStudent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        updateStudent.setBackground(new java.awt.Color(102, 102, 102));
        updateStudent.setForeground(new java.awt.Color(255, 255, 255));
        updateStudent.setText("Update");
        updateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentActionPerformed(evt);
            }
        });

        deleteStudent.setBackground(new java.awt.Color(102, 102, 102));
        deleteStudent.setForeground(new java.awt.Color(255, 255, 255));
        deleteStudent.setText("Delete");
        deleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentActionPerformed(evt);
            }
        });

        txtContactName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(txtContactName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(updateStudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteStudent))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 356, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateStudent)
                            .addComponent(deleteStudent)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void updateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentActionPerformed
       System.out.print(tblStudent.getSelectedRow());
       System.out.print(School.students.get(tblStudent.getSelectedRow()));
       Student std = School.students.get(tblStudent.getSelectedRow());
       if(std!=null){
           txtName.setText(std.getName());
           jTFID.setText(String.valueOf(std.getID()));
           jTFAge.setText(String.valueOf(std.getAge()));
           jTFDOB.setText(String.valueOf(std.getDOB()));
           txtContactName.setText(String.valueOf(std.getEmergencyName()));
           txtGPA.setText(String.valueOf(std.getGPA()));
           txtPhone.setText(String.valueOf(std.getEmergencyPhone()));

       }
// TODO add your handling code here:
    }//GEN-LAST:event_updateStudentActionPerformed

    private void jTFAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAgeActionPerformed

    private void saveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveStudentActionPerformed
                // TODO add your handling code here:
                
                        // TODO add your handling code here:
        //        int id, Date dob, int age, String name, double gpa
        boolean validateStudentId = Validation.validateStudentID(jTFID);
        boolean validateStudentName = Validation.validateName(txtName);
//        String studentName = txtName.getText();
        boolean validateStudentGpa = Validation.validateGpa(txtGPA);
           Double GPA = Double.parseDouble(txtGPA.getText());
        boolean validateStudentAge = Validation.validateAge(jTFAge);
//        Integer Age = Integer.parseInt(jTFAge.getText());
        String dateOfBirthStudent = jTFDOB.getText();
        //boolean validateDateOfBirth = Validation.validateDateOfBirth(dateOfBirthStudent);
        boolean validateDateOfBirth = true;
      ///  boolean validateContactName = Validation.validateName(txtContactName);
        boolean validateContactPhone = Validation.validatePhoneNumber(txtPhone);
        
        Date dob = null;
        try {
            dob = new SimpleDateFormat("MM-dd-yyyy").parse(dateOfBirthStudent);
        } catch (Exception e) {
            System.err.println("Exception ocurred : " + e);
        }
        
        if(validateStudentId && validateStudentName && 
                validateStudentGpa && validateDateOfBirth 
                && validateContactPhone){
               System.out.println("Inside IF block for adding student to system");
            int studentId =  Integer.parseInt(jTFID.getText());
            int studentAge = Integer.parseInt(jTFAge.getText());
            String stundentName = txtName.getText();
            String Dob = jTFDOB.getText();
            Double stundentGpa = Double.parseDouble(txtGPA.getText());
        //    String contactName = txtContactName.getText();
            String contactPhone = txtPhone.getText();

/*
            String mmrVacc1 = txtMMR1.getText();
            String mmrVacc2 = txtMMR2.getText();
            String varicella1 = Vvaccine1.getText();
            String varicella2 = Vvaccine2.getText();
            
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
            */
            Student studentObj = StudentController.getInstance().getObj(studentId,
                    dob,
                    studentAge, stundentName, stundentGpa, " ", contactPhone,
                    null, null, null, null,tblStudent.getSelectedRow(), School.students.get(tblStudent.getSelectedRow()).getTeacherAssigned()
                    );
            JOptionPane.showMessageDialog(this, "Updated Successfully");
            JTextField[] jk = new JTextField[] {txtName, txtContactName, txtGPA, txtGPA,
                        txtPhone, jTFID, jTFDOB, jTFAge};
            ClearUtility.clearTextField(jk);
            this.populateTable();

        }else {
            String errorMessage = String.format("Teacher info NOT SAVED!!! \n"
                    + "Student-ID valid: %s \n Student Name Valid : %s \n"
                    + "Gpa Valid : %s\n "
                    + "contactPhoneValidation Valid : %s \n" 
                    ,
                    validateStudentId, validateStudentName, validateStudentGpa,
                    validateDateOfBirth, validateContactPhone
            );
            UIManager.put("OptionPane.minimumSize", new Dimension(300, 300));
            JOptionPane.showMessageDialog(this, errorMessage);
        }
                
                
                
                
                
                
                
                
                
    }//GEN-LAST:event_saveStudentActionPerformed

    private void txtContactNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNameActionPerformed

    private void txtGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGPAActionPerformed

    private void deleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentActionPerformed
                // TODO add your handling code here:
            StudentFactory.deletObj(tblStudent.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Added Stundet Details Successfully");
            this.populateTable();
    }//GEN-LAST:event_deleteStudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAge;
    private javax.swing.JTextField jTFDOB;
    private javax.swing.JTextField jTFID;
    private javax.swing.JButton saveStudent;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtContactName;
    private javax.swing.JTextField txtGPA;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JButton updateStudent;
    // End of variables declaration//GEN-END:variables
}
