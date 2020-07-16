package july;

import java.util.Scanner;

public class jul {

   public static void main(String args[])
   {
      int counter, num, item, array[], first, last, middle;
      Scanner scan = new Scanner(System.in);
      System.out.println("enter number of elements");
      num = scan.nextInt(); 
      array = new int[num];

      System.out.println("enter elements");
      for (counter = 0; counter < num; counter++)
          array[counter] = scan.nextInt();

      System.out.println("enter search element ");
      item = scan.nextInt();
      first = 0;
      last = num - 1;
      middle = (first + last)/2;

      while( first <= last )
      {
         if ( array[middle] < item )
           first = middle + 1;
         else if ( array[middle] == item )
         {
           System.out.println(item + " found at location" + (middle + 1) + ".");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " not found.\n");
   }
}