
import java.util.Scanner;
public class MakingCoffee {

    public static void main(String[] args) {
        int waterPerCup = 200;
        int milkPerCup = 50;
        int coffeeBeansPerCup = 15;

        System.out.println("Write how many ml of water the coffee machine has: ");
        System.out.print("> ");
        Scanner value = new Scanner (System.in);
        int waterValue = value.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has: ");
        System.out.print("> ");
        int milkValue = value.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        System.out.print("> ");
        int coffeeBeansValue = value.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        System.out.print("> ");

        int neededCupsOfCoffee = value.nextInt();

        int water = waterValue/waterPerCup;

        int milk = milkValue/milkPerCup;

        int coffee = coffeeBeansValue/coffeeBeansPerCup;

        int min = water;
        if(milk <= water) {
            min = milk;
            if(coffee <= milk) {
                min = coffee;
            }
        }
        int diff = min - neededCupsOfCoffee;
        if(neededCupsOfCoffee > min) {
            System.out.println("No, I can make only " +  min + " cup(s) of coffee");
        }
        else if(neededCupsOfCoffee < min)
            System.out.println("Yes, I can make that amount of coffee (and even " +  diff + " more than that)");
        else
            System.out.println("Yes, I can make that amount of coffee");
    }
    }

