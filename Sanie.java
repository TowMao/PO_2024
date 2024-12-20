import java.util.ArrayList;
import java.util.Objects;

public class Sanie {

    private ArrayList<Renifer> zaprzeg;

    public Sanie() {
        zaprzeg = new ArrayList<>();
    }

    public void dodajRenifera(Renifer renifer){
        if(renifer != null) {
            this.zaprzeg.add(renifer);
        }
    }

    public void sumaPredkosci(Sanie sanie){
        int suma = 0;

        for(Renifer renifer : sanie.zaprzeg){
            suma += renifer.predkosc;
        }
        System.out.println("Laczna predkosc wynosi: "+suma);
    }

    public Renifer najwolniejszyRenifer(){
        Renifer najwolniejszy = this.zaprzeg.get(0);
        for(Renifer renifer : this.zaprzeg){
            if(najwolniejszy.predkosc > renifer.predkosc){
                najwolniejszy = renifer;
            }
        }
        return najwolniejszy;
    }

    @Override
    public String toString() {
        return "Sanie{" +
                "zaprzeg=" + zaprzeg +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sanie sanie = (Sanie) o;
        return Objects.equals(zaprzeg, sanie.zaprzeg);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(zaprzeg);
    }

    public ArrayList<Renifer> getZaprzeg() {
        return zaprzeg;
    }

    public void setZaprzeg(ArrayList<Renifer> zaprzeg) {
        if(zaprzeg != null) {
            this.zaprzeg = zaprzeg;
        }
    }
}
