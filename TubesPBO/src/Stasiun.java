import java.io.*;
public class Stasiun implements Serializable 
{
    private String idStasiun;
    private String namaStasiun;
    private String kota;
    
    public Stasiun(String nama, String id, String kota){
        idStasiun = id;
        namaStasiun = nama;
        this.kota = kota;
    }
    public Stasiun(){};
    
    public void setIdStasiun(String id) { 
        idStasiun = id; 
    }
    public void setNamaStasiun(String nama) { 
        namaStasiun = nama; 
    }
    public void setKota(String kota) { 
        this.kota = kota; 
    }
    
    public String getIdStasiun(){
        return idStasiun; 
    }
    public String getNamaStasiun() {
        return namaStasiun;
    }
    public String getKota() { 
        return kota; 
    }
}
