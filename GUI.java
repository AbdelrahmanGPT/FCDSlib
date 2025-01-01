/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import javax.swing.JOptionPane;
import static FCDSlib.Utility.* ;

/**
 *
 * @author AAMY
 */
public class GUI {
    public static void PrintGUI(String Message)
   {
       JOptionPane.showMessageDialog(null, Message);
   }
   
   public static String InputGUI(String Message)
   {
       return JOptionPane.showInputDialog(Message) ;
   }
   
   public static boolean ReadBooleanValueGUI()
   {
       boolean BooleanValue ; 
       
       return Boolean.parseBoolean(InputGUI("")) ;
   }
   
   public static byte ReadByteNumberGUI()
   {
       byte Number ;
       
       while(true)
       {
           try
           {
               Number = Byte.parseByte(InputGUI(""));
               return Number ;
           }
           
           catch(NumberFormatException e)
           {
               PrintGUI("INVALID NUMBER");
           }
       }
       
   }
   public static short ReadShortNumberGUI()
   {
       short Number ;
       
       while(true)
       {
           try
           {
               Number = Short.parseShort(InputGUI(""));
               return Number ;
           }
           
           catch(NumberFormatException e)
           {
               PrintGUI("INVALID NUMBER");
           }
       }
       
   }
   public static int ReadIntegerNumberGUI()
   {
       int Number ;
       
       while(true)
       {
           try
           {
               Number = Integer.parseInt(InputGUI(""));
               return Number ;
           }
           
           catch(NumberFormatException e)
           {
               PrintGUI("INVALID NUMBER");
           }
       }
       
   }
   public static long ReadLongNumberGUI()
   {
       long Number ;
       
       while(true)
       {
           try
           {
               Number = Long.parseLong(InputGUI(""));
               return Number ;
           }
           
           catch(NumberFormatException e)
           {
               PrintGUI("INVALID NUMBER");
           }
       }
       
   }
   
   public static double ReadDoubleNumberGUI()
   {
       double Number ;
       
       while(true)
       {
           try
           {
               Number = Double.parseDouble(InputGUI("")) ;
               return Number ;
           }
           catch(NumberFormatException e)
           {
               PrintGUI("INVALID NUMBER");
           }
       }
   }
   
   public static float ReadFloatNumberGUI()
   {
       float Number ;
       
       while(true)
       {
           try
           {
               Number = Float.parseFloat(InputGUI("")) ;
               return Number ;
           }
           
           catch(NumberFormatException e)
           {
               PrintGUI("INVALID NUMBER");
           }
       }
   }
   
   public static String ReadStringGUI()
   {
       String StringLine ;
       
       StringLine = InputGUI("") ;
       
       return StringLine ;
   }
   
   public static int ReadIntegerPositiveNumberGUI()
   {
       
       int Number = ReadIntegerNumberGUI() ;
       
       while(Number < 0)
       {
           PrintGUI("ENTER A POSITIVE NUMBER");
           Number = ReadIntegerNumberGUI();
       }
       
       return Number ;
   }
   
   public static int ReadIntegerNegativeNumberGUI()
   {
       
       int Number = ReadIntegerNumberGUI() ;
       
       while(Number > 0)
       {
           PrintGUI("ENTER A NEGATIVE NUMBER");
           Number = ReadIntegerNumberGUI() ;
       }
       
       return Number ;
   }
   
   public static int ReadIntegerNumberMultipleOfGUI(int FactorNumber)
   {
       
       int Number = ReadIntegerNumberGUI() ;
       
       while(Number % FactorNumber != 0)
       {
           PrintGUI("ENTER A NUMBER MULTIPLE OF " + FactorNumber);
           Number = ReadIntegerNumberGUI() ;
       }
       
       return Number ;
   }
   
   public static byte ReadBytePositiveNumberGUI()
   {
       
       byte Number = ReadByteNumberGUI() ;
       
       while(Number < 0)
       {
           PrintGUI("ENTER A POSITIVE NUMBER");
           Number = ReadByteNumberGUI();
       }
       
       return Number ;
   }
   
