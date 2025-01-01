/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import static FCDSlib.Utility.*;
import static FCDSlib.Read.* ;

/**
 *
 * @author AAMY
 */
public class ArrayM {
    public static int CountNumberInArray(byte Number , byte Array[])
   {
       int NumberFrequency = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Number == Array[i])
           {
               NumberFrequency++ ;
           }
       }
       
       return NumberFrequency ;
   }
   public static int CountNumberInArray(int Number , int Array[])
   {
       int NumberFrequency = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Number == Array[i])
           {
               NumberFrequency++ ;
           }
       }
       
       return NumberFrequency ;
   }
   public static int CountNumberInArray(short Number , short Array[])
   {
       int NumberFrequency = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Number == Array[i])
           {
               NumberFrequency++ ;
           }
       }
       
       return NumberFrequency ;
   }
   public static int CountNumberInArray(long Number , long Array[])
   {
       int NumberFrequency = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Number == Array[i])
           {
               NumberFrequency++ ;
           }
       }
       
       return NumberFrequency ;
   }
   
   public static int CountNumberInArray(double Number , double Array[])
   {
       int NumberFrequency = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Number == Array[i])
           {
               NumberFrequency++ ;
           }
       }
       
       return NumberFrequency ;
   }
   
   public static int CountNumberInArray(float Number , float Array[])
   {
       int NumberFrequency = 0 ;
       
       for(int i = 0 ; i < Array.length ;i++)
       {
           if(Number == Array[i])
           {
               NumberFrequency++ ;
           }
       }
       
       return NumberFrequency ;
   }
   public static int CountBooleanInArray(boolean Boolean , boolean Array[])
   {
       int BooleanFrequency = 0 ;
       
       for(int i = 0 ; i < Array.length ;i++)
       {
           if(Boolean == Array[i])
           {
               BooleanFrequency++ ;
           }
       }
       
       return BooleanFrequency ;
   }
   
   public static int CountCharacterInArray(char Character , char Array[])
   {
       int CharacterFrequency = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Character == Array[i])
           {
               CharacterFrequency++ ;
           }
       }
       
       return CharacterFrequency ;
           
   }
   
   public static int CountStringInArray(String StringWord , String Array[])
   {
       int StringFrequency = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(StringWord.equals(Array[i]))
           {
               StringFrequency++ ;
           }
       }
       
       return StringFrequency ;
       
   } 
   
    public static boolean IsDistinctNumberInArray(byte Number , byte Array[])
    {
        return (CountNumberInArray(Number, Array) == 1) ;
    }
    public static boolean IsDistinctNumberInArray(int Number , int Array[])
    {
        return (CountNumberInArray(Number, Array) == 1) ;
    }
    
    public static boolean IsDistinctNumberInArray(short Number , short Array[])
    {
        return (CountNumberInArray(Number, Array) == 1) ;
    }
    
    public static boolean IsDistinctNumberInArray(long Number , long Array[])
    {
        return (CountNumberInArray(Number, Array) == 1) ;
    }
    
    public static boolean IsDistinctNumberInArray(float Number , float Array[])
    {
        return (CountNumberInArray(Number, Array) == 1) ;
    }
    
    public static boolean IsDistinctNumberInArray(double Number , double Array[])
    {
        return (CountNumberInArray(Number , Array) == 1) ;
    }
    public static boolean IsDistinctBooleanInArray(boolean Boolean , boolean Array[])
    {
        return (CountBooleanInArray(Boolean , Array) == 1) ;
    }
    
    public static boolean IsDistinctCharacterInArray(char Character , char Array[])
    {
        return (CountCharacterInArray(Character, Array) == 1) ;
    }
    
    public static boolean IsDistinctStringInArray(String StringLine , String String[])
    {
        return (CountStringInArray(StringLine, String) == 1) ;
    }
   
   public static void PrintArray(byte Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print(Array[i] + " ");
       }
       
       System.out.println("\n");
   }
   public static void PrintArray(int Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print(Array[i] + " ");
       }
       
       System.out.println("\n");
   }
   public static void PrintArray(short Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print(Array[i] + " ");
       }
       
       System.out.println("\n");
   }
   public static void PrintArray(long Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print(Array[i] + " ");
       }
       
       System.out.println("\n");
   }
   public static void PrintArray(boolean Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print(Array[i] + " ");
       }
       
       System.out.println("\n");
   }
   
   public static void PrintArray(String Array[])
   {
       for(int i = 0 ; i < Array.length ;i++)
       {
           System.out.print(Array[i] + " ");
       }
   }
   
   public static void PrintArray(double Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.println(Array[i] + " ");
       }
   }
   
   public static void PrintArray(float Array[])
   {
       for(int i = 0 ;i < Array.length ; i++)
       {
           System.out.println(Array[i] + " ");
       }
   }
   
   public static void PrintArray(char Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.println(Array[i] +  " ");
       }
   }
   
   public static byte[] FillArrayWithRandomNumbers(byte Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = (byte) RandomNumber(1 , 100) ;
       }
       
       return Array;
   }
   public static int[] FillArrayWithRandomNumbers(int Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = RandomNumber(1 , 100) ;
       }
       
       return Array;
   }
   public static short[] FillArrayWithRandomNumbers(short Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = (short) RandomNumber(1 , 100) ;
       }
       
       return Array;
   }
   public static long[] FillArrayWithRandomNumbers(long Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = RandomNumber(1 , 100) ;
       }
       
       return Array;
   }
   
   public static double[] FillArrayWithRandomNumbers(double Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = RandomNumber(1 , 100) ;
       }
       
       return Array;
   }
   
   public static float[] FillArrayWithRandomNumbers(float Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = RandomNumber(1 , 100) ;
       }
       
       return Array;
   }
   
   public static byte[] FillArrayWithRandomNumbers(byte Array[] , byte From , byte To)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = RandomNumber(From , To);
       }
       
       return Array;
   }
   public static int[] FillArrayWithRandomNumbers(int Array[] , int From , int To)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = RandomNumber(From , To);
       }
       
       return Array;
   }
   public static short[] FillArrayWithRandomNumbers(short Array[] , short From , short To)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = (short) RandomNumber(From , To);
       }
       
       return Array;
   }
   public static long[] FillArrayWithRandomNumbers(long Array[] , long From , long To)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = RandomNumber(From , To);
       }
       
       return Array;
   }
   
   public static double[] FillArrayWithRandomNumbers(double Array[] , double From , double To)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = RandomNumber(From , To) ;
       }
       
       return Array ;
   }
   
   public static float[] FillArrayWithRandomNumbers(float Array[] , float From , float To)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = RandomNumber(From , To) ;
       }
       
       return Array ;
   }
   
   public static byte[] FillArrayWithOrderedNumbers(byte Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = (byte) (i+1) ;
       }
       
       return Array ;
   }
   public static int[] FillArrayWithOrderedNumbers(int Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = (i+1) ;
       }
       
       return Array ;
   }
   
   public static short[] FillArrayWithOrderedNumbers(short Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = (short) (i+1) ;
       }
       
       return Array ;
   }
   
   public static long[] FillArrayWithOrderedNumbers(long Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = (i+1) ;
       }
       
       return Array ;
   }
   
   public static float[] FillArrayWithOrderedNumbers(float Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = (i+1) ;
       }
       
       return Array;
   }
   
   public static double[] FillArrayWithOrderednumbers(double Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = (i+1) ;
       }
       
       return Array ;
   }
   
   public static boolean[] FillBooleanArrayWithTRUE(boolean Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = true ;
       }
       
       return Array ;
   }
   public static boolean[] FillBooleanArrayWithFALSE(boolean Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           Array[i] = false ;
       }
       
       return Array ;
   }
   
   public static byte[] CopyArray(byte CopiedArray[])
   {
       byte ArrayCopy[] = new byte[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[i] ;
       }
       
       return ArrayCopy ;
   }
   public static int[] CopyArray(int CopiedArray[])
   {
       int ArrayCopy[] = new int[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[i] ;
       }
       
       return ArrayCopy ;
   }
   
   public static short[] CopyArray(short CopiedArray[])
   {
       short ArrayCopy[] = new short[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[i] ;
       }
       
       return ArrayCopy ;
   } 
   public static long[] CopyArray(long CopiedArray[])
   {
       long ArrayCopy[] = new long[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[i] ;
       }
       
       return ArrayCopy ;
   } 
   public static boolean[] CopyArray(boolean CopiedArray[])
   {
       boolean ArrayCopy[] = new boolean[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[i] ;
       }
       
       return ArrayCopy ;
   } 
   
   public static String[] CopyArray(String CopiedArray[])
   {
       String [] ArrayCopy = new String[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[i] ;
       }
       
       return ArrayCopy ;
   }
   
   public static double[] CopyArray(double CopiedArray[] )
   {
       double[] ArrayCopy = new double[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[i] ;
       }
       
       return ArrayCopy ;
   }
   
   public static float[] CopyArray(float CopiedArray[])
   {
       float[] ArrayCopy = new float[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[i] ;
       }
       
       return ArrayCopy ;
   }
   
   public static char[] CopyArray(char CopiedArray[])
   {
       char [] ArrayCopy = new char[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[i] ;
       }
       
       return ArrayCopy ;
   }
   
   public static byte[] AddArrayElement(byte Element , byte Array[])
   {
       int ArraySize = Array.length ;
       
       byte UpdatedArray[] = new byte[ArraySize + 1] ;
       
       for(int i = 0; i < ArraySize ; i++)
       {
           UpdatedArray[i] = Array[i] ;
       }
       
       UpdatedArray[ArraySize] = Element ; 
       
       return UpdatedArray ;
   }
   public static int[] AddArrayElement(int Element , int Array[])
   {
       int ArraySize = Array.length ;
       
       int UpdatedArray[] = new int[ArraySize + 1] ;
       
       for(int i = 0; i < ArraySize ; i++)
       {
           UpdatedArray[i] = Array[i] ;
       }
       
       UpdatedArray[ArraySize] = Element ; 
       
       return UpdatedArray ;
   }
   public static short[] AddArrayElement(short Element , short Array[])
   {
       int ArraySize = Array.length ;
       
       short UpdatedArray[] = new short[ArraySize + 1] ;
       
       for(int i = 0; i < ArraySize ; i++)
       {
           UpdatedArray[i] = Array[i] ;
       }
       
       UpdatedArray[ArraySize] = Element ; 
       
       return UpdatedArray ;
   }
   public static long[] AddArrayElement(long Element , long Array[])
   {
       int ArraySize = Array.length ;
       
       long UpdatedArray[] = new long[ArraySize + 1] ;
       
       for(int i = 0; i < ArraySize ; i++)
       {
           UpdatedArray[i] = Array[i] ;
       }
       
       UpdatedArray[ArraySize] = Element ; 
       
       return UpdatedArray ;
   }
   public static boolean[] AddArrayElement(boolean Element , boolean Array[])
   {
       int ArraySize = Array.length ;
       
       boolean UpdatedArray[] = new boolean[ArraySize + 1] ;
       
       for(int i = 0; i < ArraySize ; i++)
       {
           UpdatedArray[i] = Array[i] ;
       }
       
       UpdatedArray[ArraySize] = Element ; 
       
       return UpdatedArray ;
   }
   
   public static double[] AddArrayElement(double Element , double Array[])
   {
       int ArraySize = Array.length ;
       
      double UpdatedArray[] = new double[ArraySize + 1] ;
      
      for(int i = 0 ; i < ArraySize ; i++)
      {
          UpdatedArray[i] = Array[i] ;
      }
      
      UpdatedArray[ArraySize] = Element ;
      
      return UpdatedArray ;
   }
   
   public static float[] AddArrayElement(float Element , float Array[])
   {
       int ArraySize = Array.length ;
       
       float UpdatedArray[] = new float [ArraySize + 1];
       
       for(int i = 0 ; i < ArraySize ; i++)
       {
           UpdatedArray[i] = Array[i] ;
       }
       
       UpdatedArray[ArraySize] = Element ;
       
       return UpdatedArray ;
   }
   
   public static String[] AddArrayElement(String Element , String Array[])
   {
       int ArraySize = Array.length ;
       
       String UpdatedArray[] = new String[ArraySize + 1] ;
       
       for(int i = 0 ;  i < ArraySize ; i++)
       {
           UpdatedArray[i] = Array[i] ;
       }
       
       UpdatedArray[ArraySize] = Element ;
       
       return UpdatedArray ;
   }
   
   public static char[] AddArrayElement(char Element , char Array[])
   {
       int ArraySize = Array.length ;
       
       char UpdatedArray[] = new char[ArraySize + 1 ];
       
       for(int i = 0 ; i < ArraySize ; i++)
       {
           UpdatedArray[i] = Array[i] ;
       }
       
       UpdatedArray[ArraySize] = Element ;
       
       return UpdatedArray ;
   } 
   
   public static byte[] DeleteArrayElement(int ElementIndex , byte Array[])
   {
       if(ElementIndex < 0 || ElementIndex >= Array.length)
       {
           return Array ;
       }

       int ArraySize = Array.length;
       
       byte [] UpdatedArray = new byte[ArraySize - 1] ;
       
       int UpdatedArraySize = 0 ;
       
       for(int i = 0 ; i < ArraySize ; i++)
       {
           if(i != ElementIndex)
           {
               UpdatedArray[UpdatedArraySize++] = Array[i] ;
           }
       }
       
       return UpdatedArray ;
   }
   public static int[] DeleteArrayElement(int ElementIndex , int Array[])
   {
       if(ElementIndex < 0 || ElementIndex >= Array.length)
       {
           return Array ;
       }

       int ArraySize = Array.length;
       
       int [] UpdatedArray = new int[ArraySize - 1] ;
       
       int UpdatedArraySize = 0 ;
       
       for(int i = 0 ; i < ArraySize ; i++)
       {
           if(i != ElementIndex)
           {
               UpdatedArray[UpdatedArraySize++] = Array[i] ;
           }
       }
       
       return UpdatedArray ;
   }
   public static short[] DeleteArrayElement(int ElementIndex , short Array[])
   {
       if(ElementIndex < 0 || ElementIndex >= Array.length)
       {
           return Array ;
       }

       int ArraySize = Array.length;
       
       short [] UpdatedArray = new short[ArraySize - 1] ;
       
       int UpdatedArraySize = 0 ;
       
       for(int i = 0 ; i < ArraySize ; i++)
       {
           if(i != ElementIndex)
           {
               UpdatedArray[UpdatedArraySize++] = Array[i] ;
           }
       }
       
       return UpdatedArray ;
   }
   public static long[] DeleteArrayElement(int ElementIndex , long Array[])
   {
       if(ElementIndex < 0 || ElementIndex >= Array.length)
       {
           return Array ;
       }

       int ArraySize = Array.length;
       
       long [] UpdatedArray = new long[ArraySize - 1] ;
       
       int UpdatedArraySize = 0 ;
       
       for(int i = 0 ; i < ArraySize ; i++)
       {
           if(i != ElementIndex)
           {
               UpdatedArray[UpdatedArraySize++] = Array[i] ;
           }
       }
       
       return UpdatedArray ;
   }
   public static boolean[] DeleteArrayElement(int ElementIndex , boolean Array[])
   {
       if(ElementIndex < 0 || ElementIndex >= Array.length)
       {
           return Array ;
       }

       int ArraySize = Array.length;
       
       boolean [] UpdatedArray = new boolean[ArraySize - 1] ;
       
       int UpdatedArraySize = 0 ;
       
       for(int i = 0 ; i < ArraySize ; i++)
       {
           if(i != ElementIndex)
           {
               UpdatedArray[UpdatedArraySize++] = Array[i] ;
           }
       }
       
       return UpdatedArray ;
   }
   
   public static double[] DeleteArrayElement(int ElementIndex , double Array[])
   {
       
       if(ElementIndex < 0 || ElementIndex >= Array.length)
       {
           return Array ;
       }
       
       int ArraySize = Array.length ;
       
       double [] UpdatedArray = new double [ArraySize - 1];
       
       int UpdatedArraySize = 0 ;
       
       for(int i = 0 ; i < ArraySize ; i++)
       {
           if(ElementIndex != i)
           {
               UpdatedArray[UpdatedArraySize++] = Array[i] ;
           }
       }
       
       return UpdatedArray;
       
   }
   
   public static float [] DeleteArrayElement(int ElementIndex , float Array[])
   {
       if(ElementIndex < 0 || ElementIndex >= Array.length)
       {
           return Array ;
       }
       
       int ArraySize = Array.length;
       
       float UpdatedArray[] = new float[ArraySize - 1 ] ;
       
       int UpdatedArraySize = 0 ;
       
       for(int i = 0 ; i < ArraySize ; i++)
       {
           if(ElementIndex != i)
           {
               UpdatedArray[UpdatedArraySize++] = Array[i] ;
           }
       }
       
       return UpdatedArray;
       
       
   }
   
   public static String[] DeleteArrayElement(int ElementIndex , String Array[])
   {
       if(ElementIndex < 0 || ElementIndex >= Array.length)
       {
           return Array ;
       }
       
       int ArraySize = Array.length ;
       
       String [] UpdatedArray = new String[ArraySize - 1] ;
       
       int UpdatedArraySize = 0 ;
       
       for(int i = 0 ; i < ArraySize ; i++)
       {
           if(ElementIndex != i)
           {
               UpdatedArray[UpdatedArraySize++] = Array[i] ;
           }
       }
       
       return UpdatedArray ;
   }
   
   public static char[] DeleteArrayElement(int ElementIndex , char Array[])
   {
       if(ElementIndex < 0 || ElementIndex >= Array.length)
       {
           return Array ;
       }
       
       int ArraySize = Array.length ;
       
       char []UpdatedArray = new char [ArraySize - 1] ;
       
       int UpdatedArraySize = 0 ;
       
       for(int i = 0 ; i < ArraySize ; i++)
       {
           if(ElementIndex != i)
           {
               UpdatedArray[UpdatedArraySize++] = Array[i] ;
           }
       }
       
       return UpdatedArray;
   }
           
   public static byte[] ReadArray(byte Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Array[i] = ReadByteNumber() ; 
       }
       
       return Array;
      
   }
   public static int[] ReadArray(int Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Array[i] = ReadIntegerNumber() ; 
       }
       
       return Array;
      
   }
   
   public static short[] ReadArray(short Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Array[i] = ReadShortNumber() ; 
       }
       
       return Array;
      
   }
   
   public static long[] ReadArray(long Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Array[i] = ReadLongNumber() ; 
       }
       
       return Array;
      
   }
   
   public static boolean[] ReadArray(boolean Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Array[i] = ReadBooleanValue() ; 
       }
       
       return Array;
      
   }
   
   public static double[] ReadArray(double Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Array[i] = ReadDoubleNumber() ;
       }
       
       return Array;
   }
   
   public static float[] ReadArray(float Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Array[i] = ReadFloatNumber() ;
       }
       
       return Array;
   }
   
   public static String[] ReadArray(String Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Array[i] = ReadStringLine() ;
       }
       
       return Array;
   }
   
   public static char[] ReadArray(char Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Array[i] = ReadCharacter() ;
       }
       
       return Array;
   }
   
   public static boolean IsArrayPalindrome(byte Array[])
   {
       for(int i = 0 ; i <= Array.length/2 ; i++)
       {
           if(Array[i] != Array[Array.length - 1 - i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   public static boolean IsArrayPalindrome(int Array[])
   {
       for(int i = 0 ; i <= Array.length/2 ; i++)
       {
           if(Array[i] != Array[Array.length - 1 - i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   public static boolean IsArrayPalindrome(short Array[])
   {
       for(int i = 0 ; i <= Array.length/2 ; i++)
       {
           if(Array[i] != Array[Array.length - 1 - i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   public static boolean IsArrayPalindrome(long Array[])
   {
       for(int i = 0 ; i <= Array.length/2 ; i++)
       {
           if(Array[i] != Array[Array.length - 1 - i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   public static boolean IsArrayPalindrome(boolean Array[])
   {
       for(int i = 0 ; i <= Array.length/2 ; i++)
       {
           if(Array[i] != Array[Array.length - 1 - i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean IsArrayPalindrome(double Array[])
   {
       for(int i = 0 ; i <= Array.length/2 ; i++)
       {
           if(Array[i] != Array[Array.length - 1 - i])
           {
               return false ;
           }

       }
       
       return true ;
   }
   
   public static boolean IsArrayPalindrome(float Array[])
   {
       for(int i = 0 ; i <= Array.length/2 ; i++)
       {
           if(Array[i] != Array[Array.length - 1 - i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean IsArrayPalindrome(String Array[])
   {
       for(int i = 0 ; i <= Array.length/2 ; i++)
       {
           if(!Array[i].equals(Array[Array.length - 1 - i]))
           {
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean IsArrayPalindrome(char Array[])
   {
       for(int i = 0 ; i <= Array.length/2 ; i++)
       {
           if(Array[i] != Array[Array.length - 1 - i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   
   public static int CheckNumberFoundOrNotInArrayAndReturnItsIndex(byte NumberToCheck , byte Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(NumberToCheck == Array[i])
           {
               return i ;
           }
       }
       
       return -1 ;
   }
   public static int CheckNumberFoundOrNotInArrayAndReturnItsIndex(int NumberToCheck , int Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(NumberToCheck == Array[i])
           {
               return i ;
           }
       }
       
       return -1 ;
   }
   public static int CheckNumberFoundOrNotInArrayAndReturnItsIndex(short NumberToCheck , short Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(NumberToCheck == Array[i])
           {
               return i ;
           }
       }
       
       return -1 ;
   }
   public static int CheckNumberFoundOrNotInArrayAndReturnItsIndex(long NumberToCheck , long Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(NumberToCheck == Array[i])
           {
               return i ;
           }
       }
       
       return -1 ;
   }
   public static int CheckBooleanFoundOrNotInArrayAndReturnItsIndex(boolean BooleanToCheck , boolean Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(BooleanToCheck == Array[i])
           {
               return i ;
           }
       }
       
       return -1 ;
   }
   
   public static int CheckNumberFoundOrNotInArrayAndReturnItsIndex(double NumberToCheck , double Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] == NumberToCheck)
           {
               return i ;
           }
       }
       
       return -1;
   }
   
   public static int CheckNumberFoundOrNotInArrayAndReturnItsIndex(float NumberToCheck , float Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] == NumberToCheck)
           {
               return i ;
           }
       }
       
       return -1 ;
   }
   
   public static int CheckCharacterFoundOrNotInArrayAndReturnItsIndex(char CharacterToCheck , char Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] == CharacterToCheck)
           {
               return i ;
           }
       }
       
       return -1 ;
   }
   
   public static int CheckStringFoundOrNotInArrayAndReturnItsIndex(String StringToCheck , String Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i].equals(StringToCheck))
           {
               return i ;
           }
       }
       
       return -1 ;
   }
   
   public static boolean IsNumberFoundInArray(byte NumberToCheck , byte Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(NumberToCheck == Array[i])
           {
               return true ;
           }
       }
       
       return false ;
   }
   public static boolean IsNumberFoundInArray(int NumberToCheck , int Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(NumberToCheck == Array[i])
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsNumberFoundInArray(short NumberToCheck , short Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(NumberToCheck == Array[i])
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsNumberFoundInArray(long NumberToCheck , long Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(NumberToCheck == Array[i])
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsBooleanFoundInArray(boolean BooleanToCheck , boolean Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(BooleanToCheck == Array[i])
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsNumberFoundInArray(double NumberToCheck , double Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(NumberToCheck == Array[i])
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsNumberFoundInArray(float NumberToCheck , float Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(NumberToCheck == Array[i])
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsTRUEValueFoundInArray(boolean Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i])
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsFALSEValueFoundInArray(boolean Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(!Array[i])
           {
               return true ;
           }
       }
       
       return false;
   }
   
   public static boolean IsEvenNumberFoundInArray(byte Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   public static boolean IsEvenNumberFoundInArray(int Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsEvenNumberFoundInArray(short Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsEvenNumberFoundInArray(long Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsOddNumberFoundInArray(byte Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   public static boolean IsOddNumberFoundInArray(int Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsOddNumberFoundInArray(short Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsOddNumberFoundInArray(long Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsPrimeNumberFoundInArray(byte Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   public static boolean IsPrimeNumberFoundInArray(int Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsPrimeNumberFoundInArray(short Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsPrimeNumberFoundInArray(long Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsPerfectNumberFoundInArray(byte Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   public static boolean IsPerfectNumberFoundInArray(int Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsPerfectNumberFoundInArray(short Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsPerfectNumberFoundInArray(long Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsPositiveNumberFoundInArray(byte Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   public static boolean IsPositiveNumberFoundInArray(int Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsPositiveNumberFoundInArray(short Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsPositiveNumberFoundInArray(long Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsPositiveNumberFoundInArray(double Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsPositiveNumberFoundInArray(float []Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsNegativeNumberFoundInArray(byte[]Array)
   {
       for(int  i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   public static boolean IsNegativeNumberFoundInArray(int[]Array)
   {
       for(int  i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsNegativeNumberFoundInArray(short[]Array)
   {
       for(int  i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsNegativeNumberFoundInArray(long[]Array)
   {
       for(int  i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsNegativeNumberFoundInArray(double[]Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsNegativeNumberFoundInArray(float []Array)
   {
       for(int i = 0 ; i < Array.length ;i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctNumberFoundInArray(byte Array[])
   {
       for(int i = 0 ;  i < Array.length; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               return true ;
           }
       }
       
       return false ;
   }
   public static boolean IsDistinctNumberFoundInArray(int Array[])
   {
       for(int i = 0 ;  i < Array.length; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctNumberFoundInArray(short Array[])
   {
       for(int i = 0 ;  i < Array.length; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctNumberFoundInArray(long Array[])
   {
       for(int i = 0 ;  i < Array.length; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctBooleanFoundInArray(boolean Array[])
   {
       for(int i = 0 ;  i < Array.length; i++)
       {
           if(IsDistinctBooleanInArray(Array[i], Array))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctNumberFoundInArray(double []Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctNumberFoundInArray(float Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i] , Array))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctCharacterFoundInArray(char Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctCharacterInArray(Array[i], Array))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctStringFoundInArray(String Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctStringInArray(Array[i], Array))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean AreArraysIntersect(byte Array1[] , byte Array2[])
   {
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2))
           {
               return true ;
           }
       }
       
       return false ;
   }
   public static boolean AreArraysIntersect(int Array1[] , int Array2[])
   {
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean AreArraysIntersect(short Array1[] , short Array2[])
   {
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean AreArraysIntersect(long Array1[] , long Array2[])
   {
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2))
           {
               return true ;
           }
       }
       
       return false ;
   }
   public static boolean AreArraysIntersect(boolean Array1[] , boolean Array2[])
   {
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsBooleanFoundInArray(Array1[i], Array2))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean AreArraysIntersect(double Array1[] ,double Array2[])
   {
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2))
           {
               return true ;
           }
       }
       
       return false ;
           
   }
   
   public static boolean AreArraysIntersect(float Array1[] , float Array2[])
   {
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean AreArraysIntersect(char Array1[] , char Array2[])
   {
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsCharacterFoundInArrayOrNot(Array1[i], Array2))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean AreArraysIntersect(String Array1[] , String Array2[])
   {
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsStringFoundInArrayOrNot(Array1[i], Array2))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsCharacterFoundInArrayOrNot(char CharacterToCheck , char Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(CharacterToCheck == Array[i])
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean IsStringFoundInArrayOrNot(String StringToCheck , String Array[])
   {
       for(int i = 0 ; i < Array.length; i++)
       {
           if(StringToCheck.equals(Array[i]))
           {
               return true ;
           }
       }
       
       return false ;
   }
   
   public static boolean AreArraysEqual(byte Array1[] , byte Array2[])
   {
       if(Array1.length != Array2.length)
       {
           return false ;
       }
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array1[i] != Array2[i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   public static boolean AreArraysEqual(int Array1[] , int Array2[])
   {
       if(Array1.length != Array2.length)
       {
           return false ;
       }
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array1[i] != Array2[i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean AreArraysEqual(short Array1[] , short Array2[])
   {
       if(Array1.length != Array2.length)
       {
           return false ;
       }
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array1[i] != Array2[i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean AreArraysEqual(long Array1[] , long Array2[])
   {
       if(Array1.length != Array2.length)
       {
           return false ;
       }
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array1[i] != Array2[i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean AreArraysEqual(boolean Array1[] , boolean Array2[])
   {
       if(Array1.length != Array2.length)
       {
           return false ;
       }
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array1[i] != Array2[i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean AreArraysEqual(double Array1[] , double Array2[])
   {
       if(Array1.length != Array2.length)
       {
           return false ;
       }
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array1[i] != Array2[i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean AreArraysEqual(float Array1[] , float Array2[])
   {
       if(Array1.length != Array2.length)
       {
           return false ;
       }
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array1[i] != Array2[i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean AreArraysEqual(char Array1[] , char Array2[])
   {
       if(Array1.length != Array2.length)
       {
           return false ;
       }
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array1[i] != Array2[i])
           {
               return false ;
           }
       }
       
       return true ;
   }
   
   public static boolean AreArraysEqual(String Array1[] , String Array2[])
   {
       if(Array1.length != Array2.length)
       {
           return false ;
       }
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(!Array1[i].equals(Array2[i]))
           {
               return false ;
           }
       }
       
       return true ;
   }
   
   public static byte[] CopyArrayInReversedOrder(byte CopiedArray[])
   {
       byte []ArrayCopy = new byte[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[CopiedArray.length - 1 - i] ;
       }
       
       return ArrayCopy ;
   }
   public static int[] CopyArrayInReversedOrder(int CopiedArray[])
   {
       int []ArrayCopy = new int[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[CopiedArray.length - 1 - i] ;
       }
       
       return ArrayCopy ;
   }
   
   public static short[] CopyArrayInReversedOrder(short CopiedArray[])
   {
       short []ArrayCopy = new short[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[CopiedArray.length - 1 - i] ;
       }
       
       return ArrayCopy ;
   }
   
   public static long[] CopyArrayInReversedOrder(long CopiedArray[])
   {
       long []ArrayCopy = new long[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[CopiedArray.length - 1 - i] ;
       }
       
       return ArrayCopy ;
   }
   
   public static boolean[] CopyArrayInReversedOrder(boolean CopiedArray[])
   {
       boolean []ArrayCopy = new boolean[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[CopiedArray.length - 1 - i] ;
       }
       
       return ArrayCopy ;
   }
   
   public static double[] CopyArrayInReversedOrder(double CopiedArray[])
   {
      double []ArrayCopy = new double[CopiedArray.length] ;
      
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[CopiedArray.length - 1 - i] ;
       }
       
       return ArrayCopy ;
   }
   
   public static float[] CopyArrayInReversedOrder(float CopiedArray[])
   {
       float []ArrayCopy = new float[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[CopiedArray.length - 1 - i];
       }
       
       return ArrayCopy ;
   }
   
   public static char[] CopyArrayInReversedOrder(char CopiedArray[])
   {
       char ArrayCopy [] = new char [CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[CopiedArray.length - 1 - i];
       }
       
       return ArrayCopy ;
   }
   
   public static String[] CopyArrayInReversedOrder(String CopiedArray[])
   {
       String[]ArrayCopy = new String[CopiedArray.length] ;
       
       for(int i = 0 ; i < CopiedArray.length ; i++)
       {
           ArrayCopy[i] = CopiedArray[CopiedArray.length - 1 - i];
       }
       
       return ArrayCopy ;
   }
   
   public static byte MaximumNumberInArray(byte[] Array)
   {
       byte MaximumNumberInArray = Byte.MIN_VALUE ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] > MaximumNumberInArray)
           {
               MaximumNumberInArray = Array[i] ;
           }
       }
       
       return MaximumNumberInArray ;
   }
   public static int MaximumNumberInArray(int[] Array)
   {
       int MaximumNumberInArray = Integer.MIN_VALUE ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] > MaximumNumberInArray)
           {
               MaximumNumberInArray = Array[i] ;
           }
       }
       
       return MaximumNumberInArray ;
   }
   
   public static short MaximumNumberInArray(short[] Array)
   {
       short MaximumNumberInArray = Short.MIN_VALUE ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] > MaximumNumberInArray)
           {
               MaximumNumberInArray = Array[i] ;
           }
       }
       
       return MaximumNumberInArray ;
   }
   
   public static long MaximumNumberInArray(long[] Array)
   {
       long MaximumNumberInArray = Long.MIN_VALUE ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] > MaximumNumberInArray)
           {
               MaximumNumberInArray = Array[i] ;
           }
       }
       
       return MaximumNumberInArray ;
   }
   
   public static double MaximumNumberInArray(double []Array)
   {
       double MaximumNumberInArray = Double.MIN_VALUE ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] > MaximumNumberInArray)
           {
               MaximumNumberInArray = Array[i] ;
           }
       }
       
       return MaximumNumberInArray ;
   }
   
   public static float MaximumNumberInArray(float [] Array)
   {
       float MaximumNumberInArray = Float.MIN_VALUE ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] > MaximumNumberInArray)
           {
               MaximumNumberInArray = Array[i] ;
           }
       }
       
       return MaximumNumberInArray ;
   }
      
   public static byte MinimumNumberInArray(byte [] Array)
   {
       byte MinimumNumberInArray = Byte.MAX_VALUE ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] < MinimumNumberInArray)
           {
               MinimumNumberInArray = Array[i] ;
           }
       }
       
       return MinimumNumberInArray ;
   }
   public static int MinimumNumberInArray(int [] Array)
   {
       int MinimumNumberInArray = Integer.MAX_VALUE ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] < MinimumNumberInArray)
           {
               MinimumNumberInArray = Array[i] ;
           }
       }
       
       return MinimumNumberInArray ;
   }
   
   public static short MinimumNumberInArray(short [] Array)
   {
       short MinimumNumberInArray = Short.MAX_VALUE ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] < MinimumNumberInArray)
           {
               MinimumNumberInArray = Array[i] ;
           }
       }
       
       return MinimumNumberInArray ;
   }
   
   public static long MinimumNumberInArray(long [] Array)
   {
       long MinimumNumberInArray = Long.MAX_VALUE ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] < MinimumNumberInArray)
           {
               MinimumNumberInArray = Array[i] ;
           }
       }
       
       return MinimumNumberInArray ;
   }
   
   public static double MinimumNumberInArray(double []Array)
   {
       double MinimumNumberInArray = Double.MAX_VALUE ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] < MinimumNumberInArray)
           {
               MinimumNumberInArray = Array[i] ;
           }
       }
       
       return MinimumNumberInArray ;
   }
   
   public static float MinimumNumberInArray(float [] Array)
   {
       float MinimumNumberInArray = Float.MAX_VALUE ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i] < MinimumNumberInArray)
           {
               MinimumNumberInArray = Array[i] ;
           }
       }
       
       return MinimumNumberInArray ;
   }
   
   
   public static long ArraySum(byte Array[])
   {
       long ArraySum = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           ArraySum += Array[i] ;
       }
       
       return ArraySum ;
   }
   public static long ArraySum(int Array[])
   {
       long ArraySum = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           ArraySum += Array[i] ;
       }
       
       return ArraySum ;
   }
   
   public static long ArraySum(short Array[])
   {
       long ArraySum = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           ArraySum += Array[i] ;
       }
       
       return ArraySum ;
   }
   
   public static long ArraySum(long Array[])
   {
       long ArraySum = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           ArraySum += Array[i] ;
       }
       
       return ArraySum ;
   }
   
   public static double ArraySum(double Array[])
   {
       double ArraySum = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           ArraySum += Array[i] ;
       }
       
       return ArraySum ;
   }
   
   public static float ArraySum(float Array[])
   {
       float ArraySum = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           ArraySum += Array[i] ;
       }
       
       return ArraySum ;
   }
   
   public static double ArrayAverage(byte Array[])
   {
       return (ArraySum(Array) / Array.length) ;
   }
   public static double ArrayAverage(int Array[])
   {
       return (ArraySum(Array) / Array.length) ;
   }
   
   public static double ArrayAverage(short Array[])
   {
       return (ArraySum(Array) / Array.length) ;
   }
   
   public static double ArrayAverage(long Array[])
   {
       return (ArraySum(Array) / Array.length) ;
   }
   
   public static double ArrayAverage(double Array[])
   {
       return (ArraySum(Array) / Array.length) ;
   }
   
   public static double ArrayAverage(float Array[])
   {
       return (ArraySum(Array) / Array.length) ;
   }
   
   public static boolean AreArraysEqualInSum(byte Array1[] , byte Array2[])
   {
       return (ArraySum(Array1) == ArraySum(Array2)) ;
   }
   public static boolean AreArraysEqualInSum(int Array1[] , int Array2[])
   {
       return (ArraySum(Array1) == ArraySum(Array2)) ;
   }
   
   public static boolean AreArraysEqualInSum(short Array1[] , short Array2[])
   {
       return (ArraySum(Array1) == ArraySum(Array2)) ;
   }
   public static boolean AreArraysEqualInSum(long Array1[] , long Array2[])
   {
       return (ArraySum(Array1) == ArraySum(Array2)) ;
   }
   
   public static boolean AreArraysEqualInSum(double Array1[] , double Array2[])
   {
       return (ArraySum(Array1) == ArraySum(Array2)) ;
   }
   
   public static boolean AreArraysEqualInSum(float Array1[] , float Array2[])
   {
       return (ArraySum(Array1) == ArraySum(Array2)) ;
   }
   
   public static boolean AreArraysEqualInAverage(byte Array1[] , byte Array2[])
   {
       return (ArrayAverage(Array1) == ArrayAverage(Array2)) ;
   } 
   public static boolean AreArraysEqualInAverage(int Array1[] , int Array2[])
   {
       return (ArrayAverage(Array1) == ArrayAverage(Array2)) ;
   } 
   
   public static boolean AreArraysEqualInAverage(float Array1[] , float Array2[])
   {
       return (ArrayAverage(Array1) == ArrayAverage(Array2)) ;
   }
   
   public static boolean AreArraysEqualInAverage(double Array1[] , double Array2[])
   {
       return (ArrayAverage(Array1) == ArrayAverage(Array2)) ;
   } 
   
   public static int CountTRUEValuesInArray(boolean Array[])
   {
       int TRUEValuesCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i])
           {
               TRUEValuesCounter++ ;
           }
       }
       
       return TRUEValuesCounter ;
   }
   public static int CountFALSEValuesInArray(boolean Array[])
   {
       int FALSEValuesCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(!Array[i])
           {
               FALSEValuesCounter++ ;
           }
       }
       
       return FALSEValuesCounter ;
   }
   
   public static int CountEvenNumbersInArray(byte Array[])
   {
       int EvenNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               EvenNumbersCounter++ ;
           }
       }
       
       return EvenNumbersCounter ;
   }
   public static int CountEvenNumbersInArray(int Array[])
   {
       int EvenNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               EvenNumbersCounter++ ;
           }
       }
       
       return EvenNumbersCounter ;
   }
   
   public static int CountEvenNumbersInArray(short Array[])
   {
       int EvenNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               EvenNumbersCounter++ ;
           }
       }
       
       return EvenNumbersCounter ;
   }
   
   public static int CountEvenNumbersInArray(long Array[])
   {
       int EvenNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               EvenNumbersCounter++ ;
           }
       }
       
       return EvenNumbersCounter ;
   }
   
   public static int CountOddNumbersInArray(byte Array[])
   {
       int OddNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               OddNumbersCounter++ ;
           }
       }
       
       return OddNumbersCounter ;
   }
   public static int CountOddNumbersInArray(int Array[])
   {
       int OddNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               OddNumbersCounter++ ;
           }
       }
       
       return OddNumbersCounter ;
   }
   
   public static int CountOddNumbersInArray(short Array[])
   {
       int OddNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               OddNumbersCounter++ ;
           }
       }
       
       return OddNumbersCounter ;
   }
   
   public static int CountOddNumbersInArray(long Array[])
   {
       int OddNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               OddNumbersCounter++ ;
           }
       }
       
       return OddNumbersCounter ;
   }
   
   public static int CountPositiveNumbersInArray(byte Array[])
   {
       int PositiveNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               PositiveNumbersCounter++ ;
           }
       }
       
       return PositiveNumbersCounter ;
   }
   public static int CountPositiveNumbersInArray(int Array[])
   {
       int PositiveNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               PositiveNumbersCounter++ ;
           }
       }
       
       return PositiveNumbersCounter ;
   }
   
   public static int CountPositiveNumbersInArray(short Array[])
   {
       int PositiveNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               PositiveNumbersCounter++ ;
           }
       }
       
       return PositiveNumbersCounter ;
   }
   
   public static int CountPositiveNumbersInArray(long Array[])
   {
       int PositiveNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               PositiveNumbersCounter++ ;
           }
       }
       
       return PositiveNumbersCounter ;
   }
   
   public static int CountPositiveNumbersInArray(double Array[])
   {
       int PositiveNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               PositiveNumbersCounter++ ;
           }
       }
       
       return PositiveNumbersCounter ;
   }
   
   public static int CountPositiveNumbersInArray(float Array[])
   {
       int PositiveNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               PositiveNumbersCounter++ ;
           }
       }
       
       return PositiveNumbersCounter ;
   }
   
   public static int CountNegativeNumbersInArray(byte Array[])
   {
       int NegativeNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               NegativeNumbersCounter++ ;
           }
       }
       
       return NegativeNumbersCounter ;
   }
   public static int CountNegativeNumbersInArray(int Array[])
   {
       int NegativeNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               NegativeNumbersCounter++ ;
           }
       }
       
       return NegativeNumbersCounter ;
   }
   
   public static int CountNegativeNumbersInArray(short Array[])
   {
       int NegativeNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               NegativeNumbersCounter++ ;
           }
       }
       
       return NegativeNumbersCounter ;
   }
   
   public static int CountNegativeNumbersInArray(long Array[])
   {
       int NegativeNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               NegativeNumbersCounter++ ;
           }
       }
       
       return NegativeNumbersCounter ;
   }
   
   public static int CountNegativeNumbersInArray(double Array[])
   {
       int NegativeNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               NegativeNumbersCounter++ ;
           }
       }
       
       return NegativeNumbersCounter ;
   }
   
   public static int CountNegativeNumbersInArray(float Array[])
   {
       int NegativeNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               NegativeNumbersCounter++ ;
           }
       }
       
       return NegativeNumbersCounter ;
   }
   
   public static int CountPrimeNumbersInArray(byte Array[])
   {
       int PrimeNumbersCounter = 0 ; 
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               PrimeNumbersCounter++ ;
           }
       }
       
       return PrimeNumbersCounter ;
   }
   public static int CountPrimeNumbersInArray(int Array[])
   {
       int PrimeNumbersCounter = 0 ; 
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               PrimeNumbersCounter++ ;
           }
       }
       
       return PrimeNumbersCounter ;
   }
   
   public static int CountPrimeNumbersInArray(short Array[])
   {
       int PrimeNumbersCounter = 0 ; 
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               PrimeNumbersCounter++ ;
           }
       }
       
       return PrimeNumbersCounter ;
   }
   
   public static int CountPrimeNumbersInArray(long Array[])
   {
       int PrimeNumbersCounter = 0 ; 
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               PrimeNumbersCounter++ ;
           }
       }
       
       return PrimeNumbersCounter ;
   }
   
   public static int CountPerfectNumbersInArray(byte Array[])
   {
       int PerfectNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               PerfectNumbersCounter++ ;
           }
       }
       
       return PerfectNumbersCounter ;
   }
   public static int CountPerfectNumbersInArray(int Array[])
   {
       int PerfectNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               PerfectNumbersCounter++ ;
           }
       }
       
       return PerfectNumbersCounter ;
   }
   
   public static int CountPerfectNumbersInArray(short Array[])
   {
       int PerfectNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               PerfectNumbersCounter++ ;
           }
       }
       
       return PerfectNumbersCounter ;
   }
   
   public static int CountPerfectNumbersInArray(long Array[])
   {
       int PerfectNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               PerfectNumbersCounter++ ;
           }
       }
       
       return PerfectNumbersCounter ;
   }
   
   public static int CountIntersectedNumbersInArray(byte Array1[] , byte Array2[])
   {
       int IntersectedNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2))
           {
               IntersectedNumbersCounter++ ;
           }
       }
       
       return IntersectedNumbersCounter ;
   }
   public static int CountIntersectedNumbersInArray(int Array1[] , int Array2[])
   {
       int IntersectedNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2))
           {
               IntersectedNumbersCounter++ ;
           }
       }
       
       return IntersectedNumbersCounter ;
   }
   
   public static int CountIntersectedNumbersInArray(short Array1[] , short Array2[])
   {
       int IntersectedNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2))
           {
               IntersectedNumbersCounter++ ;
           }
       }
       
       return IntersectedNumbersCounter ;
   }
   
   public static int CountIntersectedNumbersInArray(long Array1[] , long Array2[])
   {
       int IntersectedNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2))
           {
               IntersectedNumbersCounter++ ;
           }
       }
       
       return IntersectedNumbersCounter ;
   }
   
   public static int CountIntersectedBooleanInArray(boolean Array1[] , boolean Array2[])
   {
       int IntersectedBooleanCounter = 0 ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsBooleanFoundInArray(Array1[i], Array2))
           {
               IntersectedBooleanCounter++ ;
           }
       }
       
       return IntersectedBooleanCounter ;
   }
   
   public static int CountIntersectedNumbersInArray(double Array1[] , double Array2[])
   {
       int IntersectedNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array1.length ;i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2))
           {
               IntersectedNumbersCounter++;
           }
       }
       
       return IntersectedNumbersCounter ;
   }
   
   public static int CountIntersectedNumbersInArray(float Array1[] , float Array2[])
   {
       int IntersectedNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2))
           {
               IntersectedNumbersCounter++ ;
           }
       }
       
       return IntersectedNumbersCounter ;
   }
   
   public static int CountIntersectedCharcatersInArray(char Array1[] , char Array2[])
   {
       int IntersectedCharactersCounter = 0 ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsCharacterFoundInArrayOrNot(Array1[i], Array2))
           {
               IntersectedCharactersCounter++ ;
           }
       }
       
       return IntersectedCharactersCounter ;
   }
   
   public static int CountIntersectedStringsInArray(String Array1[] , String Array2[])
   {
       int IntersectedStringsCounter = 0 ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsStringFoundInArrayOrNot(Array1[i], Array2))
           {
               IntersectedStringsCounter++ ;
           }
       }
       
       return IntersectedStringsCounter ;
   }
   
   public static int CountDistinctNumbersInArray(byte Array[])
   {
       int DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               DistinctNumbersCounter++ ;
           }
       }
       
       return DistinctNumbersCounter ;
   }
   public static int CountDistinctNumbersInArray(int Array[])
   {
       int DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               DistinctNumbersCounter++ ;
           }
       }
       
       return DistinctNumbersCounter ;
   }
   
   public static int CountDistinctNumbersInArray(short Array[])
   {
       int DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               DistinctNumbersCounter++ ;
           }
       }
       
       return DistinctNumbersCounter ;
   }
   
   public static int CountDistinctNumbersInArray(long Array[])
   {
       int DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               DistinctNumbersCounter++ ;
           }
       }
       
       return DistinctNumbersCounter ;
   }
   
   public static int CountDistinctBooleansInArray(boolean Array[])
   {
       int DistinctBooleansCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctBooleanInArray(Array[i], Array))
           {
               DistinctBooleansCounter++ ;
           }
       }
       
       return DistinctBooleansCounter ;
   }
   
   public static int CountDistinctNumbersInArray(double Array[])
   {
       int DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i] , Array))
           {
               DistinctNumbersCounter++ ;
           }
       }
       
       return DistinctNumbersCounter ;
   }
   
   public static int CountDistinctNumbersInArray(float Array[])
   {
       int DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i] , Array))
           {
               DistinctNumbersCounter++ ;
           }
       }
       
       return DistinctNumbersCounter ;
   }
   
   public static int CountDistinctCharactersInArray(char Array[])
   {
       int DistinctCharactersCounter = 0 ;
       
       for(int i = 0 ; i < Array.length; i++)
       {
           if(IsDistinctCharacterInArray(Array[i], Array))
           {
               DistinctCharactersCounter++ ;
           }
       }
       
       return DistinctCharactersCounter ;
   }
   
   public static int CountDistinctSringInArray(String Array[])
   {
       int DistinctStringsCounter = 0 ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctStringInArray(Array[i], Array))
           {
               DistinctStringsCounter++ ;
           }
       }
       
       return DistinctStringsCounter ;
   }
   
   public static byte[] GetEvenNumbersArray(byte Array[])
   {
       byte EvenNumbersArray[] = new byte[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               EvenNumbersArray = AddArrayElement(Array[i], EvenNumbersArray);
           }
       }
       
       return EvenNumbersArray;
   }
   public static int[] GetEvenNumbersArray(int Array[])
   {
       int EvenNumbersArray[] = new int[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               EvenNumbersArray = AddArrayElement(Array[i], EvenNumbersArray);
           }
       }
       
       return EvenNumbersArray;
   }
   
   public static short[] GetEvenNumbersArray(short Array[])
   {
       short EvenNumbersArray[] = new short[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               EvenNumbersArray = AddArrayElement(Array[i], EvenNumbersArray);
           }
       }
       
       return EvenNumbersArray;
   }
   
   public static long[] GetEvenNumbersArray(long Array[])
   {
       long EvenNumbersArray[] = new long[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               EvenNumbersArray = AddArrayElement(Array[i], EvenNumbersArray);
           }
       }
       
       return EvenNumbersArray;
   }
   
   public static byte[] GetOddNumbersArray(byte Array[])
   {
       byte OddNumbersArray[] = new byte [0] ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               OddNumbersArray = AddArrayElement(Array[i], OddNumbersArray) ;
           }
       }
       
       return OddNumbersArray;
   }
   public static int[] GetOddNumbersArray(int Array[])
   {
       int OddNumbersArray[] = new int [0] ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               OddNumbersArray = AddArrayElement(Array[i], OddNumbersArray) ;
           }
       }
       
       return OddNumbersArray;
   }
   
   public static short[] GetOddNumbersArray(short Array[])
   {
       short OddNumbersArray[] = new short[0] ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               OddNumbersArray = AddArrayElement(Array[i], OddNumbersArray) ;
           }
       }
       
       return OddNumbersArray;
   }
   
   public static long[] GetOddNumbersArray(long Array[])
   {
       long OddNumbersArray[] = new long[0] ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               OddNumbersArray = AddArrayElement(Array[i], OddNumbersArray) ;
           }
       }
       
       return OddNumbersArray;
   }
   
   public static byte[] GetPrimeNumbersArray(byte Array[])
   {
       byte PrimeNumbersArray[] = new byte [0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               PrimeNumbersArray = AddArrayElement(Array[i] , PrimeNumbersArray) ;
           }
       }
       
       return PrimeNumbersArray;
   }
   public static int[] GetPrimeNumbersArray(int Array[])
   {
       int PrimeNumbersArray[] = new int [0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               PrimeNumbersArray = AddArrayElement(Array[i] , PrimeNumbersArray) ;
           }
       }
       
       return PrimeNumbersArray;
   }
   
   public static short[] GetPrimeNumbersArray(short Array[])
   {
       short PrimeNumbersArray[] = new short[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               PrimeNumbersArray = AddArrayElement(Array[i] , PrimeNumbersArray) ;
           }
       }
       
       return PrimeNumbersArray;
   }
   
   public static long[] GetPrimeNumbersArray(long Array[])
   {
       long PrimeNumbersArray[] = new long [0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               PrimeNumbersArray = AddArrayElement(Array[i] , PrimeNumbersArray) ;
           }
       }
       
       return PrimeNumbersArray;
   }
   
   public static byte[] GetPerfectNumbersArray(byte Array[])
   {
       byte PerfectNumbersArray[] = new byte [0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               PerfectNumbersArray = AddArrayElement(Array[i] , PerfectNumbersArray) ;
           }
       }
       
       return PerfectNumbersArray ;
   }
   public static int[] GetPerfectNumbersArray(int Array[])
   {
       int PerfectNumbersArray[] = new int [0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               PerfectNumbersArray = AddArrayElement(Array[i] , PerfectNumbersArray) ;
           }
       }
       
       return PerfectNumbersArray ;
   }
   
   public static short[] GetPerfectNumbersArray(short Array[])
   {
       short PerfectNumbersArray[] = new short [0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               PerfectNumbersArray = AddArrayElement(Array[i] , PerfectNumbersArray) ;
           }
       }
       
       return PerfectNumbersArray ;
   }
   
   public static long[] GetPerfectNumbersArray(long Array[])
   {
       long PerfectNumbersArray[] = new long[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               PerfectNumbersArray = AddArrayElement(Array[i] , PerfectNumbersArray) ;
           }
       }
       
       return PerfectNumbersArray ;
   }
   
   public static boolean[] GetTRUEValuesArray(boolean[] Array)
   {
       boolean TRUEValuesArray[] = new boolean[0] ;
       
       for(int i = 0 ; i  < Array.length ; i++)
       {
           if(Array[i])
           {
               TRUEValuesArray = AddArrayElement(Array[i], TRUEValuesArray);
           }
       }
       
       return TRUEValuesArray ;
   }
   public static boolean[] GetFALSEValuesArray(boolean[] Array)
   {
       boolean FALSEValuesArray[] = new boolean[0] ;
       
       for(int i = 0 ; i  < Array.length ; i++)
       {
           if(!Array[i])
           {
               FALSEValuesArray = AddArrayElement(Array[i], FALSEValuesArray);
           }
       }
       
       return FALSEValuesArray ;
   }
   
   public static byte[]GetPositiveNumbersArray(byte Array[])
   {
       byte[] PositiveNumbersArray = new byte[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
           PositiveNumbersArray = AddArrayElement(Array[i] , PositiveNumbersArray) ;
           }
       }
       
       return PositiveNumbersArray ;
   }
   public static int[]GetPositiveNumbersArray(int Array[])
   {
       int[] PositiveNumbersArray = new int[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
           PositiveNumbersArray = AddArrayElement(Array[i] , PositiveNumbersArray) ;
           }
       }
       
       return PositiveNumbersArray ;
   }
   
   public static short[]GetPositiveNumbersArray(short Array[])
   {
       short[] PositiveNumbersArray = new short[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
           PositiveNumbersArray = AddArrayElement(Array[i] , PositiveNumbersArray) ;
           }
       }
       
       return PositiveNumbersArray ;
   }
   
   public static long[]GetPositiveNumbersArray(long Array[])
   {
       long[] PositiveNumbersArray = new long[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
           PositiveNumbersArray = AddArrayElement(Array[i] , PositiveNumbersArray) ;
           }
       }
       
       return PositiveNumbersArray ;
   }
   
   public static double[] GetPositiveNumbersArray(double Array[])
   {
       double[] PositiveNumbersArray = new double [0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               PositiveNumbersArray = AddArrayElement(Array[i] , PositiveNumbersArray) ;
           }
       }
       
       return PositiveNumbersArray ;
   }
   
   public static float[] GetPositiveNumbersArray(float Array[])
   {
       float [] PositiveNumbersArray = new float [0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               PositiveNumbersArray = AddArrayElement(Array[i] , PositiveNumbersArray) ;
           }
       }
       
       return PositiveNumbersArray ;
   }
   
   public static byte[] GetNegativeNumbersArray(byte Array[])
   {
       byte [] NegativeNumbersArray = new byte[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
           NegativeNumbersArray = AddArrayElement(Array[i] , NegativeNumbersArray) ;
           }
       }
       
       return NegativeNumbersArray;
   }
   public static int[] GetNegativeNumbersArray(int Array[])
   {
       int [] NegativeNumbersArray = new int[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
           NegativeNumbersArray = AddArrayElement(Array[i] , NegativeNumbersArray) ;
           }
       }
       
       return NegativeNumbersArray;
   }
   
   public static short[] GetNegativeNumbersArray(short Array[])
   {
       short [] NegativeNumbersArray = new short[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
           NegativeNumbersArray = AddArrayElement(Array[i] , NegativeNumbersArray) ;
           }
       }
       
       return NegativeNumbersArray;
   }
   
   public static long[] GetNegativeNumbersArray(long Array[])
   {
       long [] NegativeNumbersArray = new long[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
           NegativeNumbersArray = AddArrayElement(Array[i] , NegativeNumbersArray) ;
           }
       }
       
       return NegativeNumbersArray;
   }
   
   public static double[] GetNegativeNumbersArray(double Array[])
   {
       double [] NegativeNumbersArray = new double[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               NegativeNumbersArray = AddArrayElement(Array[i] ,NegativeNumbersArray) ;
           }
       }
       
       return NegativeNumbersArray ;
   }
   
   public static float[] GetNegativeNumbersArray(float Array[])
   {
       float [] NegativeNumbersArray = new float [0] ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               NegativeNumbersArray = AddArrayElement(Array[i] , NegativeNumbersArray) ;
           }
       }
       
       return NegativeNumbersArray ;
   }
   
   public static byte[] GetDistinctNumbersArray(byte Array[])
   {
       byte []DistinctNumbersArray = new byte[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
           DistinctNumbersArray = AddArrayElement(Array[i] , DistinctNumbersArray) ;
           }
       }
       
       return DistinctNumbersArray ;
   }
   public static int[] GetDistinctNumbersArray(int Array[])
   {
       int []DistinctNumbersArray = new int[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
           DistinctNumbersArray = AddArrayElement(Array[i] , DistinctNumbersArray) ;
           }
       }
       
       return DistinctNumbersArray ;
   }
   
   public static short[] GetDistinctNumbersArray(short Array[])
   {
       short []DistinctNumbersArray = new short[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
           DistinctNumbersArray = AddArrayElement(Array[i] , DistinctNumbersArray) ;
           }
       }
       
       return DistinctNumbersArray ;
   }
   
   public static long[] GetDistinctNumbersArray(long Array[])
   {
       long []DistinctNumbersArray = new long[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
           DistinctNumbersArray = AddArrayElement(Array[i] , DistinctNumbersArray) ;
           }
       }
       
       return DistinctNumbersArray ;
   }
   
   public static boolean[] GetDistinctBooleansArray(boolean Array[])
   {
       boolean []DistinctNumbersArray = new boolean[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctBooleanInArray(Array[i], Array))
           {
           DistinctNumbersArray = AddArrayElement(Array[i] , DistinctNumbersArray) ;
           }
       }
       
       return DistinctNumbersArray ;
   }
   
   public static double[] GetDistinctNumbersArray(double Array[])
   {
       double [] DistinctNumbersArray = new double[0] ;
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
             DistinctNumbersArray = AddArrayElement(Array[i] , DistinctNumbersArray) ;  
           }
       }
       
       return DistinctNumbersArray ;
   }
   
   public static float[] GetDistinctNumbersArray(float Array[])
   {
       float [] DistinctNumbersArray = new float [0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               DistinctNumbersArray = AddArrayElement(Array[i] , DistinctNumbersArray);
            }
       }
       
       return DistinctNumbersArray ;
   }
   
   public static char[] GetDistinctCharactersArray(char Array[])
   {
       char [] DistinctCharactersArray = new char[0];
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctCharacterInArray(Array[i], Array))
           {
               DistinctCharactersArray = AddArrayElement(Array[i] , DistinctCharactersArray) ;
           }
       }
       
       return DistinctCharactersArray ;
   }
   
   public static String[] GetDistinctStringsArray(String Array[])
   {
       String [] DistinctStringsArray = new String[0];
       
       for(int i = 0; i < Array.length ; i++)
       {
           if(IsDistinctStringInArray(Array[i], Array))
           {
               DistinctStringsArray = AddArrayElement(Array[i] , DistinctStringsArray) ;
           }
       }
       
       return DistinctStringsArray;
   }
   
   public static byte[] GetIntersectedNumbersArray(byte [] Array1 , byte Array2[])
   {
       byte [] IntersectedNumbersArray = new byte[0];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2) && !IsNumberFoundInArray(Array1[i], IntersectedNumbersArray))
           {
               IntersectedNumbersArray = AddArrayElement(Array1[i] , IntersectedNumbersArray) ;
           }
       }
       
       return IntersectedNumbersArray ;
   }
   public static int[] GetIntersectedNumbersArray(int [] Array1 , int Array2[])
   {
       int [] IntersectedNumbersArray = new int[0];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2) && !IsNumberFoundInArray(Array1[i], IntersectedNumbersArray))
           {
               IntersectedNumbersArray = AddArrayElement(Array1[i] , IntersectedNumbersArray) ;
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static short[] GetIntersectedNumbersArray(short [] Array1 , short Array2[])
   {
       short [] IntersectedNumbersArray = new short[0];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2) && !IsNumberFoundInArray(Array1[i], IntersectedNumbersArray))
           {
               IntersectedNumbersArray = AddArrayElement(Array1[i] , IntersectedNumbersArray) ;
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static long[] GetIntersectedNumbersArray(long [] Array1 , long Array2[])
   {
       long [] IntersectedNumbersArray = new long[0];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2) && !IsNumberFoundInArray(Array1[i], IntersectedNumbersArray))
           {
               IntersectedNumbersArray = AddArrayElement(Array1[i] , IntersectedNumbersArray) ;
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static boolean[] GetIntersectedBooleansArray(boolean [] Array1 , boolean Array2[])
   {
       boolean [] IntersectedBooleansArray = new boolean[0];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsBooleanFoundInArray(Array1[i], Array2) && !IsBooleanFoundInArray(Array1[i], IntersectedBooleansArray))
           {
               IntersectedBooleansArray = AddArrayElement(Array1[i] , IntersectedBooleansArray) ;
           }
       }
       
       return IntersectedBooleansArray ;
   }
   
   public static double[] GetIntersectedNumbersArray(double Array1[] , double Array2[])
   {
       double IntersectedNumbersArray[] = new double [0];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2) && !IsNumberFoundInArray(Array1[i], IntersectedNumbersArray))
           {
               IntersectedNumbersArray = AddArrayElement(Array1[i] , IntersectedNumbersArray) ;
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static float[] GetIntersectedNumbersArray(float Array1[] , float Array2[])
   {
       float IntersectedNumbersArray[] = new float [0];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsNumberFoundInArray(Array1[i], Array2) && !IsNumberFoundInArray(Array1[i], IntersectedNumbersArray))
           {
               IntersectedNumbersArray = AddArrayElement(Array1[i] , IntersectedNumbersArray) ;
           }
       }
       return IntersectedNumbersArray ;
   }
   
   public static char[] GetIntersectedCharactersArray(char Array1[] , char Array2[])
   {
       char IntersectedCharactersArray[] = new char[0];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsCharacterFoundInArrayOrNot(Array1[i], Array2) && !IsCharacterFoundInArrayOrNot(Array1[i], IntersectedCharactersArray))
           {
               IntersectedCharactersArray = AddArrayElement(Array1[i] , IntersectedCharactersArray) ;
           }
       }
       
       return IntersectedCharactersArray ;
   }
   
   public static String[] GetIntersectedStringsArray(String Array1[] , String Array2[])
   {
       String IntersectedStringsArray[] = new String[0] ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(IsStringFoundInArrayOrNot(Array1[i], Array2) && !IsStringFoundInArrayOrNot(Array1[i], IntersectedStringsArray))
           {
               IntersectedStringsArray = AddArrayElement(Array1[i] , IntersectedStringsArray) ; 
           }
       }
       
       return IntersectedStringsArray ;
   }
   
   public static byte[] DeleteEvenNumbersFromArray(byte []Array)
   {
       
       for(int i = 0 ; i < Array.length;i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array) ;
           }
       }
       
       return Array ;
   }
   public static int[] DeleteEvenNumbersFromArray(int []Array)
   {
       
       for(int i = 0 ; i < Array.length;i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array) ;
           }
       }
       
       return Array ;
   }
   
   public static long[] DeleteEvenNumbersFromArray(long []Array)
   {
       
       for(int i = 0 ; i < Array.length;i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array) ;
           }
       }
       
       return Array ;
   }
   
   public static short[] DeleteEvenNumbersFromArray(short []Array)
   {
       
       for(int i = 0 ; i < Array.length;i++)
       {
           if(IsEvenNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array) ;
           }
       }
       
       return Array ;
   }
   
   public static byte[] DeleteOddNumbersFromArray(byte[]Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array) ;
           }
       }
       
       return Array ;
   }
   public static int[] DeleteOddNumbersFromArray(int[]Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array) ;
           }
       }
       
       return Array ;
   }
   
   public static short[] DeleteOddNumbersFromArray(short[]Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array) ;
           }
       }
       
       return Array ;
   }
   
   public static long[] DeleteOddNumbersFromArray(long[]Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsOddNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array) ;
           }
       }
       
       return Array ;
   }
   
   public static byte[] DeletePrimeNumbersFromArray(byte []Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   public static int[] DeletePrimeNumbersFromArray(int []Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static short[] DeletePrimeNumbersFromArray(short []Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static long[] DeletePrimeNumbersFromArray(long []Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPrimeNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static byte[] DeletePerfectNumbersFromArray(byte []Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
       
   }
   public static int[] DeletePerfectNumbersFromArray(int []Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
       
   }
   
   public static short[] DeletePerfectNumbersFromArray(short []Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
       
   }
   
   public static long[] DeletePerfectNumbersFromArray(long []Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPerfectNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
       
   }
   
   public static byte[] DeletePositiveNumbersFromArray(byte[] Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
            Array = DeleteArrayElement(i, Array) ;   
           }
       }
       
       return Array ;
   }
   public static int[] DeletePositiveNumbersFromArray(int[] Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
            Array = DeleteArrayElement(i, Array) ;   
           }
       }
       
       return Array ;
   }
   
   public static short[] DeletePositiveNumbersFromArray(short[] Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
            Array = DeleteArrayElement(i, Array) ;   
           }
       }
       
       return Array ;
   }
   
   public static long[] DeletePositiveNumbersFromArray(long[] Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
            Array = DeleteArrayElement(i, Array) ;   
           }
       }
       
       return Array ;
   }
   
   public static double[] DeletePositiveNumbersFromArray(double Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static float[] DeletePositiveNumbersFromArray(float Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsPositiveNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static byte[] DeleteNegativeNumbersFromArray(byte[] Array)
   {
       for(int  i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   public static int[] DeleteNegativeNumbersFromArray(int[] Array)
   {
       for(int  i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static short[] DeleteNegativeNumbersFromArray(short[] Array)
   {
       for(int  i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static long[] DeleteNegativeNumbersFromArray(long[] Array)
   {
       for(int  i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static double[] DeleteNegativeNumbersFromArray(double[]Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static float[] DeleteNegativeNumbersFromArray(float[] Array)
   {
       for(int i = 0 ; i  <Array.length ; i++)
       {
           if(IsNegativeNumber(Array[i]))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static boolean[] DeleteTRUEValuesFromArray(boolean[] Array)
   {
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(Array[i])
           {
               Array = DeleteArrayElement(i , Array) ;
           }
       }
       
       return Array ;
   }
   
   public static boolean[] DeleteFALSEValuesFromArray(boolean[] Array)
   {
       
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(!Array[i])
           {
               Array = DeleteArrayElement(i , Array) ;
           }
       }
       
       return Array ;
   }
   
   public static byte[] DeleteDistinctNumbersFromArray(byte[]Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   public static int[] DeleteDistinctNumbersFromArray(int[]Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static short[] DeleteDistinctNumbersFromArray(short[]Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static long[] DeleteDistinctNumbersFromArray(long[]Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static boolean[] DeleteDistinctBooleansFromArray(boolean[]Array)
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctBooleanInArray(Array[i], Array))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static double[] DeleteDistinctNumbersFromArray(double Array[])
   {
       for(int i = 0 ; i < Array.length ;i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static float[] DeleteDistinctNumbersFromArray(float Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctNumberInArray(Array[i], Array))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static char[] DeleteDistinctCharactersFromArray(char Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctCharacterInArray(Array[i], Array))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static String[] DeleteDistinctStringsFromArray(String Array[])
   {
       for(int i = 0 ; i < Array.length ; i++)
       {
           if(IsDistinctStringInArray(Array[i], Array))
           {
               Array = DeleteArrayElement(i, Array);
           }
       }
       
       return Array ;
   }
   
   public static short[] AddTwoArrays(byte Array1[] , byte Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       short Array3[] = new short[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] =  (short)(Array1[i] + Array2[i]) ;
       }
       
       return Array3 ;
   }
   public static long[] AddTwoArrays(int Array1[] , int Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       long Array3[] = new long[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = Array1[i] + Array2[i] ;
       }
       
       return Array3 ;
   }
   
   public static int[] AddTwoArrays(short Array1[] , short Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       int Array3[] = new int[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] =  (Array1[i] + Array2[i]) ;
       }
       
       return Array3 ;
   }
   
   public static long[] AddTwoArrays(long Array1[] , long Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       long Array3[] = new long[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = Array1[i] + Array2[i] ;
       }
       
       return Array3 ;
   }
   
   public static double[] AddTwoArrays(float Array1[] , float Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       double Array3[] = new double [Array1.length] ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = Array1[i] + Array2[i] ;
       }
       
       return Array3;
   }
   
   public static double[]AddTwoArrays(double Array1[] , double Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       double Array3[] = new double[Array1.length] ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = Array1[i] + Array2[i] ;
       }
       
       return Array3 ;
   }
   
   public static byte[] DifferenceTwoArrays(byte Array1[] , byte Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       byte Array3[] = new byte[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = (byte) (Array1[i] - Array2[i]) ;
       }
       
       return Array3 ;
   }
   public static int[] DifferenceTwoArrays(int Array1[] , int Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       int Array3[] = new int[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = Array1[i] - Array2[i] ;
       }
       
       return Array3 ;
   }
   
   public static short[] DifferenceTwoArrays(short Array1[] , short Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       short Array3[] = new short[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = (short) (Array1[i] - Array2[i]) ;
       }
       
       return Array3 ;
   }
   
   public static long[] DifferenceTwoArrays(long Array1[] , long Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       long Array3[] = new long[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = Array1[i] - Array2[i] ;
       }
       
       return Array3 ;
   }
   
   public static float[] DifferenceTwoArrays(float Array1[] , float Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       float Array3[] = new float [Array1.length] ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = Array1[i] - Array2[i] ;
       }
       
       return Array3;
   }
   
   public static double[]DifferenceTwoArrays(double Array1[] , double Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       double Array3[] = new double[Array1.length] ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = Array1[i] - Array2[i] ;
       }
       
       return Array3 ;
   }
   
   public static short[] MultiplyTwoArrays(byte Array1[] , byte Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       short Array3[] = new short[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = (short) (Array1[i] * Array2[i]) ;
       }
       
       return Array3 ;
   }
   public static long[] MultiplyTwoArrays(int Array1[] , int Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       long Array3[] = new long[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = Array1[i] * Array2[i] ;
       }
       
       return Array3 ;
   }
   
   public static int[] MultiplyTwoArrays(short Array1[] , short Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       int Array3[] = new int[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = (short) (Array1[i] * Array2[i]) ;
       }
       
       return Array3 ;
   }
   
   public static long[] MultiplyTwoArrays(long Array1[] , long Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       long Array3[] = new long[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = Array1[i] * Array2[i] ;
       }
       
       return Array3 ;
   }
   
   public static double[] MultiplyTwoArrays(float Array1[] , float Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       double Array3[] = new double [Array1.length] ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = Array1[i] * Array2[i] ;
       }
       
       return Array3;
   }
   
   public static double[]MultiplyTwoArrays(double Array1[] , double Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       double Array3[] = new double[Array1.length] ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           Array3[i] = Array1[i] * Array2[i] ;
       }
       
       return Array3 ;
   }
   
   public static byte[] DivideTwoArrays(byte Array1[] , byte Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       byte Array3[] = new byte[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array2[i] != 0)
           {
            Array3[i] = (byte) (Array1[i] / Array2[i]) ;
           }
           
           else
           {
               Array3[i] = 0 ;
           }
           
       }
       
       return Array3 ;
   }
   public static int[] DivideTwoArrays(int Array1[] , int Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       int Array3[] = new int[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array2[i] != 0)
           {
            Array3[i] = Array1[i] / Array2[i] ;
           }
           
           else
           {
               Array3[i] = 0 ;
           }
           
       }
       
       return Array3 ;
   }
   
   public static short[] DivideTwoArrays(short Array1[] , short Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       short Array3[] = new short[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array2[i] != 0)
           {
            Array3[i] = (short) (Array1[i] / Array2[i]) ;
           }
           
           else
           {
               Array3[i] = 0 ;
           }
           
       }
       
       return Array3 ;
   }
   
   public static long[] DivideTwoArrays(long Array1[] , long Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       long Array3[] = new long[Array1.length];
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array2[i] != 0)
           {
            Array3[i] = Array1[i] / Array2[i] ;
           }
           
           else
           {
               Array3[i] = 0 ;
           }
           
       }
       
       return Array3 ;
   }
   
   public static float[] DivideTwoArrays(float Array1[] , float Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       float Array3[] = new float [Array1.length] ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array2[i] != 0)
           {
           Array3[i] = Array1[i] / Array2[i] ;
           }
           
           else
           {
           Array3[i] = 0 ;        
           }
       }
       
       return Array3;
   }
   
   public static double[]DivideTwoArrays(double Array1[] , double Array2[])
   {
       if(Array1.length > Array2.length)
       {
           return null ;
       }
       
       double Array3[] = new double[Array1.length] ;
       
       for(int i = 0 ; i < Array1.length ; i++)
       {
           if(Array2[i] != 0)
           {
           Array3[i] = Array1[i] / Array2[i] ;
           }
           
           else
           {
               Array3[i] = 0 ;
           }
       }
       
       return Array3 ;
   }
}
