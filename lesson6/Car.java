package lesson6;

public class Car extends Vechile {

    public Car(String id) {
        super(id);
    }

    @Override
    public void move() {
        System.out.printf("Car %s is mooving. %n", super.getId());
        // System.out.printf("Car %s is mooving. %n", getId());
    }

    public String getId() {
        return id;
    }

}
