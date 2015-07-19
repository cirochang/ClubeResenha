/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;
import learn.CinemaOwner.*;
import cluberesenha.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author cirochang
 */
public class UserShowReserveGUI extends javax.swing.JFrame {
    

    /**
     * Creates new form AdmSecretaryGUI
     */
    private Controller controller;
    private Session session;
    private CinemaOwner cinema_owner;
    private Reserve reserve;
    
    public UserShowReserveGUI(CinemaOwner cinema_owner, Session session) {
        initComponents();
        this.controller = Controller.getInstance();
        jLabel1.setText(controller.getCurrentUser().getFullName());
        jLabel2.setText(controller.getCurrentUser().getTypeName() + " User");
        
        this.session = session;
        this.cinema_owner = cinema_owner;
        reserve = session.getReserveList().getReserveByMatricula(controller.getCurrentUser().getMatricula());
        Interface();
    }
    
    public UserShowReserveGUI(){
    }

    public void Interface(){
        jA1.setBackground(Color.blue);
        jA2.setBackground(Color.blue);
        jA3.setBackground(Color.blue);
        jA4.setBackground(Color.blue);
        jA5.setBackground(Color.blue);
        jA6.setBackground(Color.blue);
        jA7.setBackground(Color.blue);
        jA8.setBackground(Color.blue);
        jA9.setBackground(Color.blue);
        jA10.setBackground(Color.blue);
        jA11.setBackground(Color.blue);
        jA12.setBackground(Color.blue);
        jA13.setBackground(Color.blue);
        jA14.setBackground(Color.blue);
        jA15.setBackground(Color.blue);
        jA16.setBackground(Color.blue);
        jA17.setBackground(Color.blue);
        jA18.setBackground(Color.blue);
        jA19.setBackground(Color.blue);
        jA20.setBackground(Color.blue);
        jA21.setBackground(Color.blue);
        jA22.setBackground(Color.blue);
        jA23.setBackground(Color.blue);
        jA24.setBackground(Color.blue);
        jA25.setBackground(Color.blue);
        jA26.setBackground(Color.blue);
        jA27.setBackground(Color.blue);
        jA28.setBackground(Color.blue);
        jA29.setBackground(Color.blue);
        jA30.setBackground(Color.blue);
        jA31.setBackground(Color.blue);
        jA32.setBackground(Color.blue);
       

        if(session.getReserveList().checkReserved(1)){
            jA1.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(2)){
            jA2.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(3)){
            jA3.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(4)){
            jA4.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(5)){
            jA5.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(6)){
            jA6.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(7)){
            jA7.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(8)){
            jA8.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(9)){
            jA9.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(10)){
            jA10.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(11)){
            jA11.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(12)){
            jA12.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(13)){
            jA13.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(14)){
            jA14.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(15)){
            jA15.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(16)){
            jA16.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(17)){
            jA17.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(18)){
            jA18.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(19)){
            jA19.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(20)){
            jA20.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(21)){
            jA21.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(22)){
            jA22.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(23)){
            jA23.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(24)){
            jA24.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(25)){
            jA25.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(26)){
            jA26.setBackground(Color.red);
        }if(session.getReserveList().checkReserved(27)){
            jA27.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(28)){
            jA28.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(29)){
            jA29.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(30)){
            jA30.setBackground(Color.red);
        }
        if(session.getReserveList().checkReserved(31)){
            jA31.setBackground(Color.red);
        }
         if(session.getReserveList().checkReserved(32)){
            jA32.setBackground(Color.red);
        }
         
        if(reserve != null && reserve.getReserve_num()==1){
            jA1.setBackground(Color.green);
        }
        if(reserve != null && reserve.getReserve_num()==2){
            jA2.setBackground(Color.green);
        }
        if(reserve != null && reserve.getReserve_num()==3){
            jA3.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==4){
            jA4.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==5){
            jA5.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==6){
            jA6.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==7){
            jA7.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==8){
            jA8.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==9){
            jA9.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==10){
            jA10.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==11){
            jA11.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==12){
            jA12.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==13){
            jA13.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==14){
            jA14.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==15){
            jA15.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==16){
            jA16.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==17){
            jA17.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==18){
            jA18.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==19){
            jA19.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==20){
            jA20.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==21){
            jA21.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==22){
            jA22.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==23){
            jA23.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==24){
            jA24.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==25){
            jA25.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==26){
            jA26.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==27){
            jA27.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==28){
            jA28.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==29){
            jA29.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==30){
            jA30.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==31){
            jA31.setBackground(Color.GREEN);
        }
        if(reserve != null && reserve.getReserve_num()==32){
            jA32.setBackground(Color.GREEN);
        }
        
    }
    
