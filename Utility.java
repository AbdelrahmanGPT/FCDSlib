/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import static FCDSlib.Read.*;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static FCDSlib.GUI.*;

/**
 *
 * @author AAMY
 */
public class Utility {
    public static double SumFrom1ToN(int Number)
    {
        return Number * (Number + 1) * 0.5 ;
    }
    public static double SumFrom1ToN(short Number)
    {
        return Number * (Number + 1) * 0.5 ;
    }
    public static double SumFrom1ToN(byte Number)
    {
        return Number * (Number + 1) * 0.5 ;
    }

    public static double SumFrom1ToN(long Number)
    {
        return Number * (Number + 1) * 0.5 ;
    }
    
    public static long Factorial(int Number)
    {
        long Factorial = 1 ;
        
        for(int i = 1 ; i <= Number ; i++)
        {
            Factorial *= i ;
        }
        
        return Factorial ;
    }
    public static long Factorial(short Number)
    {
        long Factorial = 1 ;
        
        for(short i = 1 ; i <= Number ; i++)
        {
            Factorial *= i ;
        }
        
        return Factorial ;
    }
    public static long Factorial(byte Number)
    {
        long Factorial = 1 ;
        
        for(byte i = 1 ; i <= Number ; i++)
        {
            Factorial *= i ;
        }
        
        return Factorial ;
    }
    public static long Factorial(long Number)
    {
        long Factorial = 1 ;
        
        for(long i = 1 ; i <= Number ; i++)
        {
            Factorial *= i ;
        }
        
        return Factorial ;
    }
    
    public static long FibonacciNumber(int Number)
    {
        long FirstNumber = 0 ;
        long SecondNumber = 1 ;
        long FibonacciNumber = -1 ; 
        
        if(Number == 1)
        {
            return FirstNumber ;
        }
        
        else if (Number == 2)
        {
            return SecondNumber ;
        }
        
        else
        {
            for(long i = 3 ; i <= Number ;i++ )
            {
                FibonacciNumber = FirstNumber + SecondNumber ;
                FirstNumber = SecondNumber;
                SecondNumber = FibonacciNumber ;
            }
            
        }
        
        return FibonacciNumber ;
    }
    public static long FibonacciNumber(short Number)
    {
        long FirstNumber = 0 ;
        long SecondNumber = 1 ;
        long FibonacciNumber = -1 ; 
        
        if(Number == 1)
        {
            return FirstNumber ;
        }
        
        else if (Number == 2)
        {
            return SecondNumber ;
        }
        
        else
        {
            for(long i = 3 ; i <= Number ;i++ )
            {
                FibonacciNumber = FirstNumber + SecondNumber ;
                FirstNumber = SecondNumber;
                SecondNumber = FibonacciNumber ;
            }
            
        }
        
        return FibonacciNumber ;
    }
    public static long FibonacciNumber(byte Number)
    {
        long FirstNumber = 0 ;
        long SecondNumber = 1 ;
        long FibonacciNumber = -1 ; 
        
        if(Number == 1)
        {
            return FirstNumber ;
        }
        
        else if (Number == 2)
        {
            return SecondNumber ;
        }
        
        else
        {
            for(long i = 3 ; i <= Number ;i++ )
            {
                FibonacciNumber = FirstNumber + SecondNumber ;
                FirstNumber = SecondNumber;
                SecondNumber = FibonacciNumber ;
            }
            
        }
        
        return FibonacciNumber ;
    }
    public static long FibonacciNumber(long Number)
    {
        long FirstNumber = 0 ;
        long SecondNumber = 1 ;
        long FibonacciNumber = -1 ; 
        
        if(Number == 1)
        {
            return FirstNumber ;
        }
        
        else if (Number == 2)
        {
            return SecondNumber ;
        }
        
        else
        {
            for(long i = 3 ; i <= Number ;i++ )
            {
                FibonacciNumber = FirstNumber + SecondNumber ;
                FirstNumber = SecondNumber;
                SecondNumber = FibonacciNumber ;
            }
            
        }
        
        return FibonacciNumber ;
    }
    
