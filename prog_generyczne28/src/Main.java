import java.util.*;

public class Main {

    public static <T extends Animal> T findMinMaxAge(T obj1, T obj2) {
        if(obj1.age > obj2.age){
            return obj1;
        }
        return obj2;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("111", 5);
        Dog dog2 = new Dog("222", 7);

        Dog dog3 = findMinMaxAge(dog, dog2);
        System.out.println(dog3.toString());
    }
}