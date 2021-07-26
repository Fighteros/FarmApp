package app;

public interface BioFunctions {

    static void die() {
        Animal.setNumberOfAnimals(Animal.getNumberOfAnimals() - 1);
    }

    void eat(double foodQuantity);

    void drink(double waterQuantity);
}
