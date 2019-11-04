package zoo;

import zoo.animal.Animal;
import zoo.animal.Tiger;
import zoo.animal.Zebra;
import zoo.foods.Grass;
import zoo.foods.Meat;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Zoo() {
    }

    private static Zoo instance;

    public static synchronized Zoo getInstance() {
        if (instance == null) {
            instance = new Zoo();
        }
        return instance;
    }

    public static void run() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Tiger(5));
        animals.add(new Zebra(6));

        System.out.println("Food is meat");
        for (Animal animal : animals) {
            animal.eat(new Meat(45, "chicken"));
            animal.sayHi();
        }

        System.out.println("Food is grass");
        for (Animal animal : animals) {
            animal.eat(new Grass(4, "clover"));
            animal.sayHi();
        }

        System.out.println("Only zebra with overloading method");
        Zebra zebra = new Zebra(9);
        zebra.eat(new Meat(4, "turkey"));
        zebra.eat(new Grass(3, "chive"));
    }
}
