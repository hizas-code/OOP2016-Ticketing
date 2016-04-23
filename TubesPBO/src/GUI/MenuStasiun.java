package GUI;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 * @author Kelompok 5 - IF3801
 */
public class MenuStasiun extends javax.swing.JPanel {

    public MenuStasiun() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddStasiun = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listStasiun = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoStasiun = new javax.swing.JTextArea();

        btnAddStasiun.setBackground(new java.awt.Color(89, 126, 170));
        btnAddStasiun.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        btnAddStasiun.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStasiun.setText("TAMBAH STASIUN");
        btnAddStasiun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStasiunActionPerformed(evt);
            }
        });

        listStasiun.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listStasiun);

        infoStasiun.setEditable(false);
        infoStasiun.setColumns(20);
        infoStasiun.setRows(5);
        jScrollPane2.setViewportView(infoStasiun);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAddStasiun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddStasiun, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStasiunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStasiunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddStasiunActionPerformed

    public void addListener(ActionListener e) {
        btnAddStasiun.addActionListener(e);
    }
    public void addAdapter(MouseAdapter ma){
        listStasiun.addMouseListener(ma);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStasiun;
    private javax.swing.JTextArea infoStasiun;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listStasiun;
    // End of variables declaration//GEN-END:variables

    public Object getBtnAddStasiun() {
        return btnAddStasiun;
    }
    public Object getListStasiun(){
        return listStasiun;
    }
    public void setListStasiun(String [] stasiunList){
        listStasiun.setListData(stasiunList);
    }
    public String getSelectedStasiun(){
        return listStasiun.getSelectedValue();
    }
    public void setInfoStasiun(String s){
        infoStasiun.setText(s);
    }
}
