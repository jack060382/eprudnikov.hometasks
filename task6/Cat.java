package task6;

public class Cat extends Animal {

    protected int sweem_max_distance = 0;
    protected int run_max_distance = 200;
    private static int counter;

    public Cat(String name) {
        super(name);
        counter ++ ;
        super.sweem_max_distance = this.sweem_max_distance;
        super.run_max_distance = this.run_max_distance;
    }

    public static int getTotalCount() {
        return Cat.counter;
    }

}
