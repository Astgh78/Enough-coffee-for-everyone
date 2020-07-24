
import java.util.Scanner;
public class MakingCoffeeEx1 {

           public static void main(String[] args) {
            int waterPerCup = 200;
            int milkPerCup = 50;
            int coffeeBeansPerCup = 15;
            int cupsOfCoffee1 = 2;
               int cupsOfCoffee2 = 5;

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

            if (waterValue % waterPerCup >= neededCupsOfCoffee && milkValue % milkPerCup >= neededCupsOfCoffee && coffeeBeansValue % coffeeBeansPerCup >= neededCupsOfCoffee)
                System.out.println("Yes, I can make that amount of coffee");

            else
                if (waterValue % waterPerCup >= cupsOfCoffee1 && milkValue % milkPerCup >= cupsOfCoffee1 && coffeeBeansValue % coffeeBeansPerCup >= cupsOfCoffee1)
                    System.out.println("No, I can make only"  + cupsOfCoffee1 + "cup(s) of coffee");

                else if (waterValue % waterPerCup >= cupsOfCoffee2 && milkValue % milkPerCup >= cupsOfCoffee2 && coffeeBeansValue % coffeeBeansPerCup >= cupsOfCoffee2)
                   System.out.println("Yes, I can make that amount of coffee (and even 2 more than that)");



        }
    }

