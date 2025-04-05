public class Finally{
   public static void main(String[] agrs){
      try{
         int[] arr = new int[3];
         System.out.println(arr[5]);
         }
         catch (ArrayIndexOutOfBoundsException e){
              System.out.println("Array index out of bounds!");
         }
      finally{
          System.out.println("This block always executes.");
              }
         }
}