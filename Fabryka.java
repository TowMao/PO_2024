import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class Fabryka {
    private ArrayList<Elf> listaElfow;
    private double dlGeo;
    private double szGeo;

    public Fabryka(double dlugosc, double szerokosc) {
        listaElfow = new ArrayList<>();
        dlGeo = dlugosc;
        szGeo = szerokosc;
    }

    public Fabryka() {
        listaElfow = new ArrayList<>();
        dlGeo = 0;
        szGeo = 0;
    }


    public void dodajPracownika(Elf elf){
        if(elf != null){
            listaElfow.add(elf);
        }
    }

    public void usunPracownika(Elf elf){
        for(Elf p : this.listaElfow){
            if(p.equals(elf)){
                this.listaElfow.remove(p);
                return;
            }
        }
        System.out.println("Nie ma takiego pracownika");
    }

    public Elf najstarszyPracownik(){
        Elf najstarszy_elf = this.listaElfow.get(0);
        for(Elf p : this.listaElfow){
            if(p.wiek > najstarszy_elf.wiek){
                najstarszy_elf = p;
            }
        }
        return najstarszy_elf;
    }

    @Override
    public String toString() {
        return "Fabryka{" +
                "listaElfow=" + listaElfow +
                ", dlGeo=" + dlGeo +
                ", szGeo=" + szGeo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fabryka fabryka = (Fabryka) o;
        return Double.compare(dlGeo, fabryka.dlGeo) == 0 && Double.compare(szGeo, fabryka.szGeo) == 0 && Objects.equals(listaElfow, fabryka.listaElfow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaElfow, dlGeo, szGeo);
    }

    public ArrayList<Elf> getListaElfow() {
        return listaElfow;
    }

    public void setListaElfow(ArrayList<Elf> listaElfow) {
        if(listaElfow != null) {
            this.listaElfow = listaElfow;
        }
    }

    public double getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(double dlGeo) {
        if(dlGeo >= -180 && dlGeo <= 180) {
            this.dlGeo = dlGeo;
        }
    }

    public double getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(double szGeo) {
        if(szGeo >= -90 && szGeo <= 90) {
            this.szGeo = szGeo;
        }

    }
}
