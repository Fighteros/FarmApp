package app;

public class Main {

    public static void main(String[] args) {
        //create a farm
        Farm farm = new Farm("happy Animals");
        System.out.println(farm.toString());
        farm.feedAnimal(0, 0, 2);
        farm.irrigateAnimal(0, 0, 1);
        farm.feedAnimal(0, 1, .5);
        farm.irrigateAnimal(0, 1,.5);
        System.out.println(farm.toString());
    }
}
