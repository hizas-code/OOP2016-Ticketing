package GUI;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JList;

/**
 * @author Kelompok 5 - IF3801
 */
public class MenuPasangGerbong extends javax.swing.JPanel {

    public MenuPasangGerbong() {
        initComponents();
    }

    public void addListener(ActionListener al){
        btnAttach.addActionListener(al);
        btnBack.addActionListener(al);
        btnRelease.addActionListener(al);
    }
    public void addAdapter(MouseAdapter ma){
        listGerbongFree.addMouseListener(ma);
        listGerbongUsed.addMouseListener(ma);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPane1 = new javax.swing.JScrollPane();
        listGerbongFree = new javax.swing.JList<>();
        ScrollPane2 = new javax.swing.JScrollPane();
        infoGerbong = new javax.swing.JTextArea();
        ScrollPane3 = new javax.swing.JScrollPane();
        listGerbongUsed = new javax.swing.JList<>();
        btnAttach = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRelease = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        listGerbongFree.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPane1.setViewportView(listGerbongFree);

        infoGerbong.setColumns(20);
        infoGerbong.setRows(5);
        ScrollPane2.setViewportView(infoGerbong);

        listGerbongUsed.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPane3.setViewportView(listGerbongUsed);

        btnAttach.setText("Attach");

        btnBack.setText("Back");

        btnRelease.setText("Release");

        jLabel1.setText("List Gerbong yang Free");

        jLabel2.setText("List Gerbong yang digunakan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnAttach)
                        .addGap(18, 18, 18)
                        .addComponent(btnRelease)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAttach)
                    .addComponent(btnBack)
                    .addComponent(btnRelease))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane1;
    private javax.swing.JScrollPane ScrollPane2;
    private javax.swing.JScrollPane ScrollPane3;
    private javax.swing.JButton btnAttach;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRelease;
    private javax.swing.JTextArea infoGerbong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> listGerbongFree;
    private javax.swing.JList<String> listGerbongUsed;
    // End of variables declaration//GEN-END:variables

    public Object getBtnAttach() {
        return btnAttach;
    }
    public Object getBtnBack() {
        return btnBack;
    }
    public Object getBtnRelease() {
        return btnRelease;
    }
    public Object getListGerbongFree() {
        return listGerbongFree;
    }
    public Object getListGerbongUsed() {
        return listGerbongUsed;
    }
    public String getSelectedGerbongFree(){
        return listGerbongFree.getSelectedValue();
    }
    public String getSelectedGerbongUsed(){
        return listGerbongUsed.getSelectedValue();
    }
    public void setListGerbongFree(String [] gerbongList){
        listGerbongFree.setListData(gerbongList);
    }
    public void setListGerbongUsed(String [] gerbongList){
        listGerbongUsed.setListData(gerbongList);
    }
    public void setInfoGerbong(String s){
        infoGerbong.setText(s);
    }
}
