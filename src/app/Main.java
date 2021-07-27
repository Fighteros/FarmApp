package app;

public class Main {

    public static void main(String[] args) {
        //create a farm
        Farm farm = new Farm("happy Animals");
        System.out.println(farm.toString());
        farm.feedAnimal(0, 0, 4);
        farm.irrigateAnimal(0,0,2);
        farm.feedAnimal(1,0,.5);
        farm.irrigateAnimal(1, 0 ,.25);
        System.out.println(farm.toString());
    }
}
