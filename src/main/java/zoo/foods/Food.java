package zoo.foods;

import java.util.Objects;

public abstract class Food {
    private final int calories;
    private final String description;

    public Food(int calories, String description) {
        this.calories = calories;
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return calories == food.calories &&
                Objects.equals(description, food.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calories, description);
    }
}
