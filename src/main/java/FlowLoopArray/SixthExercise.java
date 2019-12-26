package FlowLoopArray;

/*6. Write a simple application that will simulate a shopping. Use only if-else flow control. Consider following cases:
        If you would like to buy a bottle of milk – cashier will ask you for a specific amount of money.
        You have to enter that value and verify if it is same as the cashier asked.
        If you would like to buy a bottle of wine – cashier will ask you if you are an adult and
        for positive answer ask for a specific amount of money.*/

import java.util.Scanner;

public class SixthExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pasirinkte, ka noresite pirkti: pienas ar vynas");

        String MilkOrWine = input.nextLine();

        switch (MilkOrWine){

            case "pienas":{
                System.out.println("Iveskite kasininkui paduodamu pinigu suma");
                double moneyMilk = input.nextDouble();
                double milkPrice = 1.6;
                if (moneyMilk==milkPrice){
                    System.out.println("davete pinigu lygiai, be grazaos");
                }if (moneyMilk>milkPrice){
                    System.out.println("davete pinigu daugiau, jusu graza yra "+ (moneyMilk-milkPrice) + " eur");
                }if (moneyMilk<milkPrice){
                    System.out.println("duotu pinigu neuztenka pienui nusipirkti");
                } break;
            }
            case "vynas": {
                System.out.println("koks jusu amzius?");
                int age = input.nextInt();
                if (age>20){
                    System.out.println("Iveskite kasininkui paduodamu pinigu suma");
                    double moneyWine = input.nextDouble();
                    double milkPrice = 6.5;
                    if (moneyWine==milkPrice){
                        System.out.println("davete pinigu lygiai, be grazaos");
                    }if (moneyWine>milkPrice){
                        System.out.println("davete pinigu daugiau, jusu graza yra "+ (moneyWine-milkPrice));
                    }if (moneyWine<milkPrice){
                        System.out.println("duotu pinigu neuztenka pienui nusipirkti");
                    }
                } else {
                    System.out.println("jus esate per jaunas pirkti vyna!");
                } break;

            } default:{
                System.out.println("ne tiksliai ivestas produkto pavcadinimas");
            }
        }

    }
}