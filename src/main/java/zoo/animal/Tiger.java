package zoo.animal;

import zoo.foods.Food;
import zoo.foods.Grass;
import zoo.foods.Meat;

public class Tiger extends Animal {
    public Tiger(int age) {
        super(age);
    }

    @Override
    public void sayHi() {
        System.out.println("Hi Im Tiger! Enjoy :)");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            System.out.println("Hi Im Tiger and i hate grass " + food.getDescription());
        }else if(food instanceof Meat) {
            System.out.println("Hi Im Tiger and i love meat " + food.getDescription());
        }
    }
}