   public static byte ReadByteNegativeNumberGUI()
   {
       
       byte Number = ReadByteNumberGUI() ;
       
       while(Number > 0)
       {
           PrintGUI("ENTER A NEGATIVE NUMBER");
           Number = ReadByteNumberGUI() ;
       }
       
       return Number ;
   }
   
   public static byte ReadByteNumberMultipleOfGUI(byte FactorNumber)
   {
       
       byte Number = ReadByteNumberGUI() ;
       
       while(Number % FactorNumber != 0)
       {
           PrintGUI("ENTER A NUMBER MULTIPLE OF " + FactorNumber);
           Number = ReadByteNumberGUI() ;
       }
       
       return Number ;
   }
   
   public static Short ReadShortPositiveNumberGUI()
   {
       
       short Number = ReadShortNumberGUI() ;
       
       while(Number < 0)
       {
           PrintGUI("ENTER A POSITIVE NUMBER");
           Number = ReadShortNumberGUI();
       }
       
       return Number ;
   }
   
   public static short ReadShortNegativeNumberGUI()
   {
       
       short Number = ReadShortNumberGUI() ;
       
       while(Number > 0)
       {
           PrintGUI("ENTER A NEGATIVE NUMBER");
           Number = ReadShortNumberGUI() ;
       }
       
       return Number ;
   }
   
   public static short ReadShortNumberMultipleOfGUI(short FactorNumber)
   {
       
       short Number = ReadShortNumberGUI() ;
       
       while(Number % FactorNumber != 0)
       {
           PrintGUI("ENTER A NUMBER MULTIPLE OF " + FactorNumber);
           Number = ReadShortNumberGUI() ;
       }
       
       return Number ;
   }
   
   public static long ReadLongPositiveNumberGUI()
   {
       
       long Number = ReadLongNumberGUI() ;
       
       while(Number < 0)
       {
           PrintGUI("ENTER A POSITIVE NUMBER");
           Number = ReadLongNumberGUI();
       }
       
       return Number ;
   }
   
   public static long ReadLongNegativeNumberGUI()
   {
       
       long Number = ReadLongNumberGUI() ;
       
       while(Number > 0)
       {
           PrintGUI("ENTER A NEGATIVE NUMBER");
           Number = ReadLongNumberGUI() ;
       }
       
       return Number ;
   }
   
   public static long ReadLongNumberMultipleOfGUI(long FactorNumber)
   {
       
       long Number = ReadLongNumberGUI() ;
       
       while(Number % FactorNumber != 0)
       {
           PrintGUI("ENTER A NUMBER MULTIPLE OF " + FactorNumber);
           Number = ReadLongNumberGUI() ;
       }
       
       return Number ;
   }
   
   public static float ReadFloatPositiveNumberGUI()
   {
       
       float Number = ReadFloatNumberGUI();
       
       while(Number < 0)
       {
           PrintGUI("\nENTER A POSITIVE NUMBER");
           Number = ReadFloatNumberGUI() ;
       }
       
       return Number ;
   }
   
   public static double ReadFloatNegativeNumberGUI()
   {
       float Number = ReadFloatNumberGUI() ;
       
       while(Number > 0)
       {
           PrintGUI("ENTER A NEGATIVE NUMBER");
           Number = ReadFloatNumberGUI() ;
       }
       return Number ;
   } 
   public static double ReadDoublePositiveNumberGUI()
   {
       
       double Number = ReadDoubleNumberGUI();
       
       while(Number < 0)
       {
           PrintGUI("\nENTER A POSITIVE NUMBER");
           Number = ReadDoubleNumberGUI() ;
       }
       
       return Number ;
   }
   
   public static double ReadDoubleNegativeNumberGUI()
   {
       double Number = ReadDoubleNumberGUI() ;
       
       while(Number > 0)
       {
           PrintGUI("ENTER A NEGATIVE NUMBER");
           Number = ReadDoubleNumberGUI() ;
       }
       return Number ;
   } 
   
