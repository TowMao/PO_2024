//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fabryka fabryka = new Fabryka();
        Elf elf1 = new Elf("Bartek", 14, "monter zabawek");
        Elf elf2 = new Elf("Maciek", 15, "Tragarz");
        fabryka.dodajPracownika(elf1);
        fabryka.dodajPracownika(elf2);
        elf1.przedstawSie();

        Sanie sanie = new Sanie();
        Renifer renifer1 = new Renifer("Nie pamietam imion reniferow", 15);
        Renifer renifer2 = new Renifer("Jak wyzej :(", 22);
        sanie.dodajRenifera(renifer1);
        sanie.dodajRenifera(renifer2);

        Renifer renifer3 = sanie.najwolniejszyRenifer();
        
        sanie.sumaPredkosci(sanie);
    }
}