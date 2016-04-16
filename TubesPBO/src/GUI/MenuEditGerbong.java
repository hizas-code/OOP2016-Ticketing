package GUI;

import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 * @author Kelompok 5 - IF3801
 */
public class MenuEditGerbong extends javax.swing.JPanel {

    public MenuEditGerbong() {
        initComponents();
    }

    public void addListener(ActionListener a){
        btnBack.addActionListener(a);
        btnEdit.addActionListener(a);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        taInfoGerbong = new javax.swing.JTextArea();
        tfChairQty = new javax.swing.JTextField();
        rbtnType1 = new javax.swing.JRadioButton();
        rbtnType2 = new javax.swing.JRadioButton();
        rbtnType3 = new javax.swing.JRadioButton();

        jLabel3.setText("Jumlah Kursi");

        jLabel4.setText("Tipe Gerbong");

        jLabel5.setText("Input Data Baru");

        jLabel6.setText("Data Lama");

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/gerbong/editg2.png"))); // NOI18N

        btnBack.setText("Back");

        taInfoGerbong.setColumns(20);
        taInfoGerbong.setRows(5);
        ScrollPane.setViewportView(taInfoGerbong);

        rbtnType1.setText("Ekonomi");

        rbtnType2.setText("Bisnis");

        rbtnType3.setText("Eksekutif");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbtnType2)
                                .addComponent(rbtnType1)
                                .addComponent(rbtnType3)
                                .addComponent(tfChairQty, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnBack)))
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)
                        .addComponent(tfChairQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnType1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnType2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnType3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rbtnType1;
    private javax.swing.JRadioButton rbtnType2;
    private javax.swing.JRadioButton rbtnType3;
    private javax.swing.JTextArea taInfoGerbong;
    private javax.swing.JTextField tfChairQty;
    // End of variables declaration//GEN-END:variables

    public Object getBtnBack(){
        return btnBack;
    }
    public Object getBtnEdit(){
        return btnEdit;
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
    public String getChairQty(){
        return tfChairQty.getText();
    }
    public JTextField getTfChairQty(){
        return tfChairQty;
    }
    public void setInfoGerbong(String s){
        taInfoGerbong.setText(s);      
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
