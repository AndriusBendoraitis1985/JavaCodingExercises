package Object.FourthExercise;

import java.util.Scanner;

public class FourthExercise {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite zodi");
        String text = input.nextLine();

        stringBuilder.append(text);

        String reverseText = stringBuilder.reverse().toString();

        System.out.println("Ivestas zodis yra: " + text);
        System.out.println("Apsuktas zodis yra: " + reverseText);

        if (text.equals(reverseText)) {
            System.out.println("Ivestas zodis yra palindromas");
        }else {
            System.out.println("Ivestas zodis yra NERA palindromas");
        }


    }

}
