package Object.SixthExercise;

public class Palindrome {
    private String longestPalindorme;

    public Palindrome (String longestPalindorme){
        this.longestPalindorme = longestPalindorme;
    }

    public String getLongestPalindorme() {
        return longestPalindorme;
    }

    public String toString(){
        return String.format(longestPalindorme);
    }

}
