/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.ui;

import com.software.dao.NhanVienDAO;
import com.software.dao.TaiKhoanDAO;
import com.software.entity.NhanVien;
import com.software.entity.TaiKhoan;
import java.util.List;
import javax.swing.JOptionPane;
import org.w3c.dom.ls.LSInput;

/**
 *
 * @author user
 */
public class TaoTaiKhoan extends javax.swing.JFrame {

    /**
     * Creates new form TaoTaiKhoan
     */
    NhanVienDAO dao = new NhanVienDAO();
    TaiKhoanDAO daoTK = new TaiKhoanDAO();
    static String manv = MainInterfaceDialog.manv;
    List<TaiKhoan> listTK;

    public TaoTaiKhoan() {
        initComponents();
        this.setLocationRelativeTo(null);
        NhanVien nv = dao.SelectByID(manv);
        this.setForm(nv);
    }

    public void setForm(NhanVien nv) {
        txtSDT.setText(nv.getSoDienThoai());
    }

    public TaiKhoan getForm() {
        TaiKhoan tk = new TaiKhoan();
        tk.setSoDienThoai(txtSDT.getText());
        tk.setMatKhau(pwdMatKhau.getText());
        return tk;
    }

    public void insert() {
        TaiKhoan tk = getForm();
        daoTK.insert(tk);
        JOptionPane.showMessageDialog(this, "Susecfully");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pwdXNMarKhau = new javax.swing.JPasswordField();
        pwdMatKhau = new javax.swing.JPasswordField();
        txtSDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnHoanTat = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pwdXNMarKhau.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(pwdXNMarKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 233, 190, 30));

        pwdMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(pwdMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 173, 200, 30));
        getContentPane().add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 230, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Số điện thoại :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Xác nhận mật khẩu : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Mật Khẩu  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        btnHoanTat.setBackground(new java.awt.Color(0, 51, 255));
        btnHoanTat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHoanTat.setForeground(new java.awt.Color(255, 255, 255));
        btnHoanTat.setText("Hoàn Tất");
        btnHoanTat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnHoanTat.setSelected(true);
        btnHoanTat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoanTatActionPerformed(evt);
            }
        });
        getContentPane().add(btnHoanTat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 90, 40));

        btnBack.setBackground(new java.awt.Color(0, 51, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.setSelected(true);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/software/icon/background2.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked

        this.dispose();

    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHoanTatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoanTatActionPerformed

        if (checkForm()) {
            insert();
            this.dispose();

        }
    }//GEN-LAST:event_btnHoanTatActionPerformed

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
            java.util.logging.Logger.getLogger(TaoTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaoTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaoTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaoTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaoTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHoanTat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pwdMatKhau;
    private javax.swing.JPasswordField pwdXNMarKhau;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables

    public boolean checkForm() {

        TaiKhoan tk = getForm();

        if (pwdMatKhau.getText().equals("")
                || pwdXNMarKhau.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Mật khẩu của bạn !", "Error", 1);
            return false;
        } else if (pwdMatKhau.getText().length() < 6 || pwdMatKhau.getText().length() > 18) {
            JOptionPane.showMessageDialog(this, "Mật khẩu bao gồm 6 đến 18 ký tự", "Error", 1);
            return false;
        } else if (!(pwdXNMarKhau.getText()).equalsIgnoreCase(pwdMatKhau.getText())) {
            JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu chưa chính xác", "Error", 1);
            pwdXNMarKhau.requestFocus();
            return false;
        }
//        listTK = daoTK.SelectAll();
//        for (TaiKhoan tkk : listTK) {
////            if (txtSDT.getText().equals(tkk.getSoDienThoai())) {
////                JOptionPane.showMessageDialog(this, "Mã nhân viên không được phép trùng!", "Error", 1);
////                return false;
////            }
//            String sdt = tkk.getSoDienThoai();
//            System.out.println(sdt);
        // }

        return true;
    }
}
