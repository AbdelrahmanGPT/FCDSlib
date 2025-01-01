/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import java.util.Vector;
import static FCDSlib.Read.*;
import static FCDSlib.Utility.*;
import static FCDSlib.StringsM.*;

/**
 *
 * @author AAMY
 */
public class VectorM {
    public static void PrintByteVector(Vector<Byte>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print(Vector.get(i) + " ");
       }
   }
   
   public static void PrintShortVector(Vector<Short>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print(Vector.get(i) + " ");
       }
   }
   
   public static void PrintIntegerVector(Vector<Integer>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print(Vector.get(i) + " ");
       }
   }
   
   public static void PrintLongVector(Vector<Long>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print(Vector.get(i) + " ");
       }
   }
   
   public static void PrintFloatVector(Vector<Float>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print(Vector.get(i) + " ");
       }
   }
   
   public static void PrintDoubleVector(Vector<Double>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print(Vector.get(i) + " ");
       }
   }
   
   public static void PrintCharacterVector(Vector<Character>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print(Vector.get(i) + " ");
       }
   }
   
   public static void PrintStringVector(Vector<String>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print(Vector.get(i) + " ");
       }
   }
   
   public static void PrintBooleanVector(Vector<Boolean>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print(Vector.get(i) + " ");
       }
   }
   
   public static void ReadByteVector(Vector<Byte>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.set(i , ReadByteNumber());
       }
       
   }
   public static void ReadShortVector(Vector<Short>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.set(i , ReadShortNumber());
       }
       
   }
   public static void ReadIntegerVector(Vector<Integer>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.set(i , ReadIntegerNumber());
       }

   }
   public static void ReadLongVector(Vector<Long>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.set(i , ReadLongNumber());
       }
       
   }
   public static void ReadFloatVector(Vector<Float>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.set(i , ReadFloatNumber());
       }
       
   }
   public static void ReadDoubleVector(Vector<Double>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.set(i , ReadDoubleNumber());
       }
       
   }
   public static void ReadCharacterVector(Vector<Character>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.set(i , ReadCharacter());
       }
       
   }
   public static void ReadStringVector(Vector<String>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.set(i , ReadStringLine());
       }
       
   }
   public static void ReadBooleanVector(Vector<Boolean>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.set(i , ReadBooleanValue());
       }
       
   }
   
   public static void ReadEmptyByteVector(Vector<Byte>Vector ,int VectorInitialSize)
   {
       for(int i = 0 ; i < VectorInitialSize ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.add(ReadByteNumber());
       }
       
   }
   public static void ReadEmptyShortVector(Vector<Short>Vector ,int VectorInitialSize)
   {
       for(int i = 0 ; i < VectorInitialSize ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.add(ReadShortNumber());
       }
       
   }
   public static void ReadEmptyIntegerVector(Vector<Integer>Vector ,int VectorInitialSize)
   {
       for(int i = 0 ; i < VectorInitialSize ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.add(ReadIntegerNumber());
       }
       
   }
   public static void ReadEmptyLongVector(Vector<Long>Vector ,int VectorInitialSize)
   {
       for(int i = 0 ; i < VectorInitialSize ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.add(ReadLongNumber());
       }
       
   }
   public static void ReadEmptyFloatVector(Vector<Float>Vector ,int VectorInitialSize)
   {
       for(int i = 0 ; i < VectorInitialSize ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.add(ReadFloatNumber());
       }
       
   }
   public static void ReadEmptyDoubleVector(Vector<Double>Vector ,int VectorInitialSize)
   {
       for(int i = 0 ; i < VectorInitialSize ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.add(ReadDoubleNumber());
       }
       
   }
   public static void ReadEmptyCharacterVector(Vector<Character>Vector ,int VectorInitialSize)
   {
       for(int i = 0 ; i < VectorInitialSize ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.add(ReadCharacter());
       }
       
   }
   public static void ReadEmptyStringVector(Vector<String>Vector ,int VectorInitialSize)
   {
       for(int i = 0 ; i < VectorInitialSize ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.add(ReadStringLine());
       }
       
   }
   public static void ReadEmptyBooleanVector(Vector<Boolean>Vector ,int VectorInitialSize)
   {
       for(int i = 0 ; i < VectorInitialSize ; i++)
       {
           System.out.print("ELEMENT [" + (i+1) + "] : ");
           Vector.add(ReadBooleanValue());
       }
       
   }
   
   public static int CountByteNumberInByteVector(byte Number , Vector<Byte>Vector)
   {
       int NumberFrequency = 0 ;
       
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           if(Vector.get(i) == Number)
           {
               NumberFrequency++ ;
           }
       }
       
       return NumberFrequency ;
   }
   public static int CountShortNumberInShortVector(short Number , Vector<Short>Vector)
   {
       int NumberFrequency = 0 ;
       
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           if(Vector.get(i) == Number)
           {
               NumberFrequency++ ;
           }
       }
       
       return NumberFrequency ;
   }
   public static int CountIntegerNumberInIntegerVector(int Number , Vector<Integer>Vector)
   {
       int NumberFrequency = 0 ;
       
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           if(Vector.get(i) == Number)
           {
               NumberFrequency++ ;
           }
       }
       
       return NumberFrequency ;
   }
   public static int CountLongNumberInLongVector(long Number , Vector<Long>Vector)
   {
       int NumberFrequency = 0 ;
       
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           if(Vector.get(i) == Number)
           {
               NumberFrequency++ ;
           }
       }
       
       return NumberFrequency ;
   }
   public static int CountFloatNumberInFloatVector(float Number , Vector<Float>Vector)
   {
       int NumberFrequency = 0 ;
       
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           if(Vector.get(i) == Number)
           {
               NumberFrequency++ ;
           }
       }
       
       return NumberFrequency ;
   }
   public static int CountDoubleNumberInDoubleVector(double Number , Vector<Double>Vector)
   {
       int NumberFrequency = 0 ;
       
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           if(Vector.get(i) == Number)
           {
               NumberFrequency++ ;
           }
       }
       
       return NumberFrequency ;
   }
   public static int CountCharacterInCharacterVector(char Character , Vector<Character>Vector)
   {
       int CharacterFrequency = 0 ;
       
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           if(Vector.get(i) == Character)
           {
               CharacterFrequency++ ;
           }
       }
       
       return CharacterFrequency ;
   }
   public static int CountStringInStringVector(String StringLine , Vector<String>Vector)
   {
       int StringFrequency = 0 ;
       
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           if(Vector.get(i) == StringLine)
           {
               StringFrequency++ ;
           }
       }
       
       return StringFrequency ;
   }
   public static int CountBooleanInBooleanVector(boolean BooleanValue , Vector<Boolean>Vector)
   {
       int BooleanFrequency = 0 ;
       
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           if(Vector.get(i) == BooleanValue)
           {
               BooleanFrequency++ ;
           }
       }
       
       return BooleanFrequency ;
   }
   
   public static boolean IsDistinctByteNumberInByteVector(byte Number , Vector<Byte>Vector)
   {
       return (CountByteNumberInByteVector(Number, Vector) == 1) ;
   }
   public static boolean IsDistinctShortNumberInShortVector(short Number , Vector<Short>Vector)
   {
       return (CountShortNumberInShortVector(Number, Vector) == 1) ;
   }
   public static boolean IsDistinctIntegerNumberInIntegerVector(int Number , Vector<Integer>Vector)
   {
       return (CountIntegerNumberInIntegerVector(Number, Vector) == 1) ;
   }
   public static boolean IsDistinctLongNumberInLongVector(long Number , Vector<Long>Vector)
   {
       return (CountLongNumberInLongVector(Number, Vector) == 1) ;
   }
   public static boolean IsDistinctFloatNumberInFloatVector(float Number , Vector<Float>Vector)
   {
       return (CountFloatNumberInFloatVector(Number, Vector) == 1) ;
   }
   public static boolean IsDistinctDoubleNumberInDoubleVector(double Number , Vector<Double>Vector)
   {
       return (CountDoubleNumberInDoubleVector(Number, Vector) == 1) ;
   }
   public static boolean IsDistinctCharacterInCharacterVector(char Character , Vector<Character>Vector)
   {
       return (CountCharacterInCharacterVector(Character, Vector) == 1) ;
   }
   public static boolean IsDistinctStringInStringVector(String StringLine , Vector<String>Vector)
   {
       return (CountStringInStringVector(StringLine, Vector) == 1) ;
   }
   public static boolean IsDistinctBooleanValueInBooleanVector(boolean BooleanValue , Vector<Boolean>Vector)
   {
       return (CountBooleanInBooleanVector(BooleanValue, Vector) == 1) ;
   }
   
   public static void FillByteVectorWithZeros(Vector<Byte>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (byte)0) ;
       }
   }
   public static void FillShortVectorWithZeros(Vector<Short>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (short)0) ;
       }
   }
   public static void FillIntegerVectorWithZeros(Vector<Integer>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (int)0) ;
       }
   }
   public static void FillLongVectorWithZeros(Vector<Long>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (long)0) ;
       }
   }
   public static void FillFloatVectorWithZeros(Vector<Float>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (float)0) ;
       }
   }
   public static void FillDoubleVectorWithZeros(Vector<Double>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (double)0) ;
       }
   }
   
   public static void FillByteVectorWithRandomNumbers(Vector<Byte>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (byte)RandomNumber(1, 100));
       }
   }
   public static void FillShortVectorWithRandomNumbers(Vector<Short>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (short)RandomNumber(1, 100));
       }
   }
   public static void FillIntegerVectorWithRandomNumbers(Vector<Integer>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, RandomNumber(1, 100));
       }
   }
   public static void FillLongVectorWithRandomNumbers(Vector<Long>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (long)RandomNumber(1, 100));
       }
   }
   public static void FillFloatVectorWithRandomNumbers(Vector<Float>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (float)RandomNumber(1, 100));
       }
   }
   public static void FillDoubleVectorWithRandomNumbers(Vector<Double>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (double)RandomNumber(1, 100));
       }
   }
   public static void FillByteVectorWithRandomNumbers(Vector<Byte>Vector , int From , int To)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (byte)RandomNumber(From, To));
       }
   }
   public static void FillShortVectorWithRandomNumbers(Vector<Short>Vector , int From, int To)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (short)RandomNumber(From, To));
       }
   }
   public static void FillIntegerVectorWithRandomNumbers(Vector<Integer>Vector , int From , int To)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, RandomNumber(From, To));
       }
   }
   public static void FillLongVectorWithRandomNumbers(Vector<Long>Vector , int From ,int To)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (long)RandomNumber(From, To));
       }
   }
   public static void FillFloatVectorWithRandomNumbers(Vector<Float>Vector , int From ,int To)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (float)RandomNumber(From, To));
       }
   }
   public static void FillDoubleVectorWithRandomNumbers(Vector<Double>Vector , int From , int To)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, (double)RandomNumber(From, To));
       }
   }
   
   public static void FillCharacterVectorWithRandomCharacters(Vector<Character>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, GenerateRandomCharacter());
       }
   }
   public static void FillCharacterVectorWithRandomCharacters(Vector<Character>Vector , char StartCharacter , char EndCharacter)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, GenerateRandomCharacter(StartCharacter , EndCharacter));
       }
   }
   public static void FillCharacterVectorWithRandomCharacters(Vector<Character>Vector , int StartASCIICode , int EndASCIICode)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           Vector.set(i, GenerateRandomCharacter(StartASCIICode , EndASCIICode));
       }
   }
}
