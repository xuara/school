public class HW9 {
   public static void main(String[] args){
      double a,b,c,d,e,f;
      a=69;
      b=13;
      
      System.out.println("69+13=" + addition(a,b));
      System.out.println("69-13=" + subtraction(a,b));
      System.out.println("69*13=" + multiplication(a,b));
      System.out.println("69/13=" + division(a,b));
   }
   public static double addition(double x, double y) {
      return x+y;
   }
   
   public static double subtraction(double x, double y) {
      return x-y;
   }
   
   public static double multiplication(double x, double y) {
      return x*y;
   }
   
   public static double division(double x, double y) {
      return x/y;
   }
}