    public static byte RandomNumber(byte From , byte To)
    {
        Random random = new Random();
        
    byte ByteRandomNumber = (byte)(random.nextInt(To - From + 1) + From);
    
    return ByteRandomNumber ;
    }
    public static int RandomNumber(int From , int To)
    {
        Random random = new Random();
        
    int IntegerRandomNumber = random.nextInt(To - From + 1) + From;
    
    return IntegerRandomNumber ;
    }
    
    public static long RandomNumber(long From , long To)
    {
        Random random = new Random() ;
        
    long LongRandomNumber = random.nextLong(To - From + 1) + From;
    
    return LongRandomNumber ;
    }  
    
    public static double RandomNumber(double From , double To)
    {
        Random random = new Random() ;
        
    double DoubleRandomNumber = random.nextDouble(To - From + 1) + From ;
    
    return DoubleRandomNumber ;
    }

    public static float RandomNumber(float From , float To)
    {
        Random random = new Random() ;
        
    float RandomNumber = random.nextFloat(To - From + 1) + From ;
    
    return RandomNumber ;
    
    }
    
    public static boolean RandomNumber(boolean From , boolean To)
    {
        
        Random random = new Random() ;
        
        boolean RandomBooleanValue = random.nextBoolean();
        
        return RandomBooleanValue ;
    }
    
    public static int GetIntegerPart(double Number)
    {
    return (int)(Number) ;
}

    public static double GetFloatingPoint(double Number)
    {
        return Number - (int)Number ;
    }
    
    public static boolean IsPositiveNumber(byte Number)
    {
        return (Number > 0) ;
    }
    public static boolean IsPositiveNumber(int Number)
    {
        return (Number > 0) ;
    }
    public static boolean IsPositiveNumber(long Number)
    {
        return (Number > 0) ;
    }
    public static boolean IsPositiveNumber(short Number)
    {
        return (Number > 0) ;
    }
    
    public static boolean IsPositiveNumber(float Number)
    {
        return (Number > 0) ;
    }
    
    public static boolean IsPositiveNumber(double Number)
    {
        return (Number > 0) ;
    }
    
    public static boolean IsNegativeNumber(byte Number)
    {
        return (Number < 0) ;
    }
    public static boolean IsNegativeNumber(int Number)
    {
        return (Number < 0) ;
    }
    public static boolean IsNegativeNumber(long Number)
    {
        return (Number < 0) ;
    }
    public static boolean IsNegativeNumber(short Number)
    {
        return (Number < 0) ;
    }
    
    public static boolean IsNegativeNumber(float Number)
    {
        return (Number < 0) ;
    }
    
    public static boolean IsNegativeNumber(double Number)
    {
        return (Number < 0) ;
    }
     
    public static boolean IsZeroNumber(byte Number)
    {
        return (Number == 0) ;
    }
    public static boolean IsZeroNumber(int Number)
    {
        return (Number == 0) ;
    }
    public static boolean IsZeroNumber(short Number)
    {
        return (Number == 0) ;
    }
    public static boolean IsZeroNumber(long Number)
    {
        return (Number == 0) ;
    }
    
    public static boolean IsZeroNumber(double Number)
    {
        return (Number == 0) ;
    }
    
    public static boolean IsZeroNumber(float Number)
    {
        return (Number == 0) ;
    }
    
    public static boolean IsEvenNumber(byte Number)
    {
        return (Number % 2 == 0) ;
    }
    public static boolean IsEvenNumber(int Number)
    {
        return (Number % 2 == 0) ;
    }
    public static boolean IsEvenNumber(short Number)
    {
        return (Number % 2 == 0) ;
    }
    public static boolean IsEvenNumber(long Number)
    {
        return (Number % 2 == 0) ;
    }
    
    public static boolean IsOddNumber(byte Number)
    {
        return (!IsEvenNumber(Number)) ;
    }
    public static boolean IsOddNumber(int Number)
    {
        return (!IsEvenNumber(Number)) ;
    }
    public static boolean IsOddNumber(short Number)
    {
        return (!IsEvenNumber(Number)) ;
    }
    public static boolean IsOddNumber(long Number)
    {
        return (!IsEvenNumber(Number)) ;
    }
    
