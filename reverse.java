import java.util.*;

class rev

{

   public static void main(String args[])

   {

      String current,rev="";

      Scanner s = new Scanner(System.in);

      System.out.println("Enter a string");

      current=s.nextLine();

      int length=current.length();

      for(int i=length-1;i>=0;i--)

        rev=rev+current.charAt(i);

      System.out.println("Reverse of string is "+rev);

   }

}