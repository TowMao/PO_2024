public class Dog extends Animal {
    private int age;

    public Dog(String name, int age){
        this.age = age;
    }

    public int age() {
        return age;
    }
}