   public static int ValidateNumberInRangeGUI(int From , int To)
   {
       int Number = ReadIntegerNumberGUI() ;
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadIntegerNumberGUI() ;
       }
       
       return Number ;
   }
   public static byte ValidateNumberInRangeGUI(byte From , byte To)
   {
       byte Number = ReadByteNumberGUI() ;
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadByteNumberGUI() ;
       }
       
       return Number ;
   }
   public static short ValidateNumberInRangeGUI(short From , short To)
   {
       short Number = ReadShortNumberGUI() ;
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadShortNumberGUI() ;
       }
       
       return Number ;
   }
   public static long ValidateNumberInRangeGUI(long From , long To)
   {
       long Number = ReadLongNumberGUI() ;
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadLongNumberGUI() ;
       }
       
       return Number ;
   }
   
   public static float ValidateFloatNumberInRangeGUI(float From , float To)
   {
       float Number = ReadFloatNumberGUI();
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadFloatNumberGUI() ;
       }
       return Number ;
   }
   public static float ValidateFloatNumberInRangeGUI(byte From , byte To)
   {
       float Number = ReadFloatNumberGUI();
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadFloatNumberGUI() ;
       }
       return Number ;
   }
   public static float ValidateFloatNumberInRangeGUI(short From , short To)
   {
       float Number = ReadFloatNumberGUI();
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadFloatNumberGUI() ;
       }
       return Number ;
   }
   public static float ValidateFloatNumberInRangeGUI(int From , int To)
   {
       float Number = ReadFloatNumberGUI();
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadFloatNumberGUI() ;
       }
       return Number ;
   }
   public static float ValidateFloatNumberInRangeGUI(long From , long To)
   {
       float Number = ReadFloatNumberGUI();
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadFloatNumberGUI() ;
       }
       return Number ;
   }
   public static double ValidateDoubleNumberInRangeGUI(double From , double To)
   {
       double Number = ReadDoubleNumberGUI();
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]");
           Number = ReadDoubleNumberGUI() ;
       }
       return Number ;
   }
   
   public static double ValidateDoubleNumberInRangeGUI(int From , int To)
   {
       double Number = ReadDoubleNumberGUI() ;
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]") ;
           Number = ReadDoubleNumberGUI();
       }
       
       return Number ;
   }
   public static double ValidateDoubleNumberInRangeGUI(short From , short To)
   {
       double Number = ReadDoubleNumberGUI() ;
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]") ;
           Number = ReadDoubleNumberGUI();
       }
       
       return Number ;
   }
   public static double ValidateDoubleNumberInRangeGUI(long From , long To)
   {
       double Number = ReadDoubleNumberGUI() ;
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]") ;
           Number = ReadDoubleNumberGUI();
       }
       
       return Number ;
   }
   public static double ValidateDoubleNumberInRangeGUI(byte From , byte To)
   {
       double Number = ReadDoubleNumberGUI() ;
       
       while(Number < From || Number > To)
       {
           PrintGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]") ;
           Number = ReadDoubleNumberGUI();
       }
       
       return Number ;
   }
   
   public static char ReadCharacterGUI()
   {
       char Character ;
       
       Character = ReadStringGUI().charAt(0);
       
       return Character ;
   }
   
   public static char ReadArithmeticOperatorGUI()
   {
       
       char  ArithmeticOperator = ReadCharacterGUI() ;
       
       while(ArithmeticOperator != '+' &&  ArithmeticOperator != '-' &&  ArithmeticOperator != '/' &&  ArithmeticOperator != '*' &&  ArithmeticOperator != '%')
       {
           PrintGUI("ENTER ARITHMETIC OPERATOR [+ , - , * , / , %]");
           ArithmeticOperator = ReadCharacterGUI() ;
       }
       
       return  ArithmeticOperator ;
   }
   
   public static String ReadPhoneNumberGUI()
   {
       
       String PhoneNumber ;
       
       do
       {
           PhoneNumber = ReadStringGUI() ;
       }while(!IsPhoneNumber(PhoneNumber));
       
       return PhoneNumber ;
   }
   
   public static String ReadPhoneKeyGUI()
   {
     String PhoneKey ;
     
     do
     {
         PhoneKey = ReadStringGUI() ;
     }while(!IsPhoneKey(PhoneKey));
     
     return PhoneKey ; 
   }
   
   public static String ReadFullPhoneNumberGUI()
   {
       String PhoneKey = ReadPhoneKeyGUI() ;
       String PhoneNumber = ReadPhoneNumberGUI() ;
       
       return PhoneKey + PhoneNumber ;
   }
   
   public static String ReadEmailAddressGUI()
   {
       String EmailAddress = ReadStringGUI() ;
       
       while(!IsEmailAddress(EmailAddress))
       {
           PrintGUI("INVALID EMAIL ADDRESS!");
           EmailAddress = ReadStringGUI() ;
       }
       
       return EmailAddress ;
   }
    
   public static String ReadFilteredStringGUI(String Pollutant)
   {
       String FilteredString ;
       
        FilteredString = ReadStringGUI();
       
       while(FilteredString.contains(Pollutant))
       {
           PrintGUI("INVALID STRING , YOU CAN'T ENTER STRING CONTAINS \"" + Pollutant + "\"");
           FilteredString = ReadStringGUI() ;
       }
       
       return FilteredString ;
   }
   
   public static boolean ReadBooleanValueGUI(String Message)
   {
       return Boolean.parseBoolean(InputGUI(Message)) ;
   }
   
   public static int ReadIntegerNumberGUI(String Message)
   {
       int Number ;
       
       while(true)
       {
           try
           {
               Number = Integer.parseInt(InputGUI(Message));
               return Number ;
           }
           
           catch(NumberFormatException e)
           {
               PrintGUI("INVALID NUMBER");
           }
       }
       
   }
   public static byte ReadByteNumberGUI(String Message)
   {
       byte Number ;
       
       while(true)
       {
           try
           {
               Number = Byte.parseByte(InputGUI(Message));
               return Number ;
           }
           
           catch(NumberFormatException e)
           {
               PrintGUI("INVALID NUMBER");
           }
       }
       
   }
   public static short ReadShortNumberGUI(String Message)
   {
       short Number ;
       
       while(true)
       {
           try
           {
               Number = Short.parseShort(InputGUI(Message));
               return Number ;
           }
           
           catch(NumberFormatException e)
           {
               PrintGUI("INVALID NUMBER");
           }
       }
       
   }
   public static long ReadLongNumberGUI(String Message)
   {
       long Number ;
       
       while(true)
       {
           try
           {
               Number = Long.parseLong(InputGUI(Message));
               return Number ;
           }
           
           catch(NumberFormatException e)
           {
               PrintGUI("INVALID NUMBER");
           }
       }
       
   }
   
   public static double ReadDoubleNumberGUI(String Message)
   {
       double Number ;
       
       while(true)
       {
           try
           {
               Number = Double.parseDouble(InputGUI(Message)) ;
               return Number ;
           }
           catch(NumberFormatException e)
           {
               PrintGUI("INVALID NUMBER");
           }
       }
   }
   
   public static float ReadFloatNumberGUI(String Message)
   {
       float Number ;
       
       while(true)
       {
           try
           {
               Number = Float.parseFloat(InputGUI(Message)) ;
               return Number ;
           }
           
           catch(NumberFormatException e)
           {
               PrintGUI("INVALID NUMBER");
           }
       }
   }
   
   public static String ReadStringGUI(String Message)
   {
       String StringLine ;
       
       StringLine = InputGUI(Message) ;
       
       return StringLine ;
   }
   
   public static int ReadIntegerPositiveNumberGUI(String Message)
   {
       int Number = ReadIntegerNumberGUI(Message) ;
       
       while(Number < 0)
       {
           Number = ReadIntegerNumberGUI("ENTER A POSITIVE NUMBER , " + Message);
       }
       
       return Number ;
   }
   
   public static int ReadIntegerNegativeNumberGUI(String Message)
   {
       int Number = ReadIntegerNumberGUI(Message) ;
       
       while(Number > 0)
       {
           Number = ReadIntegerNumberGUI("ENTER A NEGATIVE NUMBER , " + Message) ;
       }
       
       return Number ;
   }
   
   public static int ReadIntegerNumberMultipleOfGUI(String Message , int FactorNumber)
   {
       int Number = ReadIntegerNumberGUI(Message) ;
       
       while(Number % FactorNumber != 0)
       {
            Number = ReadIntegerNumberGUI("ENTER A NUMBER MULTIPLE OF " + FactorNumber + " , " + Message) ;
       }
       
       return Number ;
   }
   public static short ReadShortPositiveNumberGUI(String Message)
   {
       short Number = ReadShortNumberGUI(Message) ;
       
       while(Number < 0)
       {
           Number = ReadShortNumberGUI("ENTER A POSITIVE NUMBER , " + Message);
       }
       
       return Number ;
   }
   
   public static short ReadShortNegativeNumberGUI(String Message)
   {
       short Number = ReadShortNumberGUI(Message) ;
       
       while(Number > 0)
       {
           Number = ReadShortNumberGUI("ENTER A NEGATIVE NUMBER , " + Message) ;
       }
       
       return Number ;
   }
   
   public static short ReadShortNumberMultipleOfGUI(String Message , short FactorNumber)
   {
       short Number = ReadShortNumberGUI(Message) ;
       
       while(Number % FactorNumber != 0)
       {
            Number = ReadShortNumberGUI("ENTER A NUMBER MULTIPLE OF " + FactorNumber + " , " + Message) ;
       }
       
       return Number ;
   }
   public static long ReadLongPositiveNumberGUI(String Message)
   {
       long Number = ReadLongNumberGUI(Message) ;
       
       while(Number < 0)
       {
           Number = ReadLongNumberGUI("ENTER A POSITIVE NUMBER , " + Message);
       }
       
       return Number ;
   }
   
   public static long ReadLongNegativeNumberGUI(String Message)
   {
       long Number = ReadLongNumberGUI(Message) ;
       
       while(Number > 0)
       {
           Number = ReadLongNumberGUI("ENTER A NEGATIVE NUMBER , " + Message) ;
       }
       
       return Number ;
   }
   
   public static long ReadLongNumberMultipleOfGUI(String Message , long FactorNumber)
   {
       long Number = ReadLongNumberGUI(Message) ;
       
       while(Number % FactorNumber != 0)
       {
            Number = ReadLongNumberGUI("ENTER A NUMBER MULTIPLE OF " + FactorNumber + " , " + Message) ;
       }
       
       return Number ;
   }
   public static byte ReadBytePositiveNumberGUI(String Message)
   {
       byte Number = ReadByteNumberGUI(Message) ;
       
       while(Number < 0)
       {
           Number = ReadByteNumberGUI("ENTER A POSITIVE NUMBER , " + Message);
       }
       
       return Number ;
   }
   
   public static byte ReadByteNegativeNumberGUI(String Message)
   {
       byte Number = ReadByteNumberGUI(Message) ;
       
       while(Number > 0)
       {
           Number = ReadByteNumberGUI("ENTER A NEGATIVE NUMBER , " + Message) ;
       }
       
       return Number ;
   }
   
   public static byte ReadByteNumberMultipleOfGUI(String Message , byte FactorNumber)
   {
       byte Number = ReadByteNumberGUI(Message) ;
       
       while(Number % FactorNumber != 0)
       {
            Number = ReadByteNumberGUI("ENTER A NUMBER MULTIPLE OF " + FactorNumber + " , " + Message) ;
       }
       
       return Number ;
   }
   
   public static float ReadFloatPositiveNumberGUI(String Message)
   {
       float Number = ReadFloatNumberGUI(Message) ;
       
       while(Number < 0)
       {
           Number = ReadFloatNumberGUI("ENTER A POSITIVE NUMBER , " + Message);
       }
       
       return Number ;
   }
   
   public static float ReadFloatNegativeNumberGUI(String Message)
   {
       float Number = ReadFloatNumberGUI(Message) ;
       
       while(Number > 0)
       {
           Number = ReadFloatNumberGUI("ENTER A NEGATIVE NUMBER , " + Message) ;
       }
       
       return Number ;
   }
   public static double ReadDoublePositiveNumberGUI(String Message)
   {
       double Number = ReadDoubleNumberGUI(Message) ;
       
       while(Number < 0)
       {
           Number = ReadDoubleNumberGUI("ENTER A POSITIVE NUMBER , " + Message);
       }
       
       return Number ;
   }
   
   public static double ReadDoubleNegativeNumberGUI(String Message)
   {
       double Number = ReadDoubleNumberGUI(Message) ;
       
       while(Number > 0)
       {
           Number = ReadDoubleNumberGUI("ENTER A NEGATIVE NUMBER , " + Message) ;
       }
       
       return Number ;
   }
   
   public static int ValidateNumberInRangeGUI(int From , int To , String Message)
   {
       int Number = ReadIntegerNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadIntegerNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       
       return Number ;
   }
   public static short ValidateNumberInRangeGUI(short From , short To , String Message)
   {
       short Number = ReadShortNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadShortNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       
       return Number ;
   }
   public static long ValidateNumberInRangeGUI(long From , long To , String Message)
   {
       long Number = ReadLongNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadLongNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       
       return Number ;
   }
   public static byte ValidateNumberInRangeGUI(byte From , byte To , String Message)
   {
       byte Number = ReadByteNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadByteNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       
       return Number ;
   }
   
   public static double ValidateDoubleNumberInRangeGUI(int From , int To , String Message)
   {
       double Number = ReadDoubleNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadDoubleNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       return Number ;
   }
   public static double ValidateDoubleNumberInRangeGUI(short From , short To , String Message)
   {
       double Number = ReadDoubleNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadDoubleNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       return Number ;
   }
   public static double ValidateDoubleNumberInRangeGUI(byte From , byte To , String Message)
   {
       double Number = ReadDoubleNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadDoubleNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       return Number ;
   }
   public static double ValidateDoubleNumberInRangeGUI(long From , long To , String Message)
   {
       double Number = ReadDoubleNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadDoubleNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       return Number ;
   }
   public static double ValidateDoubleNumberInRangeGUI(float From , float To , String Message)
   {
       double Number = ReadDoubleNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadDoubleNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To +"]\n" + Message) ;
       }
       return Number ;
   }
   
   public static double ValidateDoubleNumberInRangeGUI(double From , double To , String Message)
   {
       double Number = ReadDoubleNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadDoubleNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]\n" + Message) ;  
       }
            
       return Number ;
   }
   public static float ValidateFloatNumberInRangeGUI(float From , float To , String Message)
   {
       float Number = ReadFloatNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadFloatNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]\n" + Message) ;  
       }
            
       return Number ;
   }
   public static float ValidateFloatNumberInRangeGUI(int From , int To , String Message)
   {
       float Number = ReadFloatNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadFloatNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]\n" + Message) ;  
       }
            
       return Number ;
   }
   public static float ValidateFloatNumberInRangeGUI(short From , short To , String Message)
   {
       float Number = ReadFloatNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadFloatNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]\n" + Message) ;  
       }
            
       return Number ;
   }
   public static float ValidateFloatNumberInRangeGUI(byte From , byte To , String Message)
   {
       float Number = ReadFloatNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadFloatNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]\n" + Message) ;  
       }
            
       return Number ;
   }
   public static float ValidateFloatNumberInRangeGUI(long From , long To , String Message)
   {
       float Number = ReadFloatNumberGUI(Message) ;
       
       while(Number < From || Number > To)
       {
           Number = ReadFloatNumberGUI("ENTER A NUMBER BETWEEN [" + From + " & " + To + "]\n" + Message) ;  
       }
            
       return Number ;
   }
   
   
   public static char ReadCharacterGUI(String Message)
   {
       char Character ;
       
       Character = ReadStringGUI(Message).charAt(0) ;
       
       return Character ;
   }
   
   public static char ReadArithmeticOperatorGUI(String Message)
   {
       char ArithmeticOperator = ReadCharacterGUI(Message) ;
       
       while(ArithmeticOperator != '+' &&  ArithmeticOperator!= '-' &&  ArithmeticOperator != '/' &&  ArithmeticOperator != '*' &&  ArithmeticOperator != '%')
       {
           ArithmeticOperator = ReadCharacterGUI("ENTER ARITHMETIC OPERATOR [+ , - , * , / , %] , " + Message) ;
       }
       
       return  ArithmeticOperator ;
   }
   
   public static String ReadPhoneKeyGUI(String Message)
   {
       String PhoneKey ;
       
       do
       {
           PhoneKey = ReadStringGUI(Message); 
       }while(!IsPhoneKeyGUI(PhoneKey));
       
       return PhoneKey ;
   }
   
   public static String ReadPhoneNumberGUI(String Message)
   {
       String PhoneNumber ;
       
       do
       {
           PhoneNumber = ReadStringGUI(Message) ;
       }while(!IsPhoneNumberGUI(PhoneNumber));
       
       return PhoneNumber ;
   }
   
   public static String ReadFullPhoneNumberGUI(String PhoneKeyMessage , String PhoneNumberMessage)
   {
       String PhoneKey , PhoneNumber ;
       
       PhoneKey = ReadPhoneKeyGUI(PhoneKeyMessage);
       PhoneNumber = ReadPhoneNumberGUI(PhoneNumberMessage) ;
       
       return PhoneKey + PhoneNumber ;
   }
   
   public static String ReadEmailAddressGUI(String Message)
   {
       String EmailAddress = ReadStringGUI(Message);
       
       while(!IsEmailAddress(EmailAddress))
       {
           EmailAddress = ReadStringGUI("INVALID EMAIL ADDRESS!" + Message) ;
       }
       
       return EmailAddress ;
   }
   
   public static String ReadFilteredStringGUI(String Message , String Pollutant)
   {
       String StringWord = ReadStringGUI(Message) ;
       
       while(StringWord.contains(Pollutant))
       {
           StringWord = ReadStringGUI("INVALID STRING , YOU CAN'T ENTER STRING CONTAINS \"" + Pollutant + "\"\n" + Message) ;
       }
       
       return StringWord ;
   }
   
   //-------------------------------------------------------------------------------------
   //REPEATING FUNCTIONS GUI : 
   //--------------------------
   
   public static boolean DoYouWantToDoThisGUI(String Message)
   {
       String ReadAgain ;
       
       do
       {
           ReadAgain = ReadStringGUI(Message) ;
           
       }while(!ReadAgain.equals("Y") && !ReadAgain.equals("y") && !ReadAgain.equals("n") && !ReadAgain.equals("N")) ;
       
       return (ReadAgain.equals("Y") || ReadAgain.equals("y"));
   }
   
   public static boolean DoYouWantToDoThisGUI(String Message , String ChoiceYes , String ChoiceNo)
   {
       String ReadAgain ;
       
       do
       {
           ReadAgain = ReadStringGUI("\n" + Message) ; 
       }while(!ReadAgain.equals(ChoiceYes) && !ReadAgain.equals(ChoiceNo));
       
       return (ReadAgain.equals(ChoiceYes)) ;
   }
}
