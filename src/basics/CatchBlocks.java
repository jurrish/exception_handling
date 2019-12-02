package basics;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CatchBlocks
{
    public static void main(String[] args)
    {
     try
     {
         Scanner console = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int number  = console.nextInt();
     }
//     catch(InputMismatchException ex)
//     {
//         System.out.println("Please enter a valid integer");
//     }
//     catch(NoSuchElementException ex)
//     {
//         System.out.println("Thiswillneverhappen");
//     }
//     catch(IllegalStateException ex)
//     {
//         System.out.println("dont close your scanner and then try to use it");
//     }

        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
