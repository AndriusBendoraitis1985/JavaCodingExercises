package Object.SixthExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SixtExercise {

    private static final String READ_FROM_FILE = "C:\\Users\\Vartotojas\\IdeaProjects\\JavaCodingExercises\\src\\main\\java\\Object\\SixthExercise\\input.txt";
    private static final String WRITE_TO_FILE = "C:\\Users\\Vartotojas\\IdeaProjects\\JavaCodingExercises\\src\\main\\java\\Object\\SixthExercise\\output.txt";

    public static void main(String[] args) {

        List<Input> inputList = getCharFromFile();

        for (Input input: inputList){
            getLongestPalindrome(input.getInput());
            System.out.println(getLongestPalindrome(input.getInput()));
        }
    }

    private static String getLongestPalindrome(char[] input){
        String maxWord = "";
        int maxWordLenth=0;

        for (int j = 0; j < input.length-1; j++) {
            StringBuilder stringBuilder = new StringBuilder(input[j]);
            for (int i = j; i < input.length; i++) {
                stringBuilder.append(input[i]);
                String reverseText = stringBuilder.reverse().toString();
                stringBuilder.reverse();

                if (stringBuilder.toString().equals(reverseText)) {
                    if (maxWordLenth<stringBuilder.toString().length()) {
                        maxWordLenth=stringBuilder.toString().length();
                        maxWord = stringBuilder.toString();
                    }
                }
            }
        }
        return maxWord;
    }

    private static List<Input> getCharFromFile (){
        List<Input> inputList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(READ_FROM_FILE))){
            String line = "";

            while (line != null){
                line = br.readLine();
                if (line == null){
                    break;
                }
                char [] inputWord = line.toCharArray();
                inputList.add(mapWordDataToObject(inputWord));
            }
        } catch (IOException e){
            System.out.println("Klaida nuskaitant faila");
        }
        return inputList;
    }
    private static Input mapWordDataToObject(char[] wordData){
        return new Input(wordData);
    }
}

