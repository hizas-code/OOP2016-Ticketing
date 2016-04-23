package Controller;

import javax.swing.JPanel;
import GUI.*;
import Model.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

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
    private SearchTiket menuSearchTiket;
    
    public Controller(Application model){
        this.model = model;
        this.view = new PanelContainer();
        view.getContentPane().setBackground(Color.decode("#ffffff"));
        
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
        menuSearchTiket = new SearchTiket();
        
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
        menuEditTiket.addListener(this);
        menuSearchTiket.addListener(this);
        
        menuGerbong.addAdapter(this);
        menuKereta.addAdapter(this);
        menuStasiun.addAdapter(this);
        menuRute.addAdapter(this);
        menuAddRute.addAdapter(this);
        menuPasangGerbong.addAdapter(this);
        menuTiket.addAdapter(this);
        menuAddTiket.addAdapter(this);
        menuEditTiket.addAdapter(this);
        menuSearchTiket.addAdapter(this);
        
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
        mainPanel.add(menuSearchTiket,"menuSearchTiket");
        
        currentView = "menuGerbong";
        view.getCardLayout().show(mainPanel,currentView);
        view.setVisible(true);
        view.addListener(this);
        view.setTitle("Tricking (Train Ticketing)");
        menuGerbong.setListGerbong(model.getGerbongList());
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = (Object) ae.getSource(); //Mencari Sumber dari Tombol yang ditekan
/*Exit*/if(source.equals(view.getBtnExit())){
            int answer = JOptionPane.showConfirmDialog(mainPanel, "Yakin ingin keluar ?");
            if(answer == 0){ //Jika Tekan Tombol Yes
                model.saveData(model);
                System.exit(0); //Exit Program
            }
            //Selain Itu Tidak ke Close
        }
        //Main
/*MM*/  if(currentView.equals("menuGerbong") || currentView.equals("menuKereta") || currentView.equals("menuStasiun") || currentView.equals("menuRute") || currentView.equals("menuTiket") || currentView.equals("menuSearchTiket")) {
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
                rute = null;
                menuRute.setListRute(model.getRuteList());
                currentView = "menuRute";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(view.getBtnTiket())){
                tiket = null;
                menuTiket.setListTiket(model.getTiketList());
                currentView = "menuTiket";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(view.getBtnSearch())){
                tiket = null;
                menuSearchTiket.setBox1(model.getListKota());
                menuSearchTiket.setBox2(model.getListKota());
                currentView = "menuSearchTiket";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
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
                    int answer = JOptionPane.showConfirmDialog(menuGerbong, "Hapus gerbong dengan ID " + gerbong.getGerbongId() + " ?");
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
                menuAddRute.setListStasiun(model.getStasiunList());
                currentView = "menuAddRute";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
        if(currentView.equals("menuTiket")){
            if(source.equals(menuTiket.getBtnAddTiket())){
                menuAddTiket.setListKereta(model.getKeretaList());
                menuAddTiket.setListRute(model.getRuteList());
                currentView = "menuAddTiket";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(menuTiket.getBtnDelTiket())){
                if(tiket == null){
                    JOptionPane.showMessageDialog(menuTiket, "Pilih tiket yang ingin dihapus!");
                }
                else {
                    int answer = JOptionPane.showConfirmDialog(menuGerbong, "Yakin Ingin menghapus Tiket dengan ID " + tiket.getTiketId() + " ?");
                    if(answer == 0){
                        model.getDaftarTiket().remove(tiket);
                        menuTiket.setListTiket(model.getTiketList());
                        tiket.getKereta().setStatus(false);
                        tiket = null;
                        menuTiket.setInfoTiket("");
                    }
                }
            }
            if(source.equals(menuTiket.getBtnEditTiket())){
                if(tiket == null){
                    JOptionPane.showMessageDialog(menuTiket, "Pilih tiket yang ingin diedit!");
                }
                else {
                    kereta = tiket.getKereta();
                    rute = tiket.getRute();
                    menuEditTiket.setListKereta(model.getKeretaList());
                    menuEditTiket.setListRute(model.getRuteList());
                    menuEditTiket.setInfoKereta(tiket.getKereta().toString());
                    menuEditTiket.setInfoRute(tiket.getRute().toString());
                    menuEditTiket.setHarga(tiket.getPrice());
                    currentView = "menuEditTiket";
                    view.getCardLayout().show(mainPanel, currentView);
                }
            }
        }
        if(currentView.equals("menuSearchTiket")){
            if(source.equals(menuSearchTiket.getBtnSearch())){
                String kota1 = menuSearchTiket.getCity1();
                String kota2 = menuSearchTiket.getCit2();
                System.out.println(kota1);
                System.out.println(kota2);
                menuSearchTiket.setListTiket(model.getListTiketByKota(kota1,kota2));
            }
        }

        if(currentView.equals("menuAddGerbong")){
            if(source.equals(menuAddGerbong.getRbtnType1()) || source.equals(menuAddGerbong.getRbtnType2()) || source.equals(menuAddGerbong.getRbtnType3()))
                menuAddGerbong.resetOtherType(source);
            if(source.equals(menuAddGerbong.getBtnAdd())){
                String id = model.generateIDGerbong(menuAddGerbong.getGerbongType());
                int answer = JOptionPane.showConfirmDialog(menuAddGerbong,"ID Gerbong = " + id + ", Tambahkan Gerbong ?");
                if(answer == 0){
                    model.addGerbong(new Gerbong(id,menuAddGerbong.getValueChairQty(),menuAddGerbong.getGerbongType()));
                    menuGerbong.setListGerbong(model.getGerbongList());
                    currentView = "menuGerbong";
                    view.getCardLayout().show(mainPanel, currentView);
                }
            }
            if(source.equals(menuAddGerbong.getBtnBack())){
                menuAddGerbong.reset();
                currentView = "menuGerbong";
                view.getCardLayout().show(mainPanel, currentView);
            }           
        }
        if(currentView.equals("menuEditGerbong")){
            menuEditGerbong.setInfoGerbong(gerbong.toString());
            if(source.equals(menuEditGerbong.getRbtnType1()) || source.equals(menuEditGerbong.getRbtnType2()) || source.equals(menuEditGerbong.getRbtnType3()))
                menuEditGerbong.resetOtherType(source);
            if(source.equals(menuEditGerbong.getBtnBack())){
                menuEditGerbong.reset();
                currentView = "menuGerbong";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(menuEditGerbong.getBtnEdit())){
                String id = model.generateIDGerbong(menuEditGerbong.getGerbongType());
                int answer = JOptionPane.showConfirmDialog(menuAddGerbong,"Gerbong diedit, ID akan berubah menjadi " + id + ", edit Gerbong ?");
                if(answer == 0){
                    gerbong.setGerbongId(id);
                    gerbong.setChairQty(menuEditGerbong.getChairQty());
                    gerbong.setGerbongType(menuEditGerbong.getGerbongType());
                    menuEditGerbong.reset();
                    menuGerbong.setListGerbong(model.getGerbongList());
                    menuGerbong.setInfoGerbong("");
                    currentView = "menuGerbong";
                    view.getCardLayout().show(mainPanel, currentView);
                } 
            }
        }
        if(currentView.equals("menuAddKereta")){
            if(source.equals(menuAddKereta.getBtnAdd())){
                String id = model.generateIDKereta();
                int answer = JOptionPane.showConfirmDialog(menuAddKereta, "Tambahkan Kereta dengan ID : " + id + " ?");
                if(answer == 0){
                    model.addKereta(new Kereta(id,menuAddKereta.getKeretaName(), menuAddKereta.getGerbongCap()));
                    currentView = "menuKereta";
                    view.getCardLayout().show(mainPanel, currentView);
                    menuKereta.setListKereta(model.getKeretaList());
                }
            }
            if(source.equals(menuAddKereta.getBtnBack())){
                menuAddKereta.reset();
                currentView = "menuKereta";
                view.getCardLayout().show(mainPanel, currentView);
                menuKereta.setListKereta(model.getKeretaList());
            }
            
        }
        if(currentView.equals("menuEditKereta")){
            menuEditKereta.setInfoKereta(kereta.toString());
            if(source.equals(menuEditKereta.getBtnBack())){
                menuEditKereta.reset();
                kereta = null;
                currentView = "menuKereta";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(menuEditKereta.getBtnEdit())){
                    kereta.setGerbongCap(menuEditKereta.getGerbongCap());
                    kereta.setKeretaName(menuEditKereta.getKeretaName());
                    JOptionPane.showMessageDialog(menuEditKereta, "Edit Kereta Berhasil!");
                    menuEditKereta.reset();
                    menuEditKereta.setInfoKereta("");
                    kereta = null;
                    currentView = "menuKereta";
                    view.getCardLayout().show(mainPanel, currentView);
            }
        }
        if(currentView.equals("menuPasangGerbong")){
            menuPasangGerbong.setListGerbongFree(model.getGerbongNotUsed());
            menuPasangGerbong.setListGerbongUsed(kereta.getGerbongUsed());
            if(source.equals(menuPasangGerbong.getBtnAttach())){
                if(gerbongAttach == null){
                    JOptionPane.showMessageDialog(menuPasangGerbong, "Pilih Gerbong yang mau dipasang!");
                }
                else if (kereta.getGerbongCap() == kereta.getGerbongList().size()) {
                    JOptionPane.showMessageDialog(menuPasangGerbong, "Kereta sudah penuh dengan Gerbong!");
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
        if(currentView.equals("menuAddStasiun")){
            if(source.equals(menuAddStasiun.getBtnAdd())){
                if(menuAddStasiun.getStasiunCity().length() < 3){
                    JOptionPane.showMessageDialog(menuAddStasiun,"Panjang Nama kota harus lebih dari 2 Karakter!");
                }
                else {
                    String id = model.generateIDStasiun(menuAddStasiun.getStasiunCity());   
                    int answer = JOptionPane.showConfirmDialog(menuAddStasiun,"Tambah Stasiun dengan ID : " + id + " ?" );
                    if(answer == 0){
                        model.addStasiun(new Stasiun(menuAddStasiun.getStasiunName(),id,menuAddStasiun.getStasiunCity()));
                        menuStasiun.setListStasiun(model.getStasiunList());
                    }
                }
            }
            if(source.equals(menuAddStasiun.getBtnBack())){
                menuAddStasiun.resetText();
                currentView = "menuStasiun";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
        if(currentView.equals("menuAddRute")){
            if(source.equals(menuAddRute.getBtnBack())){
                menuAddRute.resetText();
                currentView = "menuRute";
                view.getCardLayout().show(mainPanel, currentView);
            }
            if(source.equals(menuAddRute.getBtnCancel())){
                menuAddRute.resetText();
            }
            if(source.equals(menuAddRute.getBtnChoose1())){
                menuAddRute.setStasiunAwal(menuAddRute.getSelectedStasiun());
            }
            if(source.equals(menuAddRute.getBtnChoose2())){
                menuAddRute.setStasiunAkhir(menuAddRute.getSelectedStasiun());
            }
            if(source.equals(menuAddRute.getBtnAdd())){
                if(menuAddRute.getStasiunAwal().equals("") || menuAddRute.getStasiunAkhir().equals("")){
                    JOptionPane.showMessageDialog(menuAddRute, "Pilih Stasiun terlebih dahulu!");
                }
                else if(menuAddRute.getStasiunAwal().equals(menuAddRute.getStasiunAkhir())){
                    JOptionPane.showMessageDialog(menuAddRute, "Stasiun awal dan akhir harus berbeda!");
                }
                else if (menuAddRute.getJarak() == 0) {
                    JOptionPane.showMessageDialog(menuAddRute, "Jarak tidak boleh 0!");
                }   
                else {
                    Stasiun awal = model.getStasiunByID(menuAddRute.getStasiunAwal());
                    Stasiun akhir = model.getStasiunByID(menuAddRute.getStasiunAkhir());
                    String id = model.generateIDRute(awal,akhir);
                    int answer = JOptionPane.showConfirmDialog(menuAddRute,"Tambahkan Rute dengan ID : " + id + " ?");
                    if(answer == 0){
                        model.addRute(new Rute(id,awal,akhir,menuAddRute.getJarak()));
                        menuRute.setListRute(model.getRuteList());
                    }
                }
            }
        }
        if(currentView.equals("menuAddTiket")){
            if(source.equals(menuAddTiket.getBtnAdd())){
                if(menuAddTiket.getHarga() == 0){
                    JOptionPane.showMessageDialog(menuAddTiket,"Tentukan harga terlebih dahulu!");
                }
                else if(rute == null || kereta == null){
                    JOptionPane.showMessageDialog(menuAddTiket,"Tentukan kereta dan rute yang digunakan!");
                }
                else if(kereta.getGerbongList().isEmpty()){
                    JOptionPane.showMessageDialog(menuAddTiket,"Kereta belum memiliki gerbong!");
                }
                else {
                    String id = model.generateIDTiket(rute);
                    int answer = JOptionPane.showConfirmDialog(menuAddTiket,"Tambahkan Tiket dengan ID : " + id + " ?");
                    if(answer == 0) {
                        model.addTiket(new Tiket(id,menuAddTiket.getHarga(),rute,kereta,menuAddTiket.getJadwal()));
                        menuTiket.setListTiket(model.getTiketList());
                        kereta.setStatus(true);
                        kereta = null;
                        rute = null;
                        currentView = "menuTiket";
                        view.getCardLayout().show(mainPanel, currentView);
                    }
                }
            }
            if(source.equals(menuAddTiket.getBtnBack())){
                kereta = null;
                rute = null;
                currentView = "menuTiket";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
        if(currentView.equals("menuEditTiket")){
            if(source.equals(menuEditTiket.getBtnEdit())){
                if(menuEditTiket.getHarga() == 0){
                    JOptionPane.showMessageDialog(menuEditTiket,"Tentukan harga terlebih dahulu!");
                }
                else if(rute == null || kereta == null){
                    JOptionPane.showMessageDialog(menuEditTiket,"Tentukan kereta dan rute yang digunakan!");
                }
                else if(kereta.getGerbongList().isEmpty()){
                    JOptionPane.showMessageDialog(menuEditTiket,"Kereta belum memiliki gerbong!");
                }
                else {
                    String id = model.generateIDTiket(rute);
                    int answer = JOptionPane.showConfirmDialog(menuEditTiket,"Tiket akan memiliki ID baru dengan ID : " + id + ", Edit ?");
                    if(answer == 0) {
                        tiket.getKereta().setStatus(false);
                        tiket.setRoute(rute);
                        tiket.setKeretaUsed(kereta);
                        tiket.setSchedule(menuEditTiket.getJadwal());
                        tiket.setPrice(menuEditTiket.getHarga());
                        tiket.setTiketId(id);
                        kereta.setStatus(true);
                        kereta = null;
                        rute = null;
                        menuTiket.setListTiket(model.getTiketList());
                        currentView = "menuTiket";
                        view.getCardLayout().show(mainPanel, currentView);
                    }
                }
            }
            if(source.equals(menuEditTiket.getBtnBack())){
                kereta = null;
                rute = null;
                menuTiket.setListTiket(model.getTiketList());
                currentView = "menuTiket";
                view.getCardLayout().show(mainPanel, currentView);
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        Object source = e.getSource();
        if (source.equals(menuGerbong.getListGerbong())) {
            String idGerbong = menuGerbong.getSelectedGerbong();
            if(idGerbong != null){
                gerbong = model.getGerbongByID(idGerbong);
                menuGerbong.setInfoGerbong(gerbong.toString());
            }
        }
        if(source.equals(menuKereta.getListKereta())){
            String idKereta = menuKereta.getSelectedKereta();
            if(idKereta != null){
                kereta = model.getKeretaByID(idKereta);
                menuKereta.setInfoKereta(kereta.toString());
            }
        }
        if(source.equals(menuPasangGerbong.getListGerbongFree())){
            String idGerbong = menuPasangGerbong.getSelectedGerbongFree();
            if(idGerbong != null) {
                gerbongAttach = model.getGerbongByID(idGerbong);
                menuPasangGerbong.setInfoGerbong(gerbongAttach.toString());
            }
        }
        if(source.equals(menuPasangGerbong.getListGerbongUsed())){
            String idGerbong = menuPasangGerbong.getSelectedGerbongUsed();
            if(idGerbong != null){
                gerbongRelease = model.getGerbongByID(idGerbong);
                menuPasangGerbong.setInfoGerbong(gerbongRelease.toString());
            }
        }
        if(source.equals(menuStasiun.getListStasiun())){
            String idStasiun = menuStasiun.getSelectedStasiun();
            if(idStasiun != null){
                stasiun = model.getStasiunByID(idStasiun);
                menuStasiun.setInfoStasiun(stasiun.toString());
            }
        }
        if(source.equals(menuRute.getListRute())){
            String idRute = menuRute.getSelectedRute();
            if(idRute != null){
                rute = model.getRuteByID(idRute);
                menuRute.setInfoRute(rute.toString());
            }
        }
        if(source.equals(menuAddRute.getListStasiun())){
            String idStasiun = menuAddRute.getSelectedStasiun();
            if(idStasiun != null){
                stasiun = model.getStasiunByID(idStasiun);
                menuAddRute.setInfoStasiun(stasiun.toString());
            }
        }
        if(source.equals(menuTiket.getListTiket())){
            String idTiket = menuTiket.getSelectedTiket();
            if(idTiket != null) {
                tiket = model.getTiketByID(idTiket);
                menuTiket.setInfoTiket(tiket.toString());
            }
        }
        if(source.equals(menuAddTiket.getListKereta())){
            String idKereta = menuAddTiket.getSelectedKereta();
            if(idKereta != null) {
                kereta = model.getKeretaByID(idKereta);
                menuAddTiket.setInfoKereta(kereta.toString());
            }
        }
        if(source.equals(menuAddTiket.getListRute())){
            String idRute = menuAddTiket.getSelectedRute();
            if(idRute != null){
                rute = model.getRuteByID(idRute);
                menuAddTiket.setInfoRute(rute.toString());
            }
        }
        if(source.equals(menuEditTiket.getListRute())){
            String idRute = menuEditTiket.getSelectedRute();
            if(idRute != null){
                rute = model.getRuteByID(idRute);
                menuEditTiket.setInfoRute(rute.toString());
            }
        }
        if(source.equals(menuEditTiket.getListKereta())){
            String idKereta = menuEditTiket.getSelectedKereta();
            if(idKereta != null){
                kereta = model.getKeretaByID(idKereta);
                menuEditTiket.setInfoKereta(kereta.toString());
            }
        }
        if(source.equals(menuSearchTiket.getListTiket())){
            String idTiket = menuSearchTiket.getSelectedTiket();
            if(idTiket != null){
                tiket = model.getTiketByID(idTiket);
                menuSearchTiket.setInfoTiket(tiket.toString());
            }
        }
    }
}
