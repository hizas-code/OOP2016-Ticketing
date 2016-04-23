package Console;

import Model.Application;
import Model.Gerbong;
import Model.Kereta;
import Model.Rute;
import Model.Tiket;
import Model.Stasiun;
import java.util.*; 

public class Console {
    
    Application app;
    Scanner scanString = new Scanner(System.in);
    Scanner scanInt = new Scanner(System.in);
    Scanner scanDouble = new Scanner(System.in);
    
    public Console(Application app) {
        this.app = app;
    }
    public void mainMenu() {
        String choose = "a";
        while(!"0".equals(choose)) {
            System.out.print("Main Menu Tiketing Kereta Api\n" + 
                             "1. Menu Kereta \n" +
                             "2. Menu Gerbong \n" +
                             "3. Menu Rute \n" +
                             "4. Menu Stasiun \n" +
                             "5. Menu Tiket \n" +
                             "0. Exit \n" +
                             "Pilih Menu : ");
            choose = scanString.nextLine();
            System.out.println("");
            switch(choose)
            {
                case "1" : keretaMenu(); break;
                case "2" : gerbongMenu(); break;
                case "3" : ruteMenu(); break;
                case "4" : stasiunMenu(); break;
                case "5" : tiketMenu(); break;
                default  : break;
            }
        }
        this.app.saveData(app);
    }
    
    /*Main Menu*/
    public void keretaMenu() {
        String choose = "a";
        while(!"0".equals(choose)){
            System.out.print("Menu Kereta \n" +
                             "1. Tambah Kereta\n" + 
                             "2. Hapus Kereta\n" +
                             "3. Edit Kereta\n" +
                             "4. View Kereta\n" +
                             "5. Pasang Gerbong ke Kereta\n" +
                             "6. Lepas Gerbong dari Kereta\n" +
                             "0. Back to Main Menu \n" +
                             "Pilih Menu : ");
            choose = scanString.nextLine();
            System.out.println("");
            switch(choose)
            {
                case "1" : tambahKereta(); break;
                case "2" : hapusKereta(); break;
                case "3" : editKereta(); break;
                case "4" : viewKereta(); break;
                case "5" : pasangGerbong(); break;
                case "6" : lepasGerbong(); break;
                case "0" : break;
                default  : break;
            }
        }
    }
    public void gerbongMenu() {
        String choose = "a";
        while(!"0".equals(choose)) {
            System.out.print("Menu Gerbong \n" +
                             "1. Tambah Gerbong\n" +
                             "2. Hapus Gerbong\n" + 
                             "3. Edit Gerbong\n" +
                             "4. View Gerbong\n" +
                             "0. Back to Main Menu \n" + 
                             "Pilih Menu : ");
            choose = scanString.nextLine();
            System.out.println("");
            switch(choose)
            {
                case "1" : tambahGerbong(); break;
                case "2" : hapusGerbong(); break;
                case "3" : editGerbong(); break;
                case "4" : viewGerbong(); break;
                case "0" : break;
                default  : break;
            }
        }
    }
    public void ruteMenu() {
        String choose = "a";
        while(!"0".equals(choose)) {
            System.out.print("Menu Rute\n" +
                             "1. Tambah Rute \n" +
                             "2. View Rute \n" +
                             "0. Back to Main Menu \n" +
                             "Pilih Menu : ");
            choose = scanString.nextLine();
            System.out.println("");
            switch(choose)
            {
                case "1" : tambahRute(); break;
                case "2" : viewRute(); break;
                case "0" : break;
                default  : break;
            }
        }
    }
    public void stasiunMenu() {
        String choose = "a";
        while(!"0".equals(choose)){
            System.out.print("Menu Stasiun \n" +
                             "1. Tambah Stasiun\n" +
                             "2. View Stasiun\n" +
                             "0. Back to Main Menu\n" +
                             "Pilih Menu : ");
            choose = scanString.nextLine();
            System.out.println("");
            switch(choose){
                case "1" : tambahStasiun(); break;
                case "2" : viewStasiun(); break;
                case "0" : break;
                default  : break;
            }
        }
    }
    public void tiketMenu() {
        String choose = "a";
        while(!"0".equals(choose)) {
            System.out.print("Menu Tiket\n" +
                             "1. Tambah Tiket\n" +
                             "2. Hapus Tiket\n" +
                             "3. View Tiket\n" +
                             "4. Search Tiket\n" +
                             "0. Back to Main Menu \n" +
                             "Pilih Menu : ");
            choose = scanString.nextLine();
            System.out.println("");
            switch(choose)
            {
                case "1" : tambahTiket(); break;
                case "2" : hapusTiket(); break;
                case "3" : viewTiket(); break;
                case "4" : searchTiket(); break;
                default  : break;
            }
        }
    }
    
