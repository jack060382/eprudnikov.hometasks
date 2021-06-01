package lesson6;

public abstract class Vechile {

    protected String id;

    public Vechile(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract void move();

}
