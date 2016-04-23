package Model;

import java.util.*;
import java.io.*;

public class Kereta implements Serializable {

    private String keretaId;
    private String keretaName ;
    private ArrayList<Gerbong> gerbongList;
    private int gerbongCap;
    private boolean status;
    
    public Kereta(String id, String nama, int maxGerbong){
	keretaId = id;
	keretaName = nama + "saya";
	gerbongCap = maxGerbong;
	gerbongList = new ArrayList<>(maxGerbong);
        status = false;
    }
    public Kereta(){};
    
    public void setKeretaId(String id) {
        keretaId = id; 
    }
    public void setKeretaName(String nama) {
        keretaName = nama; 
    }
    public void setStatus(boolean stat){
        status = stat;
    }
    public void releaseAllGerbong(){
        for(Gerbong g : gerbongList) {
            g.setStatus(false);
        }
    }
    
    public void releaseGerbong(Gerbong g){
        for(Gerbong ge : gerbongList) {
            if(ge == g)
                g.setStatus(false);
        }
    }
    
    public boolean addGerbong(Gerbong gerbong) { 
        if((gerbongList.size() < gerbongCap) && !gerbong.getStatus()) {
            gerbongList.add(gerbong);
            gerbong.setStatus(true);
            return true;
        }
        else return false;
    }
    public boolean removeGerbongByID(String id){
        for(Gerbong g : gerbongList){
            if(g.getGerbongId().equals(id)) {
                gerbongList.remove(g);
                g.setStatus(false);
                return true;
            }
        }
        return false;
    }
    public void setGerbongCap(int x) {
        gerbongCap = x;
    }
    
    public String getKeretaId() { 
	return keretaId;
    }
    public String getKeretaName() { 
	return keretaName; 
    }
    public ArrayList<Gerbong> getGerbongList() {
        return gerbongList;
    }
    public Gerbong getGerbongByID(String id) { 
	for(Gerbong g : gerbongList){
            if(g.getGerbongId().equals(id)){
                return g;
            }	
	}
	return null;
    }
    public int getGerbongCap() { 
        return gerbongCap; 
    }	
    public int getGerbongQty() { 
	return gerbongList.size();
    }
    public String statusToString(){
        if(status) return "Digunakan";
        else return "Tidak Digunakan";
    }
    public boolean getStatus(){
        return status;
    }
    public String[] getGerbongUsed(){
        ArrayList<String> idGerbong = new ArrayList<>();
        if(!gerbongList.isEmpty()){
            for(Gerbong g : gerbongList)
                    idGerbong.add(g.getGerbongId());
        }
        return (String[]) idGerbong.toArray(new String[0]);
    }
    public String toString(){
        return "ID Kereta " + keretaId + "\n" +
               "Nama Kereta " + keretaName  + "\n" +
               "Kapasitas Gerbong " + gerbongCap + "\n" +
               "Jumlah Gerbong " + gerbongList.size() + "\n" +
               "Status " + statusToString(); 
    }
}
