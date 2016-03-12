public class Rute {
    private Stasiun awal;
    private Stasiun tujuan;
    private float distance;
    
    public Rute(Stasiun awal, Stasiun tujuan, float distance)
    {
        this.awal = awal;
        this.tujuan = tujuan;
        this.distance = distance;
    }

    //Getter
    public Stasiun getStasiunAwal() { return awal; }
    public Stasiun getStasiunTujuan() { return tujuan; }
    public float getDistance() { return distance; }
    
    //Setter
    public void setStasiunAwal(Stasiun awal) { this.awal = awal; }
    public void setStasiunTujuan(Stasiun tujuan) { this.tujuan = tujuan; }
    public void setDistance(float distance) { this.distance = distance; }
}
