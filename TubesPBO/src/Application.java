import java.io.*;
import java.util.ArrayList;

public class Application implements Serializable{
    
    ArrayList<Gerbong> daftarGerbong = new ArrayList<>();
    ArrayList<Kereta> daftarKereta = new ArrayList<>();
    ArrayList<Rute> daftarRute = new ArrayList<>();
    ArrayList<Stasiun> daftarStasiun = new ArrayList<>();
    ArrayList<Tiket> daftarTiket = new ArrayList<>();
    
    public Application() {
        daftarGerbong = new ArrayList<>();
        daftarKereta = new ArrayList<>();
        daftarRute = new ArrayList<>();
        daftarStasiun = new ArrayList<>();
        daftarTiket = new ArrayList<>();
    }
    public void saveData(Application app){
        try {
            FileOutputStream save = new FileOutputStream("data.txt");
            ObjectOutputStream o = new ObjectOutputStream(save);
            o.writeObject(app);
            o.flush();
        }
        catch (IOException e) {
            System.out.println("ERROR!" + e);
        }
    }
    public Application loadData(){
        Application app = null;
        try {    
            FileInputStream load = new FileInputStream("data.txt");
            ObjectInputStream o = new ObjectInputStream(load);
            while((app = (Application) o.readObject())!=null) {}
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("L");
        }
        finally { return app; }
    }
    
    
    public Gerbong getGerbongByID(String id) {
        for(Gerbong x : daftarGerbong)
        {
            if(x.getIdGerbong().equals(id))
                return x;
        }
        return null;
    }
    public Kereta getKeretaByID(String id){
        for(Kereta x : daftarKereta)
        {
            if(x.getIdKereta().equals(id))
                return x;
        }
        return null;
    }
    public Rute getRuteByID(String id){
        for(Rute x : daftarRute)
        {
            if(x.getIdRute().equals(id))
                return x;
        }
        return null;
    }
    public Stasiun getStasiunByID(String id){
        for(Stasiun x : daftarStasiun)
        {
            if(x.getIdStasiun().equals(id))
                return x;
        }
        return null;
    }
    public Tiket getTiketByID(String id) {
        for(Tiket x : daftarTiket)
        {
            if(x.getIdTiket().equals(id))
                return x;
        }
        return null;
    }
    public Kereta getKeretaByGerbong(Gerbong g){
        for(Kereta k : daftarKereta) {
            for(Gerbong gr : k.getDaftarGerbong()) {
                if(gr == g) {
                    return k;
                }
            }
        }
        return null;
    }
    public Rute getRuteByKota(String awal, String tujuan){
        for(Rute r : daftarRute){
            if(r.getStasiunAwal().getKota().equals(awal) && r.getStasiunTujuan().getKota().equals(tujuan)) {
                return r;
            }
        }
        return null;
    }
    public Tiket getTiketByRute(Rute r){
        for(Tiket t : daftarTiket){
            if(t.getRute() == r ) return t;
        }
        return null;
    }
    
    public void addGerbong(Gerbong gerbong) { daftarGerbong.add(gerbong); }
    public void addKereta(Kereta kereta) { daftarKereta.add(kereta); }
    public void addRute(Rute rute) { daftarRute.add(rute); }
    public void addStasiun(Stasiun stasiun) { daftarStasiun.add(stasiun); }
    public void addTiket(Tiket tiket) { daftarTiket.add(tiket); }
    
    
    public ArrayList<Kereta> getDaftarKereta() { return daftarKereta; }
    public ArrayList<Gerbong> getDaftarGerbong() { return daftarGerbong; }
    public ArrayList<Rute> getDaftarRute() { return daftarRute; }
    public ArrayList<Stasiun> getDaftarStasiun() { return daftarStasiun; }
    public ArrayList<Tiket> getDaftarTiket() { return daftarTiket; }
    
    public String generateIDKereta(){
        int x = 1;
        String id = "KRT";
        if(getDaftarKereta().isEmpty()) return "KRT0001";
        for(Kereta k : daftarKereta) {
            if (Integer.parseInt(k.getIdKereta().substring(3)) == x)
                x++;
            else break;  
        }
        if(x < 10) return id + "000" + Integer.toString(x);
        else if(x < 100) return id + "00" + Integer.toString(x);
        else if(x < 1000) return id + "0" + Integer.toString(x);
        else return id + Integer.toString(x);
    }
    public String generateIDGerbong(int tipe){
        int x = 1;
        String id = "GRB";
        switch(tipe) {
            case 1 : id += "EKS"; break;
            case 2 : id += "BUS"; break;
            case 3 : id += "ECO"; break;
        }
        if(daftarGerbong.isEmpty()) return id + "0001";
        for(Gerbong g : daftarGerbong) {
            if (Integer.parseInt(g.getIdGerbong().substring(6)) == x)
                x++;
            else break;
        }
        if(x < 10) return id + "000" + Integer.toString(x);
        else if(x < 100) return id + "00" + Integer.toString(x);
        else if(x < 1000) return id + "0" + Integer.toString(x);
        else return id + Integer.toString(x);
    } 
    public String generateIDRute(Stasiun awal, Stasiun tujuan) {
        int x = 1;
        String id = "RTE";
        String kotaAwal = awal.getKota().substring(0,3);
        String kotaTujuan = tujuan.getKota().substring(0,3);
        id += kotaAwal + kotaTujuan;
        for(Rute r : daftarRute) {
            if (Integer.parseInt(r.getIdRute().substring(9)) == x)
                x++;
            else break;
        }
        if(x < 10) return id + "000" + Integer.toString(x);
        else if(x < 100) return id + "00" + Integer.toString(x);
        else if(x < 1000) return id + "0" + Integer.toString(x);
        else return id + Integer.toString(x);
    }
    public String generateIDStasiun(String kota) {
        int x = 1;
        String id = "STS" + kota.substring(0,3);
        for(Stasiun s : daftarStasiun) {
            if (Integer.parseInt(s.getIdStasiun().substring(6)) == x)
                x++;
            else break;
        }
        if(x < 10) return id + "000" + Integer.toString(x);
        else if(x < 100) return id + "00" + Integer.toString(x);
        else if(x < 1000) return id + "0" + Integer.toString(x);
        else return id + Integer.toString(x);
    }
    public String generateIDTiket(Rute r) {
        int x = 1;
        String id = "TKT" + r.getIdRute().substring(3,9);
        for(Tiket t : daftarTiket) {
            if (Integer.parseInt(t.getIdTiket().substring(9)) == x)
                x++;
            else break;
        }
        if(x < 10) return id + "000" + Integer.toString(x);
        else if(x < 100) return id + "00" + Integer.toString(x);
        else if(x < 1000) return id + "0" + Integer.toString(x);
        else return id + Integer.toString(x);
    }
    
}