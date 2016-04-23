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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        ScrollPane1 = new javax.swing.JScrollPane();
        listGerbongFree = new javax.swing.JList<>();
        ScrollPane2 = new javax.swing.JScrollPane();
        infoGerbong = new javax.swing.JTextArea();
        ScrollPane3 = new javax.swing.JScrollPane();
        listGerbongUsed = new javax.swing.JList<>();
        btnAttach = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRelease = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        listGerbongFree.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPane1.setViewportView(listGerbongFree);

        infoGerbong.setEditable(false);
        infoGerbong.setColumns(20);
        infoGerbong.setRows(5);
        ScrollPane2.setViewportView(infoGerbong);

        listGerbongUsed.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPane3.setViewportView(listGerbongUsed);

        btnAttach.setBackground(new java.awt.Color(255, 255, 255));
        btnAttach.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        btnAttach.setText("PASANG");

        btnBack.setBackground(new java.awt.Color(51, 51, 51));
        btnBack.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("KEMBALI");

        btnRelease.setBackground(new java.awt.Color(51, 51, 51));
        btnRelease.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        btnRelease.setForeground(new java.awt.Color(255, 255, 255));
        btnRelease.setText("LEPAS");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Calibri Light", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LIST GERBONG YANG FREE");

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Calibri Light", 1, 9)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LIST GERBONG YANG DIGUNAKAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollPane1)
                    .addComponent(ScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAttach, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRelease, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAttach)
                            .addComponent(btnRelease))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack))
                    .addComponent(ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
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
