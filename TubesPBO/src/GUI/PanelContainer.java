package GUI;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Kelompok-5 IF3801
 */

public class PanelContainer extends javax.swing.JFrame {
    
    private CardLayout cardLayout;
    public PanelContainer() {
        initComponents();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);
        
    }  
    public JPanel getMainPanel() {
        return mainPanel;
    }
    public CardLayout getCardLayout() {
        return cardLayout;
    }
    public void addListener(ActionListener e) {
        btnExit.addActionListener(e);
        btnGerbong.addActionListener(e);
        btnKereta.addActionListener(e);
        btnStasiun.addActionListener(e);
        btnRute.addActionListener(e);
        btnTiket.addActionListener(e);
        btnHome.addActionListener(e);
        btnSearch.addActionListener(e);
    }
    public void viewErrorMsg(String errorMsg) {
        JOptionPane.showMessageDialog(this, errorMsg);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        btnGerbong = new javax.swing.JButton();
        btnKereta = new javax.swing.JButton();
        btnStasiun = new javax.swing.JButton();
        btnRute = new javax.swing.JButton();
        btnTiket = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        setResizable(false);

        mainPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        btnGerbong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/gerbongbut.png"))); // NOI18N

        btnKereta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/keretabut.png"))); // NOI18N

        btnStasiun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/stasiunbut.png"))); // NOI18N

        btnRute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/rutebut.png"))); // NOI18N

        btnTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/tiketbut.png"))); // NOI18N

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/exit.png"))); // NOI18N

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/search.png"))); // NOI18N

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/train.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix button/gerbong.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRute, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnStasiun, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnGerbong, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGerbong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStasiun, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRute, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 42, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGerbong;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnKereta;
    private javax.swing.JButton btnRute;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStasiun;
    private javax.swing.JButton btnTiket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
    public Object getBtnSearch(){
        return btnSearch;
    }
    public Object getBtnHome(){
        return btnHome;
    }
    public Object getBtnGerbong() {
        return btnGerbong;
    }
    public Object getBtnKereta() {
        return btnKereta;
    }
    public Object getBtnStasiun() {
        return btnStasiun;
    }
    public Object getBtnRute() {
        return btnRute;
    }
    public Object getBtnTiket() {
        return btnTiket;
    }
    public Object getBtnExit() {
        return btnExit;
    }
}
