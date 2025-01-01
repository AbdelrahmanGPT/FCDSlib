/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import java.util.ArrayList;
import static FCDSlib.ArrayListM.* ;

/**
 *
 * @author AAMY
 */
public class MatrixListM {
    public static void PrintByteMatrixList(ArrayList<ArrayList<Byte>>MatrixList)
   {
       for(int i = 0 ; i < MatrixList.size(); i++)
       {
           PrintByteArrayList(MatrixList.get(i));
           System.out.println("");
       }
   }
   public static void PrintShortMatrixList(ArrayList<ArrayList<Short>>MatrixList)
   {
       for(int i = 0 ; i < MatrixList.size(); i++)
       {
           PrintShortArrayList(MatrixList.get(i));
           System.out.println("");
       }
   }
   public static void PrintIntegerMatrixList(ArrayList<ArrayList<Integer>>MatrixList)
   {
       for(int i = 0 ; i < MatrixList.size(); i++)
       {
           PrintIntegerArrayList(MatrixList.get(i));
           System.out.println("");
       }
   }
   public static void PrintLongMatrixList(ArrayList<ArrayList<Long>>MatrixList)
   {
       for(int i = 0 ; i < MatrixList.size(); i++)
       {
           PrintLongArrayList(MatrixList.get(i));
           System.out.println("");
       }
   }
   public static void PrintFloatMatrixList(ArrayList<ArrayList<Float>>MatrixList)
   {
       for(int i = 0 ; i < MatrixList.size(); i++)
       {
           PrintFloatArrayList(MatrixList.get(i));
           System.out.println("");
       }
   }
   public static void PrintDoubleMatrixList(ArrayList<ArrayList<Double>>MatrixList)
   {
       for(int i = 0 ; i < MatrixList.size(); i++)
       {
           PrintDoubleArrayList(MatrixList.get(i));
           System.out.println("");
       }
   }
   public static void PrintCharacterMatrixList(ArrayList<ArrayList<Character>>MatrixList)
   {
       for(int i = 0 ; i < MatrixList.size(); i++)
       {
           PrintCharacterArrayList(MatrixList.get(i));
           System.out.println("");
       }
   }
   public static void PrintStringMatrixList(ArrayList<ArrayList<String>>MatrixList)
   {
       for(int i = 0 ; i < MatrixList.size(); i++)
       {
           PrintStringArrayList(MatrixList.get(i));
           System.out.println("");
       }
   }
}
