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

        btnAddRute.setText("TAMBAH RUTE");

        listRute.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listRute);

        infoRute.setColumns(20);
        infoRute.setRows(5);
        jScrollPane2.setViewportView(infoRute);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddRute)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnAddRute)
                .addContainerGap())
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
}
