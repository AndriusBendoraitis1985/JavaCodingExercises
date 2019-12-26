package FlowLoopArray;

/*2. As above but compare two values at the same time.
        Verify if first value is greater than 30 and second value is greater than 30, and so on.*/

import java.util.Scanner;

public class SecondExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        int numberOne = input.nextInt();

        System.out.println("Iveskite antra skaiciu");
        int numberTwo = input.nextInt();

        if (numberOne>30 && numberTwo>30){
            System.out.println("Ivesti skaiciai didesni uz 30");
        }
        if (numberOne<30 && numberTwo<30){
            System.out.println("Ivestas skaiciuai yra mazeni uz 30");
        }
        if (numberOne>30 && numberTwo<30){
            System.out.println("Pirmas skaicius yra didesnis 30");
            System.out.println("Antras skaicius yra mazesnis 30");
        }
        if (numberOne<30 && numberTwo>30){
            System.out.println("Pirmas skaicius yra mazesnis 30");
            System.out.println("Antras skaicius yra didesnis 30");
        }
        if (numberOne==30 && numberTwo==30){
            System.out.println("Abu skaiciai yra lygus 30");
        }
    }
}
