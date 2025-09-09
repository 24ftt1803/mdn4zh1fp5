import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();

        int num1 = rand.nextInt(100) + 1; 
        int num2 = rand.nextInt(99) + 1;  

        String question = num1 + " % " + num2 + " = ?";

        File folder = new File("Practical 5");
        if (!folder.exists()) {
            folder.mkdir();
        }

        File file = new File(folder, "Modulus Questions.txt");
        FileWriter writer = new FileWriter(file, true); 
        writer.write(question + "\r\n"); 
        writer.close();

        System.out.println("A new question added");
    }
}
