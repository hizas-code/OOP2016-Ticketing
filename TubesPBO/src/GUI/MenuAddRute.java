package GUI;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 * @author Kelompok 5 - IF3801
 */

public class MenuAddRute extends javax.swing.JPanel {

    public MenuAddRute() {
        initComponents();
    }

    public void addListener(ActionListener a){
        btnAdd.addActionListener(a);
        btnBack.addActionListener(a);
        btnCancel.addActionListener(a);
        btnChoose1.addActionListener(a);
        btnChoose2.addActionListener(a);
    }    
    public void addAdapter(MouseAdapter ma){
        listStasiun.addMouseListener(ma);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        listStasiun = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        infoStasiun = new javax.swing.JTextArea();
        stasiunAwal = new javax.swing.JTextField();
        stasiunAkhir = new javax.swing.JTextField();
        btnChoose1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnChoose2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listStasiunLabel = new javax.swing.JButton();
        jarakSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();

        listStasiun.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listStasiun);

        infoStasiun.setEditable(false);
        infoStasiun.setColumns(20);
        infoStasiun.setRows(5);
        jScrollPane3.setViewportView(infoStasiun);

        stasiunAwal.setEditable(false);

        stasiunAkhir.setEditable(false);

        btnChoose1.setBackground(new java.awt.Color(255, 255, 255));
        btnChoose1.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        btnChoose1.setForeground(new java.awt.Color(51, 51, 51));
        btnChoose1.setText("PILIH STASIUN AWAL");

        btnBack.setBackground(new java.awt.Color(51, 51, 51));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("KEMBALI");

        btnCancel.setBackground(new java.awt.Color(51, 51, 51));
        btnCancel.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("BATAL");

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnAdd.setText("TAMBAH");

        btnChoose2.setBackground(new java.awt.Color(255, 255, 255));
        btnChoose2.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        btnChoose2.setForeground(new java.awt.Color(51, 51, 51));
        btnChoose2.setText("PILIH STASIUN AKHIR");

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        jLabel1.setText("STASIUN AWAL");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        jLabel2.setText("STASIUN AKHIR");

        listStasiunLabel.setBackground(new java.awt.Color(51, 51, 51));
        listStasiunLabel.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        listStasiunLabel.setForeground(new java.awt.Color(255, 255, 255));
        listStasiunLabel.setText("LIST STASIUN");

        jarakSpinner.setModel(new javax.swing.SpinnerNumberModel(5, 1, 1000, 5));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 11)); // NOI18N
        jLabel3.setText("JARAK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listStasiunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jarakSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(stasiunAwal)
                                        .addComponent(stasiunAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))))
                            .addComponent(jLabel3)
                            .addComponent(btnChoose1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChoose2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listStasiunLabel)
                    .addComponent(stasiunAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stasiunAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jarakSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChoose1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnChoose2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChoose1;
    private javax.swing.JButton btnChoose2;
    private javax.swing.JTextArea infoStasiun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jarakSpinner;
    private javax.swing.JList<String> listStasiun;
    private javax.swing.JButton listStasiunLabel;
    private javax.swing.JTextField stasiunAkhir;
    private javax.swing.JTextField stasiunAwal;
    // End of variables declaration//GEN-END:variables
    public Object getBtnAdd(){
        return btnAdd;
    }
    public Object getBtnBack(){
        return btnBack;
    }
    public Object getBtnCancel(){
        return btnCancel;
    }
    public Object getBtnChoose1(){
        return btnChoose1;
    }
    public Object getBtnChoose2(){
        return btnChoose2;
    }
    public Object getListStasiun(){
        return listStasiun;
    }
    public String getSelectedStasiun(){
        return listStasiun.getSelectedValue();
    }
    public String getStasiunAwal(){
        return stasiunAwal.getText();
    }
    public int getJarak(){
        return (int) jarakSpinner.getValue();
    }
    public String getStasiunAkhir(){
        return stasiunAkhir.getText();
    }
    public void setInfoStasiun(String s){
        infoStasiun.setText(s);
    }
    public void setStasiunAwal(String s){
        stasiunAwal.setText(s);
    }
    public void setStasiunAkhir(String s){
        stasiunAkhir.setText(s);
    }
    public void resetText(){
        stasiunAwal.setText("");
        stasiunAkhir.setText("");
    }
    public void setListStasiun(String [] s){
        listStasiun.setListData(s);
    }
}
