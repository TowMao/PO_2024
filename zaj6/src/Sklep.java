import java.util.ArrayList;

public class Sklep {
    ArrayList<Produkt> produkt;

    public Sklep() {
        this.produkt = new ArrayList<Produkt>();
    }

    public void dodajProdukt(Produkt p) {
        this.produkt.add(p);
    }

    public void wyswietlOferty(){
        System.out.println("Oferty:");
        for(Produkt p : produkt){
            System.out.println("-------");
            p.wyswietlInformacje();
        }
    }

    public Produkt wyszukajProdukt(String p){
        for(Produkt p1 : produkt) {
            if (p1.nazwa == p) {
                return p1;
            }
        }
        return null;
    }

    public void zakupy(Klient k, String p, int ilosc){
        Produkt p1 = wyszukajProdukt(p);
        if(k != null && p1 != null && p1.iloscNaMagazynie > ilosc){
            p1.usunZMagazynu(ilosc);
            KoszykZakupowy koszyk = new KoszykZakupowy();
            koszyk.dodajProdukt(p1.nazwa, p1.cena, ilosc, koszyk);
            k.dodajZamowienie(koszyk);
        }
        else
        {
            System.out.println("Nie udalo sie zrobic zakupu");
        }
    }
}
