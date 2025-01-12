public class Dog extends Animal {
        String name;

        public Dog(String name, int age){
                this.name = name;
                super.age = age;
        }

        @Override
        public String toString() {
                return "Dog " +
                        "name='" + name + '\''
                        ;
        }

        public int getAge() {
                return this.age;
        }
}