    public static boolean IsPrimeNumber(byte Number)
    {
        for(int i = 2 ; i*i <= Number ; i++)
        {
            if(Number % i == 0)
            {
                return false ;
            }
        }
        
        return (Number != 1) ;
    }
    public static boolean IsPrimeNumber(int Number)
    {
        for(int i = 2 ; i*i <= Number ; i++)
        {
            if(Number % i == 0)
            {
                return false ;
            }
        }
        
        return (Number != 1) ;
    }
    public static boolean IsPrimeNumber(short Number)
    {
        for(short i = 2 ; i*i <= Number ; i++)
        {
            if(Number % i == 0)
            {
                return false ;
            }
        }
        
        return (Number != 1) ;
    }
    public static boolean IsPrimeNumber(long Number)
    {
        for(long i = 2 ; i*i <= Number ; i++)
        {
            if(Number % i == 0)
            {
                return false ;
            }
        }
        
        return (Number != 1) ;
    }
    
   
    public static boolean IsNumberMultipleOf(byte Number , byte FactorNumber)
    {
        return (Number % FactorNumber == 0) ;
    }
    public static boolean IsNumberMultipleOf(int Number , int FactorNumber)
    {
        return (Number % FactorNumber == 0) ;
    }
    public static boolean IsNumberMultipleOf(short Number , short FactorNumber)
    {
        return (Number % FactorNumber == 0) ;
    }
    public static boolean IsNumberMultipleOf(long Number , long FactorNumber)
    {
        return (Number % FactorNumber == 0) ;
    }
    
    public static boolean IsPerfectNumber(byte Number)
    {
        int DivisorsSum = 0 ;
        
        for(int i = 1 ; i < Number ; i++)
        {
            if(Number % i == 0)
            {
                DivisorsSum += i ;
            }
        }
        
        return (Number == DivisorsSum) ;
    }
    public static boolean IsPerfectNumber(int Number)
    {
        int DivisorsSum = 0 ;
        
        for(int i = 1 ; i < Number ; i++)
        {
            if(Number % i == 0)
            {
                DivisorsSum += i ;
            }
        }
        
        return (Number == DivisorsSum) ;
    }
    public static boolean IsPerfectNumber(long Number)
    {
        long DivisorsSum = 0 ;
        
        for(int i = 1 ; i < Number ; i++)
        {
            if(Number % i == 0)
            {
                DivisorsSum += i ;
            }
        }
        
        return (Number == DivisorsSum) ;
    }
    
    public static boolean IsIntegerNumber(double Number)
    {
        return (Number == GetIntegerPart(Number)) ;
    }
    
    public static boolean IsFloatingNumber(double Number)
    {
        return (!IsIntegerNumber(Number)) ;
    }
    
    public static String NumberToText(long Number)
    {
        if(Number == 0)
        {
            return "" ;
        }
        
        if(Number >= 1 && Number <= 19)
        {
            String NumberText[] = {"" , "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , 
                                   "NINE" , "TEN" , "ELEVEN" , "TWELVE" , "THIRTEEN" , "FOURTEEN" ,  "FIFTEEN" , 
                                    "SIXTEEN" , "SEVENTEEN" , "EIGHTEEN" , "NINETEEN"} ;
            
            return NumberText[(int)Number] + " " ; 
        } 
        
        if(Number >= 20 && Number <= 99)
        {
            String NumberText[] = {"" , "" , "TWENTY" , "THIRTY" , "FOURTY" , "FIFTY" , "SIXTY" , "SEVENTY" , "EIGHTY" , 
                                    "NINETY"};
            
            return NumberText[(int)Number/10] + " " + NumberToText(Number % 10) ;
        }
        
        if(Number >= 100 && Number <= 199)
        {
            return "ONE HUNDRED " + NumberToText(Number % 100) ; 
        }
        
        if(Number >= 200 && Number <= 999)
        {
            return NumberToText(Number / 100) + "HUNDREDS " + NumberToText(Number % 100) ;
        }
        
        if(Number >= 1000 && Number <= 1999)
        {
            return "ONE THOUSAND "  + NumberToText(Number % 1000) ;
        }
        
        if(Number >= 2000 && Number <= 999999)
        {
            return NumberToText(Number / 1000) + "THOUSANDS " + NumberToText(Number % 1000) ;
        }
        
        if(Number >= 1e6 && Number <= 1999999)
        {
            return "ONE MILLION " + NumberToText(Number % 1000000) ;
        }
        
        if(Number >= 2e6 && Number <= 999999999)
        {
            return NumberToText((int) (Number / 1e6)) + "MILLIONS " + NumberToText(Number % (int)(1e6)) ;
        }
        
        if(Number >= 1e9 && Number <= 1999999999)
        {
            return "ONE BILLION " + NumberToText(Number % (long)(1e9)) ;
        }
        
        else
        {
            return "BIGGER THAN OR EQUAL 2 BILLIONS" ;
        }
        
    }
    
