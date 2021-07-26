package app;

public class Animal implements BioFunctions {
    Farm farm = new Farm();
    static int numberOfAnimals;
    private String name;
    private int age;
    private int foodCap;
    private double waterCap;
    private Boolean isSick;
    private double currentFoodQuantity;
    private double currentWaterQuantity;

    public Animal() {
        numberOfAnimals++;
    }

    public Animal(String name, int age, int foodCap, double waterCap) {
        this.name = name;
        this.age = age;
        this.foodCap = foodCap;
        this.waterCap = waterCap;
        numberOfAnimals++;
    }

    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public static void setNumberOfAnimals(int numberOfAnimals) {
        Animal.numberOfAnimals = numberOfAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFoodCap() {
        return foodCap;
    }

    public double getWaterCap() {
        return waterCap;
    }

    public Boolean getSick() {
        return isSick;
    }

    public void setSick(Boolean sick) {
        isSick = sick;
    }

    public void eat(double foodQuantity) {
        if (currentFoodQuantity <= getFoodCap()) {
            currentFoodQuantity += foodQuantity;
            farm.setFoodQuantity(farm.getFoodQuantity() - foodQuantity);
        } else {
            System.out.println("the " + getName() + " isn't hungry!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCurrentFoodQuantity() {
        return currentFoodQuantity;
    }

    public void setCurrentFoodQuantity(double currentFoodQuantity) {
        this.currentFoodQuantity = currentFoodQuantity;
    }

    public double getCurrentWaterQuantity() {
        return currentWaterQuantity;
    }

    public void setCurrentWaterQuantity(double currentWaterQuantity) {
        this.currentWaterQuantity = currentWaterQuantity;
    }

    public void drink(double waterQuantity) {
        if (currentWaterQuantity <= getWaterCap()) {
            currentWaterQuantity += waterQuantity;
            farm.setWaterQuantity(farm.getWaterQuantity() - waterQuantity);
        } else {
            System.out.println("the " + getName() + " isn't hungry!");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "farm=" + farm +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", foodCap=" + foodCap +
                ", waterCap=" + waterCap +
                ", isSick=" + isSick +
                ", currentFoodQuantity=" + currentFoodQuantity +
                ", currentWaterQuantity=" + currentWaterQuantity +
                '}';
    }
}
