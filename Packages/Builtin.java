import java.io.*;      
import java.util.*;    
import java.lang.Math;
public class Builtin {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter your name: ");
        String name = reader.readLine();          
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine()); 

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

       
        double squareRoot = Math.sqrt(randomNumber);
        double power = Math.pow(randomNumber, 2);

        String os = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");

        System.out.println("\nHello, " + name + "!");
        System.out.println("Your Age: " + age);
        System.out.println("Random Number: " + randomNumber);
        System.out.println("Square Root: " + squareRoot);
        System.out.println("Square (Power of 2): " + power);
        System.out.println("\nSystem Info:");
        System.out.println("Operating System: " + os);
        System.out.println("Java Version: " + javaVersion);
    }
}
