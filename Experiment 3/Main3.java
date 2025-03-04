import java.util.Scanner;
public class Main3 {
       public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a number");
        int number = reader.nextInt();
        if (number%2==0) {
         System.out.println("given number is an even number");
         }
        else{
        System.out.println("given number is an odd number");
         }
     }
}