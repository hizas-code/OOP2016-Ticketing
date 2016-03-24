import java.util.ArrayList;

public class Application {
    
    ArrayList<Gerbong> daftarGerbong = new ArrayList<>();
    ArrayList<Kereta> daftarKereta = new ArrayList<>();
    ArrayList<Rute> daftarRute = new ArrayList<>();
    ArrayList<Stasiun> daftarStasiun = new ArrayList<>();
    ArrayList<Tiket> daftarTiket = new ArrayList<>();
    
    public Gerbong getGerbong(String id)
    {
        for(Gerbong x : daftarGerbong)
        {
            if(x.getIdGerbong().equals(id))
                return x;
        }
        return null;
    }
    public Kereta getKereta(String id)
    {
        for(Kereta x : daftarKereta)
        {
            if(x.getIdKereta().equals(id))
                return x;
        }
        return null;
    }
    public Rute getRute(String id)
    {
        for(Rute x : daftarRute)
        {
            if(x.getIdRute().equals(id))
                return x;
        }
        return null;
    }
    public Stasiun getStasiun(String id)
    {
        for(Stasiun x : daftarStasiun)
        {
            if(x.getIdStasiun().equals(id))
                return x;
        }
        return null;
    }
    public Tiket getTiket(String id)
    {
        for(Tiket x : daftarTiket)
        {
            if(x.getIdTiket().equals(id))
                return x;
        }
        return null;
    }
    
    public void addGerbong(Gerbong gerbong) { daftarGerbong.add(gerbong ); }
    public void addKereta(Kereta kereta) { daftarKereta.add(kereta); }
    public void addRute(Rute rute) { daftarRute.add(rute); }
    public void addStasiun(Stasiun stasiun) { daftarStasiun.add(stasiun); }
    public void addTiket(Tiket tiket) { daftarTiket.add(tiket); }
    
    public void removeGerbong(String id) 
    {
        for(Gerbong p : daftarGerbong)
        {
            if(p.getIdGerbong().equals(id))
            {
                daftarGerbong.remove(p);
                break;
            }
        }
    }
    public void removeKereta(String id) 
    {
        for(Kereta p : daftarKereta)
        {
            if(p.getIdKereta().equals(id))
            {
                daftarKereta.remove(p);
                break;
            }
        }
    }
    public void removeStasiun(String id) 
    {
        for(Stasiun p : daftarStasiun)
        {
            if(p.getIdStasiun().equals(id))
            {
                daftarStasiun.remove(p);
                break;
            }
        }
    }
    public void removeTiket(String id) 
    {
        for(Tiket p : daftarTiket)
        {
            if(p.getIdTiket().equals(id))
            {
                daftarTiket.remove(p);
                break;
            }
        }
    }
    public void removeRute(String id) 
    {
        for(Rute p : daftarRute)
        {
            if(p.getIdRute().equals(id))
            {
                daftarRute.remove(p);
                break;
            }
        }
    }
}
