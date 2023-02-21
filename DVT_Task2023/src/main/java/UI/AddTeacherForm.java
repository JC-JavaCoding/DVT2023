/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Color;
import java.awt.Component;

/**
 *
 * @author Jcj
 */
public class AddTeacherForm extends javax.swing.JFrame
{

    /**
     * Creates new form NewJFrame
     */
    public AddTeacherForm()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        registerClassToggleButton = new javax.swing.JToggleButton();
        birthdayFormattedField = new javax.swing.JFormattedTextField();
        numGradesSlider = new javax.swing.JSlider();
        correctInputsProgressBar = new javax.swing.JProgressBar();
        extramuralSpinner = new javax.swing.JSpinner();

        submitButton = new javax.swing.JButton();
        screenTitleLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        fullnameField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        birthdayLabel = new javax.swing.JLabel();
        numGradesLabel = new javax.swing.JLabel();
        extramuralsLabel = new javax.swing.JLabel();
        correctInputsLabel = new javax.swing.JLabel();
        fullnameLabel = new javax.swing.JLabel();
        name_warningLabel = new javax.swing.JLabel();
        birthday_warningLabel = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerClassToggleButton.setBackground(new java.awt.Color(255, 255, 255));
        registerClassToggleButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerClassToggleButton.setForeground(new java.awt.Color(102, 102, 102));
        registerClassToggleButton.setText("Register Class");
        registerClassToggleButton.setRolloverEnabled(false);
        jPanel1.add(registerClassToggleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 110, 30));

        birthdayFormattedField.setBackground(jPanel1.getBackground());
        birthdayFormattedField.setColumns(3);
        birthdayFormattedField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/y"))));
        birthdayFormattedField.setToolTipText("Write in format \"DD/MM/YYYY\"");
        jPanel1.add(birthdayFormattedField, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 146, 239, -1));

        numGradesSlider.setForeground(new java.awt.Color(102, 153, 255));
        numGradesSlider.setMajorTickSpacing(1);
        numGradesSlider.setMaximum(5);
        numGradesSlider.setMinimum(1);
        numGradesSlider.setPaintLabels(true);
        numGradesSlider.setPaintTicks(true);
        numGradesSlider.setSnapToTicks(true);
        numGradesSlider.setValue(1);
        jPanel1.add(numGradesSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 250, -1));

        correctInputsProgressBar.setBackground(jPanel1.getBackground());
        correctInputsProgressBar.setForeground(new java.awt.Color(51, 0, 51));
        correctInputsProgressBar.setMaximum(5);
        correctInputsProgressBar.setMinimum(1);
        correctInputsProgressBar.setToolTipText("");
        correctInputsProgressBar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.add(correctInputsProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 230, 20));

        extramuralSpinner.setOpaque(true);
        jPanel1.add(extramuralSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, 30));

        submitButton.setBackground(new java.awt.Color(0, 51, 102));
        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submitButton.setText("Submit");
        submitButton.setEnabled(false);
        jPanel1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 100, -1));

        screenTitleLabel.setBackground(getBackground());
        screenTitleLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        screenTitleLabel.setForeground(new java.awt.Color(0, 51, 102));
        screenTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screenTitleLabel.setText("Add Teacher Screen");
        jPanel1.add(screenTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 204, 102));
        jSeparator1.setAlignmentY(0.0F);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 404, 10));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 45, 10, 400));

        fullnameField.setBackground(jPanel1.getBackground());
        fullnameField.setText("e.g. Clifton Lloyd Bartholomew");
        fullnameField.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                fullnameFieldMouseClicked(evt);
            }
        });
        fullnameField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                fullnameFieldKeyPressed(evt);
            }
        });
        jPanel1.add(fullnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 85, 239, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        birthdayLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        birthdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        birthdayLabel.setText("Birthday:");

        numGradesLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numGradesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numGradesLabel.setText("Number of Grades taught ");

        extramuralsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        extramuralsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        extramuralsLabel.setText("Extramural Activities");

        correctInputsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        correctInputsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correctInputsLabel.setText("Fields entered correctly:");

        fullnameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fullnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullnameLabel.setText("Full Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(extramuralsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(numGradesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(birthdayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fullnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(correctInputsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(fullnameLabel)
                .addGap(43, 43, 43)
                .addComponent(birthdayLabel)
                .addGap(40, 40, 40)
                .addComponent(numGradesLabel)
                .addGap(43, 43, 43)
                .addComponent(extramuralsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(correctInputsLabel)
                .addGap(85, 85, 85))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, 390));

        name_warningLabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        name_warningLabel.setForeground(new java.awt.Color(255, 0, 0));
        name_warningLabel.setEnabled(false);
        name_warningLabel.setFocusable(false);
        jPanel1.add(name_warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 230, 20));

        birthday_warningLabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        birthday_warningLabel.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(birthday_warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 230, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullnameFieldMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_fullnameFieldMouseClicked
    {//GEN-HEADEREND:event_fullnameFieldMouseClicked
        // TODO add your handling code here:
        fullnameField.setText("");
    }//GEN-LAST:event_fullnameFieldMouseClicked

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jPanel1KeyPressed
    {//GEN-HEADEREND:event_jPanel1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1KeyPressed

    private void fullnameFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fullnameFieldKeyPressed
    {//GEN-HEADEREND:event_fullnameFieldKeyPressed
        // TODO add your handling code here:
        correctInputsProgressBar.setValue(correctInputsProgressBar.getValue()+1);
    }//GEN-LAST:event_fullnameFieldKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            javax.swing.UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
            
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(AddTeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AddTeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AddTeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AddTeacherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AddTeacherForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField birthdayFormattedField;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JLabel birthday_warningLabel;
    private javax.swing.JLabel correctInputsLabel;
    private javax.swing.JProgressBar correctInputsProgressBar;
    private javax.swing.JSpinner extramuralSpinner;
    private javax.swing.JLabel extramuralsLabel;
    private javax.swing.JTextField fullnameField;
    private javax.swing.JLabel fullnameLabel;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel name_warningLabel;
    private javax.swing.JLabel numGradesLabel;
    private javax.swing.JSlider numGradesSlider;
    private javax.swing.JToggleButton registerClassToggleButton;
    private javax.swing.JLabel screenTitleLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}