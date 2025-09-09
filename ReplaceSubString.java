import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your message: ");
        String message = input.nextLine();

        System.out.println("Enter the substring to replace: ");
        String toReplace = input.nextLine();

        System.out.println("Enter the replacement string: ");
        String replacement = input.nextLine();

        String updatedMessage = message.replace(toReplace, replacement);

        System.out.println("The updated message is:");
        System.out.println(updatedMessage);

        input.close();


    }
}
