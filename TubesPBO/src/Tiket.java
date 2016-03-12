public class Tiket 
{
	private String idTiket;
        private double harga;
        private Rute rutePerjalanan;
        private Kereta keretaUse;
	private String jadwal;
	
	public Tiket(String id, double harga, Rute rute, Kereta kereta, String jadwal)
	{
		idTiket = id;
		this.harga = harga;
		rutePerjalanan = rute;
		keretaUse = kereta;
		this.jadwal = jadwal;
	}
	public Tiket(String id, Rute rute, Kereta kereta, String jam)
	{
		idTiket = id;
		harga = rute.getDistance()*10000;
		rutePerjalanan = rute;
		keretaUse = kereta;
		jadwal = jam;
	}
	
	//Getter
	public String getIdTiket() 
        { return idTiket; }
	public double getHarga()
        { return harga; }
	public Rute getRute()
        { return rutePerjalanan; }
	public Kereta getKereta() 
        { return keretaUse; }
	public String getJadwal() 
        { return jadwal; }
	//Setter
	public void setIdTiket(String id) 
        { idTiket = id; }
	public void setHarga(double harga)
        { this.harga = harga; }
	public void setRutePerjalanan(Rute rute) 
        { rutePerjalanan = rute; }
	public void setKeretaUse(Kereta kereta) 
        { keretaUse = kereta; }
	public void setJadwal(String jadwal) 
        { this.jadwal = jadwal; }
}