    public static long NumberDigitsSum(byte Number)
    {
        long NumberDigitsSum = 0 ;
        
        while(Number > 0)
        {
            NumberDigitsSum += (Number % 10) ;
            
            Number /= 10 ;
        }
        
        return NumberDigitsSum ;
    }
    public static long NumberDigitsSum(int Number)
    {
        long NumberDigitsSum = 0 ;
        
        while(Number > 0)
        {
            NumberDigitsSum += (Number % 10) ;
            
            Number /= 10 ;
        }
        
        return NumberDigitsSum ;
    }
    
    public static int ReverseNumber(byte Number)
    {
        int ReversedNumber = 0 ;
        
        while(Number > 0)
        {
            ReversedNumber = ReversedNumber * 10 + (Number % 10) ;
            
            Number /= 10 ;
        }
        
        return ReversedNumber ;
    }
    public static int ReverseNumber(int Number)
    {
        int ReversedNumber = 0 ;
        
        while(Number > 0)
        {
            ReversedNumber = ReversedNumber * 10 + (Number % 10) ;
            
            Number /= 10 ;
        }
        
        return ReversedNumber ;
    }
    public static long NumberDigitsSum(long Number)
    {
        long NumberDigitsSum = 0 ;
        
        while(Number > 0)
        {
            NumberDigitsSum += (Number % 10) ;
            
            Number /= 10 ;
        }
        
        return NumberDigitsSum ;
    }
    
    public static long ReverseNumber(long Number)
    {
        long ReversedNumber = 0 ;
        
        while(Number > 0)
        {
            ReversedNumber = ReversedNumber * 10 + (Number % 10) ;
            
            Number /= 10 ;
        }
        
        return ReversedNumber ;
    }
    
    public static byte CountDigitFrequencyInNumber(byte TargetedDigit ,byte Number)
    {
        byte DigitFrequency = 0 ;
        
        while(Number > 0)
        {
            if(Number % 10 == TargetedDigit)
            {
                DigitFrequency++ ;
            }
            
            Number /= 10 ;
        }
        
        return DigitFrequency ;
    }
    
    public static byte CountDigitFrequencyInNumber(byte TargetedDigit ,int Number)
    {
        byte DigitFrequency = 0 ;
        
        while(Number > 0)
        {
            if(Number % 10 == TargetedDigit)
            {
                DigitFrequency++ ;
            }
            
            Number /= 10 ;
        }
        
        return DigitFrequency ;
    }
    
    public static byte CountDigitFrequencyInNumber(byte TargetedDigit ,short Number)
    {
        byte DigitFrequency = 0 ;
        
        while(Number > 0)
        {
            if(Number % 10 == TargetedDigit)
            {
                DigitFrequency++ ;
            }
            
            Number /= 10 ;
        }
        
        return DigitFrequency ;
    }
    
    public static byte CountDigitFrequencyInNumber(byte TargetedDigit ,long Number)
    {
        byte DigitFrequency = 0 ;
        
        while(Number > 0)
        {
            if(Number % 10 == TargetedDigit)
            {
                DigitFrequency++ ;
            }
            
            Number /= 10 ;
        }
        
        return DigitFrequency ;
    }
    
    public static boolean IsPalindromeNumber(byte Number)
    {
        return (Number == ReverseNumber(Number)) ;
    }
    public static boolean IsPalindromeNumber(int Number)
    {
        return (Number == ReverseNumber(Number)) ;
    }
    public static boolean IsPalindromeNumber(short Number)
    {
        return (Number == ReverseNumber(Number)) ;
    }
    public static boolean IsPalindromeNumber(long Number)
    {
        return (Number == ReverseNumber(Number)) ;
    }
    
