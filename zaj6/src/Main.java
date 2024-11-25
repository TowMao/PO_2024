
public class Main {
    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("makaron", 3.14, 10);
        Produkt produkt2 = new Produkt("Plyn do prania", 26, 16);
        Produkt produkt3 = new Produkt("Jablka", 13.4, 100);
        KoszykZakupowy koszyk = new KoszykZakupowy();
        koszyk.dodajProdukt("Jablka", 8.10, 19, koszyk);
        koszyk.dodajProdukt("Plyn do prania", 26, 10, koszyk);
        koszyk.dodajProdukt("makaron", 3.14, 5, koszyk);

        Zamowienie zam = new Zamowienie("w realizacji", koszyk);
        //zam.wyswietlZamowienie();
        zam.ustawStatusZamowienia("zrealizowano");
        //zam.wyswietlZamowienie();
        Klient jan_kowalski = new Klient("Jan", "Kowalski");
        //jan_kowalski.dodajZamowienie(zam);
        //jan_kowalski.wyswietlHistorieZamowien();
        //jan_kowalski.obliczLacznyKosztZamowien();
        Sklep magazyn = new Sklep();
        magazyn.dodajProdukt(produkt1);
        magazyn.dodajProdukt(produkt2);
        magazyn.dodajProdukt(produkt3);
        //magazyn.wyswietlOferty();
        //var produkt = magazyn.wyszukajProdukt("makaron");
    }
}