public class Rute {
    
    private String idRute;
    private Stasiun awal;
    private Stasiun tujuan;
    private float distance;
    
    public Rute(String id, Stasiun awal, Stasiun tujuan, float distance)
    {
        idRute = id;
        this.awal = awal;
        this.tujuan = tujuan;
        this.distance = distance;
    }

    //Getter
    public String getIdRute() { return idRute; }
    public Stasiun getStasiunAwal() { return awal; }
    public Stasiun getStasiunTujuan() { return tujuan; }
    public float getDistance() { return distance; }
    
    //Setter
    public void setIdRute(String id) { idRute = id; }
    public void setStasiunAwal(Stasiun awal) { this.awal = awal; }
    public void setStasiunTujuan(Stasiun tujuan) { this.tujuan = tujuan; }
    public void setDistance(float distance) { this.distance = distance; }
}
