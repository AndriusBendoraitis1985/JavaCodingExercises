package FlowLoopArray;

/*5. Using nested for loops draw (parents loop iterator should be called "row", child – "column"):
        triangle,
        *rectangle with diagonals,
        **Christmas tree.*/

public class FifthExercise {

    public static void main(String[] args) {
        String symbol = "*";
        String space = "     ";


        System.out.println("Printing rectangler \n");

        for (int i = 0; i < 5; i++) {
            for (int x = 0; x < 8; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n Printing triangle \n");

        for (int x = 0; x <=5; x++){

            if (x<5){
            System.out.println(space+symbol);}

            if (x==5){
                System.out.println(symbol);
                break;
            }

            symbol = symbol + "**";
            space = space.substring(0, space.length() - 1);
        }
     }
}
