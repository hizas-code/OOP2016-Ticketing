/*

Kelompok 5
1301140251
1301144111
1301142301

*/
public class MainClass {
    public static void main(String [] args)
    {
        Admin kel5;
        Gerbong g1 = new Gerbong(50,"G1",1);
        Gerbong g2 = new Gerbong(50,"G2",1);
        Gerbong g3 = new Gerbong(40,"G3",2);
        Gerbong g4 = new Gerbong(40,"G4",2);
        Gerbong g5 = new Gerbong(30,"G5",3);
        Kereta k1 = new Kereta("K1","Hamachi",10);
        k1.addGerbong(g1);
        k1.addGerbong(g2);
        k1.addGerbong(g4);
        Stasiun s1 = new Stasiun("S1","Stasiun Bandung","Bandung");
        Stasiun s2 = new Stasiun("S2","Stasiun Surabaya","Surabaya");
        Rute r1 = new Rute("R1",s1,s2,30);
        Tiket t1 = new Tiket("T1",r1,k1,"19.00");
    }
}
