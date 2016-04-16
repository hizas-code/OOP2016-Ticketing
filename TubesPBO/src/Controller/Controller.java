package Controller;

import Model.Application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import GUI.*;
import Model.*;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class Controller extends MouseAdapter implements ActionListener {

    private Application model;
    private PanelContainer view;
    private String currentView;
    private JPanel mainPanel;
    private Gerbong gerbong = null;
    private Gerbong gerbongRelease = null;
    private Gerbong gerbongAttach = null;
    private Kereta kereta = null;
    private Stasiun stasiun = null;
    private Rute rute = null;
    private Tiket tiket = null;
    
    private MenuGerbong menuGerbong;
    private MenuKereta menuKereta;
    private MenuStasiun menuStasiun;
    private MenuRute menuRute;
    private MenuTiket menuTiket;
    
    private MenuAddGerbong menuAddGerbong;
    private MenuEditGerbong menuEditGerbong;  
    private MenuAddKereta menuAddKereta;
    private MenuEditKereta menuEditKereta; 
    private MenuPasangGerbong menuPasangGerbong;
    private MenuAddStasiun menuAddStasiun;  
    private MenuAddRute menuAddRute;   
    private MenuAddTiket menuAddTiket;
    private MenuEditTiket menuEditTiket;
    
    public Controller(Application model){
        this.model = model;
        this.view = new PanelContainer();
        view.getContentPane().setBackground(Color.decode("#333333"));
        
        menuGerbong = new MenuGerbong();        //Gerbong
        menuAddGerbong = new MenuAddGerbong();
        menuEditGerbong = new MenuEditGerbong(); 
        menuKereta = new MenuKereta();          //Kereta
        menuAddKereta = new MenuAddKereta();
        menuEditKereta = new MenuEditKereta();
        menuPasangGerbong = new MenuPasangGerbong();
        menuStasiun = new MenuStasiun();        //Stasiun
        menuAddStasiun = new MenuAddStasiun();
        menuRute = new MenuRute();              //Rute
        menuAddRute = new MenuAddRute();
        menuTiket = new MenuTiket();            //Tiket
        menuAddTiket = new MenuAddTiket();
        menuEditTiket = new MenuEditTiket();
        
        menuGerbong.addListener(this);          //Gerbong
        menuAddGerbong.addListener(this);
        menuEditGerbong.addListener(this);
        menuKereta.addListener(this);           //Kereta
        menuAddKereta.addListener(this);
        menuEditKereta.addListener(this);
        menuPasangGerbong.addListener(this);
        menuStasiun.addListener(this);          //Stasiun
        menuAddStasiun.addListener(this); 
        menuRute.addListener(this);             //Rute
        menuAddRute.addListener(this); 
        menuTiket.addListener(this);            //Tiket
        menuAddTiket.addListener(this);
        
        menuGerbong.addAdapter(this);
        menuKereta.addAdapter(this);
        menuStasiun.addAdapter(this);
        menuPasangGerbong.addAdapter(this);
        
        mainPanel = view.getMainPanel();
        mainPanel.add(menuGerbong,"menuGerbong");           //Gerbong  
        mainPanel.add(menuAddGerbong,"menuAddGerbong");
        mainPanel.add(menuEditGerbong,"menuEditGerbong");       
        mainPanel.add(menuKereta,"menuKereta");             //Kereta
        mainPanel.add(menuAddKereta,"menuAddKereta");  
        mainPanel.add(menuEditKereta,"menuEditKereta");  
        mainPanel.add(menuPasangGerbong,"menuPasangGerbong");
        mainPanel.add(menuStasiun,"menuStasiun");           //Stasiun
        mainPanel.add(menuAddStasiun,"menuAddStasiun");
        mainPanel.add(menuRute,"menuRute");                 //Rute
        mainPanel.add(menuAddRute,"menuAddRute");
        mainPanel.add(menuTiket,"menuTiket");               //Tiket
        mainPanel.add(menuAddTiket,"menuAddTiket");
        mainPanel.add(menuEditTiket,"menuEditTiket");
        
        currentView = "menuGerbong";
        view.getCardLayout().show(mainPanel,currentView);
        view.setVisible(true);
        view.addListener(this);
        
        menuGerbong.setListGerbong(model.getGerbongList());
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = (Object) ae.getSource();
        if(source.equals(view.getBtnExit())){
            model.saveData(model);
            System.exit(0);
        }
        //Main Menu
        if(currentView.equals("menuGerbong") || currentView.equals("menuKereta") || currentView.equals("menuStasiun") || currentView.equals("menuRute") || currentView.equals("menuTiket")) {
            if(source.equals(view.getBtnGerbong())){
                gerbong = null;
                menuGerbong.setListGerbong(model.getGerbongList());
                currentView = "menuGerbong";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(view.getBtnKereta())){
                kereta = null;
                menuKereta.setListKereta(model.getKeretaList());
                currentView = "menuKereta";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(view.getBtnStasiun())){
                stasiun = null;
                menuStasiun.setListStasiun(model.getStasiunList());
                currentView = "menuStasiun";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(view.getBtnRute())){
                currentView = "menuRute";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(view.getBtnTiket())){
                currentView = "menuTiket";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
        //Menu Gerbong
        if(currentView.equals("menuGerbong")){            
            if(source.equals(menuGerbong.getBtnAddGerbong())){
                currentView = "menuAddGerbong";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(menuGerbong.getBtnDelGerbong())){
                if(gerbong == null)
                    JOptionPane.showMessageDialog(menuGerbong, "Pilih Gerbong yang akan dihapus!");
                else if(gerbong.getStatus())
                    JOptionPane.showMessageDialog(menuGerbong, "Gerbong yang sedang digunakan tidak dapat dihapus!");
                else {
                    int answer = JOptionPane.showConfirmDialog(menuGerbong, "Yakin Ingin menghapus Gerbong dengan ID " + gerbong.getGerbongId() + " ?");
                    if(answer == 0){
                        model.getDaftarGerbong().remove(gerbong);
                        menuGerbong.setListGerbong(model.getGerbongList());
                        gerbong = null;
                        menuGerbong.setInfoGerbong("");
                    }
                }
            }
            if(source.equals(menuGerbong.getBtnEditGerbong())){
                if(gerbong == null)
                    JOptionPane.showMessageDialog(menuGerbong,"Pilih Gerbong yang akan diedit!");                    
                else if(gerbong.getStatus())
                    JOptionPane.showMessageDialog(menuGerbong,"Gerbong yang sedang digunakan tidak dapat diedit!");   
                else {
                    currentView = "menuEditGerbong";
                    view.getCardLayout().show(mainPanel, currentView);
                }
            }
        }
        if(currentView.equals("menuKereta")){            
            if(source.equals(menuKereta.getBtnAddKereta())){
                currentView = "menuAddKereta";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(menuKereta.getBtnDelKereta())){
                if(kereta == null)
                    JOptionPane.showMessageDialog(menuKereta, "Pilih Kereta yang akan dihapus!");
                else if(kereta.getStatus())
                    JOptionPane.showMessageDialog(menuKereta, "Kereta yang sedang digunakan tidak dapat dihapus!");
                else {
                    int answer = JOptionPane.showConfirmDialog(menuGerbong, "Yakin Ingin menghapus Kereta dengan ID " + kereta.getKeretaId() + " ?");
                    if(answer == 0){
                        model.getDaftarKereta().remove(kereta);
                        kereta.releaseAllGerbong();
                        menuKereta.setListKereta(model.getKeretaList());
                        kereta = null;
                        menuKereta.setInfoKereta("");
                    }
                }
            }
            if(source.equals(menuKereta.getBtnEditKereta())){
                if(kereta == null)
                    JOptionPane.showMessageDialog(menuGerbong,"Pilih Kereta yang akan diedit!");                    
                else if(kereta.getStatus() || !kereta.getGerbongList().isEmpty())
                    JOptionPane.showMessageDialog(menuGerbong,"Kereta yang sedang digunakan tiket atau menggunakan gerbong tidak dapat diedit!");   
                else {
                    currentView = "menuEditKereta";
                    view.getCardLayout().show(mainPanel, currentView);
                }
            }
            if(source.equals(menuKereta.getBtnAttachGerbong())){
                if(kereta == null)
                    JOptionPane.showMessageDialog(menuGerbong,"Pilih Kereta yang akan dipasang gerbong!");
                else {
                    currentView = "menuPasangGerbong";
                    view.getCardLayout().show(mainPanel, currentView);
                }
            }
        }
        if(currentView.equals("menuStasiun")){
            if(source.equals(menuStasiun.getBtnAddStasiun())){
                currentView = "menuAddStasiun";
                view.getCardLayout().show(mainPanel, currentView);
            }   
        }
        if(currentView.equals("menuRute")){
            if(source.equals(menuRute.getBtnAddRute())){
                currentView = "menuAddRute";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
        if(currentView.equals("menuTiket")){
            if(source.equals(menuTiket.getBtnAddTiket())){
                currentView = "menuAddTiket";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(menuTiket.getBtnDelTiket())){
                currentView = "menuDelTiket";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(menuTiket.getBtnEditTiket())){
                currentView = "menuEditTiket";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(menuTiket.getBtnViewTiket())){
                currentView = "menuViewTiket";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
        //Sub-Menu
        if(currentView.equals("menuAddGerbong")){
            if(source.equals(menuAddGerbong.getRbtnType1())){
                menuAddGerbong.setFalseType2();
                menuAddGerbong.setFalseType3();
            }
            if(source.equals(menuAddGerbong.getRbtnType2())){
                menuAddGerbong.setFalseType1();
                menuAddGerbong.setFalseType3();
            }
            if(source.equals(menuAddGerbong.getRbtnType3())){
                menuAddGerbong.setFalseType1();
                menuAddGerbong.setFalseType2();
            }
            if(source.equals(menuAddGerbong.getBtnAddGerbongOK())){
                int tryAdd = model.tryGerbong(menuAddGerbong.getTextChairQty(),menuAddGerbong.getGerbongType());
                switch(tryAdd){
                    case -1 : 
                        JOptionPane.showMessageDialog(menuEditGerbong, "Inputkan Jumlah Kursi dengan angka!");
                        break;
                    case -2 :
                        JOptionPane.showMessageDialog(menuEditGerbong, "Pilih Tipe Gerbong!");
                        break;
                    case 1  :
                        String id = model.generateIDGerbong(menuAddGerbong.getGerbongType());
                        model.addGerbong(new Gerbong(Integer.parseInt(menuAddGerbong.getTextChairQty()),id,menuAddGerbong.getGerbongType()));
                        JOptionPane.showMessageDialog(menuAddGerbong, "Gerbong berhasil dibuat dengan ID : " + id);
                        menuGerbong.setListGerbong(model.getGerbongList());
                    }
            }
            if(source.equals(menuAddGerbong.getBtnAddGerbongCancel())){
                menuAddGerbong.setFalseType1();
                menuAddGerbong.setFalseType2();
                menuAddGerbong.setFalseType3();
                menuAddGerbong.getTfChairQty().setText("");
                currentView = "menuGerbong";
                view.getCardLayout().show(mainPanel, currentView);
            }           
        }
        if(currentView.equals("menuEditGerbong")){
            menuEditGerbong.setInfoGerbong(gerbong.toString());
            if(source.equals(menuEditGerbong.getBtnBack())){
                menuEditGerbong.getTfChairQty().setText("");
                menuEditGerbong.setFalseType1();
                menuEditGerbong.setFalseType2();
                menuEditGerbong.setFalseType3();
                currentView = "menuGerbong";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(menuEditGerbong.getRbtnType1())){
                menuEditGerbong.setFalseType2();
                menuEditGerbong.setFalseType3();
            }
            if(source.equals(menuEditGerbong.getRbtnType2())){
                menuEditGerbong.setFalseType1();
                menuEditGerbong.setFalseType3();
            }
            if(source.equals(menuEditGerbong.getRbtnType3())){
                menuEditGerbong.setFalseType2();
                menuEditGerbong.setFalseType3();
            }
            if(source.equals(menuEditGerbong.getBtnEdit())){
                int tryEdit = model.tryGerbong(menuEditGerbong.getChairQty(),menuEditGerbong.getGerbongType());
                switch(tryEdit){
                    case -1 : 
                        JOptionPane.showMessageDialog(menuEditGerbong, "Inputkan Jumlah Kursi dengan angka!");
                        break;
                    case -2 :
                        JOptionPane.showMessageDialog(menuEditGerbong, "Pilih Tipe Gerbong!");
                        break;
                    case 1  :     
                        String id = model.generateIDGerbong(menuEditGerbong.getGerbongType());
                        int answer = JOptionPane.showConfirmDialog(menuEditGerbong, "Gerbong akan diedit dan memiliki ID baru dengan ID : " + id);
                        if(answer == 0){
                            gerbong.setChairQty(Integer.parseInt(menuEditGerbong.getChairQty()));
                            gerbong.setGerbongType(menuEditGerbong.getGerbongType());
                            gerbong.setGerbongId(id);
                            menuGerbong.setListGerbong(model.getGerbongList());
                            menuEditGerbong.setFalseType1();
                            menuEditGerbong.setFalseType2();
                            menuEditGerbong.setFalseType3();
                            currentView = "menuGerbong";
                            view.getCardLayout().show(mainPanel, currentView);
                        }
                        break;
                }
            }
        }
        if(currentView.equals("menuAddKereta")){
            if(source.equals(menuAddKereta.getBtnAdd())){
                int tryAdd = model.tryKereta(menuAddKereta.getGerbongCap());
                if(tryAdd == -1){
                    JOptionPane.showMessageDialog(menuAddKereta, "Input Format not accepted!");
                }
                else {
                    String id = model.generateIDKereta();
                    int answer = JOptionPane.showConfirmDialog(menuAddKereta, "Tambahkan Kereta dengan ID : " + id + " ?");
                    if(answer == 0){
                        model.addKereta(new Kereta(id,menuAddKereta.getKeretaName(), Integer.parseInt(menuAddKereta.getGerbongCap())));
                    }
                }
            }
            if(source.equals(menuAddKereta.getBtnBack())){
                menuAddKereta.resetGerbongCap();
                menuAddKereta.resetKeretaName();
                currentView = "menuKereta";
                view.getCardLayout().show(mainPanel, currentView);
                menuKereta.setListKereta(model.getKeretaList());
            }
        }
        if(currentView.equals("menuEditKereta")){
            menuEditKereta.setInfoKereta(kereta.toString());
            if(source.equals(menuEditKereta.getBtnBack())){
                menuEditKereta.resetTF();
                currentView = "menuKereta";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(menuEditKereta.getBtnEdit())){
                int tryEdit = model.tryKereta(menuEditKereta.getGerbongCap());
                if(tryEdit == -1){
                    JOptionPane.showMessageDialog(menuEditKereta, "Inputkan Angka pada Kapasitas Gerbong!");
                }
                else {
                    kereta.setGerbongCap(Integer.parseInt(menuEditKereta.getGerbongCap()));
                    kereta.setKeretaName(menuEditKereta.getKeretaName());
                    JOptionPane.showMessageDialog(menuEditKereta, "Edit Kereta Berhasil!");
                    menuEditKereta.setInfoKereta(kereta.toString());
                }
            }
        }
        if(currentView.equals("menuPasangGerbong")){
            menuPasangGerbong.setListGerbongFree(model.getGerbongNotUsed());
            menuPasangGerbong.setListGerbongUsed(kereta.getGerbongUsed());
            if(source.equals(menuPasangGerbong.getBtnAttach())){
                if(gerbongAttach == null){
                    JOptionPane.showMessageDialog(menuPasangGerbong, "Pilih Gerbong yang mau dipasang!");
                }
                else {
                    kereta.getGerbongList().add(gerbongAttach);
                    gerbongAttach.setStatus(true);
                    gerbongAttach = null;
                    menuPasangGerbong.setListGerbongFree(model.getGerbongNotUsed());
                    menuPasangGerbong.setListGerbongUsed(kereta.getGerbongUsed());
                }
            }
            if(source.equals(menuPasangGerbong.getBtnRelease())){
                if(gerbongRelease == null){
                    JOptionPane.showMessageDialog(menuPasangGerbong, "Pilih Gerbong yang mau dilepas!");
                }
                else {
                    kereta.getGerbongList().remove(gerbongRelease);
                    gerbongRelease.setStatus(false);
                    gerbongRelease = null;
                    menuPasangGerbong.setListGerbongFree(model.getGerbongNotUsed());
                    menuPasangGerbong.setListGerbongUsed(kereta.getGerbongUsed());
                }
            }
            if(source.equals(menuPasangGerbong.getBtnBack())){
                gerbongAttach = null;
                gerbongRelease = null;
                currentView = "menuKereta";
                view.getCardLayout().show(mainPanel,currentView);
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        Object source = e.getSource();
        if (source.equals(menuGerbong.getListGerbong())) {
            String idGerbong = menuGerbong.getSelectedGerbong();
            gerbong = model.getGerbongByID(idGerbong);
            menuGerbong.setInfoGerbong(gerbong.toString());
        }
        if(source.equals(menuKereta.getListKereta())){
            String idKereta = menuKereta.getSelectedKereta();
            kereta = model.getKeretaByID(idKereta);
            menuKereta.setInfoKereta(kereta.toString());
        }
        if(source.equals(menuPasangGerbong.getListGerbongFree())){
            String idGerbong = menuPasangGerbong.getSelectedGerbongFree();
            gerbongAttach = model.getGerbongByID(idGerbong);
            menuPasangGerbong.setInfoGerbong(gerbongAttach.toString());
        }
        if(source.equals(menuPasangGerbong.getListGerbongUsed())){
            String idGerbong = menuPasangGerbong.getSelectedGerbongUsed();
            gerbongRelease = model.getGerbongByID(idGerbong);
            menuPasangGerbong.setInfoGerbong(gerbongRelease.toString());
        }
    }
}
