import java.util.*;

public class Lab09 {
   public static void main(String[] args) {
   
      String sName, sMajor, sCollege;
   
      Scanner s = new Scanner(System.in);
   
      System.out.println("What is your name?");
      sName = s.nextLine();
   
      System.out.println("What is your major?");
      sMajor = s.nextLine();
   
      System.out.println("What is your college?");
      sCollege = s.nextLine();
   
      System.out.print("Your name is " + sName + "\nYour major is " + sMajor + "\nAnd you go to " + 
         sCollege);
   }
}