import java.util.*;
import java.io.*;

public class Kereta implements Serializable {

    private String idKereta;
    private String namaKereta;
    private ArrayList<Gerbong> daftarGerbong;
    private int kapasitasGerbong;
    private boolean status;
    
    public Kereta(String id, String nama, int maxGerbong){
	idKereta = id;
	namaKereta = nama;
	kapasitasGerbong = maxGerbong;
	daftarGerbong = new ArrayList<>(maxGerbong);
        status = false;
    }
    public Kereta(){};
    
    public void setIdKereta(String id) {
        idKereta = id; 
    }
    public void setNamaKereta(String nama) {
        namaKereta = nama; 
    }
    public void setStatus(boolean stat){
        status = stat;
    }
    public void resetStatusGerbong(){
        for(Gerbong g : daftarGerbong) {
            g.setStatus(false);
        }
    }
    public boolean addGerbong(Gerbong gerbong) { 
        if((daftarGerbong.size() < kapasitasGerbong) && !gerbong.getStatus()) {
            daftarGerbong.add(gerbong);
            gerbong.setStatus(true);
            return true;
        }
        else return false;
    }
    public boolean removeGerbongByID(String id){
        for(Gerbong g : daftarGerbong){
            if(g.getIdGerbong().equals(id)) {
                daftarGerbong.remove(g);
                g.setStatus(false);
                return true;
            }
        }
        return false;
    }
    public void setKapasitasGerbong(int x) {
        kapasitasGerbong = x;
    }
    
    public String getIdKereta() { 
	return idKereta;
    }
    public String getNamaKereta() { 
	return namaKereta; 
    }
    public ArrayList<Gerbong> getDaftarGerbong() {
        return daftarGerbong;
    }
    public Gerbong getGerbongByID(String id) { 
	for(Gerbong g : daftarGerbong){
            if(g.getIdGerbong().equals(id)){
                return g;
            }	
	}
	return null;
    }
    public int getKapasitasGerbong() { 
        return kapasitasGerbong; 
    }	
    public int getJumlahGerbong() { 
	return daftarGerbong.size();
    }
    public boolean getStatus(){
        return status;
    }
}
