public class Box<T> {
    private T t;

    public void set(T t){this.t = t;}

    public T get(){return t;}

    public static <T> boolean isEqual(T objekt1, T objekt2) {
        return objekt1.equals(objekt2);
    }
}
