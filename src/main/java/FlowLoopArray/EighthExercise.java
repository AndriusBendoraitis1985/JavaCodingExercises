package FlowLoopArray;

/*8. Write a simple "echo" application, that will:
        print back entered string,
        go to the beginning of a loop if user will enter "continue",
        break the loop with a "good bye!" message, if user will enter "quit".*/

import java.util.Scanner;

public class EighthExercise {

    public static void main(String[] args) {
        boolean repeat = true;

        while (repeat) {
            StringBuilder stringBuilder = new StringBuilder();

            Scanner input = new Scanner(System.in);
            System.out.println("iveskite zodi");

            stringBuilder.append(input.nextLine());

            String reverseText = stringBuilder.reverse().toString();

            System.out.println(reverseText);

            System.out.println("Do you want continue or quit?");
            String answer = input.nextLine();

            if (answer.equals("quit")) {
                repeat = false;
                System.out.println("good bye!");
            }
        }
    }
}

