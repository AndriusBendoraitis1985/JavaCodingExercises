package FlowLoopArray;

/*4. Write an application that for any entered number between 0 and 9 will provide it's name.
        For example for "3" program should print "three".*/

import java.util.Scanner;

public class FourthExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int number = input.nextInt();

        switch (number){
            case 1:{
                System.out.println("one");
                break;
            }
            case 2:{
                System.out.print("two");
                break;
            }
            case 3:{
                System.out.print("three");
                break;
            }
            case 4:{
                System.out.print("four");
                break;
            }
            case 5:{
                System.out.print("five");
                break;
            }
            case 6:{
                System.out.print("six");
                break;
            }
            case 7:{
                System.out.print("seven");
                break;
            }
            case 8:{
                System.out.print("eigth");
                break;
            }
            case 9:{
                System.out.print("nine");
                break;
            }
        }

    }
}
