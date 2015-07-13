/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;
import learn.AdmMaster.*;
import learn.AdmSecretary.*;
import cluberesenha.*;
import learn.Member.MemberGUI;
import learn.PersonalTrainner.PersonalTrainnerGUI;
import learn.RestaurantOwner.RestaurantOwnerGUI;
import learn.Teacher.TeacherGUI;

/**
 *
 * @author cirochang
 */
public class UserHomeGUI extends javax.swing.JFrame {
    

    /**
     * Creates new form AdmSecretaryGUI
     */
    final Controller controller;
    
    public UserHomeGUI() {
        initComponents();
        this.controller = Controller.getInstance();
        jLabel1.setText(controller.getCurrentUser().getFullName());
        jLabel2.setText(controller.getCurrentUser().getTypeName() + " User");
        if(controller.getCurrentUser().getTypeName().equals("Member")){
            if( ((Member) controller.getCurrentUser()).hasEmployeed() ){
                btSpecial.setText("Emloyee");
                btSpecial.setVisible(true);
            }
            else{
                btSpecial.setVisible(false);
            }
        }    
        else{
            btSpecial.setText(controller.getCurrentUser().getTypeName() + " Functions");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btLogout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btSports = new javax.swing.JButton();
        btAcademy = new javax.swing.JButton();
        btMedical = new javax.swing.JButton();
        btRestaurants = new javax.swing.JButton();
        btMovies = new javax.swing.JButton();
        btBill = new javax.swing.JButton();
        btSpecial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("#{USER_FULL_NAME}");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 2, 10)); // NOI18N
        jLabel2.setText("#{USER TYPE}");

        btLogout.setText("Logout");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        jLabel3.setText("HOME");

        btSports.setText("Show Sport Classes");
        btSports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSportsActionPerformed(evt);
            }
        });

        btAcademy.setText("Show my Academy Serie");
        btAcademy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcademyActionPerformed(evt);
            }
        });

        btMedical.setText("Show my Medical Exam");
        btMedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicalActionPerformed(evt);
            }
        });

        btRestaurants.setText("Show Restaurants");
        btRestaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestaurantsActionPerformed(evt);
            }
        });

        btMovies.setText("Show Movies");
        btMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoviesActionPerformed(evt);
            }
        });

        btBill.setText("Show my Bill History");

        btSpecial.setText("#{SPECIAL BUTTON}");
        btSpecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSpecialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLogout, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btAcademy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btMedical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btRestaurants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btMovies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSpecial, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSports)
                    .addComponent(btMovies))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAcademy)
                    .addComponent(btBill))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMedical)
                    .addComponent(btSpecial))
                .addGap(18, 18, 18)
                .addComponent(btRestaurants)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btLogout))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSportsActionPerformed
        try{
            UserShowSportClassesGUI itemloader = new UserShowSportClassesGUI();
            itemloader.setVisible(true);
            this.setVisible(false);
        }catch(Exception e){
            
        } 
    }//GEN-LAST:event_btSportsActionPerformed

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        ClubeResenhaGUI itemloader = new ClubeResenhaGUI();
        itemloader.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btLogoutActionPerformed

    private void btMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMoviesActionPerformed
        
    }//GEN-LAST:event_btMoviesActionPerformed

    private void btMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMedicalActionPerformed

    private void btRestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestaurantsActionPerformed
        try{
        UserShowRestaurantGUI itemloader = new UserShowRestaurantGUI();
        itemloader.setVisible(true);
        this.setVisible(false);
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btRestaurantsActionPerformed

    private void btAcademyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcademyActionPerformed
        try{
        UserShowSerieGUI itemloader = new UserShowSerieGUI();
        itemloader.setVisible(true);
        this.setVisible(false);
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btAcademyActionPerformed

    private void btSpecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSpecialActionPerformed
        switch(controller.getCurrentUser().getUserType()) {
        case "Secretary":
            AdmSecretaryGUI itemloader = new AdmSecretaryGUI();
            itemloader.setVisible(true);
            this.setVisible(false);
            break;
        case "Master":
            AdmMasterGUI itemloader2 = new AdmMasterGUI();
            itemloader2.setVisible(true);
            this.setVisible(false);
            break;
        case "Teacher":
            TeacherGUI itemloader3 = new TeacherGUI();
            itemloader3.setVisible(true);
            this.setVisible(false);
            break;
        case "Restaurant Owner":
            RestaurantOwnerGUI itemloader4 = new RestaurantOwnerGUI();
            itemloader4.setVisible(true);
            this.setVisible(false);
            break;    
        case "Member":  
            MemberGUI itemloader5 = new MemberGUI();
            itemloader5.setVisible(true);
            this.setVisible(false);       
            break;  
        case "Personal Trainner":
            PersonalTrainnerGUI itemloader6 = new PersonalTrainnerGUI();
            itemloader6.setVisible(true);
            this.setVisible(false);       
            break;  
        default :
            break;
        }
    }//GEN-LAST:event_btSpecialActionPerformed

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
            java.util.logging.Logger.getLogger(UserHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcademy;
    private javax.swing.JButton btBill;
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btMedical;
    private javax.swing.JButton btMovies;
    private javax.swing.JButton btRestaurants;
    private javax.swing.JButton btSpecial;
    private javax.swing.JButton btSports;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
