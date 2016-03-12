public class Kereta {
	//atribut
    private String idKereta;
    private String namaKereta;
    private Gerbong[] daftarGerbong;
    private Rute[] daftarRute;
    private int kapasitasGerbong;
    private int kapasitasRute;
    private int jumlahGerbong = 0;
    private int jumlahRute = 0;
    
	//constructor
    public Kereta(String id, String nama, int maxGerbong, int maxRute){
		idKereta = id;
		namaKereta = nama;
		kapasitasGerbong = maxGerbong;
		kapasitasRute = maxRute;
		daftarGerbong = new Gerbong[maxGerbong];
		daftarRute = new Rute[maxRute];
	}
    //Getter
	public String getIdKereta() { 
		return idKereta; 
	}
	
	public String getNamaKereta() { 
		return namaKereta; 
	}
	
	public Gerbong getGerbong(String id) { 
		for(int i = 0; i < kapasitasGerbong; i++){
			if(daftarGerbong[i].getIdGerbong().equals(id)){
				return daftarGerbong[i];
			}	
		}
		return null;
	}
	
	public Rute getRuteKereta(String id) { 
		for(int i = 0; i < kapasitasRute; i++){
			if(daftarRute[i].getIdRute().equals(id)){
				return daftarRute[i];
			}
		}
		return null; 
	}
	
	public int getKapasitasGerbong() { 
		return kapasitasGerbong; 
	}
	
	public int getKapasitasRute() { 
		return kapasitasRute; 
	}
	
	public int getJumlahGerbong() { 
		return jumlahGerbong;
	}
	
	public int getJumlahRute() { 
		return jumlahRute;
	}
	
	//Setter
	public void setIdKereta(String id) {
		idKereta = id; 
	}
	
	public void setNamaKereta(String nama) {
		namaKereta = nama; 
	}
	
	public void addGerbong(Gerbong gerbong) { 
		boolean success = false;
		for(int i = 0; i < kapasitasGerbong; i++)
		{
			if(daftarGerbong[i] == null)
			{
				daftarGerbong[i] = gerbong;
				success = true;
				break;
			}
		}
		if(!success){ 
			System.out.println("Failed addGerbong!");
		} else jumlahGerbong++;
	}
	
	public void removeGerbong(String id){
		boolean success = false;
		for(int i = 0; i < kapasitasGerbong; i++){
			if(daftarGerbong[i].getIdGerbong().equals(id)){
				daftarGerbong[i] = null;
				success = true;
				break;
			}
		}
		if(!success){ 
			System.out.println("ID not found!");
		} else jumlahGerbong--;
	}
	
	public void addRute(Rute rute) { 
		boolean success = false;
		for(int i = 0; i < kapasitasRute; i++){
			if(daftarRute[i] == null){
				daftarRute[i] = rute;
				success = true;
				break;
			}
		}
		if(!success){ 
			System.out.println("Failed addRute!");		} else jumlahRute++;
	}
	
	public void removeRute(String id){
		boolean success = false;
		for(int i = 0; i < kapasitasRute; i++){
			if(daftarRute[i].getIdRute().equals(id)){
				daftarRute[i] = null;
				success = true;
				break;
			}
		}
		if(!success){ 
			System.out.println("ID not found!"); 
		} else jumlahRute--;
	}
}
