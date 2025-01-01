/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import java.util.InputMismatchException;
import java.util.Scanner;
import static FCDSlib.Utility.*;

/**
 *
 * @author AAMY
 */
public class Read {
    public static boolean ReadBooleanValue()
   {
       boolean BooleanValue ;
       
       Scanner Input = new Scanner(System.in) ;
       
       while(true)
       {
           Input = new Scanner(System.in) ;
           
           try
           {
               BooleanValue = Input.nextBoolean();
               return BooleanValue ;
            }
           
           catch(InputMismatchException e)
           {
               System.out.println("\nINVALID BOOLEAN VALUE");
           }
       }
   }
   
   public static byte ReadByteNumber()
   {
       Scanner Input = new Scanner(System.in) ;
       byte Number ;
      
       while(true)
      {
          Input = new Scanner(System.in) ;
       try
       {
           Number = Input.nextByte();
           return Number ;
       }
       
       catch(InputMismatchException e)
       {
           System.out.println("\nINVALID NUMBER");
          
       }
   }
   }
   public static int ReadIntegerNumber()
   {
       Scanner Input = new Scanner(System.in) ;
       int Number ;
      
       while(true)
      {
          Input = new Scanner(System.in) ;
       try
       {
           Number = Input.nextInt();
           return Number ;
       }
       
       catch(InputMismatchException e)
       {
           System.out.println("\nINVALID NUMBER");
          
       }
   }
   }
   public static long ReadLongNumber()
   {
       Scanner Input = new Scanner(System.in) ;
       long Number ;
      
       while(true)
      {
          Input = new Scanner(System.in) ;
          
       try
       {
           Number = Input.nextLong();
           return Number ;
       }
       
       catch(InputMismatchException e)
       {
           System.out.println("\nINVALID NUMBER");
          
       }
   }
   }
   public static short ReadShortNumber()
   {
       Scanner Input = new Scanner(System.in) ;
       short Number ;
      
       while(true)
      {
          Input = new Scanner(System.in) ;
          
       try
       {
           Number = Input.nextShort();
           return Number ;
       }
       
       catch(InputMismatchException e)
       {
           System.out.println("\nINVALID NUMBER");
          
       }
   }
   }
  
   public static byte ReadBytePositiveNumber()
   {
       
       byte Number = ReadByteNumber() ;
       
       while(Number < 0)
       {
           System.out.println("\nENTER A POSITIVE NUMBER");
           Number = ReadByteNumber();
       }
       
       return Number ;
   }
   public static int ReadIntegerPositiveNumber()
   {
       
       int Number = ReadIntegerNumber() ;
       
       while(Number < 0)
       {
           System.out.println("\nENTER A POSITIVE NUMBER");
           Number = ReadIntegerNumber();
       }
       
       return Number ;
   }
   public static short ReadShortPositiveNumber()
   {
       
       short Number = ReadShortNumber() ;
       
       while(Number < 0)
       {
           System.out.println("\nENTER A POSITIVE NUMBER");
           Number = ReadShortNumber();
       }
       
       return Number ;
   }
   public static Long ReadLongPositiveNumber()
   {
       
       long Number = ReadLongNumber() ;
       
       while(Number < 0)
       {
           System.out.println("\nENTER A POSITIVE NUMBER");
           Number = ReadLongNumber();
       }
       
       return Number ;
   }
   
   public static byte ReadByteNegativeNumber()
   {
       
       byte Number = ReadByteNumber() ;
       
       while(Number > 0)
       {
           System.out.println("\nENTER A NEGATIVE NUMBER");
           Number = ReadByteNumber() ;
       }
       
       return Number ;
   }
   public static int ReadIntegerNegativeNumber()
   {
       
       int Number = ReadIntegerNumber() ;
       
       while(Number > 0)
       {
           System.out.println("\nENTER A NEGATIVE NUMBER");
           Number = ReadIntegerNumber() ;
       }
       
       return Number ;
   }
   public static short ReadShortNegativeNumber()
   {
       
       short Number = ReadShortNumber() ;
       
       while(Number > 0)
       {
           System.out.println("\nENTER A NEGATIVE NUMBER");
           Number = ReadShortNumber() ;
       }
       
       return Number ;
   }
   public static long ReadLongNegativeNumber()
   {
       
       long Number = ReadLongNumber() ;
       
       while(Number > 0)
       {
           System.out.println("\nENTER A NEGATIVE NUMBER");
           Number = ReadLongNumber() ;
       }
       
       return Number ;
   }
   
