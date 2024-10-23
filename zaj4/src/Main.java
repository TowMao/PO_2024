import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static ArrayList<ArrayList<Integer>> uniqueArrayList(ArrayList<Integer> tab) {

        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(tab.get(0));

        for(int num : tab) {
            boolean check = false;
            for (int num2 : unique) {
                if (num == num2) {
                    check = true;
                }
            }
            if (check == false) {
                unique.add(num);
            }
        }

        ArrayList<ArrayList<Integer>> unique_arr = new ArrayList<>();

        for (int num : unique) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(num);
            arr.add(0);
            unique_arr.add(arr);
        }

        return unique_arr;
    }

    public static ArrayList<Integer> append(ArrayList<Integer> tab, ArrayList<Integer> tab_1) {
        ArrayList<Integer> appended = new ArrayList<>();
        for (int num : tab) {
            appended.add(num);
        }
        for (int num : tab_1) {
            appended.add(num);
        }
        return appended;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> merged = new ArrayList<>();
        merged.add(tab1.get(0));
        merged.add(tab2.get(0));
        int i = 1, j = 1;
        while (i < tab1.size() || j < tab2.size()) {
            if (i < tab1.size()) {
                merged.add(tab1.get(i));
                i++;
            }
            if (j < tab2.size()) {
                merged.add(tab2.get(j));
                j++;
            }
        }
        return merged;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> merged = merge(tab1, tab2);
        int[] merged_to_sort = new int[merged.size()];
        for (int i = 0; i < merged.size(); i++) {
            merged_to_sort[i] = merged.get(i);
        }

        Arrays.sort(merged_to_sort);
        merged.clear();

        for(int i = 0; i < merged_to_sort.length; i++) {
            merged.add(merged_to_sort[i]);
        }

        return merged;
    }

    public static ArrayList<String> toArrayList(String napis) {
        ArrayList<String> nap_arr = new ArrayList<>();
        char[] napis_podziel = napis.toCharArray();
        Arrays.sort(napis_podziel);
        for (char c : napis_podziel) {
            nap_arr.add(String.valueOf(c));
        }
        return nap_arr;
    }

    public static boolean checkChar(ArrayList<String> tab, char znak) {
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i).charAt(0) == znak) {
                return true;
            }
        }
        return false;
    }

    public static int countChar(ArrayList<String> tab, char znak) {
        int ilosc = 0;
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i).charAt(0) == znak) {
                ilosc++;
            }
        }
        return ilosc;
    }

    public static ArrayList<ArrayList<Integer>> countArrayList(ArrayList<Integer> tab) {
        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(tab.get(0));
        ArrayList<Integer> wystapienia = new ArrayList<>();

        for(int num : tab){
            boolean check = false;
            for (int num2 : unique) {
                if (num == num2) {
                    check = true;
                }
            }
            if (check == false) {
                unique.add(num);
            }
        }

        for (int num : unique) {
            int ilosc = 0;
            for (int num2 : tab) {
                if (num == num2) {
                    ilosc++;
                }
            }
            wystapienia.add(ilosc);
        }

        ArrayList<ArrayList<Integer>> unique_wystapienia = new ArrayList<>();
        for (int i = 0; i < wystapienia.size(); i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(unique.get(i));
            arr.add(wystapienia.get(i));
            unique_wystapienia.add(arr);
        }

        return unique_wystapienia;
    }

    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        ArrayList<Integer> tab_1 = new ArrayList<>();
        int[] tab_num = {1, 1, 2, 2, 2, 3, 14, 14, 41, 61, 16, 61, 2};
        int[] tab_num_2 = {2, 3, 1, 5, 6};
        for (int i = 0; i < tab_num.length; i++) {
            tab.add(tab_num[i]);
        }
        //for (int j = 0; j < tab_num_2.length; j++) {
        //    tab_1.add(tab_num_2[j]);
        //}
        ArrayList<ArrayList<Integer>> unikalne = countArrayList(tab);
        //
        for (ArrayList<Integer> arr : unikalne) {
            System.out.println(arr);
        }
        //}
        //String napis = "Ala ma kota";
        //ArrayList<Integer> tab_3 = mergeSorted(tab, tab_1);
        //ArrayList<String> tab_3 = toArrayList(napis);
        //for (String num : tab_3) {
        //    System.out.println(num);
        //}
        //System.out.println(countChar(toArrayList(napis), ''));
    }
}