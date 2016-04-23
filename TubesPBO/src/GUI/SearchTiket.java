package GUI;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Kelompok 5 - IF3801
 */
public class SearchTiket extends javax.swing.JPanel {

    public SearchTiket() {
        initComponents();
    }

    public void addListener(ActionListener al){
        btnSearch.addActionListener(al);
    }
    public void addAdapter(MouseAdapter ma){
        listTiket.addMouseListener(ma);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxCity1 = new javax.swing.JComboBox<>();
        boxCity2 = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTiket = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoTiket = new javax.swing.JTextArea();

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(51, 51, 51));
        btnSearch.setText("SEARCH");

        jScrollPane1.setViewportView(listTiket);

        infoTiket.setEditable(false);
        infoTiket.setColumns(20);
        infoTiket.setRows(5);
        jScrollPane2.setViewportView(infoTiket);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boxCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxCity2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxCity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCity1;
    private javax.swing.JComboBox<String> boxCity2;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextArea infoTiket;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listTiket;
    // End of variables declaration//GEN-END:variables

    public Object getBoxCity1(){
        return boxCity1;
    }
    public Object getBoxCity2(){
        return boxCity2;
    }
    public Object getBtnSearch(){
        return btnSearch;
    }
    public Object getListTiket(){
        return listTiket;
    }
    public String getSelectedTiket(){
        return listTiket.getSelectedValue();
    }
    public String getCity1(){
        return (String) boxCity1.getSelectedItem();
    }
    public String getCit2(){
        return (String) boxCity2.getSelectedItem();
    }
    public void setInfoTiket(String s){
        infoTiket.setText(s);
    }
    public void setListTiket(String [] s){
        listTiket.setListData(s);
    }
    public void setBox1(HashSet<String> s){
        if(!s.isEmpty())
            for(String st : s)
                boxCity1.addItem(st);
    }
    public void setBox2(HashSet<String> s){
            for(String st : s)
                    boxCity2.addItem(st);
    }
}
