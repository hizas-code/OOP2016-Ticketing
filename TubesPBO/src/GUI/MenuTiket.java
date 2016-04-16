package GUI;

import javax.swing.JButton;
import java.awt.event.ActionListener;

/**
 * @author Kelompok 5 - IF3801
 */
public class MenuTiket extends javax.swing.JPanel {

    public MenuTiket() {
        initComponents();
    }

    public void addListener(ActionListener e) {
        btnAddTiket.addActionListener(e);
        btnDelTiket.addActionListener(e);
        btnEditTiket.addActionListener(e);
        btnViewTiket.addActionListener(e);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddTiket = new javax.swing.JButton();
        btnDelTiket = new javax.swing.JButton();
        btnEditTiket = new javax.swing.JButton();
        btnViewTiket = new javax.swing.JButton();

        btnAddTiket.setText("TAMBAH TIKET");

        btnDelTiket.setText("HAPUS TIKET");

        btnEditTiket.setText("EDIT TIKET");

        btnViewTiket.setText("VIEW TIKET");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewTiket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddTiket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditTiket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelTiket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddTiket)
                .addGap(18, 18, 18)
                .addComponent(btnDelTiket)
                .addGap(18, 18, 18)
                .addComponent(btnEditTiket)
                .addGap(18, 18, 18)
                .addComponent(btnViewTiket)
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTiket;
    private javax.swing.JButton btnDelTiket;
    private javax.swing.JButton btnEditTiket;
    private javax.swing.JButton btnViewTiket;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAddTiket() {
        return btnAddTiket;
    }
    public JButton getBtnDelTiket() {
        return btnDelTiket;
    }
    public JButton getBtnEditTiket() {
        return btnEditTiket;
    }
    public JButton getBtnViewTiket() {
        return btnViewTiket;
    }
}
