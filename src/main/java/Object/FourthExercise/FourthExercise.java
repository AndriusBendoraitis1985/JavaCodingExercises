package Object.FourthExercise;

/*Parašyti programą, kuri pasakytų ar žodis yra palindromas ar ne.
        Palindromas yra žodis ar raidžių kratinys, kuris skaitomas vienodai tiek apsukus,
        tiek neapsukus žodžio. Pvz.: abcba - palindromas.*/

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
