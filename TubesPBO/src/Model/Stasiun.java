package Model;

import java.io.*;

public class Stasiun implements Serializable {
    private String stasiunId;
    private String stasiunName;
    private String city;
    
    public Stasiun(String nama, String id, String kota){
        stasiunId = id;
        stasiunName = nama;
        this.city = kota;
    }
    public Stasiun(){};
    
    public void setStasiunId(String id) { 
        stasiunId = id; 
    }
    public void setStasiunName(String nama) { 
        stasiunName = nama; 
    }
    public void setCity(String city) { 
        this.city = city; 
    }
    
    public String getStasiunId(){
        return stasiunId; 
    }
    public String getStasiunName() {
        return stasiunName;
    }
    public String getCity() { 
        return city; 
    }
    public String toString(){
        return "ID Stasiun " + stasiunId + "\n" +
               "Nama Stasiun " + stasiunName + "\n" +
               "Kota " + city;
    }
}
