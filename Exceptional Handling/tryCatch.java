public class tryCatch{
     public static void main(String[] args){
       try{
         int result = 10/0;
         System.out.println("The result is:"+result);
          }
          catch(ArithmeticException e){
          System.out.println("Exception Caught:"+e.getMessage());
          }
      }
}