    /*Menu Kereta*/
    public void tambahKereta(){
        String nama, id; int maxGerbong;
        System.out.print("Tambah Kereta\n" +
                         "Nama Kereta      : "); nama = scanString.nextLine();
        System.out.print("Maksimal Gerbong : "); maxGerbong = scanInt.nextInt();
        id = app.generateIDKereta();
        app.addKereta(new Kereta(id, nama, maxGerbong));
        System.out.println("Kereta dengan ID " + id + " berhasil ditambahkan!");
        scanString.nextLine();
        System.out.println("");
    }
    public void hapusKereta() {
        String id, answer;
        Kereta k;
        System.out.print("Hapus Kereta \n" +
                         "Inputkan ID Kereta yang ingin dihapus : "); id = scanString.nextLine();
        k = app.getKeretaByID(id);
        if(k != null) {
            if(!k.getStatus()) {
                k.releaseAllGerbong();
                app.getDaftarKereta().remove(k);
                System.out.println("Kereta dengan ID " + id + " berhasil dihapus!");
            }
            else {
                System.out.println("Kereta tidak dapat dihapus karena masih digunakan oleh Tiket!");
            }
        }
        else System.out.println("ID Kereta tidak ditemukan!");
        scanString.nextLine();
        System.out.println("");
    }
    public void editKereta() {
        System.out.print("Edit Kereta \n" + 
                         "Masukkan ID Kereta yang ingin di-Edit : ");
        Kereta k = app.getKeretaByID(scanString.nextLine());
        if(k == null) {
            System.out.print("ID not found!\n");
        }
        else {
            if(k.getStatus()) {
                System.out.println("Kereta tidak dapat diedit karena masih digunakan oleh Tiket!");
            }
            else {
                String nama; int cap;
                System.out.print("\nData Lama \n" +
                                 "Nama Kereta       : " + k.getKeretaName() + "\n" +
                                 "Kapasitas Gerbong : " + k.getGerbongCap() + "\n");
                System.out.print("Input Data Baru \n" + 
                                 "Nama Kereta       : "); nama = scanString.nextLine();
                System.out.print("Kapasitas Gerbong : "); cap = scanInt.nextInt();
                k.releaseAllGerbong();
                k.getGerbongList().clear();
                k.setKeretaName(nama); k.setGerbongCap(cap);
                System.out.println("Data Kereta Berhasil diedit!\n"
                                 + "(Semua Gerbong yang telah dipasang akan terlepas)");
            }
        }
        scanString.nextLine();
        System.out.println("");
    }
    public void viewKereta(){
        System.out.println("View Kereta");
        if(app.getDaftarKereta().isEmpty()){
            System.out.println("Empty!");
            scanString.nextLine();
        }
        else {
            viewDaftar(app.getDaftarKereta());
        }
        System.out.println("");
    }
    public void pasangGerbong(){
        String idKereta, idGerbong;
        Kereta k; Gerbong g;
        System.out.print("Tambahkan Gerbong ke Kereta\n" + 
                         "Masukkan ID Kereta yang ingin ditambahkan Gerbong : ");
        idKereta = scanString.nextLine();
        k = app.getKeretaByID(idKereta);
        if(k == null) {
            System.out.print("ID Kereta tidak ditemukan!");
        }
        else {
            String id;
            System.out.print("Inputkan ID Gerbong yang akan dipasang : "); id = scanString.nextLine();
            g = app.getGerbongByID(id);
            if(g == null) {
                System.out.println("ID Gerbong tidak ditemukan!");
            }
            else {
                k.addGerbong(g);
                g.setStatus(true);
                System.out.println("Gerbong berhasil dipasangkan ke Kereta!");
            }
        }
        scanString.nextLine();
        System.out.println("");
    }
    public void lepasGerbong(){
        String id;
        System.out.println("Lepas Gerbong");
        System.out.println("Inputkan ID Gerbong yang ingin dilepas : "); id = scanString.nextLine();
        Gerbong g = app.getGerbongByID(id);
        if(g == null){
            System.out.println("ID Gerbong tidak ditemukan!");
        }
        else {
            if(!g.getStatus()) {
                System.out.println("Gerbong tidak terpasang pada Kereta manapun!");
            }
            else {
                Kereta k = app.getKeretaByGerbong(g);
                if(k.getStatus()) {
                    System.out.println("Gerbong tidak dapat dilepas karena Kereta yang menggunakannya sedang digunakan oleh Tiket!");
                }
                else {
                    k.removeGerbongByID(id);
                    g.setStatus(false);
                    System.out.println("Gerbong berhasil dilepas!");
                }
            }
        }
        scanString.nextLine();
        System.out.println("");
    }
    
