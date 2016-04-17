package GUI;

import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 * @author Kelompok 5 - IF3801
 */

public class MenuAddGerbong extends javax.swing.JPanel {

    public MenuAddGerbong() {
        initComponents();
    }
    
    public void addListener(ActionListener a){
        btnAddGerbongOK.addActionListener(a);
        btnAddGerbongCancel.addActionListener(a);
        rbtnType1.addActionListener(a);
        rbtnType2.addActionListener(a);
        rbtnType3.addActionListener(a);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbChairCap = new javax.swing.JLabel();
        lbGerbongType = new javax.swing.JLabel();
        tfChairQty = new javax.swing.JTextField();
        btnAddGerbongOK = new javax.swing.JButton();
        btnAddGerbongCancel = new javax.swing.JButton();
        rbtnType1 = new javax.swing.JRadioButton();
        rbtnType2 = new javax.swing.JRadioButton();
        rbtnType3 = new javax.swing.JRadioButton();

        lbChairCap.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        lbChairCap.setText("JUMLAH KURSI");

        lbGerbongType.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        lbGerbongType.setText("TIPE GERBONG");

        btnAddGerbongOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/tambahg.png"))); // NOI18N

        btnAddGerbongCancel.setBackground(new java.awt.Color(51, 51, 51));
        btnAddGerbongCancel.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        btnAddGerbongCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnAddGerbongCancel.setText("KEMBALI");

        rbtnType1.setText("Ekonomi");

        rbtnType2.setText("Bisnis");

        rbtnType3.setText("Eksekutif");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbChairCap)
                    .addComponent(lbGerbongType))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnType1)
                        .addGap(10, 10, 10)
                        .addComponent(rbtnType2))
                    .addComponent(rbtnType3)
                    .addComponent(tfChairQty, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddGerbongOK, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddGerbongCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbChairCap)
                    .addComponent(tfChairQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGerbongType)
                    .addComponent(rbtnType1)
                    .addComponent(rbtnType2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnType3)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddGerbongOK, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddGerbongCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddGerbongCancel;
    private javax.swing.JButton btnAddGerbongOK;
    private javax.swing.JLabel lbChairCap;
    private javax.swing.JLabel lbGerbongType;
    private javax.swing.JRadioButton rbtnType1;
    private javax.swing.JRadioButton rbtnType2;
    private javax.swing.JRadioButton rbtnType3;
    private javax.swing.JTextField tfChairQty;
    // End of variables declaration//GEN-END:variables

    public Object getBtnAddGerbongOK(){
        return btnAddGerbongOK;
    }
    public Object getBtnAddGerbongCancel(){
        return btnAddGerbongCancel;
    }
    public String getTextChairQty(){
        return tfChairQty.getText();
    }
    public JTextField getTfChairQty(){
        return tfChairQty;
    }
    public Object getRbtnType1(){
        return rbtnType1;
    }
    public Object getRbtnType2(){
        return rbtnType2;
    }
    public Object getRbtnType3(){
        return rbtnType3;
    }
    public void setFalseType1(){
        rbtnType1.setSelected(false);
    }
    public void setFalseType2(){
        rbtnType2.setSelected(false);
    }
    public void setFalseType3(){
        rbtnType3.setSelected(false);
    }
    public int getGerbongType(){
        if(rbtnType1.isSelected()) return 1;
        else if(rbtnType2.isSelected()) return 2;
        else if(rbtnType3.isSelected()) return 3;
        else return 0;
    }
}
