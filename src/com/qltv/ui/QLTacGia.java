/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qltv.ui;

/**
 *
 * @author RAVEN
 */
public class QLTacGia extends javax.swing.JPanel {

    /**
     * Creates new form Form_1
     */
    public QLTacGia() {
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

        textField1 = new com.qltv.swing.TextField();
        textField2 = new com.qltv.swing.TextField();
        textField3 = new com.qltv.swing.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        button1 = new com.qltv.swing.Button();
        button2 = new com.qltv.swing.Button();
        button3 = new com.qltv.swing.Button();
        button4 = new com.qltv.swing.Button();
        textField4 = new com.qltv.swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textField1.setLabelText("Năm sinh");
        add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 270, 50));

        textField2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textField2.setLabelText("Quê quán");
        add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 270, 50));

        textField3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textField3.setLabelText("Tên tác giả");
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 270, 50));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã tác giả", "Tên tác giả", "Năm sinh", "Quê quán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 410, 420));

        button1.setText("Cập nhật");
        button1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        button1.setPreferredSize(new java.awt.Dimension(90, 50));
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        button2.setText("Mới");
        button2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        button2.setPreferredSize(new java.awt.Dimension(90, 50));
        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, -1, -1));

        button3.setText("Xóa");
        button3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        button3.setPreferredSize(new java.awt.Dimension(90, 50));
        add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        button4.setText("Thêm");
        button4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        button4.setPreferredSize(new java.awt.Dimension(90, 50));
        add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        textField4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textField4.setLabelText("Tìm kiếm");
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });
        add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 410, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel1.setText("TÁC GIẢ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 220, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.qltv.swing.Button button1;
    private com.qltv.swing.Button button2;
    private com.qltv.swing.Button button3;
    private com.qltv.swing.Button button4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private com.qltv.swing.TextField textField1;
    private com.qltv.swing.TextField textField2;
    private com.qltv.swing.TextField textField3;
    private com.qltv.swing.TextField textField4;
    // End of variables declaration//GEN-END:variables
}
