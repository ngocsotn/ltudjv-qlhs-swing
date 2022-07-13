/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20424056;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;

/**
 *
 * @author NGOC
 */
public class main extends javax.swing.JFrame {
    public static String userSettingPath = "user.txt";
    myMessageBox msg;
    private  ArrayList<hocsinh> ds = null;
    controller clr = new controller();
    fileController fileClr = new fileController();
    File selectedFile = null;
    ImageIcon currentIcon = null;
    String path = "";
    hocsinh currentHS = null;
    
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }
    private login loginForm = new login(this);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void clearInput()
    {
        txt_mhs.setText("");
        txt_tenhs.setText("");
        txt_diem.setText("");
        txt_ghichu.setText("");
        txt_hinhanh.setText("");
        txt_diachi.setText("");
        lbl_img.setIcon(null);
        currentIcon = null;
        
    }
    
    private void selectMode(boolean i)
    {
        btn_add.setEnabled(!i);
        btn_unselect.setEnabled(i);
        btn_delete.setEnabled(i);
        btn_update.setEnabled(i);
    }
    
    private void clearAll()
    {
        clearInput();
        selectMode(false);
        currentHS = null;
        selectedFile = null;
        currentIcon = null;
        path = "";
        tableMain.clearSelection();
        txt_mhs.setText(String.valueOf(getNextMHS()));
    }
    
    public void loadData() throws SQLException
    {
        ds = clr.selectAll();
        customTableModel model = new customTableModel(ds);
        tableMain.setModel(model);
        clearAll();
    }
    
    public void loadData(ArrayList<hocsinh> data)
    {
        ds = data;
        customTableModel model = new customTableModel(ds);
        tableMain.setModel(model);
        clearAll();
    }
    
    private int getNextMHS()
    {
        int rs = 0;
        if(ds == null)
        {
            return rs;
        }
        for(hocsinh item: ds)
        {
            if(item.getMHS() > rs)
            {
                rs = item.getMHS();
            }
        }
        
        return rs + 1;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMain = new javax.swing.JTable();
        lbl_img = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_ghichu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_diachi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_hinhanh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_mhs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_tenhs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_diem = new javax.swing.JTextField();
        btn_chooseImg = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_unselect = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_import = new javax.swing.JButton();
        btn_export = new javax.swing.JButton();
        cbb_type = new javax.swing.JComboBox<>();
        cbb_asc = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý học sinh");
        setMinimumSize(new java.awt.Dimension(1126, 712));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("QUẢN LÝ HỌC SINH");

        tableMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tableMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMain);

        lbl_img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Địa chỉ:");

        txt_ghichu.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Ghi chú:");

        txt_diachi.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Hình ảnh:");

        txt_hinhanh.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_hinhanh.setText("...");
        txt_hinhanh.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Mã học sinh:");

        txt_mhs.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_mhs.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Tên học sinh:");

        txt_tenhs.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Điểm:");

        txt_diem.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        btn_chooseImg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_chooseImg.setText("Chọn ảnh");
        btn_chooseImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chooseImgActionPerformed(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_add.setText("Thêm mới");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_unselect.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_unselect.setText("Bỏ chọn");
        btn_unselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unselectActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_delete.setText("Xóa");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_update.setText("Cập nhật");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_import.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_import.setText("Nhập file .csv");
        btn_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_importActionPerformed(evt);
            }
        });

        btn_export.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_export.setText("Xuất file .csv");
        btn_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportActionPerformed(evt);
            }
        });

        cbb_type.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbb_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã HS", "Điểm" }));
        cbb_type.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbb_typeItemStateChanged(evt);
            }
        });

        cbb_asc.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbb_asc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng dần", "Giảm dần" }));
        cbb_asc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbb_ascItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Sắp theo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(cbb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbb_asc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_export)
                                    .addComponent(btn_import, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_unselect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_hinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_chooseImg))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_diem, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(txt_mhs))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_tenhs, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_ghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(txt_diachi))
                                .addGap(18, 18, 18)
                                .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_asc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_unselect, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txt_tenhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(txt_mhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_import, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                    .addComponent(btn_export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_diem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ghichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_hinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(btn_chooseImg))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        loginForm.setVisible(true);
        this.setVisible(false);
        clearAll();
    }//GEN-LAST:event_formWindowOpened
  
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            // TODO add your handling code here:
            myConnection.forceClose();
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void sortingList(int sb, int sa)
    {
        int sortBy = sb;
        int sortASC = sa;
        if(sb == -1 || sa == -1)
        {
            sortBy = cbb_type.getSelectedIndex();
            sortASC = cbb_asc.getSelectedIndex();
        }

        
        if(sortBy == 0)
        {
            if(sortASC == 0)
            {
                Collections.sort(ds, new SoSanhMHS());
            }
            else
            {
                Collections.sort(ds, new SoSanhMHSReverse());
            }
        }
        else
        {
            if(sortASC == 0)
            {
                Collections.sort(ds, new SoSanhDiem());
            }
            else
            {
                Collections.sort(ds, new SoSanhDiemReverse());
            }
        }
        loadData(ds);
    }
    
    private void cbb_typeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbb_typeItemStateChanged
        // TODO add your handling code here:
        sortingList(-1,-1);
    }//GEN-LAST:event_cbb_typeItemStateChanged

    private void cbb_ascItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbb_ascItemStateChanged
        // TODO add your handling code here:
       sortingList(-1,-1);
    }//GEN-LAST:event_cbb_ascItemStateChanged

    private void tableMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMainMouseClicked
        // TODO add your handling code here:
        selectMode(true);
        
        int rowId = tableMain.getSelectedRow();
        TableModel model = tableMain.getModel();
        
        currentHS = new hocsinh();
        currentHS.setMHS(parseInt(model.getValueAt(rowId, 0).toString()));
        currentHS.setTenHS(model.getValueAt(rowId, 1).toString());
        currentHS.setDiem((Double) model.getValueAt(rowId, 2));
        currentHS.setHinhAnh(model.getValueAt(rowId, 3).toString());
        currentHS.setDiaChi(model.getValueAt(rowId, 4).toString());
        currentHS.setGhiChu(model.getValueAt(rowId, 5).toString());
        
        txt_mhs.setText(String.valueOf(currentHS.getMHS()));
        txt_tenhs.setText(currentHS.getTenHS());
        txt_diem.setText(String.valueOf(currentHS.getDiem()));
        txt_hinhanh.setText(currentHS.getHinhAnh());
        txt_diachi.setText(currentHS.getDiaChi());
        txt_ghichu.setText(currentHS.getGhiChu());
        
        //hiển thị ảnh
        if(fileClr.isExisted(currentHS.getHinhAnh()))
        {
            path  = currentHS.getHinhAnh();
            ImageIcon myImage = new ImageIcon(path);          
            //tạo hình ảnh từ ảnh icon
            Image img = myImage.getImage();
            //điều chỉnh kích thước ảnh lại
            Image newImage = img.getScaledInstance(182,160, Image.SCALE_SMOOTH);
            //để hiện lên table hay frame thế nào đó, ta dùng icon, ép ảnh vừa có kích cỡ trên lại icon
            ImageIcon showImage = new ImageIcon(newImage);
            
            lbl_img.setText("");
            lbl_img.setIcon(showImage);
        }
        else
        {
            lbl_img.setIcon(null);
            currentIcon = null;
        }
    }//GEN-LAST:event_tableMainMouseClicked

    private void btn_unselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unselectActionPerformed
        // TODO add your handling code here:
        clearAll();
    }//GEN-LAST:event_btn_unselectActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        hocsinh tmp = new hocsinh();
        
        tmp.setMHS(parseInt(txt_mhs.getText()));
        tmp.setTenHS(txt_tenhs.getText());
        tmp.setDiem(Double.valueOf(txt_diem.getText()));
        tmp.setHinhAnh(txt_hinhanh.getText());
        tmp.setDiaChi(txt_diachi.getText());
        tmp.setGhiChu(txt_ghichu.getText());
        tmp.setHinhAnh(txt_hinhanh.getText());
        int count = 0;
        
        try {
            count = clr.insertNew(tmp);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(count == 1)
        {
            msg.showMessage("Thông báo","Thêm thành công!");
            try {
                loadData();
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            cbb_type.setSelectedIndex(0);
            cbb_asc.setSelectedIndex(0);
        }
        else
        {
            msg.showMessage("Thông báo","Thêm thất bại!");
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        if(currentHS != null)
        {
            boolean check = msg.showYesNo("Xác nhận xóa", "Bạn có chắc muốn xóa học sinh này?");
            if(check == false)
            {
                return;
            }
            
            int rows = 0;
            ds.remove(currentHS);
            
            try {
                rows = clr.deleteRow(currentHS.getMHS());
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(rows !=0)
            {
                msg.showMessage("Thông báo","Xóa thành công!");
                try {
                    loadData();
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }

                cbb_type.setSelectedIndex(0);
                cbb_asc.setSelectedIndex(0);
            }
            else
            {
                msg.showMessage("Thông báo","Xóa thất bại!");
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        if(currentHS != null)
        {
            boolean check = msg.showYesNo("Xác nhận Cập nhật", "Bạn có chắc muốn cập nhật học sinh này?");
            if(check == false)
            {
                return;
            }
            
            int rows = 0;
            
            currentHS.setTenHS(txt_tenhs.getText());
            currentHS.setDiem(Double.valueOf(txt_diem.getText()));
            currentHS.setHinhAnh(txt_hinhanh.getText());
            currentHS.setDiaChi(txt_diachi.getText());
            currentHS.setGhiChu(txt_ghichu.getText());
            currentHS.setHinhAnh(txt_hinhanh.getText());
            
            try {
                rows = clr.updateRow(currentHS);
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(rows !=0)
            {
                msg.showMessage("Thông báo","Cập nhật thành công!");
                try {
                    loadData();
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }

                cbb_type.setSelectedIndex(0);
                cbb_asc.setSelectedIndex(0);
            }
            else
            {
                msg.showMessage("Thông báo","Cập nhật thất bại!");
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_chooseImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chooseImgActionPerformed
        // TODO add your handling code here:
        JFileChooser jfile = new JFileChooser();
        
        //mặc định khi mở windows chọn sẽ là thư mục home của User, or user.dir
        File defaultdirectory = new File(System.getProperty("user.home"));
        
        //đưa Dir vào cho jFileChooser
        jfile.setCurrentDirectory(defaultdirectory);
        
        //cài đặt filter cho lọc ở windows chọn lấy file ảnh
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Image","jpg","png");
        
        //thêm filter vào JFileChooser
        jfile.addChoosableFileFilter(filter);
        
        //nếu lấy file bất kỳ thành công sẽ trả về 0
        int result = jfile.showSaveDialog(null);
        if(result !=0)
        {
            return;
        }
        //đổ file vừa chọn vào biến chung
        selectedFile = jfile.getSelectedFile();
        path = selectedFile.getName();
        if(path.endsWith(".jpg") || path.endsWith(".png") || path.endsWith(".JPG") || path.endsWith(".PNG"))
        {
            if(result == JFileChooser.APPROVE_OPTION) // 0 == 0
            {
                //nếu thành công thì đổi tên label và cài đặt để hiện lên demo ảnh
                
                path = selectedFile.getAbsolutePath();           
                //tạo ảnh icon dựa trên đường dẫn
                ImageIcon myImage = new ImageIcon(path);          
                //tạo hình ảnh từ ảnh icon
                Image img = myImage.getImage();
                //điều chỉnh kích thước ảnh lại
                Image newImage = img.getScaledInstance(182,160, Image.SCALE_SMOOTH);
                //để hiện lên table hay frame thế nào đó, ta dùng icon, ép ảnh vừa có kích cỡ trên lại icon
                ImageIcon showImage = new ImageIcon(newImage);
                
                //xóa text và hiện lên demo
                txt_hinhanh.setText(path);
                lbl_img.setText("");
                lbl_img.setIcon(showImage);
            }
            else
            {
                selectedFile = null;
                currentIcon = null;
                path = null;
            }
        }
        else
        {
            msg.showMessage("Thông báo","Bạn chỉ được chọn file dạng ảnh .jpg và .png!");
            selectedFile = null;
            currentIcon = null;
            path = null;
        }
    }//GEN-LAST:event_btn_chooseImgActionPerformed

    private void btn_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_importActionPerformed
        // TODO add your handling code here:
        JFileChooser jfile = new JFileChooser();
        File defaultdirectory = new File(System.getProperty("user.home"));
        jfile.setCurrentDirectory(defaultdirectory);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.csv","csv");
        jfile.addChoosableFileFilter(filter);
        int result = jfile.showSaveDialog(null);
        if(result !=0)
        {
            return;
        }
        selectedFile = jfile.getSelectedFile();
        path = selectedFile.getName();
        
        if(path.endsWith(".csv"))
        {
            if(result == JFileChooser.APPROVE_OPTION) // 0 == 0
            {
                //nếu thành công thì đổi tên label và cài đặt để hiện lên demo ảnh
                
                path = selectedFile.getAbsolutePath();           
            }
            else
            {
                selectedFile = null;
                currentIcon = null;
                path = null;
            }
        }
        else
        {
            msg.showMessage("Thông báo","Bạn chỉ được chọn file .csv!");
            selectedFile = null;
            currentIcon = null;
            path = null;
        }
        
        if(msg.showYesNo("Xác nhận nhập file", "Bạn có chắc muốn nhập file csv này :\n" + path ))
        {
            ArrayList<hocsinh> tmp = fileClr.importFileCSV(path);
            if(tmp != null)
            {
                ds = tmp;
                loadData(ds);
                
                msg.showMessage("Thông báo","Nhập file thành công!");
                
                if(msg.showYesNo("Xác nhận đè dữ liệu", "Đã nhập file thành công, bạn có muốn dùng dữ liệu mới này thay trong Cơ sở dữ liệu"))
                {
                    try {
                        clr.reInsertAll(ds);
                    } catch (SQLException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    msg.showMessage("Thông báo","Bạn đã chọn giữ sử dụng Dữ liệu trong Cơ sở dữ liệu!");
                    try {
                        loadData();
                    } catch (SQLException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else
            {
                msg.showMessage("Thông báo","Nhập file thất bại!");
            }
        }
    }//GEN-LAST:event_btn_importActionPerformed

    private void btn_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportActionPerformed
        // TODO add your handling code here:
        JFileChooser jfile = new JFileChooser();
        File defaultdirectory = new File(System.getProperty("user.home"));
        jfile.setCurrentDirectory(defaultdirectory);

        jfile.setSelectedFile(new File("20424056.csv"));
        
        int result = jfile.showSaveDialog(null);
        
        if(result !=0)
        {
            return;
        }
        
        selectedFile = jfile.getSelectedFile();
        path = selectedFile.getAbsolutePath();
        
        if(path.endsWith(".csv"))
        {
            if(result == JFileChooser.APPROVE_OPTION) // 0 == 0
            {
                //nếu thành công thì đổi tên label và cài đặt để hiện lên demo ảnh
                
                path = selectedFile.getAbsolutePath();           
            }
            else
            {
                selectedFile = null;
                currentIcon = null;
                path = null;
            }
        }
        else
        {
            msg.showMessage("Thông báo","Bạn chỉ được lưu dạng file .csv!");
            selectedFile = null;
            currentIcon = null;
            path = null;
        }
        
        if(msg.showYesNo("Xác nhận xuất file", "Bạn có chắc muốn xuất file file csv tại :\n" + path ))
        {
            try {
                if(fileClr.exportFileCSV(ds, path))
                {
                    msg.showMessage("Thông báo","Đã lưu thành công!");
                }
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                msg.showMessage("Thông báo","Lưu thất bại!");
            }
        }
    }//GEN-LAST:event_btn_exportActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });   
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_chooseImg;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_export;
    private javax.swing.JButton btn_import;
    private javax.swing.JButton btn_unselect;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cbb_asc;
    private javax.swing.JComboBox<String> cbb_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JTable tableMain;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_diem;
    private javax.swing.JTextField txt_ghichu;
    private javax.swing.JTextField txt_hinhanh;
    private javax.swing.JTextField txt_mhs;
    private javax.swing.JTextField txt_tenhs;
    // End of variables declaration//GEN-END:variables
}
