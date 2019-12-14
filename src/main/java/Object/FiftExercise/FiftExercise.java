package Object.FiftExercise;

/*Cezario šifras yra pagrindinė šifravimo techniką, kurią naudojo Julijius Cezaris,
        komunikuojant su savo generolais. Kiekviena raidė yra pakeista kita, kuri yra per N
        pozicijų į priekį abėcėlėje. Pavyzdžiui, jei raidės poslinkis būtų 5,
        tai raidė c būtų pakeista raide h, raidė k pakeista į p ir t.t.*/

import java.io.*;

public class FiftExercise {

    private static final String INPUT_FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\JavaCodingExercises\\src\\main\\java\\Object\\FiftExercise\\originalText.txt";
        private static final String OUTPUT_FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\JavaCodingExercises\\src\\main\\java\\Object\\FiftExercise\\codedText.txt";

        public static void main(String[] args) {

            char[] originalText = getCharFromFile();

            System.out.println(originalText);

            char[] codedText = getCodedText(originalText);

            System.out.println(codedText);

            writeCodedTextToFile(codedText);

    }

    private static char[] getCharFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_LOCATION))) {
            String line = br.readLine();
            return line.toCharArray();
        } catch (IOException e) {
            System.out.println("Klaida nuskaitant faila");
        }
        return new char[0];
    }

    private static char[] getCodedText(char[] originalText) {
        char[] codedText = new char[originalText.length];
        for (int i = 0; i < originalText.length; i++) {
            if (originalText[i] == ' ') {
                codedText[i] = ' ';
            }
            else if (originalText[i] == ',') {
                codedText[i] = ',';
            }
            else {
                if (originalText[i]>'u'){
                    codedText[i] = (char) ((originalText[i]-22)+1);
                }else {
                    codedText[i] = (char) (originalText[i] + 5);
                }
            }
        }
        return codedText;
    }

    private static void writeCodedTextToFile(char[]codedText){
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))){
                bw.write(codedText);
                System.out.println("I faila irasyta");
            } catch (IOException e) {
                System.out.println("Klaida irasant i faila");
            }

    }
}