   public static byte ReadNumberMultipleOf(byte FactorNumber)
   {
       
       byte Number = ReadByteNumber() ;
       
       while(Number % FactorNumber != 0)
       {
           System.out.println("\nENTER A NUMBER MULTIPLE OF " + FactorNumber);
           Number = ReadByteNumber() ;
       }
       
       return Number ;
   }
   public static int ReadNumberMultipleOf(int FactorNumber)
   {
       
       int Number = ReadIntegerNumber() ;
       
       while(Number % FactorNumber != 0)
       {
           System.out.println("\nENTER A NUMBER MULTIPLE OF " + FactorNumber);
           Number = ReadIntegerNumber() ;
       }
       
       return Number ;
   }
   public static short ReadNumberMultipleOf(short FactorNumber)
   {
       
       short Number = ReadShortNumber() ;
       
       while(Number % FactorNumber != 0)
       {
           System.out.println("\nENTER A NUMBER MULTIPLE OF " + FactorNumber);
           Number = ReadShortNumber() ;
       }
       
       return Number ;
   }
   public static long ReadNumberMultipleOf(long FactorNumber)
   {
       
       long Number = ReadLongNumber() ;
       
       while(Number % FactorNumber != 0)
       {
           System.out.println("\nENTER A NUMBER MULTIPLE OF " + FactorNumber);
           Number = ReadLongNumber() ;
       }
       
       return Number ;
   }
   
   public static double ReadDoubleNumber()
   {
       Scanner Input = new Scanner(System.in) ;
       
       double Number ;
       
       while(true)
       {
           
           Input = new Scanner(System.in) ;
           try
           {
               Number = Input.nextDouble();
               return Number ;
           }
           catch(InputMismatchException e)
           {
               System.out.println("\nINVALID NUMBER");
           }
       }
       
   }
   
   public static float ReadFloatNumber()
   {
       Scanner Input = new Scanner(System.in);
       
       float Number ;
       
       while(true)
       {
           Input = new Scanner(System.in) ;
           
           try
           {
               Number = Input.nextFloat();
               return Number ;
           }
           
           catch(InputMismatchException e)
           {
               System.out.println("\nINVALID NUMBER");
           }
       }
   }
   
   public static double ReadDoublePositiveNumber()
   {
       
       double Number = ReadDoubleNumber();
       
       while(Number < 0)
       {
           System.out.println("\nENTER A POSITIVE NUMBER");
           Number = ReadDoubleNumber() ;
       }
       
       return Number ;
   }
   public static float ReadFloatPositiveNumber()
   {
       
       float Number = ReadFloatNumber();
       
       while(Number < 0)
       {
           System.out.println("\nENTER A POSITIVE NUMBER");
           Number = ReadFloatNumber() ;
       }
       
       return Number ;
   }
   
   public static double ReadDoubleNegativeNumber()
   {
       double Number = ReadDoubleNumber() ;
       
       while(Number > 0)
       {
           System.out.println("\nENTER A NEGATIVE NUMBER");
           Number = ReadDoubleNumber() ;
       }
       return Number ;
   } 
   
   public static double ReadFloatNegativeNumber()
   {
       float Number = ReadFloatNumber() ;
       
       while(Number > 0)
       {
           System.out.println("\nENTER A NEGATIVE NUMBER");
           Number = ReadFloatNumber() ;
       }
       return Number ;
   } 
   
