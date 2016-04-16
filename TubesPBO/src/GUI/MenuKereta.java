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

        btnAddKereta.setText("TAMBAH KERETA");

        btnDelKereta.setText("HAPUS KERETA");
        btnDelKereta.setMaximumSize(new java.awt.Dimension(115, 23));
        btnDelKereta.setPreferredSize(new java.awt.Dimension(115, 23));

        btnEditKereta.setText("EDIT KERETA");

        listKereta.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPane1.setViewportView(listKereta);

        infoKereta.setColumns(20);
        infoKereta.setRows(5);
        ScrollPane2.setViewportView(infoKereta);

        btnAttachGerbong.setText("PASANG GERBONG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(ScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAttachGerbong))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddKereta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelKereta, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditKereta)
                    .addComponent(btnDelKereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddKereta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAttachGerbong)
                .addContainerGap())
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
