package FlowLoopArray;

/*10. Write an application that will find the longest char sequence within an array of type String.
        Test it in the same way as you have done in the previous exercise. How will you generate random char sequences?*/

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TenthExercise {

    public static void main(String[] args) {

        int maxLenth = 1;
        String maxLine = "";

        for (int i = 0; i <3; i++) {
            Random size = new Random();
            int x = size.nextInt(5);
            System.out.println("eilutes ilgis " + (x+1));

            String line = RandomStringUtils.randomAlphabetic(x+1);
            System.out.println("reiksme " + line);
            if (maxLenth<line.length()){
                maxLenth=line.length();
                maxLine = line;
            }
        } System.out.println("Max lenth " +maxLenth);
        System.out.println("Max line " +maxLine);


    }
}
