package Object.ThirdExercise;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeMain {


    public static void main(String[] args) {
        String[][] initial = {{"_", "_", "_"}, {"_", "_", "_"}, {"_", "_", "_"}};

        System.out.println("Pirminis laukas \n");

        for (int row = 0; row < initial.length; row++) {
            for (int colum = 0; colum < initial[row].length; colum++) {
                System.out.print(initial[row][colum] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        Scanner playerInput = new Scanner(System.in);
        Random cpuInput = new Random();

        String[][] intermediate = initial;

        int count = 0;

        Boolean cpuRepeat = true;
        boolean tillVictory = true;

        while (tillVictory) {
            while (true) {
                System.out.println("ZAIDEJO EJIMAS");
                System.out.println("Prasome ivesti eilute, kur desite X");
                int enterRow = playerInput.nextInt() - 1;
                System.out.println("Prasome ivesti stulpeli, kur desite X");
                int enterColumn = playerInput.nextInt() - 1;
                if (enterRow < 3 && enterColumn < 3) {
                    if (intermediate[enterRow][enterColumn].equals("_")) {
                        intermediate[enterRow][enterColumn] = "X";
                        break;
                    }
                    System.out.println("Sita vieta jau pazymeta, pasirink kita!");
                } else {
                    System.out.println("Blogai ivestos kordinates, pasirink kitas");
                }
            }

            for (int breakRow = 0; breakRow < intermediate.length; breakRow++) {
                for (int breakColumn = 0; breakColumn < intermediate[breakRow].length; breakColumn++) {
                    if (intermediate[breakRow][breakColumn].equals("_")) {
                        count++;
                    }
                }
            }
            if (count < 1) {
                cpuRepeat = false;
                tillVictory = false;
                System.out.println("ZAIDIMAS BAIGTAS, NIEKAS NELAIMEJO");
            }
            count = 0;

            while (cpuRepeat) {
                int compRow = cpuInput.nextInt(3);
                int compColumn = cpuInput.nextInt(3);
//                System.out.printf("Kompas ivede %s, %s", compRow + 1, compColumn + 1); // KOPIUTERIO SPEJIMU SPAUSDINIMAS
//                System.out.println(" kurio reiškmė buvo: " + intermediate[compRow][compColumn]); // KOPIUTERIO SPEJIMU SPAUSDINIMAS

                if (intermediate[compRow][compColumn].equals("_")) {
                    intermediate[compRow][compColumn] = "O";
                    break;
                }
            }

            for (int row = 0; row < intermediate.length; row++) {
                for (int colum = 0; colum < intermediate[row].length; colum++) {
                    System.out.print(intermediate[row][colum] + "  ");
                }
                System.out.println();
            }

            for (int rowCheck = 0; rowCheck < intermediate.length; rowCheck++) {
                if (intermediate[rowCheck][0].equals(intermediate[rowCheck][1]) && intermediate[rowCheck][1].equals(intermediate[rowCheck][2])) {
                    if (intermediate[rowCheck][0].equals("X")) {
                        System.out.println("LAIMEJO ZAIDEJAS!!!");
                        tillVictory = false;
                        break;
                    }
                    if (intermediate[rowCheck][0].equals("O")) {
                        System.out.println("LAIMEJO KOMPIUTERIS!!!");
                        tillVictory = false;
                        break;
                    }
                }
            }

            for (int columnCheck = 0; columnCheck < intermediate.length; columnCheck++) {
                if (intermediate[0][columnCheck].equals(intermediate[1][columnCheck]) && intermediate[1][columnCheck].equals(intermediate[2][columnCheck])) {
                    if (intermediate[0][columnCheck].equals("X")) {
                        System.out.println("LAIMEJO ZAIDEJAS!!!");
                        tillVictory = false;
                        break;
                    }
                    if (intermediate[0][columnCheck].equals("O")) {
                        System.out.println("LAIMEJO KOMPIUTERIS!!!");
                        tillVictory = false;
                        break;
                    }
                }
            }

            if (intermediate[0][0].equals(intermediate[1][1]) && intermediate[1][1].equals(intermediate[2][2])){
                if (intermediate[0][0].equals("X")) {
                    System.out.println("LAIMEJO ZAIDEJAS!!!");
                    tillVictory = false;
                    break;
                }
                if (intermediate[0][0].equals("O")) {
                    System.out.println("LAIMEJO KOMPIUTERIS!!!");
                    tillVictory = false;
                    break;
                }
            }
            if (intermediate[2][0].equals(intermediate[1][1]) && intermediate[1][1].equals(intermediate[0][2])){
                if (intermediate[2][0].equals("X")) {
                    System.out.println("LAIMEJO ZAIDEJAS!!!");
                    tillVictory = false;
                    break;
                }
                if (intermediate[2][0].equals("O")) {
                    System.out.println("LAIMEJO KOMPIUTERIS!!!");
                    tillVictory = false;
                    break;
                }
            }
        }
    }
}
