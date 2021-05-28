package lesson5;

/**
 * public
 * private
 * protected
 * package-private (default) - private + protected + in package
 */
public class Human {
    public String name;
    public int age;
    public Human[] children;

    private String sex;

    public Human(String sex) {
        this.sex = sex;
    }

    public Human() {
        this.sex = "male";
    }

    public void increaseAge() {
        age++;
    }

    public void changeName(String name) {
        this.name = name;
    }

}
