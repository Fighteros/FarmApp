package app;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private double foodQuantity = 10;
    private double waterQuantity = 5;
    private String farmName;
    private List<Horse> horseList;
    private List<Rabbit> rabbitList;

    public Farm() {
        farmName = "default";
        horseList = new ArrayList<>();
        rabbitList = new ArrayList<>();
        horseList.add(new Horse("Sheba", this));
        rabbitList.add(new Rabbit("Freddy", this));
    }

    public Farm(String name) {
        farmName = name;
        horseList = new ArrayList<>();
        rabbitList = new ArrayList<>();
        horseList.add(new Horse("Sheba", this));
        rabbitList.add(new Rabbit("Freddy", this));
        rabbitList.add(new Rabbit("Freddy", this));
    }

    // feed horse
    public void feedAnimal(int type, int index, double foodQuantity) {
        switch (type) {
            case 0:
                horseList.get(index).eat(foodQuantity);
                break;
            case 1:
                rabbitList.get(index).eat(foodQuantity);
                break;
        }
    }

    public void irrigateAnimal(int type, int index, double waterQuantity) {
        switch (type) {
            case 0:
                horseList.get(index).drink(waterQuantity);
                break;
            case 1:
                rabbitList.get(index).drink(waterQuantity);
                break;
        }

    }

    public double getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(double foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public double getWaterQuantity() {
        return waterQuantity;
    }

    public void setWaterQuantity(double waterQuantity) {
        this.waterQuantity = waterQuantity;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "foodQuantity=" + foodQuantity +
                ", waterQuantity=" + waterQuantity +
                ", farmName='" + farmName + '\'' +
                ", animal=" + Animal.numberOfAnimals +
                ", horseList=" + horseList +
                ", rabbitList=" + rabbitList +
                '}';
    }
}
