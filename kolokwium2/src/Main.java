import java.util.ArrayList;
import java.util.Comparator;


public class Main {

    public static <T> void sortDescending(ArrayList<T> arr) {

        arr.reversed().sort(null);
    }

    public static void main(String[] args) {

        Building b1 = new Building(31.4, "red");
        House h1 = new House(13.4, "blue", 6);

        System.out.println(b1.toString());
        System.out.println(h1.toString());

        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            arr.add(i);
        }

        sortDescending(arr);
        System.out.println(arr.toString());
    }
}