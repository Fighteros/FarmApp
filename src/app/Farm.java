package app;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private  double foodQuantity = 10;
    private  double waterQuantity = 5;
    private String farmName;
    private Animal animal;
    private List<Horse> horseList = new ArrayList<>();
    private List<Rabbit> rabbitList = new ArrayList<>();

    public Farm() {
        horseList.add(new Horse("sheba"));
        rabbitList.add(new Rabbit("Freddy"));
    }

    public Farm(String name) {
        farmName = name;
    }

    // feed horse
    public void feedAnimal(int type, int index, double foodQuantity) {
        switch (type) {
            case 0:
                horseList.get(index).eat(foodQuantity);
            case 1:
                rabbitList.get(index).eat(foodQuantity);
        }
    }
    public void irrigateAnimal(int type, int index, double waterQuantity){
        switch (type){
            case 0:
                horseList.get(index).drink(waterQuantity);
            case 1:
                rabbitList.get(index).drink(waterQuantity);
        }

    }

    public void setFoodQuantity(double foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public void setWaterQuantity(double waterQuantity) {
        this.waterQuantity = waterQuantity;
    }

    public  double getFoodQuantity() {
        return foodQuantity;
    }

    public  double getWaterQuantity() {
        return waterQuantity;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "foodQuantity=" + foodQuantity +
                ", waterQuantity=" + waterQuantity +
                ", farmName='" + farmName + '\'' +
                ", animal=" + animal +
                ", horseList=" + horseList +
                ", rabbitList=" + rabbitList +
                '}';
    }
}
