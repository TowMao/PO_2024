import java.math.*;
import java.util.Random;

public class Main {
    public static double[] generujTablice(int n, int minWartosc, int maxWartosc) {
        double[] tab = new double[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            tab[i] = random.nextDouble((maxWartosc - minWartosc) + 1) + minWartosc;
        }
        return tab;
    }

    public static double[] generujZakres(int n, double minWartosc, double maxWartosc){
        double[] tab = new double[n];
        tab[0] = minWartosc;
        tab[n - 1] = maxWartosc;
        double odleglosc = (maxWartosc - minWartosc) / (double)(n-1);

        for (int i = 1; i < n-1; i++) {
            tab[i] = minWartosc + i * odleglosc;
        }

        return tab;
    }
    public static void wypiszZakres(double[] tab){
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
    public static void wypiszTablice(int[] tab, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i * m + j < tab.length) {
                    System.out.printf("%4d", tab[i * m + j]);
                } else {
                    System.out.printf("%4s", "");
                }
            }
            System.out.println();
        }
    }

    public static void ileNieparz(int[] tab){
        int n = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]%2 !=0 ){
                n++;
            }
        }
        System.out.println(n);
    }

    public static int ileParz(int[] tab){
        int n = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]%2 == 0 ){
                n++;
            }
        }
        System.out.println(n);
        return n;
    }

    public static int ileDod(int[] tab){
        int n = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]%2 > 0){
                n++;
            }
        }
        System.out.println(n);
        return n;
    }

    public static void ileUje(int[] tab){
        System.out.println(tab.length - ileDod(tab));
    }

    public static void ileZer(int[] tab){
        int zera = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0){
                zera++;
            }
        }
        System.out.println(zera);
    }

    public static void ileMax(int[] tab){
        int max = tab[0];
        int max_liczba = 1;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max){
                max = tab[i];
            }
        }
        for (int j = 0; j < tab.length; j++) {
            if (tab[j] == max){
                max++;
            }
        }
        System.out.printf("%d : %d%n", max, max_liczba);
    }

    public static void ileMin(int[] tab){
        int min = tab[0];
        int min_liczba = 1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min){
                min = tab[i];
            }
        }
        for (int j = 0; j < tab.length; j++) {
            if (tab[j] == min){
                min_liczba++;
            }
        }
        System.out.printf("%d : %d%n", min, min_liczba);
    }

    public static void ileUnikalnych(int[] tab){
        int unikalne = tab.length;
        for (int i = 0; i < tab.length; i++) {
            for (int j = i+1; j < tab.length; j++) {
                if (tab[i] == tab[j]){
                    unikalne--;
                }
            }
        }
        System.out.printf("tablica ma : %d unikalnych liczb", unikalne);
    }

    public static int sumaDodatnich(int[] tab){
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0){
                suma += tab[i];
            }
        }
        System.out.println("Suma dodatnich: " + suma);
        return suma;
    }

    public static int sumaUjemnych(int[] tab){
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0){
                suma += tab[i];
            }
        }
        System.out.println("Suma ujemnych: " + suma);
        return suma;
    }

    public static double sumaOdwr(int[] tab){
        double suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += 1/(double)tab[i];
        }
        System.out.println("Suma odwr: " + suma);
        return suma;
    }

    public static void sredniaArytm(int[] tab){
        int suma = sumaDodatnich(tab) + sumaUjemnych(tab);
        System.out.println("Srednia arytmetyczna = " + (double)(suma/tab.length));
    }

    public static void sredniaHarm(int[] tab){
        System.out.println("Srednia harmoniczna wynosi: " + (double)tab.length / sumaOdwr(tab));
    }

    public static double[] funkcjaLin(double[] tab, int a, int b){
        double[] fun = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            fun[i] = tab[i] * a + b;
        }
        return fun;
    }
    public static double[] funKwa(double[] tab, int a, int b, int c){
        double[] fun = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            fun[i] = a*tab[i]*tab[i] + b*tab[i] + c;
        }
        return fun;
    }

    public static double[] funWykl(double[] tab, int a) {
        double[] fun = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            fun[i] = Math.pow(a, tab[i]);
        }
        return fun;
    }
    public static int[] funSignum(double[] tab){
        int[] fun = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0){
                fun[i] = -1;
            }
            else {
                fun[i] = 1;
            }
        }
        return fun;
    }

    public static void najdluzszyCiagDodatnich(double[] tab){
        int streak = 1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0){
                streak++;
            }
            else{
                streak = 1;
            }
        }
        System.out.println("Streak: " + streak);
    }

    public static void najdluzszyCiagUjemnych(double[] tab){
        int streak = 1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0){
                streak++;
            }
            else{
                streak = 1;
            }
        }
    }

    public static double[] odwrocTablice(double[] tab){
        double[] odwroc = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            odwroc[i] = tab[tab.length-i-1];
        }
        return odwroc;
    }

    public static double[] odwrocTablice(double[] tab, int indexStart, int indexStop){
        double[] odwroc = new double[tab.length];
        for(int i=0;i<tab.length;i++) {
            if(i>=indexStart&&i<=indexStop)
            {
                odwroc[i]=tab[indexStop+indexStart-i];
            }
            else {
                odwroc[i]=tab[i];
            }
        }

        return odwroc;
    }

    public static void main(String[] args) {
        double maxWar = 6.25;
        double minWar = 1.25;
        int n = 2;
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] tab = generujTablice(n, minWar, maxWar);
        //double[] tab_1 = generujZakres(n, minWar, maxWar);
        //wypiszZakres(tab_1);
        //wypiszTablice(arr, 4, 4);
        //ileUnikalnych(arr);
        double[] tablica = generujTablice(10, 1, 100);
        double[] tablica_n = new double[tablica.length];
        //sredniaArytm(arr);
        //sredniaHarm(arr);
        //double[] funLin = funkcjaLin(tablica, 2, 1);
        tablica_n = odwrocTablice(arr, 1, 5);
        for (int i = 0; i < tablica_n.length; i++) {
            System.out.println(tablica_n[i]);
        }
    }
}