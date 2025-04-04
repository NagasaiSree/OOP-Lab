import java.io.*;      
import java.util.*;   
import java.lang.Math; 
public class DataProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Random random = new Random();
        int randomNumber = random.nextInt(100); // Random number between 0-99

        double squareRoot = Math.sqrt(randomNumber);
        double power = Math.pow(randomNumber, 2);

       
        String filename = "output.txt";
        String data = "Name: " + name + "\nRandom Number: " + randomNumber +
                      "\nSquare Root: " + squareRoot + "\nSquare (Power of 2): " + power;

         try (FileWriter writer = new FileWriter(filename)) {
            writer.write(data);
            System.out.println("\nData written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        scanner.close();
    }
}
