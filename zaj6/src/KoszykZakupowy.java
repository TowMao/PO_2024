import java.util.ArrayList;

public class KoszykZakupowy {
    ArrayList<Produkt> koszyk;

    public KoszykZakupowy(){
        this.koszyk = new ArrayList<Produkt>();
    }

    public void dodajProdukt(String nazwa, double cena, int ilosc, KoszykZakupowy kosz){
        Produkt lok = new Produkt(nazwa, cena, ilosc);
        kosz.koszyk.add(lok);
    }

    public void dodajProdukt(String nazwa, double cena, int ilosc){
        Produkt lok = new Produkt(nazwa, cena, ilosc);
        this.koszyk.add(lok);
    }

    public void wyswietlZawartoscKoszyka(){
        System.out.println("Zawartosc:");
        System.out.println("----------------");
        for (Produkt p : this.koszyk) {
            System.out.println("Nazwa: " + p.nazwa);
            System.out.println("Cena: " + p.cena);
            System.out.println("Ilosc: " + p.iloscNaMagazynie);
            System.out.println("----------------");
        }
    }
    public double obliczWartoscKosza(){
        double suma = 0;
        for (Produkt p : this.koszyk){
            suma += p.cena * p.iloscNaMagazynie;
        }
        return suma;
    }
}
