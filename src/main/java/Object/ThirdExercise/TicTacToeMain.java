package Object.ThirdExercise;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeMain {


    public static void main(String[] args) {
        String[][] initial = {{"_", "_", "_"}, {"_", "_", "_"}, {"_", "_", "_"}};

        System.out.println("Pirminis laukas \n");

        for (String[] strings : initial) {
            for (String string : strings) {
                System.out.print(string + "  ");
            }
            System.out.println();
        }
        System.out.println();

        boolean cpuRepeat = true;
        boolean tillVictory = true;


        while (tillVictory) {

            userInput(initial);

            if (getCount(initial) < 1) {
                cpuRepeat = false;
                tillVictory = false;
                System.out.println("ZAIDIMAS BAIGTAS");
            }

            cpuInput(initial, cpuRepeat);

            for (String[] strings : initial) {
                for (String string : strings) {
                    System.out.print(string + "  ");
                }
                System.out.println();
            }

            for (String[] strings : initial) {
                if (strings[0].equals(strings[1]) && strings[1].equals(strings[2])) {
                    if (strings[0].equals("X")) {
                        System.out.println("LAIMEJO ZAIDEJAS!!!");
                        tillVictory = false;
                        break;
                    }
                    if (strings[0].equals("O")) {
                        System.out.println("LAIMEJO KOMPIUTERIS!!!");
                        tillVictory = false;
                        break;
                    }
                }
            }

            for (int columnCheck = 0; columnCheck < initial.length; columnCheck++) {
                if (initial[0][columnCheck].equals(initial[1][columnCheck]) && initial[1][columnCheck].equals(initial[2][columnCheck])) {
                    if (initial[0][columnCheck].equals("X")) {
                        System.out.println("LAIMEJO ZAIDEJAS!!!");
                        tillVictory = false;
                        break;
                    }
                    if (initial[0][columnCheck].equals("O")) {
                        System.out.println("LAIMEJO KOMPIUTERIS!!!");
                        tillVictory = false;
                        break;
                    }
                }
            }

            if (initial[0][0].equals(initial[1][1]) && initial[1][1].equals(initial[2][2])) {
                if (initial[0][0].equals("X")) {
                    System.out.println("LAIMEJO ZAIDEJAS!!!");
                    break;
                }
                if (initial[0][0].equals("O")) {
                    System.out.println("LAIMEJO KOMPIUTERIS!!!");
                    break;
                }
            }
            if (initial[2][0].equals(initial[1][1]) && initial[1][1].equals(initial[0][2])) {
                if (initial[2][0].equals("X")) {
                    System.out.println("LAIMEJO ZAIDEJAS!!!");
                    break;
                }
                if (initial[2][0].equals("O")) {
                    System.out.println("LAIMEJO KOMPIUTERIS!!!");
                    break;
                }
            }
        }
    }

    private static void userInput(String[][] initial) {
        Scanner playerInput = new Scanner(System.in);

        while (true) {
            System.out.println("ZAIDEJO EJIMAS");
            System.out.println("Prasome ivesti eilute, kur desite X");
            int enterRow = playerInput.nextInt() - 1;
            System.out.println("Prasome ivesti stulpeli, kur desite X");
            int enterColumn = playerInput.nextInt() - 1;
            if (enterRow < 3 && enterColumn < 3) {
                if (initial[enterRow][enterColumn].equals("_")) {
                    initial[enterRow][enterColumn] = "X";
                    break;
                }
                System.out.println("Sita vieta jau pazymeta, pasirink kita!");
            } else {
                System.out.println("Blogai ivestos kordinates, pasirink kitas");
            }
        }
    }

    private static int getCount(String[][] initial) {
        int count = 0;
        for (String[] strings : initial) {
            for (String string : strings) {
                if (string.equals("_")) {
                    count++;
                }
            }
        }
        return count;
    }

    private static void cpuInput(String[][] initial, boolean cpuRepeat) {
        Random cpuInput = new Random();
        while (cpuRepeat) {
            int compRow = cpuInput.nextInt(3);
            int compColumn = cpuInput.nextInt(3);
//                System.out.printf("Kompas ivede %s, %s", compRow + 1, compColumn + 1); // KOPIUTERIO SPEJIMU SPAUSDINIMAS
//                System.out.println(" kurio reiškmė buvo: " + intermediate[compRow][compColumn]); // KOPIUTERIO SPEJIMU SPAUSDINIMAS
            if (initial[compRow][compColumn].equals("_")) {
                initial[compRow][compColumn] = "O";
                break;
            }
        }
    }


}
