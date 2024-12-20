import java.util.Objects;

public class Elf {
    protected String imie;
    protected int wiek;
    protected String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public void przedstawSie(){
        System.out.println("Czesc, nazywam sie " + this.imie +" mam " + this.wiek + " lat, a moje stanowisko pracy to " + this.stanowisko +".");
    }

    @Override
    public String toString() {
        return "Elf{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elf elf = (Elf) o;
        return wiek == elf.wiek && Objects.equals(imie, elf.imie) && Objects.equals(stanowisko, elf.stanowisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek, stanowisko);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie != null) {
            this.imie = imie;
        }
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek > 0) {
            this.wiek = wiek;
        }
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        if(stanowisko != null) {
            this.stanowisko = stanowisko;
        }
    }
}
