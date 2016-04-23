package Model;

import java.io.*;

public class Rute implements Serializable {
    
    private String ruteId;
    private Stasiun departure;
    private Stasiun destination;
    private double distance;
    
    public Rute(String id, Stasiun awal, Stasiun tujuan, double distance){
        ruteId = id;
        this.departure = awal;
        this.destination = tujuan;
        this.distance = distance;
    }
    public Rute(){};

    public void setRuteId(String id) { 
        ruteId = id; 
    }
    public void setDeparture(Stasiun awal) { 
        this.departure = awal; 
    }
    public void setDestination(Stasiun tujuan) { 
        this.destination = tujuan; 
    }
    public void setDistance(float distance) { 
        this.distance = distance; 
    }
    
    public String getRuteId() { 
        return ruteId; 
    }
    public Stasiun getDeparture() { 
        return departure; 
    }
    public Stasiun getDestination() { 
        return destination; 
    }
    public double getDistance() { 
        return distance; 
    }
    public String toString(){
        return "ID Rute " + ruteId + "\n" +
               "Keberangkatan " + departure.getCity() + "\n" +
               "Tujuan " + destination.getCity() + "\n" +
               "Jarak " + distance + " KM";
    }
}
