import java.util.Scanner;
public class Main5 {
 public static void main(String[] args){
  Scanner reader = new Scanner(System.in);
  System.out.print("enter the exponent");
  int exponent = reader.nextInt();
  System.out.print("enter the base");
  int base = reader.nextInt();
  int result=1;
  while (exponent !=0) {
   result *= base;
    exponent--;
   }
  System.out.println("Answer =" + result);
 }
}