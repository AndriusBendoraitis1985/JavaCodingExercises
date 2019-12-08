package FlowLoopArray;

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

