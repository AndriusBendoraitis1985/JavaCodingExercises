package FlowLoopArray;

/*7. Write a "divide by" application. User should be able to enter initial value that will be divided in a loop by a
        new value entered by a user. Division should occur as long, as entered value will be different than 0.
        Result of division should be rounded to the fourth decimal point and printed to the console.*/

import java.util.Scanner;

public class SeventhExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");

        double firstNum = input.nextDouble();
        System.out.println("Iveskite skaiciu is kurio dalinsite");

        double secondNum = input.nextDouble();
        double answer =0;

        while (secondNum != 0) {

            answer =  firstNum/secondNum;

            System.out.printf("jusu atsakymas yra %.3f \n",answer);

            firstNum=answer;

            System.out.println("Iveskite skaiciu is kurio dalinsite");
            secondNum = input.nextDouble();

        }

        System.out.printf("Dalyba is nulio negalima! Paskutinis veiksmas atsauktas.\nJusu atsakymas yra %.3f \n",answer);
    }
}
