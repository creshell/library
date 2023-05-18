/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalPages;


import config.dbconnector;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static javax.swing.text.html.HTML.Tag.SELECT;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HP
 */
public class logs extends javax.swing.JInternalFrame {

    /**
     * Creates new form updateLogs
     */
    public logs() {
        initComponents();
        
        displayData();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    public void displayData(){
       
        try{
       
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_student");
            student_table.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex.getMessage());
       
        }
    }
    
        public void reset(){
            contact.setText("");
            id.setText("");
            address.setText("");
            gender.setText("");
            studentname.setText("");
            in.setText("");
            out.setText("");
        }
        
        public void fillTable()throws SQLException{
        dbconnector dbc = new dbconnector();
        ResultSet rs = dbc.getData("SELECT * FROM tbl_student");
         student_table.setModel(DbUtils.resultSetToTableModel(rs));
  
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        studentname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        in = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        out = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        search1 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(826, 477));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        student_table.setAutoCreateRowSorter(true);
        student_table.setBackground(new java.awt.Color(204, 204, 255));
        student_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(student_table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 610, 120);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 210, 90, 30);

        id.setBackground(new java.awt.Color(204, 204, 255));
        id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(110, 210, 190, 30);

        studentname.setBackground(new java.awt.Color(204, 204, 255));
        studentname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentnameActionPerformed(evt);
            }
        });
        jPanel1.add(studentname);
        studentname.setBounds(110, 250, 190, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Student Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 250, 90, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Address:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 290, 90, 30);

        address.setBackground(new java.awt.Color(204, 204, 255));
        address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address);
        address.setBounds(110, 290, 190, 30);

        contact.setBackground(new java.awt.Color(204, 204, 255));
        contact.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact);
        contact.setBounds(110, 330, 190, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Contact No:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 330, 90, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Gender:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 250, 80, 30);

        gender.setBackground(new java.awt.Color(204, 204, 255));
        gender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender);
        gender.setBounds(390, 250, 220, 30);

        in.setBackground(new java.awt.Color(204, 204, 255));
        in.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });
        jPanel1.add(in);
        in.setBounds(390, 290, 220, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Time In:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 290, 80, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Time Out:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(310, 330, 80, 30);

        out.setBackground(new java.awt.Color(204, 204, 255));
        out.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });
        jPanel1.add(out);
        out.setBounds(390, 330, 220, 30);

        clear.setBackground(new java.awt.Color(204, 204, 255));
        clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(110, 380, 100, 30);

        delete.setBackground(new java.awt.Color(204, 204, 255));
        delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(220, 380, 90, 30);

        add.setBackground(new java.awt.Color(204, 204, 255));
        add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(10, 380, 90, 30);

        update.setBackground(new java.awt.Color(204, 204, 255));
        update.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(320, 380, 90, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("UPDATE INFORMATION");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 320, 30);

        search.setBackground(new java.awt.Color(204, 204, 255));
        search.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(search);
        search.setBounds(320, 190, 200, 30);

        search1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        search1.setText("SEARCH");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        jPanel1.add(search1);
        search1.setBounds(530, 190, 90, 30);

        print.setBackground(new java.awt.Color(204, 204, 255));
        print.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print);
        print.setBounds(420, 380, 90, 30);

        refresh.setBackground(new java.awt.Color(204, 204, 255));
        refresh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh);
        refresh.setBounds(520, 380, 95, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void studentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentnameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inActionPerformed

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        id.setText(null);
        studentname.setText(null);
        address.setText(null);
        contact.setText(null);
        gender.setText(null);
        in.setText(null);
        out.setText(null);

    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       int rowIndex = student_table.getSelectedRow();
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select a data first");
       }else{
            TableModel model = student_table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
                    if(a==JOptionPane.YES_OPTION){  
                            dbconnector dbc = new dbconnector();
                            dbc.deleteData(Integer.parseInt(id));
                            displayData();
                            reset();
                    }    
    }//GEN-LAST:event_deleteActionPerformed
    }
     
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
      dbconnector dbc = new dbconnector();
        dbc.insertData("INSERT INTO tbl_student (st_name, st_address, st_contact, st_gender,st_in,st_out) "
       + "VALUES ('"+studentname.getText()+"','"+address.getText()+"','"+contact.getText()+"',"
               + "'"+gender.getText()+"' ,'"+in.getText()+"','"+out.getText()+" ')");
        displayData();
        reset();
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     dbconnector dbc = new dbconnector();
        int num = dbc.updateData("UPDATE tbl_student "
                + "SET st_name = '"+studentname.getText()+"', st_address='"+address.getText()+"', "
                        + "st_contact ='"+contact.getText()+"', st_gender='"+gender.getText()+"',st_in='"+in.getText()+"',st_out='"+out.getText()+"' "
                                + "WHERE st_id = '"+id.getText()+"'");
       
        if(num == 0){
           
        }else{
           JOptionPane.showMessageDialog(null, "Updated Successfully!");
           displayData();
           reset();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void student_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_tableMouseClicked
        int selectedRow = student_table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) student_table.getModel();
        id.setText(model.getValueAt(selectedRow, 0).toString());
        studentname.setText(model.getValueAt(selectedRow, 1).toString());
        address.setText(model.getValueAt(selectedRow, 2).toString());
        contact.setText(model.getValueAt(selectedRow, 3).toString());
        gender.setText(model.getValueAt(selectedRow, 4).toString());
        in.setText(model.getValueAt(selectedRow, 5).toString());
        out.setText(model.getValueAt(selectedRow, 6).toString());
    }//GEN-LAST:event_student_tableMouseClicked

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) student_table.getModel();
        TableRowSorter<DefaultTableModel> obj  = new TableRowSorter<>(model);
        student_table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(search.getText()));   
    }//GEN-LAST:event_search1ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("LIBRARY LOGGER");
        MessageFormat footer = new MessageFormat("Library Logger");
        try{
            student_table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }catch(PrinterException e){
            JOptionPane.showMessageDialog(null, "Cannot be print!"+e.getMessage());
        }

    }//GEN-LAST:event_printActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        try {
            fillTable();
        } catch (SQLException ex) {
            Logger.getLogger(logs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JTextField in;
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
    private javax.swing.JTextField out;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField search;
    private javax.swing.JButton search1;
    private javax.swing.JTable student_table;
    private javax.swing.JTextField studentname;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
