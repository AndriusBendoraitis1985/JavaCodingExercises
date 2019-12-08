package FlowLoopArray;

import java.util.Scanner;

public class SeventhExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");

        double firstNum = input.nextDouble();
        System.out.println("Iveskite skaiciu is kurio dalinsite");

        double secondNum = input.nextDouble();

        while (secondNum != 0) {

            double answer = firstNum/secondNum;

            System.out.println("jusu atsakymas yra " +answer);

            firstNum=answer;

            System.out.println("Iveskite skaiciu is kurio dalinsite");
            secondNum = input.nextDouble();

        }

    }
}
