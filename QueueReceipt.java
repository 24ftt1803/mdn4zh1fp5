import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine().toUpperCase(); 

        Random rand = new Random();
        int queueNum = rand.nextInt(900) + 100;

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        File folder = new File("Practical 5");
        if (!folder.exists()) {
            folder.mkdir();
        }

        File file = new File(folder, "QReceipt.txt");
        FileWriter writer = new FileWriter(file, true);

        writer.write("Date/Time: " + dtf.format(now) + "\r\n");
        writer.write("WELCOME " + name + "\r\n");
        writer.write("Your queue number is: " + queueNum + "\r\n");
        writer.write("---------------------------------\r\n");
        writer.close();

        System.out.println("Receipt generated. Thank you.");

        input.close();
    }
}
