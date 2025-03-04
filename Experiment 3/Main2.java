import java.util.Scanner;
public class Main2 {
      public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("enter an year");
        int year = reader.nextInt();
        if (year%4==0){
            if (year%100==0){
              if (year%400==0){
                 System.out.print("year is a leap year");
              } else{
                System.out.print("year is not a leap year");}
             }else{System.out.print("year is a leap year");}
         }else{System.out.print("year is not a leap year");}
      }
}
                                                       