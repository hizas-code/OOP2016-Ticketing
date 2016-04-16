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

        btnAddStasiun.setText("TAMBAH STASIUN");

        listStasiun.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listStasiun);

        infoStasiun.setColumns(20);
        infoStasiun.setRows(5);
        jScrollPane2.setViewportView(infoStasiun);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAddStasiun)
                        .addGap(119, 119, 119)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnAddStasiun)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
}
