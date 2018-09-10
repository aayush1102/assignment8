import java.util.*;

class vowels

{

   public static void main(String args[])

   {

       String curr,rem;

       Scanner scan=new Scanner(System.in);

       System.out.print("Enter a String ");

       curr = scan.nextLine();

       rem=curr.replaceAll("[aeiouAEIOU]", "");

       System.out.print(rem);

   }

}