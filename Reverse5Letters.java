import java.util.Scanner;

public class Reverse5Letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 5 letters word: ");
        String word = input.next();

        if (word.length() == 5) {
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }

            System.out.println("The reverse of the word " + word + " is " + reverse);
        } else {
            System.out.println("Error: You must enter exactly 5 letters!");
        }

        input.close();
        }
            
        }
