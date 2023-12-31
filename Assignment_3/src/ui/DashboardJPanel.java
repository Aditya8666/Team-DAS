/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author adityagurram
 */
public class DashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DashboardJPanel
     */
    public DashboardJPanel() {
        initComponents();
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
        btnCourseRegistration = new javax.swing.JButton();
        btnFeeDetails = new javax.swing.JButton();
        btnClasses = new javax.swing.JButton();
        btnAssignments = new javax.swing.JButton();
        btnGrades = new javax.swing.JButton();
        btnMyProfile = new javax.swing.JButton();
        btnExamSchedule = new javax.swing.JButton();
        btnBacklogs = new javax.swing.JButton();
        btnStudentEmployment = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btnCourseRegistration.setBackground(new java.awt.Color(102, 102, 102));
        btnCourseRegistration.setForeground(new java.awt.Color(255, 255, 255));
        btnCourseRegistration.setText("Course Registration ");

        btnFeeDetails.setBackground(new java.awt.Color(102, 102, 102));
        btnFeeDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnFeeDetails.setText("Fee Details");

        btnClasses.setBackground(new java.awt.Color(102, 102, 102));
        btnClasses.setForeground(new java.awt.Color(255, 255, 255));
        btnClasses.setText("Classes");

        btnAssignments.setBackground(new java.awt.Color(102, 102, 102));
        btnAssignments.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignments.setText("Assignments");

        btnGrades.setBackground(new java.awt.Color(102, 102, 102));
        btnGrades.setForeground(new java.awt.Color(255, 255, 255));
        btnGrades.setText("Grades");

        btnMyProfile.setBackground(new java.awt.Color(102, 102, 102));
        btnMyProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnMyProfile.setText("My Profile");

        btnExamSchedule.setBackground(new java.awt.Color(102, 102, 102));
        btnExamSchedule.setForeground(new java.awt.Color(255, 255, 255));
        btnExamSchedule.setText("Exam Schedule");

        btnBacklogs.setBackground(new java.awt.Color(102, 102, 102));
        btnBacklogs.setForeground(new java.awt.Color(255, 255, 255));
        btnBacklogs.setText("Backlogs");

        btnStudentEmployment.setBackground(new java.awt.Color(102, 102, 102));
        btnStudentEmployment.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentEmployment.setText("Student Employment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnStudentEmployment)
                    .addComponent(btnBacklogs)
                    .addComponent(btnExamSchedule)
                    .addComponent(btnMyProfile)
                    .addComponent(btnGrades)
                    .addComponent(btnAssignments)
                    .addComponent(btnClasses)
                    .addComponent(btnFeeDetails)
                    .addComponent(btnCourseRegistration))
                .addContainerGap(632, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAssignments, btnBacklogs, btnClasses, btnCourseRegistration, btnExamSchedule, btnFeeDetails, btnGrades, btnMyProfile, btnStudentEmployment});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnMyProfile)
                .addGap(18, 18, 18)
                .addComponent(btnCourseRegistration)
                .addGap(18, 18, 18)
                .addComponent(btnFeeDetails)
                .addGap(18, 18, 18)
                .addComponent(btnClasses)
                .addGap(18, 18, 18)
                .addComponent(btnAssignments)
                .addGap(18, 18, 18)
                .addComponent(btnGrades)
                .addGap(18, 18, 18)
                .addComponent(btnExamSchedule)
                .addGap(18, 18, 18)
                .addComponent(btnBacklogs)
                .addGap(18, 18, 18)
                .addComponent(btnStudentEmployment)
                .addContainerGap(175, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignments;
    private javax.swing.JButton btnBacklogs;
    private javax.swing.JButton btnClasses;
    private javax.swing.JButton btnCourseRegistration;
    private javax.swing.JButton btnExamSchedule;
    private javax.swing.JButton btnFeeDetails;
    private javax.swing.JButton btnGrades;
    private javax.swing.JButton btnMyProfile;
    private javax.swing.JButton btnStudentEmployment;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
