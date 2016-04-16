package Model;

import java.io.*;

public class Gerbong implements Serializable {
    
    private String gerbongId;
    private int chairQty;
    private int gerbongType;
    private boolean status;
        
    public Gerbong(int quantity, String id, int type){
        chairQty = quantity;
        gerbongId = id;
        gerbongType = type;
        status = false;
    }
    public Gerbong() {}
        
    public void setStatus(boolean status){
	this.status = status;
    }
    public void setChairQty(int jumlah) { 
	chairQty = jumlah; 
    }
    public void setGerbongId(String id) { 
	gerbongId = id; 
    }
    public void setGerbongType(int tipe) {
	gerbongType = tipe;
    }
    
    public int getGerbongType() { 
	return gerbongType; 
    }
    public boolean getStatus() { 
	return status; 
    }
    public int getChairQty() { 
        return chairQty; 
    }
    public String getGerbongId() { 
	return gerbongId; 
    }
    public String typeToString(){
        switch(gerbongType){
            case 1 : return "Ekonomi";
            case 2 : return "Business";
            case 3 : return "Eksekutif";
        }
        return "";
    }

    public String statusToString(){
        if(status) return "Digunakan";
        else return "Tidak Digunakan";
    }
    @Override
    public String toString(){
        return "ID Gerbong      : " + gerbongId + "\n" +
               "Jumlah Kursi    : " + chairQty  + "\n" +
               "Tipe Gerbong    : " + typeToString() + "\n" +
               "Status          : " + statusToString();
    }
}