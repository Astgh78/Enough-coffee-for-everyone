
import java.util.Scanner;
public class MakingCoffeeEx1 {

           public static void main(String[] args) {
            int waterPerCup = 200;
            int milkPerCup = 50;
            int coffeeBeansPerCup = 15;

            System.out.println("Write how many ml of water the coffee machine has: ");
            Scanner value1 = new Scanner (System.in);
            int waterValue = value1.nextInt();

            System.out.println("Write how many ml of milk the coffee machine has: ");
            Scanner value2 = new Scanner (System.in);
            int milkValue = value2.nextInt();

            System.out.println("Write how many grams of coffee beans the coffee machine has: ");
            Scanner value3 = new Scanner (System.in);
            int coffeeBeansValue = value3.nextInt();

            System.out.println("Write how many cups of coffee you will need: ");
            Scanner value4 = new Scanner (System.in);
            int neededCupsOfCoffee = value4.nextInt();

            if (waterValue % waterPerCup >= neededCupsOfCoffee && milkValue % milkPerCup >= neededCupsOfCoffee && coffeeBeansValue % coffeeBeansPerCup >= neededCupsOfCoffee)
                System.out.println("Yes, I can make that amount of coffee");
            else System.out.println("Sorry there are no enough ingredients");
        }
    }

