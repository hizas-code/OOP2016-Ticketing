package GUI;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 * @author Kelompok 5 - IF3801
 */
public class MenuKereta extends javax.swing.JPanel {

    public MenuKereta() {
        initComponents();
    }

    public void addListener(ActionListener e) {
        btnAddKereta.addActionListener(e);
        btnDelKereta.addActionListener(e);
        btnEditKereta.addActionListener(e);
        btnAttachGerbong.addActionListener(e);
    }
    
    public void addAdapter(MouseAdapter e){
        listKereta.addMouseListener(e);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddKereta = new javax.swing.JButton();
        btnDelKereta = new javax.swing.JButton();
        btnEditKereta = new javax.swing.JButton();
        ScrollPane1 = new javax.swing.JScrollPane();
        listKereta = new javax.swing.JList<>();
        ScrollPane2 = new javax.swing.JScrollPane();
        infoKereta = new javax.swing.JTextArea();
        btnAttachGerbong = new javax.swing.JButton();

        btnAddKereta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/tambahkereta.png"))); // NOI18N

        btnDelKereta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/hapuskereta.png"))); // NOI18N
        btnDelKereta.setMaximumSize(new java.awt.Dimension(115, 23));
        btnDelKereta.setPreferredSize(new java.awt.Dimension(115, 23));

        btnEditKereta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/editekereta.png"))); // NOI18N

        listKereta.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPane1.setViewportView(listKereta);

        infoKereta.setColumns(20);
        infoKereta.setRows(5);
        ScrollPane2.setViewportView(infoKereta);

        btnAttachGerbong.setBackground(new java.awt.Color(51, 51, 51));
        btnAttachGerbong.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        btnAttachGerbong.setForeground(new java.awt.Color(255, 255, 255));
        btnAttachGerbong.setText("P A S A N G  G E R B O N G");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane2)
                    .addComponent(ScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAttachGerbong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAttachGerbong, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane1;
    private javax.swing.JScrollPane ScrollPane2;
    private javax.swing.JButton btnAddKereta;
    private javax.swing.JButton btnAttachGerbong;
    private javax.swing.JButton btnDelKereta;
    private javax.swing.JButton btnEditKereta;
    private javax.swing.JTextArea infoKereta;
    private javax.swing.JList<String> listKereta;
    // End of variables declaration//GEN-END:variables

    public Object getBtnAddKereta() {
        return btnAddKereta;
    }
    public Object getBtnDelKereta() {
        return btnDelKereta;
    }
    public Object getBtnEditKereta() {
        return btnEditKereta;
    }
    public Object getBtnAttachGerbong(){
        return btnAttachGerbong;
    }
    public void setListKereta(String [] keretaList){
        listKereta.setListData(keretaList);
    }
    public Object getListKereta(){
        return listKereta;
    }
    public String getSelectedKereta(){
        return listKereta.getSelectedValue();
    }
    public void setInfoKereta(String s){
        infoKereta.setText(s);
    }
}
