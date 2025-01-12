

public class Main {

    public static <T> void findMax(Dog[] dogs, Pair<? super Dog> result) {
            if (dogs[0].age() < dogs[1].age()) {
                result.obj1 = dogs[0];
                result.obj2 = dogs[1];
            }
            else {
                result.obj1 = dogs[1];
                result.obj2 = dogs[0];
            }
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("111", 12);
        Dog dog2 = new Dog("222", 13);
        Dog[] dogs = { dog1, dog2 };
        Pair<Dog> dog_result = new Pair<Dog>();

        findMax(dogs, dog_result);

        System.out.println(dog_result.obj1);
        System.out.println(dog_result.obj2);
    }
}