    public void reserveChair(int num){
        if(session.getReserveList().checkReserved(num)){
            JOptionPane.showMessageDialog(null, "The chair is already reserved");
        }
        else{
            if(!session.checkReserve(controller.getCurrentUser().getMatricula())){
                controller.createBill(cinema_owner.getMatricula(), controller.getCurrentUser().getMatricula(), 1, "Reservation on "+ cinema_owner.getCinema().getDescription()+ ", on chair " + num);
            }
            session.createReserve(num, controller.getCurrentUser().getMatricula());
            JOptionPane.showMessageDialog(null, "The reserve was sucessfull" );
        }
        reserve = session.getReserveList().getReserveByMatricula(controller.getCurrentUser().getMatricula());
        Interface();
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jA2 = new javax.swing.JToggleButton();
        jA1 = new javax.swing.JToggleButton();
        jA3 = new javax.swing.JToggleButton();
        jA4 = new javax.swing.JToggleButton();
        jA8 = new javax.swing.JToggleButton();
        jA7 = new javax.swing.JToggleButton();
        jA6 = new javax.swing.JToggleButton();
        jA5 = new javax.swing.JToggleButton();
        jA9 = new javax.swing.JToggleButton();
        jA10 = new javax.swing.JToggleButton();
        jA11 = new javax.swing.JToggleButton();
        jA12 = new javax.swing.JToggleButton();
        jA13 = new javax.swing.JToggleButton();
        jA14 = new javax.swing.JToggleButton();
        jA15 = new javax.swing.JToggleButton();
        jA16 = new javax.swing.JToggleButton();
        jA17 = new javax.swing.JToggleButton();
        jA18 = new javax.swing.JToggleButton();
        jA19 = new javax.swing.JToggleButton();
        jA20 = new javax.swing.JToggleButton();
        jA21 = new javax.swing.JToggleButton();
        jA22 = new javax.swing.JToggleButton();
        jA23 = new javax.swing.JToggleButton();
        jA24 = new javax.swing.JToggleButton();
        jA25 = new javax.swing.JToggleButton();
        jA26 = new javax.swing.JToggleButton();
        jA27 = new javax.swing.JToggleButton();
        jA28 = new javax.swing.JToggleButton();
        jA29 = new javax.swing.JToggleButton();
        jA30 = new javax.swing.JToggleButton();
        jA31 = new javax.swing.JToggleButton();
        jA32 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        jLabel3.setText("Show Sessions");

        jLabel1.setText("#{USER_FULL_NAME}");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 2, 10)); // NOI18N
        jLabel2.setText("#{USER TYPE}");

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jA2.setText("2");
        jA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA2ActionPerformed(evt);
            }
        });

        jA1.setText("1");
        jA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA1ActionPerformed(evt);
            }
        });

        jA3.setText("3");
        jA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA3ActionPerformed(evt);
            }
        });

        jA4.setText("4");
        jA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA4ActionPerformed(evt);
            }
        });

        jA8.setText("8");
        jA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA8ActionPerformed(evt);
            }
        });

        jA7.setText("7");
        jA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA7ActionPerformed(evt);
            }
        });

        jA6.setText("6");
        jA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA6ActionPerformed(evt);
            }
        });

        jA5.setText("5");
        jA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA5ActionPerformed(evt);
            }
        });

        jA9.setText("6");
        jA9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA9ActionPerformed(evt);
            }
        });

        jA10.setText("5");
        jA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA10ActionPerformed(evt);
            }
        });

        jA11.setText("2");
        jA11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA11ActionPerformed(evt);
            }
        });

        jA12.setText("1");
        jA12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA12ActionPerformed(evt);
            }
        });

        jA13.setText("3");
        jA13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA13ActionPerformed(evt);
            }
        });

        jA14.setText("4");
        jA14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA14ActionPerformed(evt);
            }
        });

        jA15.setText("8");
        jA15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA15ActionPerformed(evt);
            }
        });

        jA16.setText("7");
        jA16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA16ActionPerformed(evt);
            }
        });

        jA17.setText("6");
        jA17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA17ActionPerformed(evt);
            }
        });

        jA18.setText("5");
        jA18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA18ActionPerformed(evt);
            }
        });

        jA19.setText("2");
        jA19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA19ActionPerformed(evt);
            }
        });

        jA20.setText("1");
        jA20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA20ActionPerformed(evt);
            }
        });

        jA21.setText("3");
        jA21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA21ActionPerformed(evt);
            }
        });

        jA22.setText("4");
        jA22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA22ActionPerformed(evt);
            }
        });

        jA23.setText("8");
        jA23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA23ActionPerformed(evt);
            }
        });

        jA24.setText("7");
        jA24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA24ActionPerformed(evt);
            }
        });

        jA25.setText("6");
        jA25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA25ActionPerformed(evt);
            }
        });

        jA26.setText("5");
        jA26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA26ActionPerformed(evt);
            }
        });

        jA27.setText("2");
        jA27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA27ActionPerformed(evt);
            }
        });

        jA28.setText("1");
        jA28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA28ActionPerformed(evt);
            }
        });

        jA29.setText("3");
        jA29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA29ActionPerformed(evt);
            }
        });

        jA30.setText("4");
        jA30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA30ActionPerformed(evt);
            }
        });

        jA31.setText("8");
        jA31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA31ActionPerformed(evt);
            }
        });

        jA32.setText("7");
        jA32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA32ActionPerformed(evt);
            }
        });

        jLabel4.setText("A");

        jLabel5.setText("A");

        jLabel6.setText("B");

        jLabel7.setText("C");

        jLabel8.setText("D");

        jLabel9.setText("B");

        jLabel10.setText("C");

        jLabel11.setText("D");

        jLabel12.setText("<< MOVIE SCREEN >>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jA1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jA28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jA12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jA20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA22)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jA5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jA10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jA9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jA16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jA15))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jA18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jA17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jA24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jA23))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jA26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jA25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jA32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jA31))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jA1)
                    .addComponent(jA2)
                    .addComponent(jA3)
                    .addComponent(jA4)
                    .addComponent(jA8)
                    .addComponent(jA7)
                    .addComponent(jA6)
                    .addComponent(jA5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jA12)
                    .addComponent(jA11)
                    .addComponent(jA13)
                    .addComponent(jA14)
                    .addComponent(jA15)
                    .addComponent(jA16)
                    .addComponent(jA9)
                    .addComponent(jA10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jA20)
                    .addComponent(jA19)
                    .addComponent(jA21)
                    .addComponent(jA22)
                    .addComponent(jA23)
                    .addComponent(jA24)
                    .addComponent(jA17)
                    .addComponent(jA18)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jA28)
                    .addComponent(jA27)
                    .addComponent(jA29)
                    .addComponent(jA30)
                    .addComponent(jA31)
                    .addComponent(jA32)
                    .addComponent(jA25)
                    .addComponent(jA26)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        UserShowSessionsGUI itemloader = new UserShowSessionsGUI(cinema_owner, session.getMovie());
        itemloader.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA1ActionPerformed
        reserveChair(1);
    }//GEN-LAST:event_jA1ActionPerformed

    private void jA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA2ActionPerformed
        reserveChair(2);
    }//GEN-LAST:event_jA2ActionPerformed

    private void jA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA3ActionPerformed
        reserveChair(3);
    }//GEN-LAST:event_jA3ActionPerformed

    private void jA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA4ActionPerformed
        reserveChair(4);        // TODO add your handling code here:
    }//GEN-LAST:event_jA4ActionPerformed

    private void jA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA5ActionPerformed
        reserveChair(5);        // TODO add your handling code here:
    }//GEN-LAST:event_jA5ActionPerformed

    private void jA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA6ActionPerformed
