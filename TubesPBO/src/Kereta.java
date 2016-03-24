public class Kereta {
    //Atribut
    private String idKereta;
    private String namaKereta;
    private Gerbong[] daftarGerbong;
    private int kapasitasGerbong;
    private int jumlahGerbong = 0;
    
    //Constructor
    public Kereta(String id, String nama, int maxGerbong){
	idKereta = id;
	namaKereta = nama;
	kapasitasGerbong = maxGerbong;
	daftarGerbong = new Gerbong[maxGerbong];
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
    public int getKapasitasGerbong() { 
        return kapasitasGerbong; 
    }	
    public int getJumlahGerbong() { 
	return jumlahGerbong;
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
        for(int i = 0; i < kapasitasGerbong; i++) {
            if(daftarGerbong[i] == null) {
                daftarGerbong[i] = gerbong;
                daftarGerbong[i].setStatusGerbong(true);
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
                daftarGerbong[i].setStatusGerbong(false);
		success = true;
		break;
            }
	}
	if(!success){ 
            System.out.println("ID not found!");
	} else jumlahGerbong--;
    }
}
