package lesson6;

public class Rocket extends Vechile {

    public Rocket(String id) {
        super(id);
    }

    @Override
    public void move() {
        System.out.printf("Jet %s is mooving. %n", super.getId());
    }
}
