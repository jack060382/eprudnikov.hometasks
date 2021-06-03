package task6;

public class Dog extends Animal {

    protected int sweem_max_distance = 10;
    protected int run_max_distance = 500;
    private static int counter;

    public Dog(String name) {
        super(name);
        counter ++ ;
        super.sweem_max_distance = this.sweem_max_distance;
        super.run_max_distance = this.run_max_distance;
    }

    public static int getTotalCount() {
        return Dog.counter;
    }

}
