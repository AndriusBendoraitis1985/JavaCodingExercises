package FlowLoopArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NinthExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("iveskite masyvo ilgi");
        int x = input.nextInt();

        for (int repeat = 1; repeat <= 5; repeat++) {
            Scanner inputText = new Scanner(System.in);
            Random random = new Random();

            int[] array = new int[x];

            for (int i = 0; i < x; i++) {
                array[i] = random.nextInt(100);
            }
            System.out.println(Arrays.toString(array));

            int maxNum = array[0];
            for (int a = 0; a < x; a++) {
                if (maxNum < array[a]) {
                    maxNum = array[a];
                }
            }
            System.out.printf("didziausia masyvo reiksme yra %s \n", maxNum);

            System.out.println("patvirtinti, kad parinktas skaicius yra didziausias");
            System.out.println(inputText.nextLine());
        }
    }
}
