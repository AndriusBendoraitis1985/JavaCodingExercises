package Object.SecondExercise;

/*2. Petrol Station
        Simulate the process of refueling. Within the while loop ask user if you should continue or finish.
        For every entered "continue" command you should add a specific amount of petrol and money (both of type double)
        and view it on the console.
        At the end user should pay for petrol. Consider multiple possibilities, like:
        The user paid exactly as much as required.
        The user paid too much (cashier should return the rest of the money).
        The user paid too little – should be asked for the rest.*/

import java.util.Scanner;

public class PetrolMain {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
/*
        System.out.println("iveskite kuro kaina");
        double price = input.nextDouble();
        System.out.println("iveskite kuro kieki");
        double litres = input.nextDouble();
*/
        double sumPrice = 0;
        double sumLitres = 0;
        double finalSUm = 0;

        boolean repeat = true;

        while (repeat) {
            System.out.println("iveskite kuro kaina");
           double price = input.nextDouble();
            System.out.println("iveskite kuro kieki");
           double litres = input.nextDouble();

    //        sumLitres = sumLitres + litres;
     //       sumPrice = sumPrice + price;
            finalSUm=finalSUm +(litres*price);

            repeat = false;

            System.out.println("jei norite testi, -> continue");
            String answer = inputText.nextLine();

            if (answer.equals("continue")) {
                repeat = true;
            }
        }
        System.out.println(finalSUm);
        System.out.println("iveskite pinigu kieki, kuri mokate");
        double customerPrice = input.nextDouble();
        if (customerPrice==finalSUm){
            System.out.println("sumokejote lygiai tiek kiek reikia");
        } else if (customerPrice >finalSUm){
            System.out.println("sumokejote daugiau, jusu graza: "+ (customerPrice-finalSUm)+ " eur");
        } else if (customerPrice<finalSUm){
            System.out.println("sumoketu pinigu nepakanka, prasoma papildomai sumoketi: "+ (finalSUm-customerPrice)+ " eur");
        }
    }
}

