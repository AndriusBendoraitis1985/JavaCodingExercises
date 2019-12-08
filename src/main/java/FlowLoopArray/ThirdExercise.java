package FlowLoopArray;

import java.util.Scanner;

public class ThirdExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        int numberOne = input.nextInt();

        System.out.println("Iveskite antra skaiciu");
        int numberTwo = input.nextInt();

        if (numberOne>30 || numberTwo>30){
            System.out.println("Bent vienas skaicius yra daugiau uz 30");
        }
        if (numberOne<30 || numberTwo<30){
            System.out.println("Bent vienas skaicius yra maziau uz 30");
        }
        if (numberOne==30 || numberTwo==30){
            System.out.println("Bent vienas skaicius yra lygus 30");
        }
    }
}
