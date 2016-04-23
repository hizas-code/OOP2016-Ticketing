package Model;  

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

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
    
    public void saveData(Application a){
        try {
            FileOutputStream save = new FileOutputStream("data.dat");
            ObjectOutputStream o = new ObjectOutputStream(save);
            o.writeObject(a);
            o.flush();
            o.close();
            save.close();     
        }
        catch (IOException e) {
            System.out.println("ERROR!" + e);
        }
    }
    public Application loadData(){
        try {  
            Application app;
            FileInputStream load = new FileInputStream("data.dat");
            ObjectInputStream o = new ObjectInputStream(load);
            app = (Application) o.readObject();
            return app;
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println(e);
        }
        return null;
    }
    
    
    public Gerbong getGerbongByID(String id) {
        for(Gerbong x : daftarGerbong)
        {
            if(x.getGerbongId().equals(id))
                return x;
        }
        return null;
    }
    public Kereta getKeretaByID(String id){
        for(Kereta x : daftarKereta)
        {
            if(x.getKeretaId().equals(id))
                return x;
        }
        return null;
    }
    public Rute getRuteByID(String id){
        for(Rute x : daftarRute)
        {
            if(x.getRuteId().equals(id))
                return x;
        }
        return null;
    }
    public Stasiun getStasiunByID(String id){
        for(Stasiun x : daftarStasiun)
        {
            if(x.getStasiunId().equals(id))
                return x;
        }
        return null;
    }
    public Tiket getTiketByID(String id) {
        for(Tiket x : daftarTiket)
        {
            if(x.getTiketId().equals(id))
                return x;
        }
        return null;
    }
    public Kereta getKeretaByGerbong(Gerbong g){
        for(Kereta k : daftarKereta) {
            for(Gerbong gr : k.getGerbongList()) {
                if(gr == g) {
                    return k;
                }
            }
        }
        return null;
    }
    public Rute getRuteByKota(String awal, String tujuan){
        for(Rute r : daftarRute){
            if(r.getDeparture().getCity().equals(awal) && r.getDestination().getCity().equals(tujuan)) {
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
    public HashSet<String> getListKota(){
        HashSet<String> listKota = new HashSet<>(100);
        if(!daftarStasiun.isEmpty()){
            for(Stasiun s : daftarStasiun)
                listKota.add(s.getCity());
        }
        return listKota;
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
            if (Integer.parseInt(k.getKeretaId().substring(3)) == x)
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
            case 1 : id += "ECO"; break;
            case 2 : id += "BUS"; break;
            case 3 : id += "EKS"; break;
        }
        if(daftarGerbong.isEmpty()) return id + "0001";
        else {
            for(Gerbong g : daftarGerbong) {
            if (Integer.parseInt(g.getGerbongId().substring(6)) == x)
                x++;
            else break;
            }
        }
        if(x < 10) return id + "000" + Integer.toString(x);
        else if(x < 100) return id + "00" + Integer.toString(x);
        else if(x < 1000) return id + "0" + Integer.toString(x);
        else return id + Integer.toString(x);
    } 
    public String generateIDRute(Stasiun awal, Stasiun tujuan) {
        int x = 1;
        String id = "RTE";
        String kotaAwal = awal.getCity().substring(0,3).toUpperCase();
        String kotaTujuan = tujuan.getCity().substring(0,3).toUpperCase();
        id += kotaAwal + kotaTujuan;
        for(Rute r : daftarRute) {
            if (Integer.parseInt(r.getRuteId().substring(9)) == x)
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
        String id = "STS" + (kota.substring(0,3)).toUpperCase();
        for(Stasiun s : daftarStasiun) {
            if (Integer.parseInt(s.getStasiunId().substring(6)) == x)
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
        String id = "TKT" + r.getRuteId().substring(3,9).toUpperCase();
        for(Tiket t : daftarTiket) {
            if (Integer.parseInt(t.getTiketId().substring(9)) == x)
                x++;
            else break;
        }
        if(x < 10) return id + "000" + Integer.toString(x);
        else if(x < 100) return id + "00" + Integer.toString(x);
        else if(x < 1000) return id + "0" + Integer.toString(x);
        else return id + Integer.toString(x);
    }
    
    public String[] getGerbongList(){
        ArrayList<String> idGerbong = new ArrayList<>();
        if(!daftarGerbong.isEmpty()){
            for(Gerbong g : daftarGerbong)
                idGerbong.add(g.getGerbongId());
        }
        return (String[]) idGerbong.toArray(new String[0]);
    }
    public String[] getKeretaList(){
        ArrayList<String> idKereta = new ArrayList<>();
        if(!daftarKereta.isEmpty()){
            for(Kereta k  : daftarKereta)
                idKereta.add(k.getKeretaId());
        }
        return (String[]) idKereta.toArray(new String[0]);
    }
    public String[] getGerbongNotUsed(){
        ArrayList<String> idGerbong = new ArrayList<>();
        if(!daftarGerbong.isEmpty()){
            for(Gerbong g : daftarGerbong)
                if(!g.getStatus())
                    idGerbong.add(g.getGerbongId());
        }
        return (String[]) idGerbong.toArray(new String[0]);
    }
    public String[] getStasiunList(){
        ArrayList<String> idStasiun = new ArrayList<>();
        if(!daftarStasiun.isEmpty()){
            for(Stasiun s : daftarStasiun)
                idStasiun.add(s.getStasiunId());
        }
        return (String[]) idStasiun.toArray(new String[0]);
    }
    public String[] getRuteList(){
        ArrayList<String> idRute = new ArrayList<>();
        if(!daftarRute.isEmpty()){
            for(Rute r : daftarRute)
                idRute.add(r.getRuteId());
        }
        return (String[]) idRute.toArray(new String[0]);
    }
    public String[] getTiketList(){
        ArrayList<String> idTiket = new ArrayList<>();
        if(!daftarTiket.isEmpty()){
            for(Tiket t : daftarTiket)
                idTiket.add(t.getTiketId());
        }
        return (String[]) idTiket.toArray(new String[0]);
    }
    public String[] getKeretaNotUsedList(){
        ArrayList<String> idKereta = new ArrayList<>();
        if(!daftarKereta.isEmpty()){
            for(Kereta k  : daftarKereta){
                if(!k.getStatus())
                    idKereta.add(k.getKeretaId());
            }
        }
        return (String[]) idKereta.toArray(new String[0]);
    }
    public String[] getListTiketByKota(String awal, String tujuan){
        ArrayList<String> idTiket = new ArrayList<>();
        if(!daftarTiket.isEmpty()){
            for(Tiket t : daftarTiket){
                if(t.getRute().getDeparture().getCity().equals(awal) && t.getRute().getDestination().getCity().equals(tujuan))
                    idTiket.add(t.getTiketId());
            }
        }
        return (String[]) idTiket.toArray(new String[0]);
    }
}