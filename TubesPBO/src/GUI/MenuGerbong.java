package GUI;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 * @author Kelompok 5 - IF3801
 */
public class MenuGerbong extends javax.swing.JPanel {

    public MenuGerbong() {
        initComponents();
    }

    public void addListener(ActionListener e) {
        btnAddGerbong.addActionListener(e);
        btnDelGerbong.addActionListener(e);
        btnEditGerbong.addActionListener(e);
    }
    
    public void addAdapter(MouseAdapter e){
        listGerbong.addMouseListener(e);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddGerbong = new javax.swing.JButton();
        btnDelGerbong = new javax.swing.JButton();
        btnEditGerbong = new javax.swing.JButton();
        ScrollPane1 = new javax.swing.JScrollPane();
        listGerbong = new javax.swing.JList<>();
        ScrollPane2 = new javax.swing.JScrollPane();
        taInfoGerbong = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(221, 221, 221));

        btnAddGerbong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/tambahg.png"))); // NOI18N

        btnDelGerbong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/hapus.png"))); // NOI18N
        btnDelGerbong.setMaximumSize(new java.awt.Dimension(125, 23));
        btnDelGerbong.setPreferredSize(new java.awt.Dimension(125, 23));

        btnEditGerbong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/edit.png"))); // NOI18N
        btnEditGerbong.setMaximumSize(new java.awt.Dimension(125, 23));
        btnEditGerbong.setPreferredSize(new java.awt.Dimension(125, 23));

        listGerbong.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listGerbong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listGerbongMouseClicked(evt);
            }
        });
        ScrollPane1.setViewportView(listGerbong);

        taInfoGerbong.setEditable(false);
        taInfoGerbong.setColumns(20);
        taInfoGerbong.setRows(5);
        ScrollPane2.setViewportView(taInfoGerbong);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddGerbong, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelGerbong, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditGerbong, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollPane1)
                    .addComponent(ScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddGerbong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelGerbong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditGerbong, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listGerbongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listGerbongMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listGerbongMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane1;
    private javax.swing.JScrollPane ScrollPane2;
    private javax.swing.JButton btnAddGerbong;
    private javax.swing.JButton btnDelGerbong;
    private javax.swing.JButton btnEditGerbong;
    private javax.swing.JList<String> listGerbong;
    private javax.swing.JTextArea taInfoGerbong;
    // End of variables declaration//GEN-END:variables
    public Object getBtnAddGerbong() {
        return btnAddGerbong;
    }
    public Object getBtnDelGerbong() {
        return btnDelGerbong;
    }
    public Object getBtnEditGerbong() {
        return btnEditGerbong;
    }
    public Object getListGerbong(){
        return listGerbong;
    }
    public Object getTaInfoGerbong(){
        return taInfoGerbong;
    }
    public void setInfoGerbong(String s){
        taInfoGerbong.setText(s);
    }
    public String getSelectedGerbong(){
        return listGerbong.getSelectedValue();
    }
    public void setListGerbong(String [] gerbongList){
        listGerbong.setListData(gerbongList);
    }
}
