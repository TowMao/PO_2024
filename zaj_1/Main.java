import java.time.LocalDate;
import java.time.LocalTime;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zestaw 1
        String name = "Krzysztof";
        String surname = "Stopyra";
        System.out.println(name + " " + surname);

        int len = (name + " " + surname).length();
        System.out.println(len);

        String ala = "Ala ";
        String ma = "ma ";
        String kota = "kota";
        System.out.println(ala + ma + kota);

        System.out.println("                     *        ");
        System.out.println("                     * *      ");
        System.out.println("                     * * *    ");
        System.out.println("* * * * * * * * * * * * * *  ");
        System.out.println("* * * * * * * * * * * * * * * ");
        System.out.println("* * * * * * * * * * * * * *   ");
        System.out.println("                     * * *    ");
        System.out.println("                     * *      ");
        System.out.println("                     *        ");

        System.out.println("               *");
        System.out.println("              * *");
        System.out.println("             * * *");
        System.out.println("            * * * *");
        System.out.println("           * * * * *");
        System.out.println("          * * * * * *");
        System.out.println("           * * * * *");
        System.out.println("            * * * *");
        System.out.println("             * * *");
        System.out.println("              * *");
        System.out.println("               *");


        System.out.println("Ala ma kota".replace("a", "e"));
        System.out.println("Ala ma kota".toUpperCase());
        System.out.println("Ala ma kota".toLowerCase());

        char ch1 = 'A';
        int asc_val_1 = ch1;
        char ch2 = '!';
        int asc_val_2 = ch2;
        char ch3 = '@';
        int asc_val_3 = ch3;
        char ch4 = '>';
        int asc_val_4 = ch4;
        char ch5 = '~';
        int asc_val_5 = ch5;
        char ch6 ='\n';
        int asc_val_6 = ch6;
        char ch7 = '\b';
        int asc_val_7 = ch7;
        System.out.println(asc_val_1 + " " + asc_val_2 + " " + asc_val_3 + " " + asc_val_4 + " " + asc_val_5 + " " + asc_val_6 + " " + asc_val_7 + " " + asc_val_7);

        char ch8 = 'A';
        char ch9 = 'Z';
        char ch10 = 'a';
        char ch11 = 'z';
        int asc_val_8 = ch8;
        int asc_val_9 = ch9;
        int asc_val_10 = ch10;
        int asc_val_11 = ch11;
        char ch12 = '0';
        char ch13 = '9';
        int asc_val_12 = ch12;
        int asc_val_13 = ch13;
        System.out.println(asc_val_8 + " " + asc_val_9 + " " + asc_val_10 + " " + asc_val_11 + " " + asc_val_12 + " " + asc_val_13);

        String linia = "Grzesiek nie wiedzial dlaczego ... jest tak drapieznym ... mimo, ze jego ... na to nie wskazuje.";
        String regex = "\\.\\.\\.";
        System.out.println(linia.replaceFirst(regex, "Ala").replaceFirst(regex, "ma").replaceFirst(regex, "kota"));

        System.out.println("... mimo, że jego ... na to nie wskazuje.".replaceFirst(regex, "slowo1").replaceFirst(regex, "slowo2"));

        System.out.println("... to najlepsza książka napisana przez ...".replaceFirst(regex, "tytuł").replaceFirst( regex, "autora"));

        for (int i = 0; i < 5; i++) {
            System.out.print("wodrze");
        }
        System.out.println(" ");

        System.out.println("Dzisiaj jest: "+ LocalDate.now() +" Godzina: "+ LocalTime.now());

        int char1 = 54;
        int char2 = 103;
        int char3 = 241;
        int char4 = 67;
        int char5 = 9999;
        int numer_albumu = 174922;
        int dlugosc_imienia = (name + surname).length();
        char int_to_char_1 = (char) char1;
        char int_to_char_2 = (char) char2;
        char int_to_char_3 = (char) char3;
        char int_to_char_4 = (char) char4;
        char int_to_char_5 = (char) char5;
        char int_to_char_6 = (char) dlugosc_imienia;
        char int_to_char_7 = (char) numer_albumu;
        System.out.println(int_to_char_1 + " " + int_to_char_2 + int_to_char_3 + int_to_char_4 + int_to_char_5 + int_to_char_6 + int_to_char_7);
        //zestaw2
        System.out.println((23.0 + 76) + ", Typ: " + ((Object)(23.0 + 76)).getClass().getSimpleName());
        System.out.println((41*2.0+3) + ", Typ: " + ((Object)(41*2.0+3)).getClass().getSimpleName());
        System.out.println((5-33) + ", Typ: " + ((Object)(5-33)).getClass().getSimpleName());
        System.out.println((109%3) + ", Typ: " + ((Object)(109%3)).getClass().getSimpleName());
        System.out.println((50/2) + ", Typ: " + ((Object)(50/2)).getClass().getSimpleName());
        System.out.println((40|2) + ", Typ: " + ((Object)(40|2)).getClass().getSimpleName());
        System.out.println((3^5) + ", Typ: " + ((Object)(3^5)).getClass().getSimpleName());
        System.out.println((7&9) + ", Typ: " + ((Object)(7&9)).getClass().getSimpleName());

        double eq_1 = (Math.sqrt(7) - 1)/(2) + (Math.pow(3, 3))%2;
        int eq_1_to_int = (int) eq_1;
        double eq_2 = 2004/(24 + 8);
        int eq_2_to_int = (int) eq_2;
        double eq_3 = (3 + Math.sqrt(3))/((Math.sqrt(5)/2)/(3));
        int eq_3_to_int = (int) eq_3;
        double eq_4 = 6%5%4;
        int eq_4_to_int = (int) eq_4;
        double eq_5 = ("Stopyra".length()%"Krzysztof".length() + 1) / Math.pow(2, 4);
        int eq_5_to_int = (int) eq_5;
        System.out.println(eq_1_to_int + " " + eq_2_to_int + " " + eq_3_to_int + " " + eq_4_to_int + " " + eq_5_to_int);

        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Podaj 2 slowa: ");
        String user_input = scannerObj.nextLine();
        System.out.println(user_input);

        System.out.println("Podaj 1 liczbe: ");
        float var_1 = scannerObj.nextFloat();
        System.out.println("Podaj 2 liczbe: ");
        float var_2 = scannerObj.nextFloat();
        System.out.println("Suma" + (var_1+var_2) + "Iloczyn" + (var_2 * var_1) + "Roznica" + (var_1 - var_2) + "Iloraz" + (var_1/var_2));

        System.out.println("Podaj liczbe x:");
        float num = scannerObj.nextFloat();
        System.out.println(num+140);
        System.out.println(num-31);
        System.out.println(num*7);
        System.out.println(num/13);
        System.out.println(num%7);
        System.out.println((int)num/4);
        System.out.println(Math.pow(num,45));
        System.out.println((int)num&67);
        System.out.println((int)num|59);
        System.out.println((int)num^23);
        System.out.println((int)num<<5);
        System.out.println((int)num>>6);

    }
}