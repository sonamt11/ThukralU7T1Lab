import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Mercury");
        Cat cat2 = new Cat("Venus");
        Cat cat3 = new Cat("Earth");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Mars");
        Cat replaced = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replaced);
        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);
        System.out.println(cats);
        cats.add(new Cat("Sam"));
        System.out.println(cats);


    }
}
