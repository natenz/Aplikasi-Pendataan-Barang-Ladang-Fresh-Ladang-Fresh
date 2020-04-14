package hidroponiksahabat;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TambahStok extends javax.swing.JFrame {
    String id, barang, stok;
    int jumlah;
    Integer harga, total;
    private final DefaultTableModel model;

    /**
     * Creates new form TambahStok
     */
    public void setData() {
        try {
            Statement stat = (Statement) koneksi.koneksiDB().createStatement();
            String sql = "Select * from barang";
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                jComboBox1.addItem(res.getString(2));
                System.out.println(res.getString("nama_barang"));
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }

    public TambahStok() {
        initComponents();
        this.setLocationRelativeTo(null);

        model = new DefaultTableModel();
        tableTambah.setModel(model);
        model.addColumn("Kode Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah Stock");
        model.addColumn("Harga per Kg");
        model.addColumn("Total Harga");
        setData();
        Tanggal date = new Tanggal();
        tanggal.setText(date.getTanggal());
        this.setLocationRelativeTo(null);
    }
    
    public void setStok() {
        try {
            Statement stat = (Statement) koneksi.koneksiDB().createStatement();
        String sql = "Update barang SET jumlah_barang=" + jumlah + " WHERE id_barang=" + id;
        stat.execute(sql);
        } catch(SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableTambah = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jumlah_stok = new javax.swing.JTextField();
        harga_satuan = new javax.swing.JTextField();
        selesai = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        background1 = new hidroponiksahabat.Background();
        hapus = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        ButtonKembali = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonMin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tanggal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableTambah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableTambah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tableTambah);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 388, 200));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 100, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nama Barang");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Jumlah di Stok");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jumlah_stok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jumlah_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 77, -1));

        harga_satuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        harga_satuan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(harga_satuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 82, -1));

        selesai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selesai.setText("Selesai");
        selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesaiActionPerformed(evt);
            }
        });
        getContentPane().add(selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 341, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        background1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        tambah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        ButtonKembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonKembali.setText("Kembali");
        ButtonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKembaliActionPerformed(evt);
            }
        });

        jButtonClose.setBackground(new java.awt.Color(255, 0, 0));
        jButtonClose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonClose.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClose.setText("X");
        jButtonClose.setFocusable(false);
        jButtonClose.setMaximumSize(new java.awt.Dimension(49, 31));
        jButtonClose.setMinimumSize(new java.awt.Dimension(49, 31));
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jButtonMin.setBackground(new java.awt.Color(16, 203, 22));
        jButtonMin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonMin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMin.setText("—");
        jButtonMin.setFocusable(false);
        jButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Tambah Stok");

        tanggal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tanggal.setText("Tanggal");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("@ rupiah");

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addComponent(jButtonMin)
                .addGap(0, 0, 0)
                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ButtonKembali)
                .addGap(32, 32, 32)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addComponent(tambah)
                        .addGap(35, 35, 35)
                        .addComponent(hapus))
                    .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMin))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tambah)
                        .addComponent(ButtonKembali))
                    .addComponent(hapus))
                .addGap(15, 15, 15))
        );

        getContentPane().add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        Object[] obj = new Object[5];

        barang = jComboBox1.getSelectedItem().toString();
        harga = Integer.parseInt(harga_satuan.getText());
        jumlah = Integer.parseInt(jumlah_stok.getText());
        total = harga * jumlah;
        
        try {
            Statement stat = (Statement) koneksi.koneksiDB().createStatement();
            String sql = "Select * from barang where nama_barang = '" + barang + "'";
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                id = res.getString("id_barang");
                stok = res.getString("jumlah_barang");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
        obj[0] = id;
        obj[1] = barang;
        obj[2] = jumlah;
        obj[3] = harga;
        obj[4] = total;

        model.addRow(obj);
    }//GEN-LAST:event_tambahActionPerformed

    private void ButtonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKembaliActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new CekStok().setVisible(true);
    }//GEN-LAST:event_ButtonKembaliActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButtonMinActionPerformed

    private void selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesaiActionPerformed
        if (id != null) {
            if (JOptionPane.showConfirmDialog(null, "Data Sudah Benar?", "Yakin", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    Statement stat = (Statement) koneksi.koneksiDB().createStatement();
                    String sql = "insert into stock(id_barang, jumlah_stock, harga_stock) values (" + "'" + id + "'," + "'" + jumlah + "'," + harga + ")";
                    stat.execute(sql);

                    int temp = Integer.parseInt(stok);
                    if(temp == 0) {
                        setStok();
                    } else {
                        jumlah = jumlah + temp;
                        setStok();
                    }
                } catch (SQLException err) {
                    JOptionPane.showMessageDialog(null, err.getMessage());
                }
                
                this.setVisible(false);
                new TambahStok().setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong!!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_selesaiActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        model.removeRow(0);
    }//GEN-LAST:event_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(TambahStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TambahStok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonKembali;
    private hidroponiksahabat.Background background1;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga_satuan;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonMin;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jumlah_stok;
    private javax.swing.JButton selesai;
    private javax.swing.JTable tableTambah;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tanggal;
    // End of variables declaration//GEN-END:variables
}
