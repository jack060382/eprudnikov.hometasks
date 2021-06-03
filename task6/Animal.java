package task6;

public abstract class Animal {

    protected String name;
    private static int counter;

    protected int sweem_max_distance;
    protected int run_max_distance;

    public Animal(String name) {
        counter ++ ;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getTotalCount() {
        return Animal.counter;
    }

    public void run(int distance) {
        if (this.run_max_distance < distance) {
            System.out.printf("%s столько бегать не умеет, только %dм.\n", name, this.run_max_distance);
            return;
        }
        System.out.printf("%s пробежал %dм.\n", name, distance);
    }

    public void sweem(int distance) {
        if (this.sweem_max_distance < distance) {
            System.out.printf("%s столько плавать не умеет, только %dм.\n", name, this.sweem_max_distance);
            return;
        }
        System.out.printf("%s проплыл %dм.\n", name, distance);
    }

}
