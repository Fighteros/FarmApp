package app;

public class Main {

    public static void main(String[] args) {
        //create a farm
        Farm farm = new Farm("happy Animals");
        System.out.println(farm);
        farm.horseDrink(1);
        farm.horseEat(2);
        farm.rabbitEat(.5);
        farm.rabbitDrink(.5);
        System.out.println(farm);

    }
}
