import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void pit_triples(int n){
        int[] triples = {};
        for (int i = 1; i < n/2; i++) {
            for (int j = 1; j < n / 2; j++) {
                if (Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2)) == Math.floor(Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2))) && i < j) {
                    System.out.println(i + " " + j + " " + (int) Math.floor(Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2))));
                }
            }
        }
    }

    public static void funKwaRozwiazania(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (Math.pow(i, 2) + 4*j*k > 0)
                        System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }

    public static void funKwaDelta(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    double delta = Math.pow(i, 2) + 4 * j * k;
                    for (int l = 0; l < Math.pow(n, 2); l++) {
                        if (delta == l) {
                            System.out.println(i + " " + j + " " + k);
                        }
                    }
                }
            }
        }
    }
    public static void liczbyPierwsze(int n){
        int dzielniki = 1;
        for (int i = 2; i < n+1; i++) {
            for (int j = 2; j < i; j++) {
                if (i != j && i%j == 0) {
                    dzielniki++;
                }
            }
            //System.out.println(dzielniki);
            if (dzielniki == 1){
                System.out.println(i);
            }
            dzielniki = 1;
        }
    }

    public static void liczbyPodzielne(int m, int n){
        for (int i = (int)Math.pow(10, m-1); i < (int)Math.pow(10, m); i++) {
            if (i%n == 0){
                System.out.println(i);
            }
        }
    }
    public static void piramida(int n, int variant) {
        if (variant == 1) {
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }
        else {
            for (int i = 1; i < n + 1; i++) {
                for (int j = i; j < n + 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k < i + 1; k++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }
    }
    public static int silnia(int n){
        int sil = 1;
        for (int i = 1; i < n+1; i++) {
            sil = sil*i;
        }
        return sil;
    }
    public static int silniaPodwojna(int n){
        int sil = 1;
        for (int i = 1; i < n+2; i++) {
            if (i%2 != 0){
                sil = sil*i;
            }
        }
        return sil;
    }

    public static int silniaM(int m, int n){
        int sil = 1;
        for (int i = 1; i <= m; i+=n) {
            sil = sil*i;
        }
        return sil;
    }

    public static int dwumian(int n, int m){
        int dwumian = silnia(n)/(silnia(m)*silnia((n-m)));
        return dwumian;
    }

    public static void ciagFib(int n){

        int[] ciag = new int[n+1];
        ciag[0] = 0;
        ciag[1] = 1;
        for (int i = 0; i < n+1; i++) {
            if (i > 1) {
                ciag[i] = ciag[i-2] + ciag[i-1];
            }
            System.out.println(ciag[i]);
        }
    }
    public static int sumaNat(int n){
        int suma = 0;
        for (int i = 1; i < n+1; i++) {
            suma += i;
        }
        return suma;
    }

    public static int sumaParz(int n){
        int suma = 0;
        for (int i = 0; i < 2*n+1; i+=2) {
            suma += i;
        }
        return suma;
    }

    public static int sumaNParz(int n){
        int suma = 0;
        for (int i = 1; i < 2*n; i+=2) {
            suma += i;
        }
        return suma;
    }

    public static int sumaKwaNat(int n){
        int suma = 0;
        for (int i = 1; i < n+1; i++) {
            suma += (int)Math.pow(i, 2);
        }
        return suma;
    }

    public static int sumaSzeNat(int n){
        int suma = 0;
        for (int i = 1; i < n+1; i++) {
            suma += (int)Math.pow(i, 3);
        }
        return suma;
    }

    public static double sumaOdwNat(int n){
        double suma = 0;
        for (int i = 1; i < n+1; i++) {
            suma += 1/Math.pow(i, 2);
        }
        return suma;
    }

    public static boolean czyPali(String napis){
        for (int i = 0; i < napis.length(); i++) {
            if (napis.charAt(i) != napis.charAt(napis.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void trojkatPascala(int n){
        for (int i = 0; i < n + 1; i++) {
            for (int j = i; j < n + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(dwumian(i, k) + " ");
            }
            System.out.print("\n");
        }
    }

    public static boolean czyPalindrom(int n){
        int num_len = 0;
        int check_val = n;

        if (n < 10) {
            return false;
        }

        while (check_val != 0) {
            check_val = check_val/10;
            num_len++;
        }

        for (int j = 1; j < num_len; j++){
            if (n/Math.pow(10, j) != n/Math.pow(10, num_len-j-1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean czyDosk(int n){
        int[] dzielniki = new int[n];
        int suma_dzielnikow = 0;
        dzielniki[0] = 1;
        for (int i = 2; i < n/2+1; i++) {
            if (n%i == 0) {
                dzielniki[i] = i;
            }
        }
        for (int j = 0; j<dzielniki.length; j++){
            suma_dzielnikow += dzielniki[j];
        }
        if(suma_dzielnikow == n){
            return true;
        }
        return false;

    }

    public static boolean czyPier(int n){
        for (int i = 2; i < n/2 + 1; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return  true;
    }

    public static void NWD(int n, int m){
        int nwd = 1;
        for (int i = 1; i < n+1; i++) {
            if (n%i == 0 && m%i == 0) {
                nwd = i;
            }
        }
        System.out.println(nwd);
    }

    public static int[] wczytaj_tab(int n){
        int[] wczytaj = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<n; i++){
            System.out.println("Podaj liczbe do dodania, pozostalo "+ (n-i) + " miejsc");
            int val = scanner.nextInt();
            wczytaj[i] = val;
        }
        return wczytaj;
    }

    public static void podzbiory(int[] tab){
        for (int start = 0; start < tab.length; start++) {
            for (int koniec = start; koniec < tab.length; koniec++) {
                for (int k = start; k <= koniec; k++) {
                    System.out.print(tab[k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("~0~");
    }
    public static void main(String[] args) {
        int n = 14;
        int m = 7;
        //pit_triples(n);
        //funKwaRozwiazania(n);
        //funKwaDelta(n);
        //liczbyPierwsze(n);
        //liczbyPodzielne(m, n);
        //piramida(n, 2);
        //System.out.println(silnia(n));
        //System.out.println(silniaPodwojna(n));
        //System.out.println(silniaM(9, 4));
        //System.out.println(dwumian(5, 3));
        //ciagFib(n);
        //trojkatPascala(10);
        //System.out.println(czyPalindrom(n));
        //System.out.println(czyDosk(6));
        //System.out.println(czyPier(m));
        //NWD(n, m);
        //int[] tab = wczytaj_tab(6);
        int[] tab = {1, 2, 3};
        podzbiory(tab);
    }
}