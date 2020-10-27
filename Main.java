import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean palindrome(String text) {
        String normalText = text;
        String reverseText = "";
        text.length();
        for(int i=0; i<=normalText.length()-1; i++) {
            reverseText = reverseText + (normalText.charAt(i));
            System.out.println(normalText.charAt(i));
        }
        System.out.println(reverseText);
        // write your code here
        if(normalText != reverseText){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}