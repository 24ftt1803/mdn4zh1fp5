import java.util.Scanner;

public class WordsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first words: ");
        String first = input.next();

        System.out.println("Enter the second words: ");
        String second = input.next();

        boolean same = first.equalsIgnoreCase(second);

        System.out.println("Are both words the same? " +  same);

        input.close();

    }
}