    public static boolean IsNumberBetween(byte Number , int From , int To)
    {
        return (Number >= From && Number <= To) ;
    }
    public static boolean IsNumberBetween(byte Number , byte From , byte To)
    {
        return (Number >= From && Number <= To) ;
    }
    public static boolean IsNumberBetween(int Number , int From , int To)
    {
        return (Number >= From && Number <= To) ;
    }
    public static boolean IsNumberBetween(short Number , short From , short To)
    {
        return (Number >= From && Number <= To) ;
    }
    public static boolean IsNumberBetween(long Number , long From , long To)
    {
        return (Number >= From && Number <= To) ;
    }
    public static boolean IsNumberBetween(float Number , float From , float To)
    {
        return (Number >= From && Number <= To) ;
    }
    public static boolean IsNumberBetween(double Number , double From , double To)
    {
        return (Number >= From && Number <= To) ;
    }
    
    public static boolean IsCharacterBetween(char Character , char From , char To)
    {
        return (Character >= From && Character <= To) ;
    }
    
    public static boolean IsTrue(boolean Boolean)
    {
        return Boolean ;
    }
    
    public static boolean IsFalse(boolean Boolean)
    {
        return !Boolean ;
    }
    
   public static boolean IsPhoneKey(String PhoneKey)
   {
       if(PhoneKey.charAt(0) != '+')
       {
           System.out.println("\nINVALID PHONE KEY , YOU HAVEN'T ENTERED + SIGN CHARACTER IN THE BEGINNING OF KEY !");
           
           return false ;
       }
       
       for(int i = 1 ; i < PhoneKey.length() ; i++)
       {
           if(!Character.isDigit(PhoneKey.charAt(i)))
           {
               
               System.out.println("\nINVALID PHONE KEY , YOU HAVE ENTERED NON-DIGIT CHARACTER !");
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean IsPhoneNumber(String PhoneNumber)
   {
       for(int i = 0 ; i < PhoneNumber.length() ; i++)
       {
           if(!Character.isDigit(PhoneNumber.charAt(i)))
           {
               System.out.println("\nINVALID PHONE NUMBER , YOU HAVE ENTERED NON-DIGIT CHARACTER !");
               
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean IsEmailAddress(String EmailAddress)
   {
       String EMAIL_REGEX =
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
        "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    Pattern pattern = Pattern.compile(EMAIL_REGEX);
  
    Matcher matcher = pattern.matcher(EmailAddress);
        
    return matcher.matches();
   }
   
   public static boolean IsPhoneKeyGUI(String PhoneKey)
   {
       if(PhoneKey.charAt(0) != '+')
       {
           PrintGUI("INVALID PHONE KEY , YOU HAVEN'T ENTERED + SIGN CHARACTER IN THE BEGINNING OF KEY !");
           
           return false ;
       }
       
       for(int i = 1 ; i < PhoneKey.length() ; i++)
       {
           if(!Character.isDigit(PhoneKey.charAt(i)))
           {
               
               PrintGUI("\nINVALID PHONE KEY , YOU HAVE ENTERED NON-DIGIT CHARACTER !");
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean IsPhoneNumberGUI(String PhoneNumber)
   {
       for(int i = 0 ; i < PhoneNumber.length() ; i++)
       {
           if(!Character.isDigit(PhoneNumber.charAt(i)))
           {
               PrintGUI("INVALID PHONE NUMBER , YOU HAVE ENTERED NON-DIGIT CHARACTER !");
               
               return false ;
           }
       }
       
       return true ;
   }
      
   
   public static void Exit()
   {
       System.exit(0);
   }
   
   public static boolean DoYouWantToDoThis(String Message)
   {
       String ReadAgain ;
       
       do
       {
           ReadAgain = ReadStringLine("\n" + Message) ;
           
       }while(!ReadAgain.equals("Y") && !ReadAgain.equals("y") && !ReadAgain.equals("n") && !ReadAgain.equals("N")) ;
       
       return (ReadAgain.equals("Y") || ReadAgain.equals("y"));
   }
   
   public static boolean DoYouWantToDoThis(String Message , String ChoiceYes , String ChoiceNo)
   {
       String ReadAgain ;
       
       do
       {
           ReadAgain = ReadStringLine("\n" + Message) ; 
       }while(!ReadAgain.equals(ChoiceYes) && !ReadAgain.equals(ChoiceNo));
       
       return (ReadAgain.equals(ChoiceYes)) ;
   }
}
