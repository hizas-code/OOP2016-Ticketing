package GUI;

import java.awt.event.ActionListener;

/**
 * @author Kelompok 5 - IF3801
 */

public class MenuAddGerbong extends javax.swing.JPanel {

    public MenuAddGerbong() {
        initComponents();
    }
    
    public void addListener(ActionListener a){
        btnAdd.addActionListener(a);
        btnBack.addActionListener(a);
        rbtnType1.addActionListener(a);
        rbtnType2.addActionListener(a);
        rbtnType3.addActionListener(a);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbChairCap = new javax.swing.JLabel();
        lbGerbongType = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        rbtnType1 = new javax.swing.JRadioButton();
        rbtnType2 = new javax.swing.JRadioButton();
        rbtnType3 = new javax.swing.JRadioButton();
        chairQty = new javax.swing.JSpinner();

        lbChairCap.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        lbChairCap.setText("JUMLAH KURSI");

        lbGerbongType.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        lbGerbongType.setText("TIPE GERBONG");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/tambahg.png"))); // NOI18N

        btnBack.setBackground(new java.awt.Color(51, 51, 51));
        btnBack.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("KEMBALI");

        rbtnType1.setSelected(true);
        rbtnType1.setText("Ekonomi");

        rbtnType2.setText("Bisnis");

        rbtnType3.setText("Eksekutif");

        chairQty.setModel(new javax.swing.SpinnerNumberModel(10, 10, null, 10));

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chairQty, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbChairCap)
                    .addComponent(chairQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGerbongType)
                    .addComponent(rbtnType1)
                    .addComponent(rbtnType2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnType3)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JSpinner chairQty;
    private javax.swing.JLabel lbChairCap;
    private javax.swing.JLabel lbGerbongType;
    private javax.swing.JRadioButton rbtnType1;
    private javax.swing.JRadioButton rbtnType2;
    private javax.swing.JRadioButton rbtnType3;
    // End of variables declaration//GEN-END:variables

    public Object getBtnAdd(){
        return btnAdd;
    }
    public Object getBtnBack(){
        return btnBack;
    }
    public Object getChairQty(){
        return chairQty;
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
    public int getValueChairQty(){
        return (int) chairQty.getValue();
    }
    public int getGerbongType(){
        if(rbtnType1.isSelected()) return 1;
        else if(rbtnType2.isSelected()) return 2;
        else if(rbtnType3.isSelected()) return 3;
        else return 0;
    }
    public void resetOtherType(Object O){
        if(O.equals(rbtnType1)) {
            rbtnType1.setSelected(true);
            rbtnType2.setSelected(false);
            rbtnType3.setSelected(false);
        }
        if(O.equals(rbtnType2)) {
            rbtnType1.setSelected(false);
            rbtnType2.setSelected(true);
            rbtnType3.setSelected(false);
        }
        if(O.equals(rbtnType3)) {
            rbtnType1.setSelected(false);
            rbtnType2.setSelected(false);
            rbtnType3.setSelected(true);
        }
    }
    public void reset(){
        chairQty.setValue(10);
        rbtnType1.setSelected(true);
        rbtnType2.setSelected(false);
        rbtnType3.setSelected(false);
    }
}