   public static byte ValidateNumberInRange(byte From , byte To)
   {
       byte Number = ReadByteNumber() ;
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadByteNumber() ;
       }
       
       return Number ;
   }
   
   public static int ValidateNumberInRange(int From , int To)
   {
       int Number = ReadIntegerNumber() ;
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadIntegerNumber() ;
       }
       
       return Number ;
   }
   public static short ValidateNumberInRange(short From , short To)
   {
       short Number = ReadShortNumber() ;
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadShortNumber() ;
       }
       
       return Number ;
   }
   public static long ValidateNumberInRange(long From , long To)
   {
       long Number = ReadLongNumber() ;
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadLongNumber() ;
       }
       
       return Number ;
   }
   
   public static float ValidateFloatNumberInRange(float From , float To)
   {
       float Number = ReadFloatNumber();
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadFloatNumber() ;
       }
       return Number ;
   }
   public static float ValidateFloatNumberInRange(byte From , byte To)
   {
       float Number = ReadFloatNumber();
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadFloatNumber() ;
       }
       return Number ;
   }
   public static float ValidateFloatNumberInRange(int From , int To)
   {
       float Number = ReadFloatNumber();
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadFloatNumber() ;
       }
       return Number ;
   }
   public static float ValidateFloatNumberInRange(short From , short To)
   {
       float Number = ReadFloatNumber();
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadFloatNumber() ;
       }
       return Number ;
   }
   public static float ValidateFloatNumberInRange(long From , long To)
   {
       float Number = ReadFloatNumber();
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadFloatNumber() ;
       }
       return Number ;
   }
   public static double ValidateDoubleNumberInRange(double From , double To)
   {
       double Number = ReadDoubleNumber();
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadDoubleNumber() ;
       }
       return Number ;
   }
   
   public static double ValidateDoubleNumberInRange(byte From , byte To)
   {
       double Number = ReadDoubleNumber() ;
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]") ;
           Number = ReadDoubleNumber();
       }
       
       return Number ;
   }
   public static double ValidateDoubleNumberInRange(int From , int To)
   {
       double Number = ReadDoubleNumber() ;
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]") ;
           Number = ReadDoubleNumber();
       }
       
       return Number ;
   }
   
   public static double ValidateDoubleNumberInRange(short From , short To)
   {
       double Number = ReadDoubleNumber() ;
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]") ;
           Number = ReadDoubleNumber();
       }
       
       return Number ;
   }
   
   public static double ValidateDoubleNumberInRange(long From , long To)
   {
       double Number = ReadDoubleNumber() ;
       
       while(Number < From || Number > To)
       {
           System.out.println("\nENTER A NUMBER BETWEEN [" + From + " & " + To + "]") ;
           Number = ReadDoubleNumber();
       }
       
       return Number ;
   }
   
   public static String ReadString()
   {
       Scanner Input = new Scanner(System.in) ;
       
       String StringWord ;
       
       StringWord = Input.next() ;
       
       return StringWord ;
   }
   
   public static String ReadStringLine()
   {
       Scanner Input = new Scanner(System.in) ;
       
       String StringLine ;
       
       StringLine = Input.nextLine();
       
       
       return StringLine ;
   }
   
   public static char ReadCharacter()
   {
       Scanner Input = new Scanner(System.in) ;
       
       char Character = Input.next().charAt(0) ;
       
       return Character ;
   }
   
   public static char ReadArithmeticOperator()
   {
       
       char  ArithmeticOperator = ReadCharacter() ;
       
       while(ArithmeticOperator != '+' &&  ArithmeticOperator != '-' &&  ArithmeticOperator != '/' &&  ArithmeticOperator != '*' &&  ArithmeticOperator != '%')
       {
           System.out.println("\nENTER ARITHMETIC OPERATOR [+ , - , * , / , %]");
           ArithmeticOperator = ReadCharacter() ;
       }
       
       return  ArithmeticOperator ;
   }
   
   public static String ReadPhoneNumber()
   {
       
       String PhoneNumber ;
       
       do
       {
           PhoneNumber = ReadStringLine() ;
       }while(!IsPhoneNumber(PhoneNumber));
       
       return PhoneNumber ;
   }
   
   public static String ReadPhoneKey()
   {
     String PhoneKey ;
     
     do
     {
         PhoneKey = ReadStringLine() ;
     }while(!IsPhoneKey(PhoneKey));
     
     return PhoneKey ; 
   }
   
   public static String ReadFullPhoneNumber()
   {
       String PhoneKey = ReadPhoneKey() ;
       String PhoneNumber = ReadPhoneNumber() ;
       
       return PhoneKey + PhoneNumber ;
   }
   
   public static String ReadEmailAddress()
   {
       String EmailAddress ;
       
       do
       {
           EmailAddress = ReadStringLine() ;
       }while(!IsEmailAddress(EmailAddress));
       
       return EmailAddress ;
   }
    
   public static String ReadFilteredString(String Pollutant)
   {
       String FilteredString ;
       
        FilteredString = ReadString();
       
       while(FilteredString.contains(Pollutant))
       {
           System.out.println("\nINVALID STRING , YOU CAN'T ENTER STRING CONTAINS \"" + Pollutant + "\"");
           FilteredString = ReadString() ;
       }
       
       return FilteredString ;
   }
   
   public static String ReadFilteredStringLine(String Pollutant)
   {
       String FilteredStringLine ;
       
       FilteredStringLine = ReadStringLine();
       
       while(FilteredStringLine.contains(Pollutant))
       {
           System.out.println("\nINVALID STRING , YOU CAN'T ENTER STRING CONTAINS \"" + Pollutant + "\"");
           FilteredStringLine = ReadStringLine() ;
       }
       
       return FilteredStringLine ;
   }
   
   public static boolean ReadBooleanValue(String Message)
   {
       Scanner Input = new Scanner(System.in) ;
       
       boolean BooleanValue ;
       
       while(true)
       {
           Input = new Scanner(System.in) ;
           
           try
           {
               System.out.println("\n" + Message);
               BooleanValue = Input.nextBoolean();
               return BooleanValue ;
           }
           
           catch(InputMismatchException e)
           {
               System.out.println("\nINVALID BOOLEAN VALUE");
           }
       }
   }
   
   public static byte ReadByteNumber(String Message)
   {
       Scanner Input = new Scanner(System.in) ;
       
       byte Number ;
       
       while(true)
       {
           Input = new Scanner(System.in) ;
           
           try
           {
               System.out.println("\n" + Message);
               Number = Input.nextByte() ;
               return Number ;
           }
           
           catch(InputMismatchException e)
           {
               System.out.println("\nINVALID NUMBER");
               
           }
       }
   }
   public static int ReadIntegerNumber(String Message)
   {
       Scanner Input = new Scanner(System.in) ;
       
       int Number ;
       
       while(true)
       {
           Input = new Scanner(System.in) ;
           
           try
           {
               System.out.println("\n" + Message);
               Number = Input.nextInt() ;
               return Number ;
           }
           
           catch(InputMismatchException e)
           {
               System.out.println("\nINVALID NUMBER");
               
           }
       }
   }
   public static short ReadShortNumber(String Message)
   {
       Scanner Input = new Scanner(System.in) ;
       
       short Number ;
       
       while(true)
       {
           Input = new Scanner(System.in) ;
           
           try
           {
               System.out.println("\n" + Message);
               Number = Input.nextShort() ;
               return Number ;
           }
           
           catch(InputMismatchException e)
           {
               System.out.println("\nINVALID NUMBER");
               
           }
       }
   }
   public static long ReadLongNumber(String Message)
   {
       Scanner Input = new Scanner(System.in) ;
       
       long Number ;
       
       while(true)
       {
           Input = new Scanner(System.in) ;
           
           try
           {
               System.out.println("\n" + Message);
               Number = Input.nextLong() ;
               return Number ;
           }
           
           catch(InputMismatchException e)
           {
               System.out.println("\nINVALID NUMBER");
               
           }
       }
   }
   
   public static byte ReadBytePositiveNumber(String Message)
   {
       byte Number = ReadByteNumber(Message) ;
       
       while(Number < 0)
       {
           Number = ReadByteNumber("ENTER A POSITIVE NUMBER , " + Message);
       }
       
       return Number ;
   }
   public static int ReadIntegerPositiveNumber(String Message)
   {
       int Number = ReadIntegerNumber(Message) ;
       
       while(Number < 0)
       {
           Number = ReadIntegerNumber("ENTER A POSITIVE NUMBER , " + Message);
       }
       
       return Number ;
   }
   
   public static short ReadShortPositiveNumber(String Message)
   {
       short Number = ReadShortNumber(Message) ;
       
       while(Number < 0)
       {
           Number = ReadShortNumber("ENTER A POSITIVE NUMBER , " + Message);
       }
       
       return Number ;
   }
   
   public static Long ReadLongPositiveNumber(String Message)
   {
       long Number = ReadLongNumber(Message) ;
       
       while(Number < 0)
       {
           Number = ReadLongNumber("ENTER A POSITIVE NUMBER , " + Message);
       }
       
       return Number ;
   }
   
   public static byte ReadByteNegativeNumber(String Message)
   {
       byte Number = ReadByteNumber(Message) ;
       
       while(Number > 0)
       {
           Number = ReadByteNumber("ENTER A NEGATIVE NUMBER , " + Message) ;
       }
       
       return Number ;
   }
   public static int ReadIntegerNegativeNumber(String Message)
   {
       int Number = ReadIntegerNumber(Message) ;
       
       while(Number > 0)
       {
           Number = ReadIntegerNumber("ENTER A NEGATIVE NUMBER , " + Message) ;
       }
       
       return Number ;
   }
   
   public static short ReadShortNegativeNumber(String Message)
   {
       short Number = ReadShortNumber(Message) ;
       
       while(Number > 0)
       {
           Number = ReadShortNumber("ENTER A NEGATIVE NUMBER , " + Message) ;
       }
       
       return Number ;
   }
   
   public static long ReadLongNegativeNumber(String Message)
   {
       long Number = ReadLongNumber(Message) ;
       
       while(Number > 0)
       {
           Number = ReadLongNumber("ENTER A NEGATIVE NUMBER , " + Message) ;
       }
       
       return Number ;
   }
   
   public static byte ReadNumberMultipleOf(String Message , byte FactorNumber)
   {
       byte Number = ReadByteNumber(Message) ;
       
       while(Number % FactorNumber != 0)
       {
            Number = ReadByteNumber("ENTER A NUMBER MULTIPLE OF " + FactorNumber + " , " + Message) ;
       }
       
       return Number ;
   }
   public static int ReadNumberMultipleOf(String Message , int FactorNumber)
   {
       int Number = ReadIntegerNumber(Message) ;
       
       while(Number % FactorNumber != 0)
       {
            Number = ReadIntegerNumber("ENTER A NUMBER MULTIPLE OF " + FactorNumber + " , " + Message) ;
       }
       
       return Number ;
   }
   public static short ReadNumberMultipleOf(String Message , short FactorNumber)
   {
       short Number = ReadShortNumber(Message) ;
       
       while(Number % FactorNumber != 0)
       {
            Number = ReadShortNumber("ENTER A NUMBER MULTIPLE OF " + FactorNumber + " , " + Message) ;
       }
       
       return Number ;
   }
   public static long ReadNumberMultipleOf(String Message , long FactorNumber)
   {
       long Number = ReadLongNumber(Message) ;
       
       while(Number % FactorNumber != 0)
       {
            Number = ReadIntegerNumber("ENTER A NUMBER MULTIPLE OF " + FactorNumber + " , " + Message) ;
       }
       
       return Number ;
   }
   
   public static float ReadFloatNumber(String Message)
   {
       Scanner Input = new Scanner(System.in) ;
       
       float Number ;
       
       while(true)
       {
           Input = new Scanner(System.in) ;
           
           try
           {
               System.out.println("\n" + Message);
               Number = Input.nextFloat() ;
               return Number ;
           }
           
           catch(InputMismatchException e)
           {
               System.out.println("\nINVALID NUMBER");
           }
       }
   }
   
   public static double ReadDoubleNumber(String Message)
   {
       Scanner Input = new Scanner(System.in) ;
       
       double Number ;
       
       while(true)
       {
           Input = new Scanner(System.in) ;
           
          try
          {
              System.out.println("\n" + Message);
              Number = Input.nextDouble();
              return Number ;
          }
          
          catch(InputMismatchException e)
          {
              System.out.println("\nINVALID NUMBER");
          }
       }
   }
   
   public static float ReadFloatPositiveNumber(String Message)
   {
       float Number = ReadFloatNumber(Message) ;
       
       while(Number < 0)
       {
           Number = ReadFloatNumber("ENTER A POSITIVE NUMBER , " + Message);
       }
       
       return Number ;
   }
   
   public static float ReadFloatNegativeNumber(String Message)
   {
       float Number = ReadFloatNumber(Message) ;
       
       while(Number > 0)
       {
           Number = ReadFloatNumber("ENTER A NEGATIVE NUMBER , " + Message) ;
       }
       
       return Number ;
   }
   public static double ReadDoublePositiveNumber(String Message)
   {
       double Number = ReadDoubleNumber(Message) ;
       
       while(Number < 0)
       {
           Number = ReadDoubleNumber("ENTER A POSITIVE NUMBER , " + Message);
       }
       
       return Number ;
   }
   
   public static double ReadDoubleNegativeNumber(String Message)
   {
       double Number = ReadDoubleNumber(Message) ;
       
       while(Number > 0)
       {
           Number = ReadDoubleNumber("ENTER A NEGATIVE NUMBER , " + Message) ;
       }
       
       return Number ;
   }
   
   public static byte ValidateNumberInRange(byte From , byte To , String Message)
   {
       byte Number = ReadByteNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadByteNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       
       return Number ;
   }
   public static int ValidateNumberInRange(int From , int To , String Message)
   {
       int Number = ReadIntegerNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadIntegerNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       
       return Number ;
   }
   
   public static long ValidateNumberInRange(long From , long To , String Message)
   {
       long Number = ReadLongNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadLongNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       
       return Number ;
   }
   
   public static short ValidateNumberInRange(short From , short To , String Message)
   {
       short Number = ReadShortNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadShortNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       
       return Number ;
   }
   
   public static double ValidateDoubleNumberInRange(byte From , byte To , String Message)
   {
       double Number = ReadDoubleNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadDoubleNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       return Number ;
   }
   public static double ValidateDoubleNumberInRange(int From , int To , String Message)
   {
       double Number = ReadDoubleNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadDoubleNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       return Number ;
   }
   public static double ValidateDoubleNumberInRange(short From , short To , String Message)
   {
       double Number = ReadDoubleNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadDoubleNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       return Number ;
   }
   public static double ValidateDoubleNumberInRange(long From , long To , String Message)
   {
       double Number = ReadDoubleNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadDoubleNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       return Number ;
   }
   
   public static float ValidateFloatNumberInRange(float From , float To , String Message)
   {
       float Number = ReadFloatNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadFloatNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]\n" + Message) ;  
       }
            
       return Number ;
   }
   public static float ValidateFloatNumberInRange(byte From , byte To , String Message)
   {
       float Number = ReadFloatNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadFloatNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]\n" + Message) ;  
       }
            
       return Number ;
   }
   public static float ValidateFloatNumberInRange(int From , int To , String Message)
   {
       float Number = ReadFloatNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadFloatNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]\n" + Message) ;  
       }
            
       return Number ;
   }
   public static float ValidateFloatNumberInRange(short From , short To , String Message)
   {
       float Number = ReadFloatNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadFloatNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]\n" + Message) ;  
       }
            
       return Number ;
   }
   public static float ValidateFloatNumberInRange(long From , long To , String Message)
   {
       float Number = ReadFloatNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadFloatNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]\n" + Message) ;  
       }
            
       return Number ;
   }
   public static double ValidateDoubleNumberInRange(double From , double To , String Message)
   {
       double Number = ReadDoubleNumber(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadDoubleNumber("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]\n" + Message) ;  
       }
            
       return Number ;
   }
   
   public static String ReadString(String Message)
   {
       Scanner Input = new Scanner (System.in) ;
       
       String StringWord ;
       
       System.out.println("\n" + Message);
       StringWord = Input.next() ;
       
       return StringWord ;
   }
   
   public static String ReadStringLine(String Message)
   {
       Scanner Input = new Scanner(System.in) ;
       
       String StringLine ;
       
       System.out.println("\n" + Message);
       StringLine = Input.nextLine();
       
       return StringLine ;
   }
   
   public static char ReadCharacter(String Message)
   {
       Scanner Input = new Scanner(System.in) ;
       
       char Character ;
       
       System.out.println("\n" + Message);
       Character = Input.next().charAt(0) ;
       
       return Character ;
   }
   
   public static char ReadArithmeticOperator(String Message)
   {
       char ArithmeticOperator = ReadCharacter(Message) ;
       
       while(ArithmeticOperator != '+' &&  ArithmeticOperator!= '-' &&  ArithmeticOperator != '/' &&  ArithmeticOperator != '*' &&  ArithmeticOperator != '%')
       {
           ArithmeticOperator = ReadCharacter("ENTER ARITHMETIC OPERATOR [+ , - , * , / , %] , " + Message) ;
       }
       
       return  ArithmeticOperator ;
   }
   
   public static String ReadPhoneKey(String Message)
   {
       String PhoneKey ;
       
       do
       {
           PhoneKey = ReadStringLine(Message); 
       }while(!IsPhoneKey(PhoneKey));
       
       return PhoneKey ;
   }
   
   public static String ReadPhoneNumber(String Message)
   {
       String PhoneNumber ;
       
       do
       {
           PhoneNumber = ReadStringLine(Message) ;
       }while(!IsPhoneNumber(PhoneNumber));
       
       return PhoneNumber ;
   }
   
   public static String ReadFullPhoneNumber(String PhoneKeyMessage , String PhoneNumberMessage)
   {
       String PhoneKey , PhoneNumber ;
       
       PhoneKey = ReadPhoneKey(PhoneKeyMessage);
       PhoneNumber = ReadPhoneNumber(PhoneNumberMessage) ;
       
       return PhoneKey + PhoneNumber ;
   }
   
   public static String ReadEmailAddress(String Message)
   {
       String EmailAddress ;
       
       do
       {
           EmailAddress = ReadStringLine(Message) ;
       }while(!IsEmailAddress(EmailAddress));
       
       return EmailAddress ;
   }
   
   public static String ReadFilteredString(String Message , String Pollutant)
   {
       String StringWord = ReadString(Message) ;
       
       while(StringWord.contains(Pollutant))
       {
           StringWord = ReadString("INVALID STRING , YOU CAN'T ENTER STRING CONTAINS \"" + Pollutant + "\"\n" + Message) ;
       }
       
       return StringWord ;
   }
   
   public static String ReadFilteredStringLine(String Message , String Pollutant)
   {
       String StringLine = ReadStringLine(Message) ;
       
       while(StringLine.contains(Pollutant))
       {
           StringLine = ReadStringLine("INVALID STRING , YOU CAN'T ENTER STRING CONTAINS \"" + Pollutant + "\"\n" + Message) ;
       }
       
       return StringLine ;
   }
}
