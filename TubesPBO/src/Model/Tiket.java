package Model;

import java.io.Serializable;

public class Tiket implements Serializable {
    private String tiketId;
    private double price;
    private Rute route;
    private Kereta keretaUsed;
    private String schedule;
	
    public Tiket(String id, double harga, Rute rute, Kereta kereta, String jadwal) {
	tiketId = id;
	this.price = harga;
	route = rute;
	keretaUsed = kereta;
	this.schedule = jadwal;
    }
    public Tiket() {}
	
    public void setTiketId(String id) { 
        tiketId = id; 
    }
    public void setPrice(double price){ 
        this.price = price; 
    }
    public void setRoute(Rute rute){ 
        route = rute; 
    }
    public void setKeretaUsed(Kereta kereta) { 
        keretaUsed = kereta; 
    }
    public void setSchedule(String schedule) { 
        this.schedule = schedule; 
    }
    public void resetStatusKereta(){
        keretaUsed.setStatus(false);
        keretaUsed.releaseAllGerbong();
    }
        
    public String getTiketId() {
        return tiketId; 
    }
    public double getPrice(){
        return price; 
    }
    public Rute getRute(){
        return route; 
    }
    public Kereta getKereta() {
        return keretaUsed; 
    }
    public String getSchedule() {
        return schedule; 
    }
    public String toString(){
        return "ID Tiket " + tiketId + "\n" +
               "Harga Rp. " + price + "\n" +
               "Jadwal " + schedule + "\n" +
               "Dari " + route.getDeparture().getCity() + "\n" +
               "Ke " + route.getDestination().getCity() + "\n" +
               "Kereta " + keretaUsed.getKeretaName();
    }
}