reserveChair(6);        // TODO add your handling code here:
    }//GEN-LAST:event_jA6ActionPerformed

    private void jA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA7ActionPerformed
reserveChair(7);        // TODO add your handling code here:
    }//GEN-LAST:event_jA7ActionPerformed

    private void jA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA8ActionPerformed
reserveChair(8);        // TODO add your handling code here:
    }//GEN-LAST:event_jA8ActionPerformed

    private void jA12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA12ActionPerformed
reserveChair(12);        // TODO add your handling code here:
    }//GEN-LAST:event_jA12ActionPerformed

    private void jA11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA11ActionPerformed
reserveChair(10);        // TODO add your handling code here:
    }//GEN-LAST:event_jA11ActionPerformed

    private void jA13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA13ActionPerformed
reserveChair(13);        // TODO add your handling code here:
    }//GEN-LAST:event_jA13ActionPerformed

    private void jA14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA14ActionPerformed
reserveChair(14);        // TODO add your handling code here:
    }//GEN-LAST:event_jA14ActionPerformed

    private void jA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA10ActionPerformed
reserveChair(10);        // TODO add your handling code here:
    }//GEN-LAST:event_jA10ActionPerformed

    private void jA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA9ActionPerformed
reserveChair(9);        // TODO add your handling code here:
    }//GEN-LAST:event_jA9ActionPerformed

    private void jA16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA16ActionPerformed
