/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20424056;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author NGOC
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    private main mForm = null;
    myMessageBox msg = null;
    fileController fc = new fileController();
    public login(main mainForm)
    {
        mForm = mainForm;
        initComponents();
    }
    
    public login() {
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

        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_ip = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        cbb_dbs = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_dbname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_port = new javax.swing.JTextField();
        btn_help = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kết nối tới máy chủ cơ sở dữ kliệu");
        setMinimumSize(new java.awt.Dimension(690, 380));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_login.setText("Kết nối");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Điền các thông tin bên dưới để kết nối");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Loại Máy chủ cơ sở dữ liệu:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("IP:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tên đăng nhập:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Mật khẩu:");

        txt_password.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N

        cbb_dbs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MSSQL Server", "MySQL", "Oracle" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Tên cơ sở dữ liệu");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Port:");

        btn_help.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_help.setText("?");
        btn_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_helpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_username)
                            .addComponent(txt_password)
                            .addComponent(cbb_dbs, 0, 314, Short.MAX_VALUE)
                            .addComponent(txt_dbname)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_port, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_help)
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbb_dbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_help, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_dbname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jLabel1.getAccessibleContext().setAccessibleName("CONNECT TO DATABASE");
        txt_username.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        
        int selectedDBS = cbb_dbs.getSelectedIndex();
        String selectedDB = "sqlserver";
        if(selectedDBS == 1)
        {
            selectedDB = "mysql";
        }
        else if(selectedDBS == 2)
        {
            selectedDB = "oracle";
        }
        
        try {
            myConnection.getConnecttion(selectedDB, txt_ip.getText(), txt_port.getText(), txt_dbname.getText(), txt_username.getText(), txt_password.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(myConnection.conn == null)
        {
            msg.showMessage("Thông báo", "Kết nối thất bại");
        }
        else
        {
            String userData [] = new String[6];
            userData[0] = selectedDB;
            userData[1] = txt_ip.getText();
            userData[2] = txt_port.getText();
            userData[3] = txt_dbname.getText();
            userData[4] = txt_username.getText();
            userData[5] = txt_password.getText();
            try {
                fc.rewriteUser(main.userSettingPath, userData);
            } catch (IOException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
            msg.showMessage("Thông báo", "Kết nối thành công");
            try {
                mForm.loadData();
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
            mForm.setVisible(true);
            this.setVisible(false);

        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_helpActionPerformed
        // TODO add your handling code here:
        msg.showMessage("Chỉ dẫn", "Port của Microsoft SQL server thường là 1433.\nPort của mysql là 3306 hoặc 3308.\nPort của Oracle là 1521.");
    }//GEN-LAST:event_btn_helpActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String userData[] = null;
        try {
            // TODO add your handling code here:
            userData = fc.readUser(main.userSettingPath);
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        };
        if(userData.length < 6)
        {
            return;
        }
        
        if(userData[0].equals("mysql"))
        {
            cbb_dbs.setSelectedIndex(1);
        }
        else if(userData[0].equals("sqlserver"))
        {
            cbb_dbs.setSelectedIndex(0);
        }
        else if(userData[0].equals("oracle"))
        {
            cbb_dbs.setSelectedIndex(2);
        }
        
        txt_ip.setText(userData[1]);
        txt_port.setText(userData[2]);
        txt_dbname.setText(userData[3]);
        txt_username.setText(userData[4]);
        txt_password.setText(userData[5]);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_help;
    private javax.swing.JButton btn_login;
    private javax.swing.JComboBox<String> cbb_dbs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_dbname;
    private javax.swing.JTextField txt_ip;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_port;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
