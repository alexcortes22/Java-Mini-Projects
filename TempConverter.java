
/**
 * Title: TempConverter.java
 * Author: Alex Cortes
 * 
 * Demonstrates the use of primitive types and arithmetic expressions.
 */
import java.util.Scanner;

public class TempConverter
{//-----------------------------------------------------------------
   //  Computes the Fahrenheit equivalent of a specific Celsius
   //  value using the formula F = (9/5)C + 32.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      //constant
      final int BASE = 32;
      final double CONVERSION_FACTOR = (9.0 / 5);
      
      //variables
      double fahrenheitTemp, celsiusTemp;
      
      Scanner scan = new Scanner (System.in);
      
      System.out.println ("Enter Temperature in Celcius: ");
      celsiusTemp = scan.nextFloat();
      
      //calculation
      fahrenheitTemp = CONVERSION_FACTOR * celsiusTemp + BASE;
      
      //result
      System.out.println ("The equivalent temperature in Fahrenheit is " + fahrenheitTemp); 

   }
}