package lesson5;

public class New {

    public static void main(String[] args) {
        Human max = new Human("male");
        max.name = "Max";
        max.age = 33;
        max.increaseAge();
        System.out.println(max.name + " has age "+max.age);

        Human jack1 = new Human("male");
        jack1.name = "Jack";
        jack1.age = 25;
        System.out.println(jack1.name + " has age "+jack1.age);
        jack1.increaseAge();

        Human jack2 = new Human("male");
        jack2.name = "Jack";
        jack2.age = 25;
        System.out.println(jack2.name + " has age "+jack2.age);

        Car car = new Car();
        car.name = "Camry";
        car.age = 10;


    }

}
