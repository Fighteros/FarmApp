package app;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private final int foodQuantity = 10;
    private final int waterQuantity = 5;
    private String farmName;
    private List<Horse> horseList = new ArrayList<>();
    private Animal[] animal;
    private Horse horse = new Horse("Sheba");
    private Rabbit rabbit = new Rabbit("Freddy");

    public Farm() {
    }

    public Farm(String name) {
        farmName = name;
    }

    public Farm(String farmName, Animal animal) {
        this.farmName = farmName;
        this.animal[Animal.numberOfAnimals] = animal;
    }

    public void horseEat(int foodQuantity) {
        horse.eat(foodQuantity);
    }

    public void horseDrink(double waterQuantity) {
        horse.drink(waterQuantity);
    }

    public void rabbitEat(double foodQuantity) {
        rabbit.eat(foodQuantity);
    }

    public void rabbitDrink(double waterQuantity) {
        rabbit.drink(waterQuantity);
    }

    public void animalEat(int foodQuantity, int index) {
        animal[index].eat(foodQuantity);
    }

    public void animalDrink(double waterQuantity, int index) {
        animal[index].drink(waterQuantity);
    }

    public void feedAnimal(int type, int index) {
        switch (type) {
            case 0:
                // feed horse
                animal[index].eat(5);
                break;

        }

    }

    @Override
    public String toString() {
        return "Farm{" +
                "farmName='" + farmName + '\'' +
                ", number of Animals= " + Animal.numberOfAnimals +
                ", foodQuantity=" + foodQuantity +
                ", waterQuantity=" + waterQuantity +
                ", horse=" + horse.toString() +
                ", rabbit=" + rabbit.toString() +
                '}';
    }
}
