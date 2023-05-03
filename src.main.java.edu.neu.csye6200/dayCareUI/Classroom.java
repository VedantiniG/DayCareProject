/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dayCareUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import models.ClassRoom;
import models.Demo;
import models.School;
import models.Student;

/**
 *
 * @author saisumanthkammalshetty
 */
public class Classroom extends javax.swing.JPanel {

    /**
     * Creates new form Classroom
     */
    public Classroom() {
        initComponents();
        List<String> ageGroupTypes = new ArrayList<>(Demo.studentRatioRules.keySet());
         Vector<String> studentList = new Vector<>(); 
        for (String tk : ageGroupTypes){
            studentList.add(String.valueOf(tk));
        }
        classRoomsCombo.setModel(new DefaultComboBoxModel(studentList));
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        classRoomsCombo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tsTable = new javax.swing.JTable();
        showStudentBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setForeground(new java.awt.Color(255, 204, 0));

        jLabel1.setText("Age-Group");

        classRoomsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        classRoomsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classRoomsComboActionPerformed(evt);
            }
        });

        tsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Teacher", "Student Count", "Classroom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tsTable);

        showStudentBtn.setBackground(new java.awt.Color(102, 102, 102));
        showStudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        showStudentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/confirmation.png"))); // NOI18N
        showStudentBtn.setText("Show Students");
        showStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStudentBtnActionPerformed(evt);
            }
        });

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Students"
            }
        ));
        jScrollPane3.setViewportView(studentTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classRoomsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(showStudentBtn)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(classRoomsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showStudentBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStudentBtnActionPerformed
       this.populateStuds();   // TODO add your handling code here:
    }//GEN-LAST:event_showStudentBtnActionPerformed

    private void classRoomsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classRoomsComboActionPerformed
        this.populateData();        // TODO add your handling code here:
    }//GEN-LAST:event_classRoomsComboActionPerformed
 private void populateStuds(){
        DefaultTableModel dtm = (DefaultTableModel) studentTable.getModel();
        
        int rowCount = dtm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
         dtm.removeRow(i);
        }
        studentTable.removeAll();
        int index = tsTable.getSelectedRow();
        String ageGrp = classRoomsCombo.getSelectedItem().toString();
        List<ClassRoom> clRooms = School.classrooms.stream().filter(e-> e.getAgeGroup()!=null && e.getAgeGroup().equalsIgnoreCase(ageGrp)).collect(Collectors.toList());
        for(ClassRoom classRoom : clRooms){
           Map<String,List<Student>> teacherStudent = classRoom.getStudentTeacherGroup();
          Object teacher =  teacherStudent.keySet().toArray()[index];
            for(Student stud : teacherStudent.get(teacher.toString()) ){
             Object [] row = new Object[1];
                row[0] = stud.getName();
                dtm.addRow(row);
           }
        }

    }
    private void populateData(){
        System.out.print(classRoomsCombo.getSelectedItem());
        String ageGrp = classRoomsCombo.getSelectedItem().toString();
        List<ClassRoom> clRooms = School.classrooms.stream().filter(e-> e.getAgeGroup()!=null && e.getAgeGroup().equalsIgnoreCase(ageGrp)).collect(Collectors.toList());
        DefaultTableModel dtm = (DefaultTableModel) tsTable.getModel();
        dtm.setRowCount(0);
        int count = 0;
        for(ClassRoom classRoom : clRooms){
           Map<String,List<Student>> teacherStudent = classRoom.getStudentTeacherGroup();
            for (Map.Entry<String,List<Student>> ts : teacherStudent.entrySet()) {
                Object [] row = new Object[3];
                row[0] = ts.getKey();
                row[1] = ts.getValue().size();
                row[2] = "Class-"+ (++count);            
                dtm.addRow(row);
          //      populateStuds(ts.getValue());
           }
        }
//        for(ClassRoom classRoom : clRooms){
//            Object [] row = new Object[5];
//            row[0] = classRoom;
//            row[1] = pk.getId();
//            row[2] = pk.getAge();
//            row[3] = String.valueOf(pk.getDateOfBirth());
//            row[4] = pk.getGpa();
//            dtm.addRow(row);
//        }
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> classRoomsCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton showStudentBtn;
    private javax.swing.JTable studentTable;
    private javax.swing.JTable tsTable;
    // End of variables declaration//GEN-END:variables
}
