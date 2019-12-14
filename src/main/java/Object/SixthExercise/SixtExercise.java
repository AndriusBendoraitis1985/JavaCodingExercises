package Object.SixthExercise;

public class SixtExercise {
    public static void main(String[] args) {
       //String line = "ABAGTGABA";
        String line = "ABABA";
        //String line = "LABAS";
        char[] input = line.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int max = 0;
        String maxWord="";


        for (int i = 0; i < input.length; i++) {
            stringBuilder.append(input[i]);
            String reverseText = stringBuilder.reverse().toString();
            stringBuilder.reverse();
            System.out.println(stringBuilder);
            System.out.println(reverseText);

            if (stringBuilder.toString().equals(reverseText)) {
                System.out.println("ok");
                if (max<i){
                    max = i;
                    maxWord=stringBuilder.toString();
                }
            }
        } System.out.println(max);
        System.out.println(maxWord);
    }
}

