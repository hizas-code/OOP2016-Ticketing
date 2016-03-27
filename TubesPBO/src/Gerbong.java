import java.io.Serializable;

public class Gerbong implements Serializable{
    
    private String idGerbong;
    private int jumlahKursi;
    private int tipeGerbong;
    private boolean status;
        
    public Gerbong(int quantity, String id, int type){
        jumlahKursi = quantity;
        idGerbong = id;
        tipeGerbong = type;
        status = false;
    }
    public Gerbong() {}
        
    public void setStatus(boolean status){
	this.status = status;
    }
    public void setJumlahKursi(int jumlah) { 
	jumlahKursi = jumlah; 
    }
    public void setIdGerbong(String id) { 
	idGerbong = id; 
    }
    public void setTipeGerbong(int tipe) {
	tipeGerbong = tipe;
    }
    
    public int getTipeGerbong() { 
	return tipeGerbong; 
    }
    public boolean getStatus() { 
	return status; 
    }
    public int getJumlahKursi() { 
        return jumlahKursi; 
    }
    public String getIdGerbong() { 
	return idGerbong; 
    }
    public String tipeToString(){
        switch(tipeGerbong){
            case 1 : return "Eksekutif";
            case 2 : return "Bisnis";
            case 3 : return "Ekonomi";
        }
        return "";
    }
    public String statusToString(){
        if(status) return "Sedang Digunakan";
        else return "Tidak Digunakan";
    }
}