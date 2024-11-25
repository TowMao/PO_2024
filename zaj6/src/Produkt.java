import javax.sound.midi.SysexMessage;

public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, double cena_p, int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena_p;
        this.iloscNaMagazynie = ilosc;
    }

    public void wyswietlInformacje(){
        System.out.println(this.nazwa);
        System.out.println(this.cena);
        System.out.println(this.iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ile){
        this.iloscNaMagazynie += ile;
    }

    public void usunZMagazynu(int ile){
        if(this.iloscNaMagazynie >= ile){
            this.iloscNaMagazynie -= ile;
            return;
        }
        System.out.println("podano zla wartosc");
    }
}
