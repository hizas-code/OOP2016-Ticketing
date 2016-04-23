package GUI;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 * @author Kelompok 5 - IF3801
 */
public class MenuRute extends javax.swing.JPanel {

    public MenuRute() {
        initComponents();
    }

    public void addListener(ActionListener e) {
        btnAddRute.addActionListener(e);
    }
    public void addAdapter(MouseAdapter ma){
        listRute.addMouseListener(ma);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddRute = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listRute = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoRute = new javax.swing.JTextArea();

        btnAddRute.setBackground(new java.awt.Color(89, 126, 170));
        btnAddRute.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        btnAddRute.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRute.setText("TAMBAH RUTE");

        listRute.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listRute);

        infoRute.setEditable(false);
        infoRute.setColumns(20);
        infoRute.setRows(5);
        jScrollPane2.setViewportView(infoRute);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(btnAddRute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddRute, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRute;
    private javax.swing.JTextArea infoRute;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listRute;
    // End of variables declaration//GEN-END:variables

    public Object getBtnAddRute() {
        return btnAddRute;
    }
    public Object getListRute(){
        return listRute;
    }
    public String getSelectedRute(){
        return listRute.getSelectedValue();
    }
    public void setInfoRute(String s){
        infoRute.setText(s);
    }
    public void setListRute(String [] s){
        listRute.setListData(s);
    }
}
