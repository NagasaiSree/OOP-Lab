import java.util.Scanner;
public class Main1 {
     public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       System.out.print("enter a number ");
       int number = reader.nextInt();
       System.out.print("enter another number");
       int number2 = reader.nextInt();
       int sum = number + number2;
       System.out.println("sum of entered numbers" + sum);    
        }
}

       