    /*Menu Gerbong*/
    public void tambahGerbong() {
        try {
            String id; int tipe, kursi;
            String strTipe, strKursi;
            System.out.print("Tambah Gerbong\n" +
                             "Tipe Gerbong \n" +
                             "1. Eksekutif   2. Bisnis   3. Ekonomi\n" +
                             " = "); strTipe = scanString.nextLine();
            tipe = Integer.parseInt(strTipe);
            System.out.print("Jumlah Kursi : "); strKursi = scanString.nextLine();
            kursi = Integer.parseInt(strKursi);
            id = app.generateIDGerbong(tipe);
            app.addGerbong(new Gerbong(id,kursi, tipe));
            System.out.println("Gerbong dengan ID " + id + " berhasil ditambahkan!");
        }
        catch (NumberFormatException e) {
            System.out.println("ERROR : Mohon inputkan angka pada Jumalah Kursi dan Tipe Gerbong"); 
        }
        scanString.nextLine();
        System.out.println("");
    }
    public void hapusGerbong(){
        String id;
        Gerbong g;
        System.out.print("Hapus Gerbong \n\n" + 
                         "Masukkan ID Gerbong yang akan dihapus : "); id = scanString.nextLine();
        g = app.getGerbongByID(id);
        if(g == null) {
            System.out.println("ID Gerbong tidak ditemukan!");
        }
        else {
            if(g.getStatus()) {
                app.getDaftarGerbong().remove(g);
                System.out.println("Gerbong dengan ID " + id + "telah dihapus!");
            }
            else {
                System.out.println("Gerbong tidak dapat dihapus karena masih digunakan oleh Kereta!");
            }
            
        }
        scanString.nextLine();
        System.out.println("");
    }
    public void editGerbong(){
        String id; Gerbong g;
        System.out.print("Edit Gerbong\n\n" + 
                         "Masukkan ID Gerbong yang ingin di-Edit : "); id = scanString.nextLine();
        g = app.getGerbongByID(id);
        if(g == null) {
            System.out.println("\nID Gerbong tidak ditemukan!");
        }
        else {
            try {
                String strTipe, strKursi;
                int tipe, kursi;
                System.out.print("\nData Lama \n" +
                        "Tipe Gerbong : " + g.getGerbongType() + "\n" +
                        "Jumlah Kursi : " + g.getChairQty() + "\n" +
                        "Input Data Baru\n");
                System.out.print("Tipe Gerbong \n" +
                        "1. Eksekutif  2. Bisnis  3. Ekonomi\n" +
                        " = ");
                strTipe = scanString.nextLine();
                tipe = Integer.parseInt(strTipe);
                System.out.print("Jumlah Kursi : ");
                strKursi = scanString.nextLine();
                kursi = Integer.parseInt(strKursi);
                id = app.generateIDGerbong(tipe);
                g.setGerbongId(id);
                g.setGerbongType(tipe);
                g.setChairQty(kursi);
                System.out.println("Data Gerbong berhasil diedit!");
                System.out.println("(ID akan berubah secara automatis)");
            }
            catch(NumberFormatException e){
                System.out.println("ERROR : Mohon inputkan angka pada Jumlah Kursi dan Tipe Gerbong");
            }
        }
        scanString.nextLine();
        System.out.println("");
    }
    public void viewGerbong(){
        System.out.println("View Gerbong");
        if(app.getDaftarGerbong().isEmpty()){
            System.out.println("Empty!");
            scanString.nextLine();
        }
        else {
            viewDaftar(app.getDaftarGerbong());
        }
        System.out.println("");
    }
    
