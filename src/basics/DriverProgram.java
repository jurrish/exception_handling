//package basics;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class DriverProgram
//{
//    private static Scanner console = new Scanner(System.in);
//    public static void main(String[] args)
//    {
//        double numerator = getDoubleFromConsole();
//        double denominator = getDoubleFromConsole();
//
//        try
//        {
//            System.out.println(Calculator.divide(numerator, denominator));
//        }
//        catch(Exception ex)
//        {
//            System.out.println("error occurred");
//        }
//    }
//
//    public static double getDoubleFromConsole()
//    {
//        double number = 0;
//        boolean badInput = true;
//
//        while(badInput)
//        {
//            try
//            {
//                System.out.println("enter a number: ");
//                number = console.nextDouble();
//                console.nextLine();
//                badInput = false;
//            }
//            catch(InputMismatchException ex)
//            {
//                console.nextLine();
//                System.out.println("User input not recognized as a number");
//            }
//        }
//
//
//        return number;
//    }
//}
