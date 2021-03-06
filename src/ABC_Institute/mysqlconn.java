package ABC_Institute;



import com.mysql.cj.protocol.Resultset;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kozz
 */
public class mysqlconn extends javax.swing.JFrame {

    Connection conn  ;
    PreparedStatement pst  ;
    ResultSet RS ;
    
   
    
    public mysqlconn() {
        
        initComponents();
        showTableData();
        
        
    }
    
     public void showTableData()
        {
            try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost/prabuddha","root","");
                String sql = "SELECT * FROM lecdetails WHERE 1";
                pst = conn.prepareStatement(sql);
                RS = pst.executeQuery();
                jtable1.setModel(DbUtils.resultSetToTableModel(RS));
            }
            catch(Exception Ex){
            JOptionPane.showMessageDialog(null,Ex);
            
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jeid = new javax.swing.JTextField();
        jran = new javax.swing.JTextField();
        jlname = new javax.swing.JTextField();
        jdep = new javax.swing.JComboBox();
        jcen = new javax.swing.JComboBox();
        jbui = new javax.swing.JComboBox();
        jlev = new javax.swing.JComboBox();
        jfac = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();
        jsave = new javax.swing.JButton();
        jclear = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jrank = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add and Manage Lecturers");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(80, 195, 195));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Employee ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 107, 102, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Faculty");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 184, 102, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Department");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 263, 102, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Center");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 44, 102, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Building");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 107, 102, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Lecturer Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 39, 102, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Level");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 184, 102, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Rank");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 263, 102, 40));

        jeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeidActionPerformed(evt);
            }
        });
        jeid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jeidKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jeidKeyTyped(evt);
            }
        });
        jPanel1.add(jeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 107, 216, 40));

        jran.setEditable(false);
        jran.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jran, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 264, 216, 40));

        jlname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jlnameKeyPressed(evt);
            }
        });
        jPanel1.add(jlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 40, 216, 40));

        jdep.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IT", "BM", "CCNA" }));
        jPanel1.add(jdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 264, 216, 40));

        jcen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Malabe", "Metro", "Mathara", "Kandy", "Kurunagala", "Jaffna" }));
        jPanel1.add(jcen, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 45, 216, 40));

        jbui.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "New Building", "Old Building", "D-block", "E-block", " " }));
        jPanel1.add(jbui, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 108, 216, 40));

        jlev.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        jPanel1.add(jlev, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 185, 216, 40));

        jfac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Computing", "Engeneering", "Business", "Humanities & Sciences" }));
        jPanel1.add(jfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 185, 216, 40));

        jtable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecturer Name", "Employee ID", "Faculty", "Department", "Center", "Building", "Level", "Rank"
            }
        ));
        jtable1.setName(""); // NOI18N
        jtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 322, 1211, 351));

        jsave.setText("Save");
        jsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsaveActionPerformed(evt);
            }
        });
        jPanel1.add(jsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 711, 113, 34));

        jclear.setText("Clear");
        jclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclearActionPerformed(evt);
            }
        });
        jPanel1.add(jclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(867, 711, 113, 34));

        jupdate.setText("Update");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        jPanel1.add(jupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 711, 113, 34));

        jdelete.setText("Delete");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1113, 711, 113, 34));

        jrank.setText("Genarate Rank");
        jrank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrankActionPerformed(evt);
            }
        });
        jPanel1.add(jrank, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 711, 121, 34));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 684, -1, -1));

        jButton2.setBackground(new java.awt.Color(80, 195, 195));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 713, 71, -1));

        jButton3.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton3.setText("Manage Subjects");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 706, 368, 44));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclearActionPerformed
        
        
        jlname.setText("");
        jeid.setText("");
        jfac.setToolTipText("");
        jdep.setToolTipText("");
        jcen.setToolTipText("");
        jbui.setToolTipText("");
        jlev.setToolTipText("");
        jran.setText("");
        
        
        
    }//GEN-LAST:event_jclearActionPerformed

    private void jeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeidActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jeidActionPerformed

    private void jsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsaveActionPerformed
        // TODO add your handling code here:
        
        
        
        try {
            String sql = "INSERT INTO lecdetails"
                    +"(LName, EmpID, Faculty, Department, Center, Building, Level, Rank)"
                    + "VALUES (?,?,?,?,?,?,?,?)";
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost/prabuddha","root","");
            pst = conn.prepareStatement(sql);
            pst.setString(1,jlname.getText());
            
            pst.setString(2,jeid.getText().toString());
            
            
            String fac = jfac.getSelectedItem().toString();
            pst.setString(3,fac);
            
            
            String dep = jdep.getSelectedItem().toString();
            pst.setString(4,dep);
            
            String cen = jcen.getSelectedItem().toString();
            pst.setString(5,cen);
            
            String bui = jbui.getSelectedItem().toString();
            pst.setString(6,bui);
            
            String lev = jlev.getSelectedItem().toString();
            pst.setString(7,lev);
            
            pst.setString(8,jran.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            
            showTableData();
            
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "Fill all the Details!!!");
        
        
        }
        
        
    }//GEN-LAST:event_jsaveActionPerformed

    private void jrankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrankActionPerformed
        // TODO add your handling code here:
        
        String text1,text2;
        text1 = jeid.getText();
        text2 = jlev.getSelectedItem().toString();
        
       
        
        jran.setText(""+text2+"."+text1+"");
        
        
       
        
        
    }//GEN-LAST:event_jrankActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        // TODO add your handling code here:
        
        try {
           
            
            String sql = "update lecdetails set LName= ?, EmpID= ?, Faculty= ? ,Department= ?, Center= ?, Building= ?, Level=?, Rank= ? WHERE EmpID= ?";
            pst= conn.prepareStatement(sql);
            
            pst.setString(9, jeid.getText());
            
            pst.setString(1,jlname.getText());
            pst.setString(2,jeid.getText());
            
            
            String fac = jfac.getSelectedItem().toString();
            pst.setString(3,fac);
            
            
            String dep = jdep.getSelectedItem().toString();
            pst.setString(4,dep);
            
            String cen = jcen.getSelectedItem().toString();
            pst.setString(5,cen);
            
            String bui = jbui.getSelectedItem().toString();
            pst.setString(6,bui);
            
            String lev = jlev.getSelectedItem().toString();
            pst.setString(7,lev);
            
            String rank = jran.getText();
            pst.setString(8,rank);
            
            
            
            
            
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
            showTableData();
            
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "Nothing to update");
        
        
        }
        
    }//GEN-LAST:event_jupdateActionPerformed

    private void jtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable1MouseClicked
        // TODO add your handling code here:
        
      
  
        
        
    }//GEN-LAST:event_jtable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        showTableData();
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
        // TODO add your handling code here:
        
        int row = jtable1.getSelectedRow();
        String cell = jtable1.getModel().getValueAt(row, 0).toString();
        String sql = "DELETE FROM lecdetails where id =" +cell;
        try{
            pst =  conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted succesfully");
            showTableData();
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
       
        
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jlnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlnameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)|| c==KeyEvent.VK_PERIOD)
        {
            jlname.setEditable(true);
        }
        else{
            jlname.setEditable(false);
        }
        
    }//GEN-LAST:event_jlnameKeyPressed

    private void jeidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jeidKeyPressed
        // TODO add your handling code here:
        
        
        
        
        
        
    }//GEN-LAST:event_jeidKeyPressed

    private void jeidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jeidKeyTyped
        // TODO add your handling code here:
        
       
        
        
        char c = evt.getKeyChar();
        
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_jeidKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        new sub_details().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new mysqlconn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jbui;
    private javax.swing.JComboBox jcen;
    private javax.swing.JButton jclear;
    private javax.swing.JButton jdelete;
    private javax.swing.JComboBox jdep;
    private javax.swing.JTextField jeid;
    private javax.swing.JComboBox jfac;
    private javax.swing.JComboBox jlev;
    private javax.swing.JTextField jlname;
    private javax.swing.JTextField jran;
    private javax.swing.JButton jrank;
    private javax.swing.JButton jsave;
    private javax.swing.JTable jtable1;
    private javax.swing.JButton jupdate;
    // End of variables declaration//GEN-END:variables

    
}