    /*Menu Rute*/
    public void tambahRute() {
        try {
            String id, idAwal, idTujuan, strDistance; double distance;
            Stasiun awal, tujuan;
            System.out.print("Buat Rute\n" + 
                             "ID Stasiun Keberangkatan : "); idAwal = scanString.nextLine();
            awal = app.getStasiunByID(idAwal);
            System.out.print("ID Stasiun Tujuan        : "); idTujuan = scanString.nextLine();
            tujuan = app.getStasiunByID(idTujuan);
            System.out.print("Jarak antara Stasiun     : "); strDistance = scanString.nextLine();
            distance = Double.parseDouble(strDistance);
            if(((awal != null) && (tujuan != null)) && (tujuan!=awal)) {
                id = app.generateIDRute(awal, tujuan);
                app.addRute(new Rute(id, awal,tujuan, distance));
                System.out.println("Rute dengan ID " + id + " berhasil ditambahkan!");
            }
            else {
                if((awal == null) && (tujuan == null)) {
                    System.out.println("ID Stasiun Keberangkatan dan Stasiun Tujuan tidak ditemukan!");
                }
                else if(awal == null) {
                    System.out.println("ID Stasiun Keberangkatan tidak ditemukan!");
                }
                else if(tujuan == null) {
                    System.out.println("ID Stasiun Tujuan tidak ditemukan!");
                }
                else if(tujuan == awal) {
                    System.out.print("Stasiun awal harus tidak sama dengan Stasiun Tujuan!");
                }
            }   
        }
        catch(NumberFormatException e){
            System.out.println("ERROR : Mohon inputkan angka pada Jarak");
        }
        scanString.nextLine();
        System.out.println("");
    }
    public void viewRute(){
        System.out.println("View Rute");
        if(app.getDaftarRute().isEmpty()){
            System.out.println("Empty!");
            scanString.nextLine();
        }
        else {
            viewDaftar(app.getDaftarRute());
        }
        System.out.println("");
    }
    
    /*Menu Stasiun*/
    public void tambahStasiun(){
        String nama, id, kota;
        System.out.print("Tambah Stasiun\n" +
                         "Nama Stasiun : "); nama = scanString.nextLine();
        System.out.print("Kota         : "); kota = scanString.nextLine();
        id = app.generateIDStasiun(kota);
        app.addStasiun(new Stasiun(nama, id , kota));
        System.out.println("Stasiun dengan ID " + id + " berhasil ditambahkan!");
        scanString.nextLine();
        System.out.println("");
    }
    public void viewStasiun(){
        System.out.println("View Stasiun");
        if(app.getDaftarStasiun().isEmpty()){
            System.out.println("Empty!");
            scanString.nextLine();
        }
        else {
            viewDaftar(app.getDaftarStasiun());
        }
        System.out.println("");
    }
    
