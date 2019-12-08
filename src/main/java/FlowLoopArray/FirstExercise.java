package FlowLoopArray;

import java.util.Scanner;

public class FirstExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite skiciu");

        int enterNumber = input.nextInt();
        if (enterNumber>30){
            System.out.println("Ivestas skaicius didesnis uz 30");
        }
        else if (enterNumber<30){
            System.out.println("Ivestas skaicius yra mazenis uz 30");
        }
        else {
            System.out.println("Ivestas skaicius yra lygus 30");

        }

    }
}
