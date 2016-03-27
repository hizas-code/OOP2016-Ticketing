import java.io.Serializable;

public class Tiket implements Serializable
{
    private String idTiket;
    private double harga;
    private Rute rutePerjalanan;
    private Kereta usedKereta;
    private String jadwal;
	
    public Tiket(String id, double harga, Rute rute, Kereta kereta, String jadwal) {
	idTiket = id;
	this.harga = harga;
	rutePerjalanan = rute;
	usedKereta = kereta;
	this.jadwal = jadwal;
    }
    public Tiket(String id, Rute rute, Kereta kereta, String jadwal){
	idTiket = id;
	harga = rute.getDistance()*10000;
	rutePerjalanan = rute;
	usedKereta = kereta;
	this.jadwal = jadwal;
    }
    public Tiket() {}
	
    public void setIdTiket(String id) { 
        idTiket = id; 
    }
    public void setHarga(double harga){ 
        this.harga = harga; 
    }
    public void setRutePerjalanan(Rute rute){ 
        rutePerjalanan = rute; 
    }
    public void setKeretaUse(Kereta kereta) { 
        usedKereta = kereta; 
    }
    public void setJadwal(String jadwal) { 
        this.jadwal = jadwal; 
    }
    public void resetStatusKereta(){
        usedKereta.setStatus(false);
        usedKereta.resetStatusGerbong();
    }
        
    public String getIdTiket() {
        return idTiket; 
    }
    public double getHarga(){
        return harga; 
    }
    public Rute getRute(){
        return rutePerjalanan; 
    }
    public Kereta getKereta() {
        return usedKereta; 
    }
    public String getJadwal() {
        return jadwal; 
    }
}
