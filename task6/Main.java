package task6;

public class Main {

    public static void main(String[] args) {
        Dog Bobik = new Dog("Бобик");
        Dog Sharik = new Dog("Шарик");
        Cat Murzik = new Cat("Мурзик");

        Bobik.run(300);
        Bobik.sweem(100);

        Sharik.run(600);
        Sharik.sweem(5);

        Murzik.sweem(10);
        Murzik.run(150);

        System.out.println("Собак "+Dog.getTotalCount());
        System.out.println("Кошек "+Cat.getTotalCount());
        System.out.println("Всего теплокровных "+Animal.getTotalCount());

    }

}
