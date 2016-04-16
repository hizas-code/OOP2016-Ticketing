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

        textTitle = new javax.swing.JLabel();
        lbChairCap = new javax.swing.JLabel();
        lbGerbongType = new javax.swing.JLabel();
        tfChairQty = new javax.swing.JTextField();
        btnAddGerbongOK = new javax.swing.JButton();
        btnAddGerbongCancel = new javax.swing.JButton();
        rbtnType1 = new javax.swing.JRadioButton();
        rbtnType2 = new javax.swing.JRadioButton();
        rbtnType3 = new javax.swing.JRadioButton();

        textTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTitle.setText("Tambah Gerbong");

        lbChairCap.setText("Jumlah Kursi");

        lbGerbongType.setText("Tipe Gerbong");

        btnAddGerbongOK.setText("Add");

        btnAddGerbongCancel.setText("Back");

        rbtnType1.setText("Ekonomi");

        rbtnType2.setText("Bisnis");

        rbtnType3.setText("Eksekutif");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnAddGerbongOK, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnAddGerbongCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbChairCap)
                                    .addComponent(lbGerbongType))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnType1)
                                    .addComponent(rbtnType2)
                                    .addComponent(rbtnType3)
                                    .addComponent(tfChairQty, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(textTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfChairQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbChairCap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbGerbongType)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnType1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnType2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnType3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddGerbongOK)
                    .addComponent(btnAddGerbongCancel))
                .addGap(24, 24, 24))
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
    private javax.swing.JLabel textTitle;
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
