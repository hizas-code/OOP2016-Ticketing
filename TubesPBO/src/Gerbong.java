public class Gerbong {
    //atribut
	private String idGerbong;
	private int jumlahKursi;
	private int tipeGerbong;
	private boolean statusGerbong;//status sedang digunakan atau tidak

	//constructor
	public Gerbong(int quantity, String id, int type){
            jumlahKursi = quantity;
            idGerbong = id;
            tipeGerbong = type;
            statusGerbong = false;
        }
        public Gerbong() {}
        
	//Setter
	public void setStatusGerbong(boolean status){
		statusGerbong = status;
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
    
	//Getter
	public int getTipeGerbong() { 
		return tipeGerbong; 
	}
 
	public boolean getStatusGerbong() { 
		return statusGerbong; 
	}
 
        public int getJumlahKursi() { 
		return jumlahKursi; 
	}
 
        public String getIdGerbong() { 
		return idGerbong; 
	}
}