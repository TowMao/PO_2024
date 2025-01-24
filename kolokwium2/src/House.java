public class House extends Building {
    int numberOfRooms;


    public House(double height, String color, int numberOfRooms) {
        super(height, color);
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
