public class Platnosc {
    double kwota;
    String statusPlatnosci;

    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "w trakcie realizacji";
    }

    public void zaplac(){
        this.statusPlatnosci = "oplacone";
    }


}
