import java.io.*;
public class Rute implements Serializable{
    
    private String idRute;
    private Stasiun awal;
    private Stasiun tujuan;
    private double distance;
    
    public Rute(String id, Stasiun awal, Stasiun tujuan, double distance){
        idRute = id;
        this.awal = awal;
        this.tujuan = tujuan;
        this.distance = distance;
    }
    public Rute(){};

    public void setIdRute(String id) { 
        idRute = id; 
    }
    public void setStasiunAwal(Stasiun awal) { 
        this.awal = awal; 
    }
    public void setStasiunTujuan(Stasiun tujuan) { 
        this.tujuan = tujuan; 
    }
    public void setDistance(float distance) { 
        this.distance = distance; 
    }
    
    public String getIdRute() { 
        return idRute; 
    }
    public Stasiun getStasiunAwal() { 
        return awal; 
    }
    public Stasiun getStasiunTujuan() { 
        return tujuan; 
    }
    public double getDistance() { 
        return distance; 
    }
   
}
