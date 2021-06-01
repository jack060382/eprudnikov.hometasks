package lesson6;

public class Main {
    public static void main(String[] args) {
        Vechile[] vechiles = {
                new Car("#2"),
                new Rocket("#3")
        };
        startVechiles(vechiles);
    }

    static void startVechiles(Vechile[] vechiles) {
        for (int i = 0; i < vechiles.length; i++) {
            vechiles[i].move();
            // Его тоже можно переопределить!!!
            vechiles[i].toString();
        }
    }
}