reserveChair(16);        // TODO add your handling code here:
    }//GEN-LAST:event_jA16ActionPerformed

    private void jA15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA15ActionPerformed
reserveChair(15);        // TODO add your handling code here:
    }//GEN-LAST:event_jA15ActionPerformed

    private void jA20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA20ActionPerformed
reserveChair(20);        // TODO add your handling code here:
    }//GEN-LAST:event_jA20ActionPerformed

    private void jA19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA19ActionPerformed
reserveChair(19);        // TODO add your handling code here:
    }//GEN-LAST:event_jA19ActionPerformed

    private void jA21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA21ActionPerformed
reserveChair(21);        // TODO add your handling code here:
    }//GEN-LAST:event_jA21ActionPerformed

    private void jA22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA22ActionPerformed
reserveChair(22);        // TODO add your handling code here:
    }//GEN-LAST:event_jA22ActionPerformed

    private void jA18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA18ActionPerformed
reserveChair(18);        // TODO add your handling code here:
    }//GEN-LAST:event_jA18ActionPerformed

    private void jA17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA17ActionPerformed
reserveChair(17);        // TODO add your handling code here:
    }//GEN-LAST:event_jA17ActionPerformed

    private void jA24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA24ActionPerformed
reserveChair(24);        // TODO add your handling code here:
    }//GEN-LAST:event_jA24ActionPerformed

    private void jA23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA23ActionPerformed
reserveChair(23);        // TODO add your handling code here:
    }//GEN-LAST:event_jA23ActionPerformed

    private void jA28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA28ActionPerformed
reserveChair(28);        // TODO add your handling code here:
    }//GEN-LAST:event_jA28ActionPerformed

    private void jA27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA27ActionPerformed
reserveChair(27);        // TODO add your handling code here:
    }//GEN-LAST:event_jA27ActionPerformed

    private void jA29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA29ActionPerformed
reserveChair(29);        // TODO add your handling code here:
    }//GEN-LAST:event_jA29ActionPerformed

    private void jA30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA30ActionPerformed
reserveChair(30);        // TODO add your handling code here:
    }//GEN-LAST:event_jA30ActionPerformed

    private void jA26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA26ActionPerformed
reserveChair(26);        // TODO add your handling code here:
    }//GEN-LAST:event_jA26ActionPerformed

    private void jA25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA25ActionPerformed
reserveChair(25);        // TODO add your handling code here:
    }//GEN-LAST:event_jA25ActionPerformed

    private void jA32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA32ActionPerformed
reserveChair(32);        // TODO add your handling code here:
    }//GEN-LAST:event_jA32ActionPerformed

    private void jA31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA31ActionPerformed
reserveChair(31);        // TODO add your handling code here:
    }//GEN-LAST:event_jA31ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserShowSessionsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jA1;
    private javax.swing.JToggleButton jA10;
    private javax.swing.JToggleButton jA11;
    private javax.swing.JToggleButton jA12;
    private javax.swing.JToggleButton jA13;
    private javax.swing.JToggleButton jA14;
    private javax.swing.JToggleButton jA15;
    private javax.swing.JToggleButton jA16;
    private javax.swing.JToggleButton jA17;
    private javax.swing.JToggleButton jA18;
    private javax.swing.JToggleButton jA19;
    private javax.swing.JToggleButton jA2;
    private javax.swing.JToggleButton jA20;
    private javax.swing.JToggleButton jA21;
    private javax.swing.JToggleButton jA22;
    private javax.swing.JToggleButton jA23;
    private javax.swing.JToggleButton jA24;
    private javax.swing.JToggleButton jA25;
    private javax.swing.JToggleButton jA26;
    private javax.swing.JToggleButton jA27;
    private javax.swing.JToggleButton jA28;
    private javax.swing.JToggleButton jA29;
    private javax.swing.JToggleButton jA3;
    private javax.swing.JToggleButton jA30;
    private javax.swing.JToggleButton jA31;
    private javax.swing.JToggleButton jA32;
    private javax.swing.JToggleButton jA4;
    private javax.swing.JToggleButton jA5;
    private javax.swing.JToggleButton jA6;
    private javax.swing.JToggleButton jA7;
    private javax.swing.JToggleButton jA8;
    private javax.swing.JToggleButton jA9;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
