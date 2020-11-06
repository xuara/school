package ch06.lists;

public class Car {

    private int year;
    private String make;
    private String model;
    private double price, c;

    public Car(int year, String make, String model, double price) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {

        return String.format("%4d %s %s - $%,.2f", getYear(), getMake(), getModel(), getPrice());

    }

    public static double totalPrice(ArrayUnsortedList<Car> carList) {
        double t = 0;
        carList.reset();
        while (carList.currentPos < carList.size() - 1) {
            Car l = carList.getNext();
            t += l.getPrice();
        }
        Car l = carList.getNext();
        t += l.getPrice();
        return t;
    }

    public static void main(String[] args) {

        ArrayUnsortedList t = new ArrayUnsortedList();
        Car one = new Car(2004, "VW", "Jetta", 2000);
        Car two = new Car(2010, "Honda", "Civic", 4000);
        Car three = new Car(1985, "Ford", "Mustang", 6000);
        t.add(one);
        t.add(two);
        t.add(three);

        System.out.println("car" + t);

        System.out.printf("The totalPrice is: $%,.2f %n", totalPrice(t));
    }
}
