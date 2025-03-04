import java.util.Scanner;
public class Main4 {
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    System.out.println("enter a number");
    int num = reader.nextInt();
    int factorial = 1;
    int i=1;
    while(i <= num)
    {
     factorial *= i;
     i++;
     }
     System.out.println("factorial of "+num+": "+factorial);
   }
}
