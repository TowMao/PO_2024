import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new ArrayList<Zamowienie>();
    }

    public void dodajZamowienie(Zamowienie zamowione) {
        this.listaZamowien.add(zamowione);
    }

    public void wyswietlHistorieZamowien(){
        System.out.println("historia zamowien " + this.imie + " " +this.nazwisko + ":");
        for(Zamowienie z : this.listaZamowien){
            z.wyswietlZamowienie();
        }
    }

    public void obliczLacznyKosztZamowien(){
        double suma = 0;
        for(Zamowienie z : this.listaZamowien){
            suma += z.koszykZakupowy.obliczWartoscKosza();
        }
        System.out.println("laczny koszt wszystkich zamowien: " + suma);
    }

    public void dodajZamowienie(KoszykZakupowy koszyk){
        Zamowienie zam = new Zamowienie("w trakcie realizacji", koszyk);
        this.listaZamowien.add(zam);
    }
}
