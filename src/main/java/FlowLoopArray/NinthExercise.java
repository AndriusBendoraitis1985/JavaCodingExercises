package FlowLoopArray;

/*9. Write an application that will find biggest value within array of int variables.
*
* check your application using randomly generated array (use Random class),
check your application at least 5 times in a loop (generate random array ->
* print array to the console -> find biggest value -> print biggest value -> manually verify results).
*/

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
