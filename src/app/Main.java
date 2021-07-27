package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create a farm
        Farm farm = new Farm("happy Animals");
        System.out.println(farm.toString());
        farm.feedAnimal(0, 0, 4);
        farm.irrigateAnimal(0, 0, 4);
        farm.feedAnimal(1, 0, .5);
        farm.irrigateAnimal(1, 0, .5);
        System.out.println(farm.toString());
        System.out.println("please chose whether to add Horses or Rabbits \n 1- Horses \n 2- Rabbits");
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();

        if (type == 1) {
            System.out.println("please input how many horses you want to add?");
            int numOfHorses = input.nextInt();
            for (int i = 0; i < numOfHorses; i++) {
                System.out.println("Please Enter horse Name");
                String horseName = input.next();
                farm.addHorse(new Horse(horseName, farm));
            }
            System.out.println(farm.toString());
        } else if (type == 2) {
            System.out.println("please input how many Rabbits you want to add?");
            int numOfRabbits = input.nextInt();
            for (int i = 0; i < numOfRabbits; i++) {
                System.out.println("Please Enter Rabbit Name");
                String rabbitName = input.next();
                farm.addHorse(new Horse(rabbitName, farm));
            }
            System.out.println(farm.toString());
        } else {
            System.out.println("please choose 1 or 2 only!");
        }
    }
}