    /*Menu Tiket*/
    public void tambahTiket(){
        String id,rute,kereta,jadwal, strHarga; double harga = 0; 
        Rute r = null ; Kereta k = null;
        System.out.print("Tambah Tiket\n" +
                         "ID Rute   : "); rute = scanString.nextLine();
        System.out.print("ID Kereta : "); kereta = scanString.nextLine();
        System.out.print("Harga     : "); 
        strHarga = scanString.nextLine();
        try {
            harga = Double.parseDouble(strHarga);
        }
        catch (NumberFormatException e){
            System.out.println("ERROR : Mohon inputkan angka pada Harga");
        }
        System.out.print("Jadwal    : "); jadwal = scanString.nextLine();
        r = app.getRuteByID(rute);
        k = app.getKeretaByID(kereta);
        if((r != null) && (k != null) && !k.getGerbongList().isEmpty()) {
            id = app.generateIDTiket(r);
            app.addTiket(new Tiket(id,harga,r,k,jadwal));
            k.setStatus(true);
            System.out.println("Tiket dengan ID " + id + " berhasil dibuat!");
        }
        else{
            if((r == null) && (k == null)) {
                System.out.println("ID Rute dan ID Kereta tidak ditemukan!");
            }
            else if(r == null) {
                System.out.println("ID Rute tidak ditemukan!");
            }
            else if(k == null) {
                System.out.println("ID Kereta tidak ditemukan!");
            }
            else {
                System.out.println("Kereta masih belum memiliki Gerbong!");
            }
        }
        scanString.nextLine();
        System.out.println("");
    }
    public void hapusTiket(){
        String id;
        Tiket t = null;
        System.out.print("Hapus Tiket\n" +
                         "Inputkan ID Tiket yang ingin dihapus : "); id = scanString.nextLine();
        t = app.getTiketByID(id);
        if(t == null){
            System.out.println("ID Tiket tidak ditemukan!");
        }
        else {
            app.getDaftarTiket().remove(t);
            t.resetStatusKereta();
            System.out.println("Tiket dengan ID " + id + " berhasil dihapus!");
        }
        scanString.nextLine();
        System.out.println("");
    }
    public void viewTiket(){
        System.out.println("View Tiket");
        if(app.getDaftarTiket().isEmpty()){
            System.out.println("Empty!");
            scanString.nextLine();
        }
        else {
            viewDaftar(app.getDaftarTiket());
        }
        System.out.println("");
    }
    public void searchTiket(){
        String kotaAwal, kotaTujuan;
        System.out.println("Search Tiket");
        System.out.print  ("Inputkan Kota Keberangkatan : "); kotaAwal = scanString.nextLine();
        System.out.print  ("Inputkan Kota Tujuan        : "); kotaTujuan = scanString.nextLine();
        Rute r = app.getRuteByKota(kotaAwal, kotaTujuan);
        if(r != null){
            Tiket t = app.getTiketByRute(r);
            if(t != null){
                System.out.println("");
                System.out.println("Tiket Tersedia dengan : ");
                System.out.println("Harga  : Rp. " + t.getPrice());
                System.out.println("Kereta : " + t.getKereta().getKeretaId());
                System.out.println("Jadwal : " + t.getSchedule());
            }
            else {
                System.out.println("Tiket tidak tersedia!");
            }
        }
        else {
            System.out.println("Tiket tidak tersedia!");
        }
        scanString.nextLine();
        System.out.println("");
    }
    
    public void viewDaftar(ArrayList array) {
        if(array.get(0) instanceof Gerbong) {
            ArrayList<Gerbong> arrayGerbong = (ArrayList<Gerbong>) array;
            System.out.println("[ID|Tipe|Jumlah Kursi|Status]\n");
            String tipe; String status;
            for(Gerbong g : arrayGerbong) {
                tipe = g.typeToString();
                status = g.statusToString();
                System.out.println(g.getGerbongId() + " | " + tipe + " | " + g.getChairQty() + " | " + status);
            }
        }
        else if(array.get(0) instanceof Kereta) {
            ArrayList<Kereta> arrayKereta = (ArrayList<Kereta>) array;
            System.out.println("[ID|Nama|Jumlah Gerbong|Kapasitas Gerbong]\n");
            for(Kereta k : arrayKereta) {
                System.out.println(k.getKeretaId() + " | " + k.getKeretaName() + " | " + k.getGerbongList().size() + " | " + k.getGerbongCap());
            }
        }
        else if(array.get(0) instanceof Rute) {
            ArrayList<Rute> arrayRute = (ArrayList<Rute>) array;
            System.out.println("[ID|Stasiun Awal|Stasiun Tujuan|Jarak]\n");
            for(Rute r : arrayRute){
                System.out.println(r.getRuteId() + " | " + r.getDeparture().getStasiunName() + " | " + r.getDestination().getStasiunName() + " | " + r.getDistance());
            }
        }
        else if(array.get(0) instanceof Stasiun) {
            ArrayList<Stasiun> arrayStasiun = (ArrayList<Stasiun>) array;
            System.out.println("[ID|Nama|Kota]\n");
            for(Stasiun s : arrayStasiun) {
                System.out.println(s.getStasiunId() + " | " + s.getStasiunName() + " | " + s.getCity());
            }
        }
        if(array.get(0) instanceof Tiket) {
            ArrayList<Tiket> arrayTiket = (ArrayList<Tiket>) array;
            System.out.println("[ID|Rute|Harga|Kereta|Jadwal]");
            for(Tiket t : arrayTiket) {
                System.out.println(t.getTiketId() + " | " + t.getRute().getDeparture().getCity() + "-" + t.getRute().getDestination().getCity() + " | " + t.getPrice() + " | " + t.getKereta().getKeretaId() + " | " + t.getSchedule());
            }
        }
        System.out.println("\nSelesai...");
        scanString.nextLine();
        System.out.println("");
    }
}