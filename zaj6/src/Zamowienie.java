public class Zamowienie {

    String statusZamowienia;
    KoszykZakupowy koszykZakupowy;
    Platnosc platnosc;

    public Zamowienie(String status, KoszykZakupowy koszyk) {
        this.statusZamowienia = status;
        this.koszykZakupowy = koszyk;
        this.platnosc.kwota = koszyk.obliczWartoscKosza();
        this.platnosc.statusPlatnosci = "w trakcie realizacji";
    }

    public void ustawStatusZamowienia(String status) {
        this.statusZamowienia = status;
    }

    public void wyswietlZamowienie() {
        System.out.println("Status: " + this.statusZamowienia);
        System.out.println(" ");
        this.koszykZakupowy.wyswietlZawartoscKoszyka();
    }

    public void finalizujZamowienie(){
        if (this.platnosc.statusPlatnosci == "zrealizowano"){
            this.statusZamowienia = "gotowe do wysylki";
        }
    }

    public void zwrocProdukt(Produkt produkt) {
        if (this.koszykZakupowy.koszyk.contains(produkt)) {
            for (Produkt p : this.koszykZakupowy.koszyk) {
                if (p.equals(produkt)) {
                    this.koszykZakupowy.koszyk.remove(p);
                    break;
                }
            }
        }
        this.platnosc.kwota = this.koszykZakupowy.obliczWartoscKosza();

    }
}
