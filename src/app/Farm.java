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
    }

    public void addHorse(Horse e) {
        horseList.add(e);
    }

    public void addRabbit(Rabbit r) {
        rabbitList.add(r);
    }

    // feed horse
    public void feedAnimal(int type, int index, double foodQuantity) {
        switch (type) {
            case 0:
                try {
                    horseList.get(index).eat(foodQuantity);
                    break;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("you have chosen to feed an animal that doesn't exist");
                }
            case 1:
                try {
                    rabbitList.get(index).eat(foodQuantity);
                    break;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("you have chosen to feed an animal that doesn't exist");
                }
        }
    }

    public void irrigateAnimal(int type, int index, double waterQuantity) {
        switch (type) {
            case 0:
                try {
                    horseList.get(index).drink(waterQuantity);
                    break;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("you have chosen to irrigate an animal that doesn't exit");
                }
            case 1:
                try {
                    rabbitList.get(index).drink(waterQuantity);
                    break;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("you have chosen to irrigate an animal that doesn't exit");
                }
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
