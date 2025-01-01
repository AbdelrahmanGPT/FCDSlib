/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import static FCDSlib.Utility.*;
import static FCDSlib.Read.*;
import static FCDSlib.ArrayM.*;

/**
 *
 * @author AAMY
 */
public class MatrixM {
    public static long CountNumberInMatrix(byte Number , byte Matrix[][] , int Rows , int Columns)
    {
      long NumberFrequency = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix[i][j] == Number)
              {
                  NumberFrequency++ ;
              }
          }
      }
      
      return NumberFrequency;
  }
    public static long CountNumberInMatrix(int Number , int Matrix[][] , int Rows , int Columns)
    {
      long NumberFrequency = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix[i][j] == Number)
              {
                  NumberFrequency++ ;
              }
          }
      }
      
      return NumberFrequency;
  }
    public static long CountNumberInMatrix(short Number , short Matrix[][] , int Rows , int Columns)
    {
      long NumberFrequency = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix[i][j] == Number)
              {
                  NumberFrequency++ ;
              }
          }
      }
      
      return NumberFrequency;
  }
    public static long CountNumberInMatrix(long Number , long Matrix[][] , int Rows , int Columns)
    {
      long NumberFrequency = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix[i][j] == Number)
              {
                  NumberFrequency++ ;
              }
          }
      }
      
      return NumberFrequency;
  }
  
    public static long CountNumberInMatrix(float Number , float Matrix[][] , int Rows , int Columns)
    {
      long NumberFrequency = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix[i][j] == Number)
              {
                  NumberFrequency++ ;
              }
          }
      }
      
      return NumberFrequency;
  }
  
    public static long CountNumberInMatrix(double Number , double Matrix[][] , int Rows , int Columns)
    {
      long NumberFrequency = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix[i][j] == Number)
              {
                  NumberFrequency++ ;
              }
          }
      }
      
      return NumberFrequency;
  }
    public static long CountBooleanInMatrix(boolean Boolean , boolean Matrix[][] , int Rows , int Columns)
    {
      long BooleanFrequency = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix[i][j] == Boolean)
              {
                  BooleanFrequency++ ;
              }
          }
      }
      
      return BooleanFrequency;
  }
  
    public static long CountCharacterInMatrix(char Character , char Matrix[][] , int Rows , int Columns)
    {
      long CharacterFrequency = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Character == Matrix[Rows][Columns])
              {
                  CharacterFrequency++ ;
              }
          }
      }
      
      return CharacterFrequency ;
  }
  
    public static long CountStringInMatrix(String StringWord , String Matrix[][] , int Rows , int Columns)
    {
     long StringFrequency = 0 ;
     
     for(int i = 0 ; i < Rows ; i++)
     {
         for(int j = 0 ; j < Columns ; j++)
         {
             if(StringWord.equals(StringWord))
             {
                 StringFrequency++ ;
             }
         }
     }
     
     return StringFrequency;
     
  }
    
    public static boolean IsDistinctNumberInMatrix(byte Number , byte Matrix[][] , int Rows , int Columns)
    {
        return (CountNumberInMatrix(Number, Matrix, Rows, Columns) == 1);
    }
    public static boolean IsDistinctNumberInMatrix(int Number , int Matrix[][] , int Rows , int Columns)
    {
        return (CountNumberInMatrix(Number, Matrix, Rows, Columns) == 1);
    }
    
    public static boolean IsDistinctNumberInMatrix(short Number , short Matrix[][] , int Rows , int Columns)
    {
        return (CountNumberInMatrix(Number, Matrix, Rows, Columns) == 1);
    }
    
    public static boolean IsDistinctNumberInMatrix(long Number , long Matrix[][] , int Rows , int Columns)
    {
        return (CountNumberInMatrix(Number, Matrix, Rows, Columns) == 1);
    }
    
    public static boolean IsDistinctNumberInMatrix(float Number , float Matrix[][] , int Rows , int Columns)
    {
        return (CountNumberInMatrix(Number, Matrix, Rows, Columns) == 1);
    }
    
    public static boolean IsDistinctNumberInMatrix(double Number , double Matrix[][] , int Rows , int Columns)
    {
        return (CountNumberInMatrix(Number, Matrix, Rows, Columns) == 1);
    }
    
    public static boolean IsDistinctBooleanValueInMatrix(boolean Boolean , boolean Matrix[][] , int Rows , int Columns)
    {
        return (CountBooleanInMatrix(Boolean, Matrix, Rows, Columns) == 1);
    }
    
    public static boolean IsDistinctCharacterInMatrix(char Character , char Matrix[][] , int Rows , int Columns)
    {
        return (CountCharacterInMatrix(Character, Matrix, Rows, Columns) == 1);
    }
    
    public static boolean IsDistinctStringInMatrix(String StringWord , String Matrix[][] , int Rows , int Columns)
    {
        return (CountStringInMatrix(StringWord, Matrix, Rows, Columns) == 1) ;
    }
    
   
   public static void PrintMatrix(byte[][]Matrix , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print(Matrix[i][j] + " ");
           }
           
           System.out.print("\n");
       }
   }
   public static void PrintMatrix(int[][]Matrix , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print(Matrix[i][j] + " ");
           }
           
           System.out.print("\n");
       }
   }
   
   public static void PrintMatrix(short[][]Matrix , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print(Matrix[i][j] + " ");
           }
           
           System.out.print("\n");
       }
   }
   
   public static void PrintMatrix(long[][]Matrix , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print(Matrix[i][j] + " ");
           }
           
           System.out.print("\n");
       }
   }
   
   public static void PrintMatrix(boolean[][]Matrix , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print(Matrix[i][j] + " ");
           }
           
           System.out.print("\n");
       }
   }
   
   public static void PrintMatrix(float Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print(Matrix[i][j] + " ");
           }
           System.out.print("\n");
       }
   }
   
   public static void PrintMatrix(double Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print(Matrix[i][j] + " ");
           }
       }
       
       System.out.print("\n");
   }
   
   public static void PrintMatrix(char Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print(Matrix[i][j] + " ");
           }
           
           System.out.print("\n");
       }
   }
   
   public static void PrintMatrix(String Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print(Matrix[i][j] + " ");
           }
           System.out.print("\n");
       }
   }
   
   public static byte[][] ReadMatrix(byte[][]Matrix , int Rows , int Columns)
   {
       int ElementOrder = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print("ELEMENT[" + (++ElementOrder) + "] : ");
               Matrix[i][j] = ReadByteNumber() ;
           }
       }
       
       return Matrix ;
   }
   public static int[][] ReadMatrix(int[][]Matrix , int Rows , int Columns)
   {
       int ElementOrder = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print("ELEMENT[" + (++ElementOrder) + "] : ");
               Matrix[i][j] = ReadIntegerNumber() ;
           }
       }
       
       return Matrix ;
   }
  
   public static short[][] ReadMatrix(short[][]Matrix , int Rows , int Columns)
   {
       int ElementOrder = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print("ELEMENT[" + (++ElementOrder) + "] : ");
               Matrix[i][j] = ReadShortNumber() ;
           }
       }
       
       return Matrix ;
   }
  
   public static long[][] ReadMatrix(long[][]Matrix , int Rows , int Columns)
   {
       int ElementOrder = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print("ELEMENT[" + (++ElementOrder) + "] : ");
               Matrix[i][j] = ReadLongNumber() ;
           }
       }
       
       return Matrix ;
   }
  
   public static boolean[][] ReadMatrix(boolean[][]Matrix , int Rows , int Columns)
   {
       int ElementOrder = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print("ELEMENT[" + (++ElementOrder) + "] : ");
               Matrix[i][j] = ReadBooleanValue() ;
           }
       }
       
       return Matrix ;
   }
  
   public static double[][] ReadMatrix(double [][]Matrix , int Rows , int Columns)
   {
       int ElementOrder = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print("ELEMENT [" + (++ElementOrder) + "] : ");
               Matrix[i][j] = ReadDoubleNumber() ; 
           }
       }
       
       return Matrix;
   }
   
   public static float[][] ReadMatrix(float[][]Matrix , int Rows , int Columns)
   {
       int ElementOrder = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print("ELEMENT [" + (++ElementOrder) + "] : ");
               Matrix[i][j] = ReadFloatNumber() ;
           }
           
       }
       
       return Matrix ;
   }
   
   public static char[][] ReadMatrix(char [][]Matrix , int Rows , int Columns)
   {
       int ElementOrder = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print("ELEMENT [" + (++ElementOrder) + "] : ");
               Matrix[i][j] = ReadCharacter() ;
           }
       }
       
       return Matrix ;
   }
   
   public static String[][] ReadMatrix(String[][] Matrix , int Rows , int Columns)
   {
       int ElementOrder = 0 ; 
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               System.out.print("ELEMENT [" + (++ElementOrder) + "] : ");
               Matrix[i][j] = ReadStringLine() ;
           }
       }
       
       return Matrix ;
   }
   
   public static byte[][] FillMatrixWithRandomNumbers(byte[][]Matrix , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = (byte) RandomNumber(1 , 100) ;
           }
       }
       
       return Matrix ;
   }
   public static int[][] FillMatrixWithRandomNumbers(int[][]Matrix , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = RandomNumber(1 , 100) ;
           }
       }
       
       return Matrix ;
   }
   
   public static short[][] FillMatrixWithRandomNumbers(short[][]Matrix , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = (short) RandomNumber(1 , 100) ;
           }
       }
       
       return Matrix ;
   }
   
   public static long[][] FillMatrixWithRandomNumbers(long[][]Matrix , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = RandomNumber(1 , 100) ;
           }
       }
       
       return Matrix ;
   }
   
   public static float[][] FillMatrixWithRandomNumbers(float [][]Matrix , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = RandomNumber(1 , 100) ;
           }
       }
       
       return Matrix ;
   }
   
   public static double[][] FillMatrixWithRandomNumbers(double [][]Matrix , int Rows, int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = RandomNumber(1 , 100) ;
           }
       }
       
       return Matrix ;
   }
   
   public static byte[][] FillMatrixWithRandomNumbers(byte[][]Matrix , int Rows , int Columns , byte From , byte To)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = RandomNumber(From , To) ;
           }
       }
       
       return Matrix ;
   }
   public static int[][] FillMatrixWithRandomNumbers(int[][]Matrix , int Rows , int Columns , int From , int To)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = RandomNumber(From , To) ;
           }
       }
       
       return Matrix ;
   }
   
   public static short[][] FillMatrixWithRandomNumbers(short[][]Matrix , int Rows , int Columns , short From , short To)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = (short) RandomNumber(From , To) ;
           }
       }
       
       return Matrix ;
   }
   
   public static long[][] FillMatrixWithRandomNumbers(long[][]Matrix , int Rows , int Columns , long From , long To)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = RandomNumber(From , To) ;
           }
       }
       
       return Matrix ;
   }
   
   public static float[][] FillMatrixWithRandomNumbers(float Matrix[][] , int Rows , int Columns , float From , float To)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = RandomNumber(From , To);
           }
       }
       
       return Matrix ;
   }
   
   public static double[][] FillMatrixWithRandomNumbers(double Matrix[][] , int Rows , int Columns , double From , double To)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = RandomNumber(From , To) ;
           }
       }
       
       return Matrix ;
   }
   
   public static byte[][] FillMatrixWithOrderedNumbers(byte[][]Matrix , int Rows ,int Columns)
   {
       int OrderedNumber = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = (byte) ++OrderedNumber ;
           }
       }
       
       return Matrix ;
   }
   public static int[][] FillMatrixWithOrderedNumbers(int[][]Matrix , int Rows ,int Columns)
   {
       int OrderedNumber = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = ++OrderedNumber ;
           }
       }
       
       return Matrix ;
   }
   
   public static short[][] FillMatrixWithOrderedNumbers(short[][]Matrix , int Rows ,int Columns)
   {
       int OrderedNumber = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = (short) ++OrderedNumber ;
           }
       }
       
       return Matrix ;
   }
   
   public static long[][] FillMatrixWithOrderedNumbers(long[][]Matrix , int Rows ,int Columns)
   {
       long OrderedNumber = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = ++OrderedNumber ;
           }
       }
       
       return Matrix ;
   }
   
   public static float[][] FillMatrixWithOrderedNumbers(float [][]Matrix , int Rows , int Columns)
   {
       float OrderedNumber = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = ++OrderedNumber ;
           }
       }
       
       return Matrix ;
   }
   
   public static double[][] FillMatrixWithOrderedNumbers(double [][]Matrix , int Rows , int Columns)
   {
       double OrderedNumber = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix[i][j] = ++OrderedNumber ;
           }
       }
       
       return Matrix ;
   }
   
   public static long MatrixRowSum(byte[][]Matrix , int RowNumber , int Columns)
   {
       long MatrixRowSum = 0 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           MatrixRowSum += Matrix[RowNumber-1][i] ;
       }
       
       return MatrixRowSum ;
   }
   public static long MatrixRowSum(int[][]Matrix , int RowNumber , int Columns)
   {
       long MatrixRowSum = 0 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           MatrixRowSum += Matrix[RowNumber-1][i] ;
       }
       
       return MatrixRowSum ;
   }
   
   public static long MatrixRowSum(short[][]Matrix , int RowNumber , int Columns)
   {
       long MatrixRowSum = 0 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           MatrixRowSum += Matrix[RowNumber-1][i] ;
       }
       
       return MatrixRowSum ;
   }
   
   public static long MatrixRowSum(long[][]Matrix , int RowNumber , int Columns)
   {
       long MatrixRowSum = 0 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           MatrixRowSum += Matrix[RowNumber-1][i] ;
       }
       
       return MatrixRowSum ;
   }
   
   public static float MatrixRowSum(float[][]Matrix , int RowNumber  ,int Columns)
   {
       float MatrixRowSum = 0 ;
       
      for(int i = 0 ; i < Columns ; i++)
      {
          MatrixRowSum += Matrix[RowNumber-1][Columns] ;
      }
      
      return MatrixRowSum ;
   }
   
   public static double MatrixRowSum(double [][]Matrix , int RowNumber , int Columns)
   {
       double MatrixRowSum = 0 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           MatrixRowSum += Matrix[RowNumber-1][Columns] ;
       }
       
       return MatrixRowSum ;
   }
   
   public static long MatrixColumnSum(byte [][] Matrix , int Rows , int ColumnNumber)
   {
       long MatrixColumnSum = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           MatrixColumnSum += Matrix[i][ColumnNumber - 1] ;
       }
       
       return MatrixColumnSum ;
   }
   public static long MatrixColumnSum(int [][] Matrix , int Rows , int ColumnNumber)
   {
       long MatrixColumnSum = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           MatrixColumnSum += Matrix[i][ColumnNumber - 1] ;
       }
       
       return MatrixColumnSum ;
   }
   
   public static long MatrixColumnSum(short [][] Matrix , int Rows , int ColumnNumber)
   {
       long MatrixColumnSum = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           MatrixColumnSum += Matrix[i][ColumnNumber - 1] ;
       }
       
       return MatrixColumnSum ;
   }
   
   public static long MatrixColumnSum(long [][] Matrix , int Rows , int ColumnNumber)
   {
       long MatrixColumnSum = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           MatrixColumnSum += Matrix[i][ColumnNumber - 1] ;
       }
       
       return MatrixColumnSum ;
   }
   
   public static float MatrixColumnSum(float Matrix[][] , int Rows , int ColumnNumber)
   {
       float MatrixColumnSum = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           MatrixColumnSum += Matrix[i][ColumnNumber - 1] ;
       }
       
       return MatrixColumnSum ;
   }
   
   public static double MatrixColumnSum(double Matrix[][] , int Rows ,int ColumnNumber)
   {
       double MatrixColumnSum = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           MatrixColumnSum += Matrix[i][ColumnNumber - 1] ;
       }
       
       return MatrixColumnSum ;
   }
   
   public static byte[][] MatrixTranspose(byte [] [] Matrix , int Rows , int Columns)
   {
       byte MatrixTranspose[][] = new byte [Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixTranspose[j][i] = Matrix[i][j] ;
           }
       }
       
       return MatrixTranspose ;
   }
   public static int[][] MatrixTranspose(int [] [] Matrix , int Rows , int Columns)
   {
       int MatrixTranspose[][] = new int [Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixTranspose[j][i] = Matrix[i][j] ;
           }
       }
       
       return MatrixTranspose ;
   }
   
   public static short[][] MatrixTranspose(short [] [] Matrix , int Rows , int Columns)
   {
       short MatrixTranspose[][] = new short [Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixTranspose[j][i] = Matrix[i][j] ;
           }
       }
       
       return MatrixTranspose ;
   }
   
   public static long[][] MatrixTranspose(long[] [] Matrix , int Rows , int Columns)
   {
       long MatrixTranspose[][] = new long [Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixTranspose[j][i] = Matrix[i][j] ;
           }
       }
       
       return MatrixTranspose ;
   }
   
   public static boolean[][] MatrixTranspose(boolean [] [] Matrix , int Rows , int Columns)
   {
       boolean MatrixTranspose[][] = new boolean [Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixTranspose[j][i] = Matrix[i][j] ;
           }
       }
       
       return MatrixTranspose ;
   }
   
   public static float[][] MatrixTranspose(float [][]Matrix , int Rows , int Columns)
   {
       float MatrixTranspose[][] = new float[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixTranspose[i][j] = Matrix[j][i] ;
           }
       }
       
       return MatrixTranspose ;
   }
   
   public static double[][]MatrixTranspose(double [][]Matrix , int Rows , int Columns)
   {
       double MatrixTranspose[][] = new double [Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixTranspose[i][j] = Matrix[j][i] ;
           }
       }
       
       return MatrixTranspose ;
   }
   
   public static char[][] MatrixTranspose(char [][]Matrix , int Rows ,int Columns)
   {
       char MatrixTranspose[][] = new char [Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixTranspose[i][j] = Matrix[j][i] ;
           }
       }
       
       return MatrixTranspose;
   }
   
   public static String[][]MatrixTranspose(String [][]Matrix , int Rows , int Columns)
   {
       String MatrixTranspose[][] = new String[Rows][Columns];
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixTranspose[i][j] = Matrix[j][i] ;
           }
       }
       
       return MatrixTranspose ;
   }
   
   public static short[][] AddTwoMatrices(byte [][] Matrix1 , byte[][] Matrix2 , int Rows , int Columns)
   {
       short[][]Matrix3 = new short[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = (byte) (Matrix1[i][j] + Matrix2[i][j]) ;
           }
       }
       
       return Matrix3;
   }
   public static long[][] AddTwoMatrices(int [][] Matrix1 , int[][] Matrix2 , int Rows , int Columns)
   {
       long[][]Matrix3 = new long[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = Matrix1[i][j] + Matrix2[i][j] ;
           }
       }
       
       return Matrix3;
   }
   
   public static int[][] AddTwoMatrices(short [][] Matrix1 , short[][] Matrix2 , int Rows , int Columns)
   {
       int[][]Matrix3 = new int[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = (short) (Matrix1[i][j] + Matrix2[i][j]) ;
           }
       }
       
       return Matrix3;
   }
   
   public static long[][] AddTwoMatrices(long [][] Matrix1 , long[][] Matrix2 , int Rows , int Columns)
   {
       long[][]Matrix3 = new long[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = Matrix1[i][j] + Matrix2[i][j] ;
           }
       }
       
       return Matrix3;
   }
   
   public static double[][] AddTwoMatrices(float[][] Matrix1 , float Matrix2[][] , int Rows , int Columns)
   {
      double Matrix3[][] = new double[Rows][Columns];
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              Matrix3[i][j] = Matrix1[i][j] + Matrix2[i][j];
          }
      }
      
      return Matrix3;
   }
   
   public static double[][]AddTwoMatrices(double[][]Matrix1 , double[][]Matrix2 , int Rows , int Columns)
   {
       double[][]Matrix3 = new double[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = Matrix1[i][j] + Matrix2[i][j] ;
            }
       }
       
       return Matrix3 ;
   }
   
   public static byte[][] DifferenceTwoMatrices(byte [][] Matrix1 , byte[][] Matrix2 , int Rows , int Columns)
   {
       byte[][]Matrix3 = new byte[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = (byte) (Matrix1[i][j] - Matrix2[i][j]) ;
           }
       }
       
       return Matrix3;
   }
   public static int[][] DifferenceTwoMatrices(int [][] Matrix1 , int[][] Matrix2 , int Rows , int Columns)
   {
       int[][]Matrix3 = new int[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = Matrix1[i][j] - Matrix2[i][j] ;
           }
       }
       
       return Matrix3;
   }
   
   public static short[][] DifferenceTwoMatrices(short [][] Matrix1 , short[][] Matrix2 , int Rows , int Columns)
   {
       short[][]Matrix3 = new short[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = (short) (Matrix1[i][j] - Matrix2[i][j]) ;
           }
       }
       
       return Matrix3;
   }
   
   public static long[][] DifferenceTwoMatrices(long [][] Matrix1 , long[][] Matrix2 , int Rows , int Columns)
   {
       long[][]Matrix3 = new long[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = Matrix1[i][j] - Matrix2[i][j] ;
           }
       }
       
       return Matrix3;
   }
   
   public static float[][] DifferenceTwoMatrices(float[][] Matrix1 , float Matrix2[][] , int Rows , int Columns)
   {
      float Matrix3[][] = new float[Rows][Columns];
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              Matrix3[i][j] = Matrix1[i][j] - Matrix2[i][j];
          }
      }
      
      return Matrix3;
   }
   
   public static double[][]DifferenceTwoMatrices(double[][]Matrix1 , double[][]Matrix2 , int Rows , int Columns)
   {
       double[][]Matrix3 = new double[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = Matrix1[i][j] - Matrix2[i][j] ;
            }
       }
       
       return Matrix3 ;
   }
   
   public static short[][] MultipltyTwoMatrices(byte [][] Matrix1 , byte[][] Matrix2 , int Rows , int Columns)
   {
       short[][]Matrix3 = new short[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = (byte) (Matrix1[i][j] * Matrix2[i][j]) ;
           }
       }
       
       return Matrix3;
   }
   public static long[][] MultipltyTwoMatrices(int [][] Matrix1 , int[][] Matrix2 , int Rows , int Columns)
   {
       long[][]Matrix3 = new long[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = Matrix1[i][j] * Matrix2[i][j] ;
           }
       }
       
       return Matrix3;
   }
   
   public static int[][] MultipltyTwoMatrices(short [][] Matrix1 , short[][] Matrix2 , int Rows , int Columns)
   {
       int[][]Matrix3 = new int[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = (short) (Matrix1[i][j] * Matrix2[i][j]) ;
           }
       }
       
       return Matrix3;
   }
   
   public static long[][] MultipltyTwoMatrices(long [][] Matrix1 , long[][] Matrix2 , int Rows , int Columns)
   {
       long[][]Matrix3 = new long[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = Matrix1[i][j] * Matrix2[i][j] ;
           }
       }
       
       return Matrix3;
   }
   
   public static double[][] MultiplyTwoMatrices(float[][] Matrix1 , float Matrix2[][] , int Rows , int Columns)
   {
      double Matrix3[][] = new double[Rows][Columns];
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              Matrix3[i][j] = Matrix1[i][j] * Matrix2[i][j];
          }
      }
      
      return Matrix3;
   }
   
   public static double[][]MultiplyTwoMatrices(double[][]Matrix1 , double[][]Matrix2 , int Rows , int Columns)
   {
       double[][]Matrix3 = new double[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               Matrix3[i][j] = Matrix1[i][j] * Matrix2[i][j] ;
            }
       }
       
       return Matrix3 ;
   }
   
   public static byte[][]DivideTwoMatrices(byte [][] Matrix1 , byte [][] Matrix2 , int Rows , int Columns)
   {
       byte Matrix3[][] = new byte [Rows][Columns];
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix2[i][j] != 0)
               {
                    Matrix3[i][j] = (byte) (Matrix1[i][j] / Matrix2[i][j]) ;    
               }
               else
               {
                   Matrix3[i][j] = 0 ;
               }
               
           }
       }
       
       return Matrix3 ;
   }
   public static int[][]DivideTwoMatrices(int [][] Matrix1 , int [][] Matrix2 , int Rows , int Columns)
   {
       int Matrix3[][] = new int [Rows][Columns];
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix2[i][j] != 0)
               {
                    Matrix3[i][j] = Matrix1[i][j] / Matrix2[i][j] ;    
               }
               else
               {
                   Matrix3[i][j] = 0 ;
               }
               
           }
       }
       
       return Matrix3 ;
   }
   public static short[][]DivideTwoMatrices(short [][] Matrix1 , short [][] Matrix2 , int Rows , int Columns)
   {
       short Matrix3[][] = new short [Rows][Columns];
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix2[i][j] != 0)
               {
                    Matrix3[i][j] = (short) (Matrix1[i][j] / Matrix2[i][j]) ;    
               }
               else
               {
                   Matrix3[i][j] = 0 ;
               }
               
           }
       }
       
       return Matrix3 ;
   }
   public static long[][]DivideTwoMatrices(long [][] Matrix1 , long [][] Matrix2 , int Rows , int Columns)
   {
       long Matrix3[][] = new long [Rows][Columns];
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix2[i][j] != 0)
               {
                    Matrix3[i][j] = Matrix1[i][j] / Matrix2[i][j] ;    
               }
               else
               {
                   Matrix3[i][j] = 0 ;
               }
               
           }
       }
       
       return Matrix3 ;
   }
   
   public static float[][]DivideTwoMatrices(float[][] Matrix1 , float[][] Matrix2 , int Rows , int Columns)
   {
       float Matrix3[][] = new float [Rows][Columns];
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix2[i][j] != 0)
               {
                    Matrix3[i][j] = Matrix1[i][j] / Matrix2[i][j] ;    
               }
               else
               {
                   Matrix3[i][j] = 0 ;
               }
               
           }
       }
       
       return Matrix3 ;
   }
   
   public static double[][]DivideTwoMatrices(double [][] Matrix1 , double [][] Matrix2 , int Rows , int Columns)
   {
       double Matrix3[][] = new double [Rows][Columns];
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix2[i][j] != 0)
               {
                    Matrix3[i][j] = Matrix1[i][j] / Matrix2[i][j] ;    
               }
               else
               {
                   Matrix3[i][j] = 0 ;
               }
               
           }
       }
       
       return Matrix3 ;
   }
    
   public static void PrintMiddleRow(byte[][] Matrix , int Rows , int Columns)
   {
       int MiddleRow = Rows / 2 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           System.out.print(Matrix[MiddleRow][i] + " ");
       }
   }
   public static void PrintMiddleRow(int[][] Matrix , int Rows , int Columns)
   {
       int MiddleRow = Rows / 2 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           System.out.print(Matrix[MiddleRow][i] + " ");
       }
   }
   
   public static void PrintMiddleRow(short[][] Matrix , int Rows , int Columns)
   {
       int MiddleRow = Rows / 2 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           System.out.print(Matrix[MiddleRow][i] + " ");
       }
   }
   
   public static void PrintMiddleRow(long[][] Matrix , int Rows , int Columns)
   {
       int MiddleRow = Rows / 2 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           System.out.print(Matrix[MiddleRow][i] + " ");
       }
   }
   
   public static void PrintMiddleRow(boolean[][] Matrix , int Rows , int Columns)
   {
       int MiddleRow = Rows / 2 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           System.out.print(Matrix[MiddleRow][i] + " ");
       }
   }
   
   public static void PrintMiddleColumn(byte [][] Matrix , int Rows , int Columns)
   {
       int MiddleColumn = Columns / 2 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           System.out.print(Matrix[i][MiddleColumn] + " ");
       }
   }
   public static void PrintMiddleColumn(int [][] Matrix , int Rows , int Columns)
   {
       int MiddleColumn = Columns / 2 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           System.out.print(Matrix[i][MiddleColumn] + " ");
       }
   }
   
   public static void PrintMiddleColumn(short [][] Matrix , int Rows , int Columns)
   {
       int MiddleColumn = Columns / 2 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           System.out.print(Matrix[i][MiddleColumn] + " ");
       }
   }
   
   public static void PrintMiddleColumn(long [][] Matrix , int Rows , int Columns)
   {
       int MiddleColumn = Columns / 2 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           System.out.print(Matrix[i][MiddleColumn] + " ");
       }
   }
   
   public static void PrintMiddleColumn(boolean [][] Matrix , int Rows , int Columns)
   {
       int MiddleColumn = Columns / 2 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           System.out.print(Matrix[i][MiddleColumn] + " ");
       }
   }
   
   public static void PrintMiddleRow(float[][] Matrix , int Rows , int Columns)
   {
       int MiddleRow = Rows / 2 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           System.out.print(Matrix[MiddleRow][i] + " ");
       }
   }
   
   public static void PrintMiddleColumn(float [][] Matrix , int Rows , int Columns)
   {
       int MiddleColumn = Columns / 2 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           System.out.print(Matrix[i][MiddleColumn] + " ");
       }
   }
   
   public static void PrintMiddleRow(double[][] Matrix , int Rows , int Columns)
   {
       int MiddleRow = Rows / 2 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           System.out.print(Matrix[MiddleRow][i] + " ");
       }
   }
   
   public static void PrintMiddleColumn(double [][] Matrix , int Rows , int Columns)
   {
       int MiddleColumn = Columns / 2 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           System.out.print(Matrix[i][MiddleColumn] + " ");
       }
   }
   
   public static void PrintMiddleRow(char[][] Matrix , int Rows , int Columns)
   {
       int MiddleRow = Rows / 2 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           System.out.print(Matrix[MiddleRow][i] + " ");
       }
   }
   
   public static void PrintMiddleColumn(char [][] Matrix , int Rows , int Columns)
   {
       int MiddleColumn = Columns / 2 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           System.out.print(Matrix[i][MiddleColumn] + " ");
       }
   }
   
   public static void PrintMiddleRow(String[][] Matrix , int Rows , int Columns)
   {
       int MiddleRow = Rows / 2 ;
       
       for(int i = 0 ; i < Columns ; i++)
       {
           System.out.print(Matrix[MiddleRow][i] + " ");
       }
   }
   
   public static void PrintMiddleColumn(String [][] Matrix , int Rows , int Columns)
   {
       int MiddleColumn = Columns / 2 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           System.out.print(Matrix[i][MiddleColumn] + " ");
       }
   }
   
   public static long NumberOfMatrixElements(int Rows , int Columns)
   {
       return (Rows * Columns) ;
   }
   
   public static long MatrixSum(byte Matrix[][] , int Rows , int Columns)
   {
       long MatrixSum = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixSum += Matrix[i][j] ;
           }
       }
       
       return MatrixSum ;
   }
   public static long MatrixSum(int Matrix[][] , int Rows , int Columns)
   {
       long MatrixSum = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixSum += Matrix[i][j] ;
           }
       }
       
       return MatrixSum ;
   }
   
   public static long MatrixSum(short Matrix[][] , int Rows , int Columns)
   {
       long MatrixSum = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixSum += Matrix[i][j] ;
           }
       }
       
       return MatrixSum ;
   }
   
   public static long MatrixSum(long Matrix[][] , int Rows , int Columns)
   {
       long MatrixSum = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixSum += Matrix[i][j] ;
           }
       }
       
       return MatrixSum ;
   }
   
   public static float MatrixSum(float Matrix[][] , int Rows , int Columns)
   {
       float MatrixSum = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixSum += Matrix[i][j] ;
           }
       }
       
       return MatrixSum ;
   }
   
   public static double MatrixSum(double Matrix[][] , int Rows , int Columns)
   {
       double MatrixSum = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixSum += Matrix[i][j] ;
           }
       }
       
       return MatrixSum ;
   }
   
   public static double MatrixAverage(byte Matrix[][] ,int Rows , int Columns)
   {
       return (MatrixSum(Matrix , Rows , Columns) / NumberOfMatrixElements(Rows, Columns));
   }
   public static double MatrixAverage(int Matrix[][] ,int Rows , int Columns)
   {
       return (MatrixSum(Matrix , Rows , Columns) / NumberOfMatrixElements(Rows, Columns));
   }
   
   public static double MatrixAverage(short Matrix[][] ,int Rows , int Columns)
   {
       return (MatrixSum(Matrix , Rows , Columns) / NumberOfMatrixElements(Rows, Columns));
   }
   
   public static double MatrixAverage(long Matrix[][] ,int Rows , int Columns)
   {
       return (MatrixSum(Matrix , Rows , Columns) / NumberOfMatrixElements(Rows, Columns));
   }
   
   public static double MatrixAverage(double Matrix[][] ,int Rows , int Columns)
   {
       return (MatrixSum(Matrix , Rows , Columns) / NumberOfMatrixElements(Rows, Columns));
   }
   
   public static double MatrixAverage(float Matrix[][] ,int Rows , int Columns)
   {
       return (MatrixSum(Matrix , Rows , Columns) / NumberOfMatrixElements(Rows, Columns));
   }
   
  public static boolean AreMatricesEqualInSum(byte Matrix1[][] , byte Matrix2[][] , int Rows , int Columns)
  {
      return (MatrixSum(Matrix1 , Rows , Columns) == MatrixSum(Matrix2 , Rows , Columns));
  }
  public static boolean AreMatricesEqualInSum(int Matrix1[][] , int Matrix2[][] , int Rows , int Columns)
  {
      return (MatrixSum(Matrix1 , Rows , Columns) == MatrixSum(Matrix2 , Rows , Columns));
  }
  
  public static boolean AreMatricesEqualInSum(byte Matrix1[][]  , int Rows1 , int Columns1 , byte Matrix2[][] , int Rows2 , int Columns2)
  {
      return (MatrixSum(Matrix1 , Rows1 , Columns1) == MatrixSum(Matrix2, Rows2, Columns2));
  }
  public static boolean AreMatricesEqualInSum(int Matrix1[][]  , int Rows1 , int Columns1 , int Matrix2[][] , int Rows2 , int Columns2)
  {
      return (MatrixSum(Matrix1 , Rows1 , Columns1) == MatrixSum(Matrix2, Rows2, Columns2));
  }
  
  public static boolean AreMatricesEqualInSum(short Matrix1[][] , short Matrix2[][] , int Rows , int Columns)
  {
      return (MatrixSum(Matrix1 , Rows , Columns) == MatrixSum(Matrix2 , Rows , Columns));
  }
  
  public static boolean AreMatricesEqualInSum(short Matrix1[][]  , int Rows1 , int Columns1 , short Matrix2[][] , int Rows2 , int Columns2)
  {
      return (MatrixSum(Matrix1 , Rows1 , Columns1) == MatrixSum(Matrix2, Rows2, Columns2));
  }
  
  public static boolean AreMatricesEqualInSum(long Matrix1[][] , long Matrix2[][] , int Rows , int Columns)
  {
      return (MatrixSum(Matrix1 , Rows , Columns) == MatrixSum(Matrix2 , Rows , Columns));
  }
  
  public static boolean AreMatricesEqualInSum(long Matrix1[][]  , int Rows1 , int Columns1 , long Matrix2[][] , int Rows2 , int Columns2)
  {
      return (MatrixSum(Matrix1 , Rows1 , Columns1) == MatrixSum(Matrix2, Rows2, Columns2));
  }
  
  public static boolean AreMatricesEqualInSum(float Matrix1[][] , float Matrix2[][] , int Rows , int Columns)
  {
      return (MatrixSum(Matrix1 , Rows , Columns) == MatrixSum(Matrix2 , Rows , Columns));
  }
  
  public static boolean AreMatricesEqualInSum(float Matrix1[][]  , int Rows1 , int Columns1 , float Matrix2[][] , int Rows2 , int Columns2)
  {
      return (MatrixSum(Matrix1 , Rows1 , Columns1) == MatrixSum(Matrix2, Rows2, Columns2));
  }
  
  public static boolean AreMatricesEqualInSum(double Matrix1[][] , double Matrix2[][] , int Rows , int Columns)
  {
      return (MatrixSum(Matrix1 , Rows , Columns) == MatrixSum(Matrix2 , Rows , Columns));
  }
  
  public static boolean AreMatricesEqualInSum(double Matrix1[][]  , int Rows1 , int Columns1 , double Matrix2[][] , int Rows2 , int Columns2)
  {
      return (MatrixSum(Matrix1 , Rows1 , Columns1) == MatrixSum(Matrix2, Rows2, Columns2));
  }
  
  public static boolean AreMatricesEqualInAverage(byte Matrix1[][] , byte Matrix2[][] , int Rows , int Columns)
  {
      return (MatrixAverage(Matrix1, Rows, Columns) == MatrixAverage(Matrix2, Rows, Columns));
  }
  public static boolean AreMatricesEqualInAverage(int Matrix1[][] , int Matrix2[][] , int Rows , int Columns)
  {
      return (MatrixAverage(Matrix1, Rows, Columns) == MatrixAverage(Matrix2, Rows, Columns));
  }
  
  public static boolean AreMatricesEqualInAverage(short Matrix1[][] , short Matrix2[][] , int Rows , int Columns)
  {
      return (MatrixAverage(Matrix1, Rows, Columns) == MatrixAverage(Matrix2, Rows, Columns));
  }
  
  public static boolean AreMatricesEqualInAverage(long Matrix1[][] , long Matrix2[][] , int Rows , int Columns)
  {
      return (MatrixAverage(Matrix1, Rows, Columns) == MatrixAverage(Matrix2, Rows, Columns));
  }
  
  public static boolean AreMatricesEqualInAverage(float Matrix1[][] , float Matrix2[][] , int Rows , int Columns)
  {
      return (MatrixAverage(Matrix1, Rows, Columns) == MatrixAverage(Matrix2, Rows, Columns));
  }
  
  public static boolean AreMatricesEqualInAverage(double Matrix1[][] , double Matrix2[][] , int Rows , int Columns)
  {
      return (MatrixAverage(Matrix1, Rows, Columns) == MatrixAverage(Matrix2, Rows, Columns));
  }
  
  public static boolean AreMatricesEqualInAverage(byte Matrix1[][] , int Rows1 , int Columns1 , byte Matrix2[][] , int Rows2 , int Columns2)
  {
      return (MatrixAverage(Matrix1, Rows1, Columns1) == MatrixAverage(Matrix2, Rows2, Columns2));
  }
  public static boolean AreMatricesEqualInAverage(int Matrix1[][] , int Rows1 , int Columns1 , int Matrix2[][] , int Rows2 , int Columns2)
  {
      return (MatrixAverage(Matrix1, Rows1, Columns1) == MatrixAverage(Matrix2, Rows2, Columns2));
  }
  
  public static boolean AreMatricesEqualInAverage(short Matrix1[][] , int Rows1 , int Columns1 , short Matrix2[][] , int Rows2 , int Columns2)
  {
      return (MatrixAverage(Matrix1, Rows1, Columns1) == MatrixAverage(Matrix2, Rows2, Columns2));
  }
  
  public static boolean AreMatricesEqualInAverage(long Matrix1[][] , int Rows1 , int Columns1 , long Matrix2[][] , int Rows2 , int Columns2)
  {
      return (MatrixAverage(Matrix1, Rows1, Columns1) == MatrixAverage(Matrix2, Rows2, Columns2));
  }
  
  public static boolean AreMatricesEqualInAverage(float Matrix1[][] , int Rows1 , int Columns1 , float Matrix2[][] , int Rows2 , int Columns2)
  {
      return (MatrixAverage(Matrix1, Rows1, Columns1) == MatrixAverage(Matrix2, Rows2, Columns2));
  }
  
  public static boolean AreMatricesEqualInAverage(double Matrix1[][] , int Rows1 , int Columns1 , double Matrix2[][] , int Rows2 , int Columns2)
  {
      return (MatrixAverage(Matrix1, Rows1, Columns1) == MatrixAverage(Matrix2, Rows2, Columns2));
  }
  
  public static boolean AreMatricesEqual(byte Matrix1[][] , byte Matrix2[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix1[i][j] != Matrix2[i][j])
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  public static boolean AreMatricesEqual(int Matrix1[][] , int Matrix2[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix1[i][j] != Matrix2[i][j])
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean AreMatricesEqual(short Matrix1[][] , short Matrix2[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix1[i][j] != Matrix2[i][j])
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean AreMatricesEqual(long Matrix1[][] , long Matrix2[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix1[i][j] != Matrix2[i][j])
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean AreMatricesEqual(boolean Matrix1[][] , boolean Matrix2[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix1[i][j] != Matrix2[i][j])
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean AreMatricesEqual(float Matrix1[][] , float Matrix2[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix1[i][j] != Matrix2[i][j])
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean AreMatricesEqual(double Matrix1[][] , double Matrix2[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix1[i][j] != Matrix2[i][j])
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean AreMatricesEqual(char Matrix1[][] , char Matrix2[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix1[i][j] != Matrix2[i][j])
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean AreMatricesEqual(String Matrix1[][] , String Matrix2[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!Matrix1[i][j].equals(Matrix2[i][j]))
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean IsMatrixIdentity(byte Matrix[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0  ;j < Columns ; j++)
          {
              if((i == j && Matrix[i][j] != 1) || (i != j && Matrix[i][j] != 0))
              {
                  return false ;
              }
          }
      }
      
      return true;
  }
  public static boolean IsMatrixIdentity(int Matrix[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0  ;j < Columns ; j++)
          {
              if((i == j && Matrix[i][j] != 1) || (i != j && Matrix[i][j] != 0))
              {
                  return false ;
              }
          }
      }
      
      return true;
  }
  
  public static boolean IsMatrixIdentity(short Matrix[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0  ;j < Columns ; j++)
          {
              if((i == j && Matrix[i][j] != 1) || (i != j && Matrix[i][j] != 0))
              {
                  return false ;
              }
          }
      }
      
      return true;
  }
  
  public static boolean IsMatrixIdentity(long Matrix[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0  ;j < Columns ; j++)
          {
              if((i == j && Matrix[i][j] != 1) || (i != j && Matrix[i][j] != 0))
              {
                  return false ;
              }
          }
      }
      
      return true;
  }
  
  public static boolean IsMatrixIdentity(float Matrix[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0  ;j < Columns ; j++)
          {
              if((i == j && Matrix[i][j] != 1) || (i != j && Matrix[i][j] != 0))
              {
                  return false ;
              }
          }
      }
      
      return true;
  }
  
  public static boolean IsMatrixIdentity(double Matrix[][] , int Rows , int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0  ;j < Columns ; j++)
          {
              if((i == j && Matrix[i][j] != 1) || (i != j && Matrix[i][j] != 0))
              {
                  return false ;
              }
          }
      }
      
      return true;
  }
  
  public static boolean IsScalarMatrix(byte Matrix[][] , int Rows , int Columns)
  {
      byte FirstElementDiagonal = Matrix[0][0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if((i == j && Matrix[i][j] != FirstElementDiagonal) || (i != j && Matrix[i][j] != 0))
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  public static boolean IsScalarMatrix(int Matrix[][] , int Rows , int Columns)
  {
      int FirstElementDiagonal = Matrix[0][0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if((i == j && Matrix[i][j] != FirstElementDiagonal) || (i != j && Matrix[i][j] != 0))
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean IsScalarMatrix(short Matrix[][] , int Rows , int Columns)
  {
      short FirstElementDiagonal = Matrix[0][0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if((i == j && Matrix[i][j] != FirstElementDiagonal) || (i != j && Matrix[i][j] != 0))
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean IsScalarMatrix(long Matrix[][] , int Rows , int Columns)
  {
      long FirstElementDiagonal = Matrix[0][0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if((i == j && Matrix[i][j] != FirstElementDiagonal) || (i != j && Matrix[i][j] != 0))
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean IsScalarMatrix(float Matrix[][] , int Rows , int Columns)
  {
      float FirstElementDiagonal = Matrix[0][0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if((i == j && Matrix[i][j] != FirstElementDiagonal) || (i != j && Matrix[i][j] != 0))
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean IsScalarMatrix(double Matrix[][] , int Rows , int Columns)
  {
      double FirstElementDiagonal = Matrix[0][0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if((i == j && Matrix[i][j] != FirstElementDiagonal) || (i != j && Matrix[i][j] != 0))
              {
                  return false ;
              }
          }
      }
      
      return true ;
  }
  
  public static boolean IsNumberFoundInMatrix(byte Number ,byte Matrix[][] , int Rows , int Columns)    
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Number == Matrix[i][j])
              {
                  return true ;
              }
          }
      }
      
      return false ;
  }
  public static boolean IsNumberFoundInMatrix(int Number ,int Matrix[][] , int Rows , int Columns)    
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Number == Matrix[i][j])
              {
                  return true ;
              }
          }
      }
      
      return false ;
  }
  
  public static boolean IsNumberFoundInMatrix(short Number ,short Matrix[][] , int Rows , int Columns)    
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Number == Matrix[i][j])
              {
                  return true ;
              }
          }
      }
      
      return false ;
  }
  
  public static boolean IsNumberFoundInMatrix(long Number ,long Matrix[][] , int Rows , int Columns)    
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Number == Matrix[i][j])
              {
                  return true ;
              }
          }
      }
      
      return false ;
  }
  
  public static boolean IsBooleanValueFoundInMatrix(boolean BooleanValue , boolean Matrix[][] , int Rows ,int Columns)
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Matrix[i][j] == BooleanValue)
              {
                  return true ;
              }
          }
      }
      
      return false ;
  }
  

  public static boolean IsNumberFoundInMatrix(float Number ,float Matrix[][] , int Rows , int Columns)    
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Number == Matrix[i][j])
              {
                  return true ;
              }
          }
      }
      
      return false ;
  }
  
  public static boolean IsNumberFoundInMatrix(double Number ,double Matrix[][] , int Rows , int Columns)    
  {
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(Number == Matrix[i][j])
              {
                  return true ;
              }
          }
      }
      
      return false ;
  }
  
 
  
  public static int CountEvenNumbersInMatrix(byte Matrix[][] , int Rows , int Columns)
  {
      int EvenNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsEvenNumber(Matrix[i][j]))
              {
                  EvenNumbersCounter++ ;
              }
          }
      }
      
      return EvenNumbersCounter ;
  }
  public static int CountEvenNumbersInMatrix(int Matrix[][] , int Rows , int Columns)
  {
      int EvenNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsEvenNumber(Matrix[i][j]))
              {
                  EvenNumbersCounter++ ;
              }
          }
      }
      
      return EvenNumbersCounter ;
  }
  
  public static int CountEvenNumbersInMatrix(short Matrix[][] , int Rows , int Columns)
  {
      int EvenNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsEvenNumber(Matrix[i][j]))
              {
                  EvenNumbersCounter++ ;
              }
          }
      }
      
      return EvenNumbersCounter ;
  }
  
  public static int CountEvenNumbersInMatrix(long Matrix[][] , int Rows , int Columns)
  {
      int EvenNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsEvenNumber(Matrix[i][j]))
              {
                  EvenNumbersCounter++ ;
              }
          }
      }
      
      return EvenNumbersCounter ;
  }
  
  public static int CountOddNumbersInMatrix(byte Matrix[][] , int Rows ,int Columns)
  {
      int OddNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsOddNumber(Matrix[i][j]))
              {
                  OddNumbersCounter++;
              }
          }
      }
      
      return OddNumbersCounter ;
  }
  public static int CountOddNumbersInMatrix(int Matrix[][] , int Rows ,int Columns)
  {
      int OddNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsOddNumber(Matrix[i][j]))
              {
                  OddNumbersCounter++;
              }
          }
      }
      
      return OddNumbersCounter ;
  }
  
  public static int CountOddNumbersInMatrix(short Matrix[][] , int Rows ,int Columns)
  {
      int OddNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsOddNumber(Matrix[i][j]))
              {
                  OddNumbersCounter++;
              }
          }
      }
      
      return OddNumbersCounter ;
  }
  
  public static int CountOddNumbersInMatrix(long Matrix[][] , int Rows ,int Columns)
  {
      int OddNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsOddNumber(Matrix[i][j]))
              {
                  OddNumbersCounter++;
              }
          }
      }
      
      return OddNumbersCounter ;
  }
  
  public static int CountPrimeNumbersInMatrix(byte Matrix[][] , int Rows , int Columns)
  {
      int PrimeNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsPrimeNumber(Matrix[i][j]))
              {
                  PrimeNumbersCounter++ ;
              }
          }
      }
      
      return PrimeNumbersCounter ;
  }
  public static int CountPrimeNumbersInMatrix(int Matrix[][] , int Rows , int Columns)
  {
      int PrimeNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsPrimeNumber(Matrix[i][j]))
              {
                  PrimeNumbersCounter++ ;
              }
          }
      }
      
      return PrimeNumbersCounter ;
  }
  
  public static int CountPrimeNumbersInMatrix(short Matrix[][] , int Rows , int Columns)
  {
      int PrimeNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsPrimeNumber(Matrix[i][j]))
              {
                  PrimeNumbersCounter++ ;
              }
          }
      }
      
      return PrimeNumbersCounter ;
  }
  
  public static int CountPrimeNumbersInMatrix(long Matrix[][] , int Rows , int Columns)
  {
      int PrimeNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsPrimeNumber(Matrix[i][j]))
              {
                  PrimeNumbersCounter++ ;
              }
          }
      }
      
      return PrimeNumbersCounter ;
  }
  
  public static int CountPerfectNumbersInMatrix(byte Matrix[][] , int Rows , int Columns)
  {
      int PerfectNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0; j < Columns ; j++)
          {
              if(IsPerfectNumber(Matrix[i][j]))
              {
                  PerfectNumbersCounter++ ;
              }
          }
      }
      
      return PerfectNumbersCounter ;
  }
  public static int CountPerfectNumbersInMatrix(int Matrix[][] , int Rows , int Columns)
  {
      int PerfectNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0; j < Columns ; j++)
          {
              if(IsPerfectNumber(Matrix[i][j]))
              {
                  PerfectNumbersCounter++ ;
              }
          }
      }
      
      return PerfectNumbersCounter ;
  }
  
  public static int CountPerfectNumbersInMatrix(short Matrix[][] , int Rows , int Columns)
  {
      int PerfectNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0; j < Columns ; j++)
          {
              if(IsPerfectNumber(Matrix[i][j]))
              {
                  PerfectNumbersCounter++ ;
              }
          }
      }
      
      return PerfectNumbersCounter ;
  }
  
  public static int CountPerfectNumbersInMatrix(long Matrix[][] , int Rows , int Columns)
  {
      int PerfectNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0; j < Columns ; j++)
          {
              if(IsPerfectNumber(Matrix[i][j]))
              {
                  PerfectNumbersCounter++ ;
              }
          }
      }
      
      return PerfectNumbersCounter ;
  }
  
  public static int CountPositiveNumbersInMatrix(byte Matrix[][] , int Rows , int Columns)
  {
      int PositiveNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsPositiveNumber(Matrix[i][j]))
              {
                  PositiveNumbersCounter++;
              }
          }
      }
      
      return PositiveNumbersCounter ;
  }
  public static int CountPositiveNumbersInMatrix(int Matrix[][] , int Rows , int Columns)
  {
      int PositiveNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsPositiveNumber(Matrix[i][j]))
              {
                  PositiveNumbersCounter++;
              }
          }
      }
      
      return PositiveNumbersCounter ;
  }
  
  public static int CountPositiveNumbersInMatrix(short Matrix[][] , int Rows , int Columns)
  {
      int PositiveNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsPositiveNumber(Matrix[i][j]))
              {
                  PositiveNumbersCounter++;
              }
          }
      }
      
      return PositiveNumbersCounter ;
  }
  
  public static int CountPositiveNumbersInMatrix(long Matrix[][] , int Rows , int Columns)
  {
      int PositiveNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsPositiveNumber(Matrix[i][j]))
              {
                  PositiveNumbersCounter++;
              }
          }
      }
      
      return PositiveNumbersCounter ;
  }
  
  public static int CountPositiveNumbersInMatrix(float Matrix[][] , int Rows , int Columns)
  {
      int PositiveNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsPositiveNumber(Matrix[i][j]))
              {
                  PositiveNumbersCounter++;
              }
          }
      }
      
      return PositiveNumbersCounter ;
  }
  
  public static int CountPositiveNumbersInMatrix(double Matrix[][] , int Rows , int Columns)
  {
      int PositiveNumbersCounter = 0 ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(IsPositiveNumber(Matrix[i][j]))
              {
                  PositiveNumbersCounter++;
              }
          }
      }
      
      return PositiveNumbersCounter ;
  }
  
 public static int CountNegativeNumbersInMatrix(byte Matrix[][] , int Rows , int Columns)
 {
     int NegativeNumbersCounter = 0 ;
     
     for(int i = 0 ; i < Rows ;i++)
     {
         for(int j = 0 ; j < Columns ; j++)
         {
             if(IsNegativeNumber(Matrix[i][j]))
             {
                 NegativeNumbersCounter++ ;
             }
         }
     }
        
     return NegativeNumbersCounter ;
 }
 public static int CountNegativeNumbersInMatrix(int Matrix[][] , int Rows , int Columns)
 {
     int NegativeNumbersCounter = 0 ;
     
     for(int i = 0 ; i < Rows ;i++)
     {
         for(int j = 0 ; j < Columns ; j++)
         {
             if(IsNegativeNumber(Matrix[i][j]))
             {
                 NegativeNumbersCounter++ ;
             }
         }
     }
        
     return NegativeNumbersCounter ;
 }
 
 public static int CountNegativeNumbersInMatrix(short Matrix[][] , int Rows , int Columns)
 {
     int NegativeNumbersCounter = 0 ;
     
     for(int i = 0 ; i < Rows ;i++)
     {
         for(int j = 0 ; j < Columns ; j++)
         {
             if(IsNegativeNumber(Matrix[i][j]))
             {
                 NegativeNumbersCounter++ ;
             }
         }
     }
        
     return NegativeNumbersCounter ;
 }
 
 public static int CountNegativeNumbersInMatrix(long Matrix[][] , int Rows , int Columns)
 {
     int NegativeNumbersCounter = 0 ;
     
     for(int i = 0 ; i < Rows ;i++)
     {
         for(int j = 0 ; j < Columns ; j++)
         {
             if(IsNegativeNumber(Matrix[i][j]))
             {
                 NegativeNumbersCounter++ ;
             }
         }
     }
        
     return NegativeNumbersCounter ;
 }
 
 public static int CountNegativeNumbersInMatrix(float Matrix[][] , int Rows , int Columns)
 {
     int NegativeNumbersCounter = 0 ;
     
     for(int i = 0 ; i < Rows ;i++)
     {
         for(int j = 0 ; j < Columns ; j++)
         {
             if(IsNegativeNumber(Matrix[i][j]))
             {
                 NegativeNumbersCounter++ ;
             }
         }
     }
        
     return NegativeNumbersCounter ;
 }
 
 public static int CountNegativeNumbersInMatrix(double Matrix[][] , int Rows , int Columns)
 {
     int NegativeNumbersCounter = 0 ;
     
     for(int i = 0 ; i < Rows ;i++)
     {
         for(int j = 0 ; j < Columns ; j++)
         {
             if(IsNegativeNumber(Matrix[i][j]))
             {
                 NegativeNumbersCounter++ ;
             }
         }
     }
        
     return NegativeNumbersCounter ;
 }
  
  
   public static boolean IsSparseMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       return (CountNumberInMatrix((byte)0, Matrix , Rows , Columns) >= (Rows * Columns * 0.5)) ;
   }
   public static boolean IsSparseMatrix(int Matrix[][] , int Rows , int Columns)
   {
       return (CountNumberInMatrix(0, Matrix , Rows , Columns) >= (Rows * Columns * 0.5)) ;
   }
   
   public static boolean IsSparseMatrix(short Matrix[][] , int Rows , int Columns)
   {
       return (CountNumberInMatrix((short)0, Matrix , Rows , Columns) >= (Rows * Columns * 0.5)) ;
   }
   
   public static boolean IsSparseMatrix(long Matrix[][] , int Rows , int Columns)
   {
       return (CountNumberInMatrix(0, Matrix , Rows , Columns) >= (Rows * Columns * 0.5)) ;
   }
   
   public static boolean IsSparseMatrix(float Matrix[][] , int Rows , int Columns)
   {
       return (CountNumberInMatrix(0, Matrix , Rows , Columns) >= (Rows * Columns * 0.5)) ;
   }
   
   public static boolean IsSparseMatrix(double Matrix[][] , int Rows , int Columns)
   {
       return (CountNumberInMatrix(0, Matrix , Rows , Columns) >= (Rows * Columns * 0.5)) ;
   }
   
   public static boolean IsMatrixPalindrome(byte Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j <= (Columns / 2) ; j++)
           {
               if(Matrix[i][j] != Matrix[i][Columns - 1 - j])
               {
                   return false ;
               }
           }
        }
       
       return true ;
   }
   public static boolean IsMatrixPalindrome(int Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j <= (Columns / 2) ; j++)
           {
               if(Matrix[i][j] != Matrix[i][Columns - 1 - j])
               {
                   return false ;
               }
           }
        }
       
       return true ;
   }
   
   public static boolean IsMatrixPalindrome(short Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j <= (Columns / 2) ; j++)
           {
               if(Matrix[i][j] != Matrix[i][Columns - 1 - j])
               {
                   return false ;
               }
           }
        }
       
       return true ;
   }
   
   public static boolean IsMatrixPalindrome(long Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j <= (Columns / 2) ; j++)
           {
               if(Matrix[i][j] != Matrix[i][Columns - 1 - j])
               {
                   return false ;
               }
           }
        }
       
       return true ;
   }
   
   public static boolean IsMatrixPalindrome(boolean Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j <= (Columns / 2) ; j++)
           {
               if(Matrix[i][j] != Matrix[i][Columns - 1 - j])
               {
                   return false ;
               }
           }
        }
       
       return true ;
   }
   
   public static boolean IsMatrixPalindrome(float Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j <= (Columns / 2) ; j++)
           {
               if(Matrix[i][j] != Matrix[i][Columns - 1 - j])
               {
                   return false ;
               }
           }
        }
       
       return true ;
   }
    
   public static boolean IsMatrixPalindrome(double Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j <= (Columns / 2) ; j++)
           {
               if(Matrix[i][j] != Matrix[i][Columns - 1 - j])
               {
                   return false ;
               }
           }
        }
       
       return true ;
   }
   
   public static boolean IsMatrixPalindrome(char Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0  ; i < Rows ; i++)
       {
           for(int j = 0 ; j < (Columns / 2) ; j++)
           {
               if(Matrix[i][j] != Matrix[i][Columns - 1 - j])
               {
                   return false ;
               }
           }
       }
       
       return true ;
   }
   
   public static boolean IsMatrixPalindrome(String Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns / 2 ; j++)
           {
               if(!Matrix[i][j].equals( Matrix[i][Columns - 1 - j]))
               {
                   return false ;
               }
           }
           
       }
       
       return true ;
   }
   
   public static byte MaximumNumberInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte MaximumNumberInMatrix = Byte.MIN_VALUE ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j] > MaximumNumberInMatrix)
               {
                   MaximumNumberInMatrix = Matrix[i][j] ;
               }
           }
       }
       
       return MaximumNumberInMatrix ;
   }
   public static int MaximumNumberInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int MaximumNumberInMatrix = Integer.MIN_VALUE ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j] > MaximumNumberInMatrix)
               {
                   MaximumNumberInMatrix = Matrix[i][j] ;
               }
           }
       }
       
       return MaximumNumberInMatrix ;
   }
   
   public static short MaximumNumberInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short MaximumNumberInMatrix = Short.MIN_VALUE ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j] > MaximumNumberInMatrix)
               {
                   MaximumNumberInMatrix = Matrix[i][j] ;
               }
           }
       }
       
       return MaximumNumberInMatrix ;
   }
   
   public static long MaximumNumberInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long MaximumNumberInMatrix = Long.MIN_VALUE ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j] > MaximumNumberInMatrix)
               {
                   MaximumNumberInMatrix = Matrix[i][j] ;
               }
           }
       }
       
       return MaximumNumberInMatrix ;
   }
   
   public static float MaximumNumberInMatrix(float Matrix[][] , int Rows , int Columns)
   {
       float MaximumNumberInMatrix = Float.MIN_VALUE ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j] > MaximumNumberInMatrix)
               {
                   MaximumNumberInMatrix = Matrix[i][j] ;
               }
           }
       }
       
       return MaximumNumberInMatrix ;
   }
   
   public static double MaximumNumberInMatrix(double Matrix[][] , int Rows , int Columns)
   {
       double MaximumNumberInMatrix = Double.MIN_VALUE;
       
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j] > MaximumNumberInMatrix)
               {
                   MaximumNumberInMatrix = Matrix[i][j] ;
               }
           }
       }
       
       return MaximumNumberInMatrix;
   }
   
   public static byte MinimumNumberInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte MinimumNumberInMatrix = Byte.MAX_VALUE ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j] < MinimumNumberInMatrix)
               {
                   MinimumNumberInMatrix = Matrix[i][j];
               }
           }
       }
       
       return MinimumNumberInMatrix;
   }
   public static int MinimumNumberInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int MinimumNumberInMatrix = Integer.MAX_VALUE ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j] < MinimumNumberInMatrix)
               {
                   MinimumNumberInMatrix = Matrix[i][j];
               }
           }
       }
       
       return MinimumNumberInMatrix;
   }
   public static short MinimumNumberInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short MinimumNumberInMatrix = Short.MAX_VALUE ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j] < MinimumNumberInMatrix)
               {
                   MinimumNumberInMatrix = Matrix[i][j];
               }
           }
       }
       
       return MinimumNumberInMatrix;
   }
   public static long MinimumNumberInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long MinimumNumberInMatrix = Long.MAX_VALUE ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j] < MinimumNumberInMatrix)
               {
                   MinimumNumberInMatrix = Matrix[i][j];
               }
           }
       }
       
       return MinimumNumberInMatrix;
   }
   
   public static float MinimumNumberInMatrix(float Matrix[][] , int Rows ,int Columns)
   {
       float MinimumNumberInMatrix = Float.MAX_VALUE ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j] < MinimumNumberInMatrix)
               {
                   MinimumNumberInMatrix = Matrix[i][j] ;
               }
           }
       }
       
       return MinimumNumberInMatrix ;
   }
   
   public static double MinimumNumberInMatrix(double Matrix[][] , int Rows , int Columns)
   {
       double MininmumNumberInMatrix = Double.MAX_VALUE ;
       
       for(int i = 0 ;i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j] < MininmumNumberInMatrix)
               {
                   MininmumNumberInMatrix = Matrix[i][j] ;
               }

               }
       }
       
       return MininmumNumberInMatrix ;
   }

   public static byte[][] CopyMatrix(byte CopiedMatrix[][] , int Rows , int Columns)
   {
       byte [][]MatrixCopy = new byte[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][j] ;
           }
       }
       
       return MatrixCopy ;
   }
   public static int[][] CopyMatrix(int CopiedMatrix[][] , int Rows , int Columns)
   {
       int [][]MatrixCopy = new int[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][j] ;
           }
       }
       
       return MatrixCopy ;
   }
   
   public static short[][] CopyMatrix(short CopiedMatrix[][] , int Rows , int Columns)
   {
       short [][]MatrixCopy = new short[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][j] ;
           }
       }
       
       return MatrixCopy ;
   }
   
   public static long[][] CopyMatrix(long CopiedMatrix[][] , int Rows , int Columns)
   {
       long [][]MatrixCopy = new long[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][j] ;
           }
       }
       
       return MatrixCopy ;
   }
   
   public static boolean[][] CopyMatrix(boolean CopiedMatrix[][] , int Rows , int Columns)
   {
       boolean [][]MatrixCopy = new boolean[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][j] ;
           }
       }
       
       return MatrixCopy ;
   }
   
   public static double[][] CopyMatrix(double CopiedMatrix[][] , int Rows , int Columns)
   {
       double [][]MatrixCopy = new double[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][j] ;
           }
       }
       
       return MatrixCopy ;
   }
   
   public static float[][] CopyMatrix(float CopiedMatrix[][] , int Rows , int Columns)
   {
       float [][]MatrixCopy = new float[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][j] ;
           }
       }
       
       return MatrixCopy ;
   }
   
   public static char[][] CopyMatrix(char CopiedMatrix[][] , int Rows , int Columns)
   {
       char [][]MatrixCopy = new char[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][j] ;
           }
       }
       
       return MatrixCopy ;
   }
   
   public static String[][] CopyMatrix(String CopiedMatrix[][] , int Rows , int Columns)
   {
       String[][]MatrixCopy = new String[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][j] ;
           }
       }
       
       return MatrixCopy ;
   }
   
   public static byte[][] CopyArrayInReversedOrder(byte CopiedMatrix[][] ,int Rows ,int Columns)
   {
       byte[][]MatrixCopy = new byte[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ;j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][Columns - 1 - j];
           }
       }
       
       return MatrixCopy ;
   }
   public static int[][] CopyArrayInReversedOrder(int CopiedMatrix[][] ,int Rows ,int Columns)
   {
       int[][]MatrixCopy = new int[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ;j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][Columns - 1 - j];
           }
       }
       
       return MatrixCopy ;
   }
   
   public static short[][] CopyArrayInReversedOrder(short CopiedMatrix[][] ,int Rows ,int Columns)
   {
       short[][]MatrixCopy = new short[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ;j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][Columns - 1 - j];
           }
       }
       
       return MatrixCopy ;
   }
   
   public static long[][] CopyArrayInReversedOrder(long CopiedMatrix[][] ,int Rows ,int Columns)
   {
       long[][]MatrixCopy = new long[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ;j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][Columns - 1 - j];
           }
       }
       
       return MatrixCopy ;
   }
   
   public static boolean[][] CopyArrayInReversedOrder(boolean CopiedMatrix[][] ,int Rows ,int Columns)
   {
       boolean[][]MatrixCopy = new boolean[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ;j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][Columns - 1 - j];
           }
       }
       
       return MatrixCopy ;
   }
   
   public static float[][] CopyArrayInReversedOrder(float CopiedMatrix[][] ,int Rows ,int Columns)
   {
       float[][]MatrixCopy = new float[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ;j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][Columns - 1 - j];
           }
       }
       
       return MatrixCopy ;
   }
   
   public static double[][] CopyArrayInReversedOrder(double CopiedMatrix[][] ,int Rows ,int Columns)
   {
       double[][]MatrixCopy = new double[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ;j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][Columns - 1 - j];
           }
       }
       
       return MatrixCopy ;
   }
   
   public static char[][] CopyArrayInReversedOrder(char CopiedMatrix[][] ,int Rows ,int Columns)
   {
       char[][]MatrixCopy = new char[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ;j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][Columns - 1 - j];
           }
       }
       
       return MatrixCopy ;
   }
   
   public static String[][] CopyArrayInReversedOrder(String CopiedMatrix[][] ,int Rows ,int Columns)
   {
       String[][]MatrixCopy = new String[Rows][Columns] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ;j++)
           {
               MatrixCopy[i][j] = CopiedMatrix[i][Columns - 1 - j];
           }
       }
       
       return MatrixCopy ;
   }
   
   public static boolean IsStringFoundInMatrix(String StringWord , String Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(StringWord.equals(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsCharacterFoundInMatrix(char Character , char Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Character == Matrix[i][j])
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsTRUEValuesFoundInMatrix(boolean Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j])
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   public static boolean IsFALSEValuesFoundInMatrix(boolean Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!Matrix[i][j])
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsEvenNumberFoundInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j  <Columns ; j++)
           {
               if(IsEvenNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   public static boolean IsEvenNumberFoundInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j  <Columns ; j++)
           {
               if(IsEvenNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsEvenNumberFoundInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j  <Columns ; j++)
           {
               if(IsEvenNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsEvenNumberFoundInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j  <Columns ; j++)
           {
               if(IsEvenNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsOddNumberFoundInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsOddNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   public static boolean IsOddNumberFoundInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsOddNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsOddNumberFoundInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsOddNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsOddNumberFoundInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsOddNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsPrimeNumberFoundInMatrix(byte Matrix[][] , int Rows ,int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPrimeNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   public static boolean IsPrimeNumberFoundInMatrix(int Matrix[][] , int Rows ,int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPrimeNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsPrimeNumberFoundInMatrix(short Matrix[][] , int Rows ,int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPrimeNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsPrimeNumberFoundInMatrix(long Matrix[][] , int Rows ,int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPrimeNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsPerfectNumberFoundInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPerfectNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   public static boolean IsPerfectNumberFoundInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPerfectNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsPerfectNumberFoundInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPerfectNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsPerfectNumberFoundInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPerfectNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsPositiveNumberFoundInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPositiveNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   public static boolean IsPositiveNumberFoundInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPositiveNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsPositiveNumberFoundInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPositiveNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsPositiveNumberFoundInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPositiveNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsPositiveNumberFoundInMatrix(double Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPositiveNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsPositiveNumberFoundInMatrix(float Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPositiveNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsNegativeNumberFoundInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNegativeNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   public static boolean IsNegativeNumberFoundInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNegativeNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsNegativeNumberFoundInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNegativeNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsNegativeNumberFoundInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNegativeNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsNegativeNumberFoundInMatrix(double Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNegativeNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsNegativeNumberFoundInMatrix(float Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNegativeNumber(Matrix[i][j]))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctNumberFoundInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctNumberFoundInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctNumberFoundInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctNumberFoundInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   public static boolean IsDistinctBooleanValueFoundInMatrix(boolean Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctBooleanValueInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctNumberFoundInMatrix(float Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctNumberFoundInMatrix(double Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctCharacterFoundInMatrix(char Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctCharacterInMatrix(Matrix[i][j] ,Matrix, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean IsDistinctStringFoundInMatrix(String Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctStringInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(byte Matrix1[][] , byte Matrix2[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   public static boolean AreMatricesIntersect(int Matrix1[][] , int Matrix2[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(short Matrix1[][] , short Matrix2[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(long Matrix1[][] , long Matrix2[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(boolean Matrix1[][] , boolean Matrix2[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsBooleanValueFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(int Matrix1[][] , int Rows1 , int Columns1 , int Matrix2[][] , int Rows2 , int Columns2)
   {
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(short Matrix1[][] , int Rows1 , int Columns1 , short Matrix2[][] , int Rows2 , int Columns2)
   {
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(long Matrix1[][] , int Rows1 , int Columns1 , long Matrix2[][] , int Rows2 , int Columns2)
   {
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(boolean Matrix1[][] , int Rows1 , int Columns1 , boolean Matrix2[][] , int Rows2 , int Columns2)
   {
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsBooleanValueFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(float Matrix1[][] , float Matrix2[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(float Matrix1[][] , int Rows1 , int Columns1 , float Matrix2[][] , int Rows2 , int Columns2)
   {
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(double Matrix1[][] , double Matrix2[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(double Matrix1[][] , int Rows1 , int Columns1 , double Matrix2[][] , int Rows2 , int Columns2)
   {
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(char Matrix1[][] , char Matrix2[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsCharacterFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(char Matrix1[][] , int Rows1 , int Columns1 , char Matrix2[][] , int Rows2 , int Columns2)
   {
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsCharacterFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(String Matrix1[][] , String Matrix2[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsStringFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean AreMatricesIntersect(String Matrix1[][] , int Rows1 , int Columns1 , String Matrix2[][] , int Rows2 , int Columns2)
   {
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsStringFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static long CountDistinctNumbersInMatrix(byte Matrix[][] , int Rows ,int Columns)
   {
       long DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersCounter++ ;
               }
           }
       }
       
       return DistinctNumbersCounter;
   }
   public static long CountDistinctNumbersInMatrix(int Matrix[][] , int Rows ,int Columns)
   {
       long DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersCounter++ ;
               }
           }
       }
       
       return DistinctNumbersCounter;
   }
   
   public static long CountDistinctNumbersInMatrix(short Matrix[][] , int Rows ,int Columns)
   {
       long DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersCounter++ ;
               }
           }
       }
       
       return DistinctNumbersCounter;
   }
   
   public static long CountDistinctNumbersInMatrix(long Matrix[][] , int Rows ,int Columns)
   {
       long DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersCounter++ ;
               }
           }
       }
       
       return DistinctNumbersCounter;
   }
   
   public static long CountDistinctNumbersInMatrix(boolean Matrix[][] , int Rows ,int Columns)
   {
       long DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctBooleanValueInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersCounter++ ;
               }
           }
       }
       
       return DistinctNumbersCounter;
   }
   
   public static long CountDistinctNumbersInMatrix(float Matrix[][] , int Rows ,int Columns)
   {
       long DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersCounter++ ;
               }
           }
       }
       
       return DistinctNumbersCounter;
   }
   
   public static long CountDistinctNumbersInMatrix(double Matrix[][] , int Rows ,int Columns)
   {
       long DistinctNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersCounter++ ;
               }
           }
       }
       
       return DistinctNumbersCounter;
   }
   
   public static long CountDistinctCharactersInMatrix(char Matrix[][] , int Rows ,int Columns)
   {
       long DistinctCharactersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctCharacterInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctCharactersCounter++ ;
               }
           }
       }
       
       return DistinctCharactersCounter;
   }
   
   public static long CountDistinctStringInMatrix(String Matrix[][] , int Rows ,int Columns)
   {
       long DistinctStringsCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctStringInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctStringsCounter++ ;
               }
           }
       }
       
       return DistinctStringsCounter;
   }
   
   public static long CountIntersectedNumbersInMatrix(byte Matrix1[][] , byte Matrix2[][] , int Rows , int Columns)
   {
       long IntersectedNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   IntersectedNumbersCounter++;
               }
           }
       }
       
       return IntersectedNumbersCounter ;
   }
   public static long CountIntersectedNumbersInMatrix(int Matrix1[][] , int Matrix2[][] , int Rows , int Columns)
   {
       long IntersectedNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   IntersectedNumbersCounter++;
               }
           }
       }
       
       return IntersectedNumbersCounter ;
   }
   
   public static long CountIntersectedNumbersInMatrix(short Matrix1[][] , short Matrix2[][] , int Rows , int Columns)
   {
       long IntersectedNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   IntersectedNumbersCounter++;
               }
           }
       }
       
       return IntersectedNumbersCounter ;
   }
   
   public static long CountIntersectedNumbersInMatrix(long Matrix1[][] , long Matrix2[][] , int Rows , int Columns)
   {
       long IntersectedNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   IntersectedNumbersCounter++;
               }
           }
       }
       
       return IntersectedNumbersCounter ;
   }
   
   public static long CountIntersectedBooleansInMatrix(boolean Matrix1[][] , boolean Matrix2[][] , int Rows , int Columns)
   {
       long IntersectedBooleansCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsBooleanValueFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   IntersectedBooleansCounter++;
               }
           }
       }
       
       return IntersectedBooleansCounter ;
   }
   
   public static long CountIntersectedNumbersInMatrix(byte Matrix1[][] ,int Rows1 , int Columns1 , byte Matrix2[][] , int Rows2 , int Columns2)
   {
    long IntersectedNumbersCounter = 0 ;
    
    for(int i = 0 ; i < Rows1 ; i++)
    {
        for(int j = 0 ; j < Columns1 ; j++)
        {
            if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
            {
                IntersectedNumbersCounter++ ;
            }
        }
    }
    
    return IntersectedNumbersCounter ;
   }
   public static long CountIntersectedNumbersInMatrix(int Matrix1[][] ,int Rows1 , int Columns1 , int Matrix2[][] , int Rows2 , int Columns2)
   {
    long IntersectedNumbersCounter = 0 ;
    
    for(int i = 0 ; i < Rows1 ; i++)
    {
        for(int j = 0 ; j < Columns1 ; j++)
        {
            if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
            {
                IntersectedNumbersCounter++ ;
            }
        }
    }
    
    return IntersectedNumbersCounter ;
   }
   
   public static long CountIntersectedNumbersInMatrix(short Matrix1[][] ,int Rows1 , int Columns1 , short Matrix2[][] , int Rows2 , int Columns2)
   {
    long IntersectedNumbersCounter = 0 ;
    
    for(int i = 0 ; i < Rows1 ; i++)
    {
        for(int j = 0 ; j < Columns1 ; j++)
        {
            if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
            {
                IntersectedNumbersCounter++ ;
            }
        }
    }
    
    return IntersectedNumbersCounter ;
   }
   
   public static long CountIntersectedNumbersInMatrix(long Matrix1[][] ,int Rows1 , int Columns1 , long Matrix2[][] , int Rows2 , int Columns2)
   {
    long IntersectedNumbersCounter = 0 ;
    
    for(int i = 0 ; i < Rows1 ; i++)
    {
        for(int j = 0 ; j < Columns1 ; j++)
        {
            if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
            {
                IntersectedNumbersCounter++ ;
            }
        }
    }
    
    return IntersectedNumbersCounter ;
   }
   
   public static long CountIntersectedNumbersInMatrix(boolean Matrix1[][] ,int Rows1 , int Columns1 , boolean Matrix2[][] , int Rows2 , int Columns2)
   {
    long IntersectedNumbersCounter = 0 ;
    
    for(int i = 0 ; i < Rows1 ; i++)
    {
        for(int j = 0 ; j < Columns1 ; j++)
        {
            if(IsBooleanValueFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
            {
                IntersectedNumbersCounter++ ;
            }
        }
    }
    
    return IntersectedNumbersCounter ;
   }
   
   public static long CountIntersectedNumbersInMatrix(float Matrix1[][] , float Matrix2[][] , int Rows , int Columns)
   {
       long IntersectedNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   IntersectedNumbersCounter++;
               }
           }
       }
       
       return IntersectedNumbersCounter ;
   }
   
   public static long CountIntersectedNumbersInMatrix(float Matrix1[][] ,int Rows1 , int Columns1 , float Matrix2[][] , int Rows2 , int Columns2)
   {
    long IntersectedNumbersCounter = 0 ;
    
    for(int i = 0 ; i < Rows1 ; i++)
    {
        for(int j = 0 ; j < Columns1 ; j++)
        {
            if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
            {
                IntersectedNumbersCounter++ ;
            }
        }
    }
    
    return IntersectedNumbersCounter ;
   }
   
   public static long CountIntersectedNumbersInMatrix(double Matrix1[][] , double Matrix2[][] , int Rows , int Columns)
   {
       long IntersectedNumbersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   IntersectedNumbersCounter++;
               }
           }
       }
       
       return IntersectedNumbersCounter ;
   }
   
   public static long CountIntersectedNumbersInMatrix(double Matrix1[][] ,int Rows1 , int Columns1 , double Matrix2[][] , int Rows2 , int Columns2)
   {
    long IntersectedNumbersCounter = 0 ;
    
    for(int i = 0 ; i < Rows1 ; i++)
    {
        for(int j = 0 ; j < Columns1 ; j++)
        {
            if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
            {
                IntersectedNumbersCounter++ ;
            }
        }
    }
    
    return IntersectedNumbersCounter ;
   }
   
   public static long CountIntersectedCharactersInMatrix(char Matrix1[][] , char Matrix2[][] , int Rows , int Columns)
   {
       long IntersectedCharactersCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsCharacterFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   IntersectedCharactersCounter++;
               }
           }
       }
       
       return IntersectedCharactersCounter ;
   }
   
   public static long CountIntersectedCharactersInMatrix(char Matrix1[][] ,int Rows1 , int Columns1 , char Matrix2[][] , int Rows2 , int Columns2)
   {
    long IntersectedCharacterCounter = 0 ;
    
    for(int i = 0 ; i < Rows1 ; i++)
    {
        for(int j = 0 ; j < Columns1 ; j++)
        {
            if(IsCharacterFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
            {
                IntersectedCharacterCounter++ ;
            }
        }
    }
    
    return IntersectedCharacterCounter ;
   }
   
   public static long CountIntersectedStringsInMatrix(String Matrix1[][] , String Matrix2[][] , int Rows , int Columns)
   {
       long IntersectedStringsCounter = 0 ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsStringFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
                   IntersectedStringsCounter++;
               }
           }
       }
       
       return IntersectedStringsCounter ;
   }
   
   public static long CountIntersectedStringsInMatrix(String Matrix1[][] ,int Rows1 , int Columns1 , String Matrix2[][] , int Rows2 , int Columns2)
   {
    long IntersectedStringsCounter = 0 ;
    
    for(int i = 0 ; i < Rows1 ; i++)
    {
        for(int j = 0 ; j < Columns1 ; j++)
        {
            if(IsStringFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
            {
                IntersectedStringsCounter++ ;
            }
        }
    }
    
    return IntersectedStringsCounter ;
   }
   
   public static boolean GetTRUEValuesArrayInMatrix(boolean Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j])
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static boolean GetFALSEValuesArrayInMatrix(boolean Matrix[][] , int Rows , int Columns)
   {
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!Matrix[i][j])
               {
                   return true ;
               }
           }
       }
       
       return false ;
   }
   
   public static byte[]GetEvenNumbersArrayInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte[]EvenNumbersArray = new byte[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsEvenNumber(Matrix[i][j]))
               {
                   EvenNumbersArray = AddArrayElement(Matrix[i][j], EvenNumbersArray);
               }
           }
       }
       
       return EvenNumbersArray ;
   }
   public static int[]GetEvenNumbersArrayInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int[]EvenNumbersArray = new int[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsEvenNumber(Matrix[i][j]))
               {
                   EvenNumbersArray = AddArrayElement(Matrix[i][j], EvenNumbersArray);
               }
           }
       }
       
       return EvenNumbersArray ;
   }
   
   public static short[]GetEvenNumbersArrayInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short[]EvenNumbersArray = new short[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsEvenNumber(Matrix[i][j]))
               {
                   EvenNumbersArray = AddArrayElement(Matrix[i][j], EvenNumbersArray);
               }
           }
       }
       
       return EvenNumbersArray ;
   }
   
   public static long[]GetEvenNumbersArrayInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long[]EvenNumbersArray = new long[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsEvenNumber(Matrix[i][j]))
               {
                   EvenNumbersArray = AddArrayElement(Matrix[i][j], EvenNumbersArray);
               }
           }
       }
       
       return EvenNumbersArray ;
   }
   
   public static byte[]GetOddNumbersArrayInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte[]OddNumbersArray = new byte[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsOddNumber(Matrix[i][j]))
               {
                   OddNumbersArray = AddArrayElement(Matrix[i][j], OddNumbersArray);
               }
           }
       }
       
       return OddNumbersArray ;
   }
   public static int[]GetOddNumbersArrayInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int[]OddNumbersArray = new int[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsOddNumber(Matrix[i][j]))
               {
                   OddNumbersArray = AddArrayElement(Matrix[i][j], OddNumbersArray);
               }
           }
       }
       
       return OddNumbersArray ;
   }
   
   public static short[]GetOddNumbersArrayInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short[]OddNumbersArray = new short[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsOddNumber(Matrix[i][j]))
               {
                   OddNumbersArray = AddArrayElement(Matrix[i][j], OddNumbersArray);
               }
           }
       }
       
       return OddNumbersArray ;
   }
   
   public static long[]GetOddNumbersArrayInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long[]OddNumbersArray = new long[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsOddNumber(Matrix[i][j]))
               {
                   OddNumbersArray = AddArrayElement(Matrix[i][j], OddNumbersArray);
               }
           }
       }
       
       return OddNumbersArray ;
   }
   
   public static byte[]GetPrimeNumbersArrayInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte[]PrimeNumbersArray = new byte[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPrimeNumber(Matrix[i][j]))
               {
                   PrimeNumbersArray = AddArrayElement(Matrix[i][j], PrimeNumbersArray);
               }
           }
       }
       
       return PrimeNumbersArray ;
   }
   public static int[]GetPrimeNumbersArrayInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int[]PrimeNumbersArray = new int[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPrimeNumber(Matrix[i][j]))
               {
                   PrimeNumbersArray = AddArrayElement(Matrix[i][j], PrimeNumbersArray);
               }
           }
       }
       
       return PrimeNumbersArray ;
   }
   
   public static short[]GetPrimeNumbersArrayInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short[]PrimeNumbersArray = new short[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPrimeNumber(Matrix[i][j]))
               {
                   PrimeNumbersArray = AddArrayElement(Matrix[i][j], PrimeNumbersArray);
               }
           }
       }
       
       return PrimeNumbersArray ;
   }
   
   public static long[]GetPrimeNumbersArrayInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long[]PrimeNumbersArray = new long[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPrimeNumber(Matrix[i][j]))
               {
                   PrimeNumbersArray = AddArrayElement(Matrix[i][j], PrimeNumbersArray);
               }
           }
       }
       
       return PrimeNumbersArray ;
   }
   
   public static byte[]GetPerfectNumbersArrayInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte[]PerfectNumbersArray = new byte[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPerfectNumber(Matrix[i][j]))
               {
                   PerfectNumbersArray = AddArrayElement(Matrix[i][j], PerfectNumbersArray);
               }
           }
       }
       
       return PerfectNumbersArray ;
   }
   public static int[]GetPerfectNumbersArrayInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int[]PerfectNumbersArray = new int[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPerfectNumber(Matrix[i][j]))
               {
                   PerfectNumbersArray = AddArrayElement(Matrix[i][j], PerfectNumbersArray);
               }
           }
       }
       
       return PerfectNumbersArray ;
   }
   
   public static short[]GetPerfectNumbersArrayInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short[]PerfectNumbersArray = new short[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPerfectNumber(Matrix[i][j]))
               {
                   PerfectNumbersArray = AddArrayElement(Matrix[i][j], PerfectNumbersArray);
               }
           }
       }
       
       return PerfectNumbersArray ;
   }
   
   public static long[]GetPerfectNumbersArrayInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long[]PerfectNumbersArray = new long[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPerfectNumber(Matrix[i][j]))
               {
                   PerfectNumbersArray = AddArrayElement(Matrix[i][j], PerfectNumbersArray);
               }
           }
       }
       
       return PerfectNumbersArray ;
   }
   
   public static byte[]GetPositiveNumbersArrayInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte[]PositiveNumbersArray = new byte[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPositiveNumber(Matrix[i][j]))
               {
                   PositiveNumbersArray = AddArrayElement(Matrix[i][j], PositiveNumbersArray);
               }
           }
       }
       
       return PositiveNumbersArray ;
   }
   public static int[]GetPositiveNumbersArrayInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int[]PositiveNumbersArray = new int[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPositiveNumber(Matrix[i][j]))
               {
                   PositiveNumbersArray = AddArrayElement(Matrix[i][j], PositiveNumbersArray);
               }
           }
       }
       
       return PositiveNumbersArray ;
   }
   
   public static short[]GetPositiveNumbersArrayInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short[]PositiveNumbersArray = new short[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPositiveNumber(Matrix[i][j]))
               {
                   PositiveNumbersArray = AddArrayElement(Matrix[i][j], PositiveNumbersArray);
               }
           }
       }
       
       return PositiveNumbersArray ;
   }
   
   public static long[]GetPositiveNumbersArrayInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long[]PositiveNumbersArray = new long[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPositiveNumber(Matrix[i][j]))
               {
                   PositiveNumbersArray = AddArrayElement(Matrix[i][j], PositiveNumbersArray);
               }
           }
       }
       
       return PositiveNumbersArray ;
   }
   
   public static float[]GetPositiveNumbersArrayInMatrix(float Matrix[][] , int Rows , int Columns)
   {
       float[]PositiveNumbersArray = new float[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPositiveNumber(Matrix[i][j]))
               {
                   PositiveNumbersArray = AddArrayElement(Matrix[i][j], PositiveNumbersArray);
               }
           }
       }
       
       return PositiveNumbersArray ;
   }
   
   public static double[]GetPositiveNumbersArrayInMatrix(double Matrix[][] , int Rows , int Columns)
   {
       double[]PositiveNumbersArray = new double[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsPositiveNumber(Matrix[i][j]))
               {
                   PositiveNumbersArray = AddArrayElement(Matrix[i][j], PositiveNumbersArray);
               }
           }
       }
       
       return PositiveNumbersArray ;
   }
   
   public static byte[]GetNegativeNumbersArrayInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte[]NegativeNumbersArray = new byte[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNegativeNumber(Matrix[i][j]))
               {
                   NegativeNumbersArray = AddArrayElement(Matrix[i][j], NegativeNumbersArray);
               }
           }
       }
       
       return NegativeNumbersArray ;
   }
   public static int[]GetNegativeNumbersArrayInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int[]NegativeNumbersArray = new int[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNegativeNumber(Matrix[i][j]))
               {
                   NegativeNumbersArray = AddArrayElement(Matrix[i][j], NegativeNumbersArray);
               }
           }
       }
       
       return NegativeNumbersArray ;
   }
   
   public static short[]GetNegativeNumbersArrayInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short[]NegativeNumbersArray = new short[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNegativeNumber(Matrix[i][j]))
               {
                   NegativeNumbersArray = AddArrayElement(Matrix[i][j], NegativeNumbersArray);
               }
           }
       }
       
       return NegativeNumbersArray ;
   }
   
   public static long[]GetNegativeNumbersArrayInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long[]NegativeNumbersArray = new long[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNegativeNumber(Matrix[i][j]))
               {
                   NegativeNumbersArray = AddArrayElement(Matrix[i][j], NegativeNumbersArray);
               }
           }
       }
       
       return NegativeNumbersArray ;
   }
   
   public static float[]GetNegativeNumbersArrayInMatrix(float Matrix[][] , int Rows , int Columns)
   {
       float[]NegativeNumbersArray = new float[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNegativeNumber(Matrix[i][j]))
               {
                   NegativeNumbersArray = AddArrayElement(Matrix[i][j], NegativeNumbersArray);
               }
           }
       }
       
       return NegativeNumbersArray ;
   }
   
   public static double[]GetNegativeNumbersArrayInMatrix(double Matrix[][] , int Rows , int Columns)
   {
       double[]NegativeNumbersArray = new double[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNegativeNumber(Matrix[i][j]))
               {
                   NegativeNumbersArray = AddArrayElement(Matrix[i][j], NegativeNumbersArray);
               }
           }
       }
       
       return NegativeNumbersArray ;
   }
   
   public static byte[] GetDistinctNumbersArrayInMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte DistinctNumbersArray[] = new byte[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersArray = AddArrayElement(Matrix[i][j], DistinctNumbersArray);
               }
           }
       }
       
       return DistinctNumbersArray ;
   }
   public static int[] GetDistinctNumbersArrayInMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int DistinctNumbersArray[] = new int[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersArray = AddArrayElement(Matrix[i][j], DistinctNumbersArray);
               }
           }
       }
       
       return DistinctNumbersArray ;
   }
   
   public static short[] GetDistinctNumbersArrayInMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short DistinctNumbersArray[] = new short[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersArray = AddArrayElement(Matrix[i][j], DistinctNumbersArray);
               }
           }
       }
       
       return DistinctNumbersArray ;
   }
   
   public static long[] GetDistinctNumbersArrayInMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long DistinctNumbersArray[] = new long[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersArray = AddArrayElement(Matrix[i][j], DistinctNumbersArray);
               }
           }
       }
       
       return DistinctNumbersArray ;
   }
   
   public static boolean[] GetDistinctBooleansArrayInMatrix(boolean Matrix[][] , int Rows , int Columns)
   {
       boolean DistinctBooleansArray[] = new boolean[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctBooleanValueInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctBooleansArray = AddArrayElement(Matrix[i][j], DistinctBooleansArray);
               }
           }
       }
       
       return DistinctBooleansArray ;
   }
   
   public static float[] GetDistinctNumbersArrayInMatrix(float Matrix[][] , int Rows , int Columns)
   {
       float DistinctNumbersArray[] = new float[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersArray = AddArrayElement(Matrix[i][j], DistinctNumbersArray);
               }
           }
       }
       
       return DistinctNumbersArray ;
   }
   
   public static double[] GetDistinctNumbersArrayInMatrix(double Matrix[][] , int Rows , int Columns)
   {
       double DistinctNumbersArray[] = new double[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctNumberInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctNumbersArray = AddArrayElement(Matrix[i][j], DistinctNumbersArray);
               }
           }
       }
       
       return DistinctNumbersArray ;
   }
   
   public static char[] GetDistinctCharactersArrayInMatrix(char Matrix[][] , int Rows , int Columns)
   {
       char DistinctCharactersArray[] = new char[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctCharacterInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctCharactersArray = AddArrayElement(Matrix[i][j], DistinctCharactersArray);
               }
           }
       }
       
       return DistinctCharactersArray ;
   }
   
   public static String[] GetDistinctStringsArrayInMatrix(String Matrix[][] , int Rows , int Columns)
   {
       String DistinctStringsArray[] = new String[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsDistinctStringInMatrix(Matrix[i][j], Matrix, Rows, Columns))
               {
                   DistinctStringsArray = AddArrayElement(Matrix[i][j], DistinctStringsArray);
               }
           }
       }
       
       return DistinctStringsArray ;
   }
   
   public static byte[] GetIntersectedNumbersArrayInMatrix(byte Matrix1[][] , byte Matrix2[][] , int Rows , int Columns)
   {
       byte IntersectedNumbersArray[] = new byte[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
               IntersectedNumbersArray = AddArrayElement(Matrix1[i][j], IntersectedNumbersArray);
               }
           }
       }
       
       return IntersectedNumbersArray ;
   }
   public static int[] GetIntersectedNumbersArrayInMatrix(int Matrix1[][] , int Matrix2[][] , int Rows , int Columns)
   {
       int IntersectedNumbersArray[] = new int[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
               IntersectedNumbersArray = AddArrayElement(Matrix1[i][j], IntersectedNumbersArray);
               }
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static short[] GetIntersectedNumbersArrayInMatrix(short Matrix1[][] , short Matrix2[][] , int Rows , int Columns)
   {
       short IntersectedNumbersArray[] = new short[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
               IntersectedNumbersArray = AddArrayElement(Matrix1[i][j], IntersectedNumbersArray);
               }
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static long[] GetIntersectedNumbersArrayInMatrix(long Matrix1[][] , long Matrix2[][] , int Rows , int Columns)
   {
       long IntersectedNumbersArray[] = new long[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
               IntersectedNumbersArray = AddArrayElement(Matrix1[i][j], IntersectedNumbersArray);
               }
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static boolean[] GetIntersectedBooleansArrayInMatrix(boolean Matrix1[][] , boolean Matrix2[][] , int Rows , int Columns)
   {
       boolean IntersectedBooleansArray[] = new boolean[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsBooleanValueFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
               IntersectedBooleansArray = AddArrayElement(Matrix1[i][j], IntersectedBooleansArray);
               }
           }
       }
       
       return IntersectedBooleansArray ;
   }
   
   public static byte[] GetIntersectedNumbersArrayInMatrix(byte Matrix1[][] , int Rows1 , int Columns1, byte Matrix2[][] , int Rows2  , int Columns2)
   {
       byte IntersectedNumbersArray[] = new byte[0] ;
       
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
               IntersectedNumbersArray = AddArrayElement(Matrix1[i][j], IntersectedNumbersArray);
               }
           }
       }
       
       return IntersectedNumbersArray ;
   }
   public static int[] GetIntersectedNumbersArrayInMatrix(int Matrix1[][] , int Rows1 , int Columns1, int Matrix2[][] , int Rows2  , int Columns2)
   {
       int IntersectedNumbersArray[] = new int[0] ;
       
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
               IntersectedNumbersArray = AddArrayElement(Matrix1[i][j], IntersectedNumbersArray);
               }
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static short[] GetIntersectedNumbersArrayInMatrix(short Matrix1[][] , int Rows1 , int Columns1, short Matrix2[][] , int Rows2  , int Columns2)
   {
       short IntersectedNumbersArray[] = new short[0] ;
       
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
               IntersectedNumbersArray = AddArrayElement(Matrix1[i][j], IntersectedNumbersArray);
               }
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static long[] GetIntersectedNumbersArrayInMatrix(long Matrix1[][] , int Rows1 , int Columns1, long Matrix2[][] , int Rows2  , int Columns2)
   {
       long IntersectedNumbersArray[] = new long[0] ;
       
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
               IntersectedNumbersArray = AddArrayElement(Matrix1[i][j], IntersectedNumbersArray);
               }
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static boolean[] GetIntersectedBooleansArrayInMatrix(boolean Matrix1[][] , int Rows1 , int Columns1, boolean Matrix2[][] , int Rows2  , int Columns2)
   {
       boolean IntersectedBooleansArray[] = new boolean[0] ;
       
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsBooleanValueFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
               IntersectedBooleansArray = AddArrayElement(Matrix1[i][j], IntersectedBooleansArray);
               }
           }
       }
       
       return IntersectedBooleansArray ;
   }
   
   public static float[] GetIntersectedNumbersArrayInMatrix(float Matrix1[][] , float Matrix2[][] , int Rows , int Columns)
   {
       float IntersectedNumbersArray[] = new float[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
               IntersectedNumbersArray = AddArrayElement(Matrix1[i][j], IntersectedNumbersArray);
               }
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static float[] GetIntersectedNumbersArrayInMatrix(float Matrix1[][] , int Rows1 , int Columns1, float Matrix2[][] , int Rows2  , int Columns2)
   {
       float IntersectedNumbersArray[] = new float[0] ;
       
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
               IntersectedNumbersArray = AddArrayElement(Matrix1[i][j], IntersectedNumbersArray);
               }
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static double[] GetIntersectedNumbersArrayInMatrix(double Matrix1[][] , double Matrix2[][] , int Rows , int Columns)
   {
       double IntersectedNumbersArray[] = new double[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
               IntersectedNumbersArray = AddArrayElement(Matrix1[i][j], IntersectedNumbersArray);
               }
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static double[] GetIntersectedNumbersArrayInMatrix(double Matrix1[][] , int Rows1 , int Columns1, double Matrix2[][] , int Rows2  , int Columns2)
   {
       double IntersectedNumbersArray[] = new double[0] ;
       
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsNumberFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
               IntersectedNumbersArray = AddArrayElement(Matrix1[i][j], IntersectedNumbersArray);
               }
           }
       }
       
       return IntersectedNumbersArray ;
   }
   
   public static char[] GetIntersectedCharactersArrayInMatrix(char Matrix1[][] , char Matrix2[][] , int Rows , int Columns)
   {
       char IntersectedCharactersArray[] = new char[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsCharacterFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
               IntersectedCharactersArray = AddArrayElement(Matrix1[i][j], IntersectedCharactersArray);
               }
           }
       }
       
       return IntersectedCharactersArray ;
   }
   
   public static char[] GetIntersectedCharactersArrayInMatrix(char Matrix1[][] , int Rows1 , int Columns1, char Matrix2[][] , int Rows2  , int Columns2)
   {
       char IntersectedCharactersArray[] = new char[0] ;
       
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsCharacterFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
               IntersectedCharactersArray = AddArrayElement(Matrix1[i][j], IntersectedCharactersArray);
               }
           }
       }
       
       return IntersectedCharactersArray ;
   }
   
   public static String[] GetIntersectedStringsArrayInMatrix(String Matrix1[][] , String Matrix2[][] , int Rows , int Columns)
   {
       String IntersectedStringsArray[] = new String[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(IsStringFoundInMatrix(Matrix1[i][j], Matrix2, Rows, Columns))
               {
               IntersectedStringsArray = AddArrayElement(Matrix1[i][j], IntersectedStringsArray);
               }
           }
       }
       
       return IntersectedStringsArray ;
   }
   
   public static String[] GetIntersectedStringsArrayInMatrix(String Matrix1[][] , int Rows1 , int Columns1, String Matrix2[][] , int Rows2  , int Columns2)
   {
       String IntersectedStringsArray[] = new String[0] ;
       
       for(int i = 0 ; i < Rows1 ; i++)
       {
           for(int j = 0 ; j < Columns1 ; j++)
           {
               if(IsStringFoundInMatrix(Matrix1[i][j], Matrix2, Rows2, Columns2))
               {
               IntersectedStringsArray = AddArrayElement(Matrix1[i][j], IntersectedStringsArray);
               }
           }
       }
       
       return IntersectedStringsArray ;
   }
   
   public static boolean[] DeleteTRUEValuesFromMatrix(boolean Matrix[][] , int Rows  , int Columns)
   {
       boolean []FilteredArray = new boolean[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!Matrix[i][j])
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   public static boolean[] DeleteFALSEValuesFromMatrix(boolean Matrix[][] , int Rows  , int Columns)
   {
       boolean []FilteredArray = new boolean[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(Matrix[i][j])
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   
   public static byte[] DeleteEvenNumbersFromMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte [] FilteredArray = new byte [0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsEvenNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   public static int[] DeleteEvenNumbersFromMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int [] FilteredArray = new int [0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsEvenNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   public static short[] DeleteEvenNumbersFromMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short [] FilteredArray = new short [0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsEvenNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   public static long[] DeleteEvenNumbersFromMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long [] FilteredArray = new long [0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsEvenNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   
   
   public static byte[] DeleteOddNumbersFromMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte [] FilteredArray = new byte[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsOddNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   public static int[] DeleteOddNumbersFromMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int [] FilteredArray = new int[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsOddNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   
   public static short[] DeleteOddNumbersFromMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short [] FilteredArray = new short[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsOddNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   
   public static long[] DeleteOddNumbersFromMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long [] FilteredArray = new long[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsOddNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   
   public static byte[] DeletePrimeNumbersFromMatrix(byte Matrix[][] , int Rows  ,int Columns)
   {
       byte[] FilteredArray = new byte[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns  ;j++)
           {
               if(!IsPrimeNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   public static int[] DeletePrimeNumbersFromMatrix(int Matrix[][] , int Rows  ,int Columns)
   {
       int[] FilteredArray = new int[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns  ;j++)
           {
               if(!IsPrimeNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   public static short[] DeletePrimeNumbersFromMatrix(short Matrix[][] , int Rows  ,int Columns)
   {
       short[] FilteredArray = new short[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns  ;j++)
           {
               if(!IsPrimeNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   public static long[] DeletePrimeNumbersFromMatrix(long Matrix[][] , int Rows  ,int Columns)
   {
       long[] FilteredArray = new long[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns  ;j++)
           {
               if(!IsPrimeNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   
   public static byte[] DeletePerfectNumbersFromMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte[] FilteredArray = new byte[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsPerfectNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   public static int[] DeletePerfectNumbersFromMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int[] FilteredArray = new int[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsPerfectNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   public static short[] DeletePerfectNumbersFromMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short[] FilteredArray = new short[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsPerfectNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   public static long[] DeletePerfectNumbersFromMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long[] FilteredArray = new long[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsPerfectNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
               }
           }
       }
       
       return FilteredArray ;
   }
   
   public static byte[] DeletePositiveNumbersFromMatrix(byte Matrix[][] , int Rows , int Columns)
   {
       byte FilteredArray[] = new byte[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsPositiveNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j], FilteredArray);
               }
           }
       }
       
       return FilteredArray ;
   }
   public static int[] DeletePositiveNumbersFromMatrix(int Matrix[][] , int Rows , int Columns)
   {
       int FilteredArray[] = new int[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsPositiveNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j], FilteredArray);
               }
           }
       }
       
       return FilteredArray ;
   }
   public static short[] DeletePositiveNumbersFromMatrix(short Matrix[][] , int Rows , int Columns)
   {
       short FilteredArray[] = new short[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsPositiveNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j], FilteredArray);
               }
           }
       }
       
       return FilteredArray ;
   }
   public static long[] DeletePositiveNumbersFromMatrix(long Matrix[][] , int Rows , int Columns)
   {
       long FilteredArray[] = new long[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsPositiveNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j], FilteredArray);
               }
           }
       }
       
       return FilteredArray ;
   }
   public static float[] DeletePositiveNumbersFromMatrix(float Matrix[][] , int Rows , int Columns)
   {
       float FilteredArray[] = new float[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsPositiveNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j], FilteredArray);
               }
           }
       }
       
       return FilteredArray ;
   }
   public static double[] DeletePositiveNumbersFromMatrix(double Matrix[][] , int Rows , int Columns)
   {
       double FilteredArray[] = new double[0] ;
       
       for(int i = 0 ; i < Rows ; i++)
       {
           for(int j = 0 ; j < Columns ; j++)
           {
               if(!IsPositiveNumber(Matrix[i][j]))
               {
                   FilteredArray = AddArrayElement(Matrix[i][j], FilteredArray);
               }
           }
       }
       
       return FilteredArray ;
   }
   
  public static byte[] DeleteNegativeNumbersFromMatrix(byte Matrix[][] , int Rows ,int Columns)
  {
      byte FilteredArray[] = new byte[0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsNegativeNumber(Matrix[i][j]))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray);
              }
          }
      }
      
      return FilteredArray ;
  }
  public static int[] DeleteNegativeNumbersFromMatrix(int Matrix[][] , int Rows ,int Columns)
  {
      int FilteredArray[] = new int[0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsNegativeNumber(Matrix[i][j]))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray);
              }
          }
      }
      
      return FilteredArray ;
  }
  public static short[] DeleteNegativeNumbersFromMatrix(short Matrix[][] , int Rows ,int Columns)
  {
      short FilteredArray[] = new short[0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsNegativeNumber(Matrix[i][j]))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray);
              }
          }
      }
      
      return FilteredArray ;
  }
  public static long[] DeleteNegativeNumbersFromMatrix(long Matrix[][] , int Rows ,int Columns)
  {
      long FilteredArray[] = new long[0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsNegativeNumber(Matrix[i][j]))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray);
              }
          }
      }
      
      return FilteredArray ;
  }
  public static float[] DeleteNegativeNumbersFromMatrix(float Matrix[][] , int Rows ,int Columns)
  {
      float FilteredArray[] = new float[0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsNegativeNumber(Matrix[i][j]))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray);
              }
          }
      }
      
      return FilteredArray ;
  }
  public static double[] DeleteNegativeNumbersFromMatrix(double Matrix[][] , int Rows ,int Columns)
  {
      double FilteredArray[] = new double[0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsNegativeNumber(Matrix[i][j]))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray);
              }
          }
      }
      
      return FilteredArray ;
  }
          
  public static byte[] DeleteDistinctNumbersFromMatrix(byte Matrix[][] , int Rows , int Columns)
  {
      byte FilteredArray[] = new byte [0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsDistinctNumberInMatrix(Matrix[i][j] ,Matrix , Rows, Columns))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
              }
          }
      }
      
      return FilteredArray ;
  }
  public static int[] DeleteDistinctNumbersFromMatrix(int Matrix[][] , int Rows , int Columns)
  {
      int FilteredArray[] = new int [0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsDistinctNumberInMatrix(Matrix[i][j] ,Matrix , Rows, Columns))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
              }
          }
      }
      
      return FilteredArray ;
  }
  public static short[] DeleteDistinctNumbersFromMatrix(short Matrix[][] , int Rows , int Columns)
  {
      short FilteredArray[] = new short [0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsDistinctNumberInMatrix(Matrix[i][j] ,Matrix , Rows, Columns))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
              }
          }
      }
      
      return FilteredArray ;
  }
  public static long[] DeleteDistinctNumbersFromMatrix(long Matrix[][] , int Rows , int Columns)
  {
      long FilteredArray[] = new long [0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsDistinctNumberInMatrix(Matrix[i][j] ,Matrix , Rows, Columns))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
              }
          }
      }
      
      return FilteredArray ;
  }
  public static float[] DeleteDistinctNumbersFromMatrix(float Matrix[][] , int Rows , int Columns)
  {
      float FilteredArray[] = new float [0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsDistinctNumberInMatrix(Matrix[i][j] ,Matrix , Rows, Columns))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
              }
          }
      }
      
      return FilteredArray ;
  }
  public static double[] DeleteDistinctNumbersFromMatrix(double Matrix[][] , int Rows , int Columns)
  {
      double FilteredArray[] = new double [0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsDistinctNumberInMatrix(Matrix[i][j] ,Matrix , Rows, Columns))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
              }
          }
      }
      
      return FilteredArray ;
  }
  public static char[] DeleteDistinctCharactersFromMatrix(char Matrix[][] , int Rows , int Columns)
  {
      char FilteredArray[] = new char [0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsDistinctCharacterInMatrix(Matrix[i][j] ,Matrix , Rows, Columns))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
              }
          }
      }
      
      return FilteredArray ;
  }
  public static String[] DeleteDistinctStringsFromMatrix(String Matrix[][] , int Rows , int Columns)
  {
      String FilteredArray[] = new String [0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsDistinctStringInMatrix(Matrix[i][j] ,Matrix , Rows, Columns))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
              }
          }
      }
      
      return FilteredArray ;
  }
  public static boolean[] DeleteDistinctBooleansFromMatrix(boolean Matrix[][] , int Rows , int Columns)
  {
      boolean FilteredArray[] = new boolean [0] ;
      
      for(int i = 0 ; i < Rows ; i++)
      {
          for(int j = 0 ; j < Columns ; j++)
          {
              if(!IsDistinctBooleanValueInMatrix(Matrix[i][j] ,Matrix , Rows, Columns))
              {
                  FilteredArray = AddArrayElement(Matrix[i][j] , FilteredArray) ;
              }
          }
      }
      
      return FilteredArray ;
  }
}
