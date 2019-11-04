package zoo.animal;

import zoo.foods.Food;
import zoo.foods.Grass;
import zoo.foods.Meat;

public class Zebra extends Animal implements Herbivore {
    public Zebra(int age) {
        super(age);
    }

    @Override
    public void sayHi() {
        System.out.println("Hi Im Zebra! Enjoy :)");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            System.out.println("Hi Im zebra and i love grass(eat(Food food)) " + food.getDescription());
        }else if(food instanceof Meat) {
            System.out.println("Hi Im zebra and i hate meat " + food.getDescription());
        }
    }

    @Override
    public void eat(Grass grass) {
        System.out.println("Hi Im zebra and i love grass (eat(Grass grass)) " + grass.getDescription());
    }
}
