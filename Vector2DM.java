/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import java.util.Vector;
import static FCDSlib.VectorM.*;

/**
 *
 * @author AAMY
 */
public class Vector2DM {
    public static void Print2DByteVector(Vector<Vector<Byte>>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           PrintByteVector(Vector.get(i));
           System.out.println("");
       }
   }
   
   public static void Print2DShortVector(Vector<Vector<Short>>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           PrintShortVector(Vector.get(i));
           System.out.println("");
       }
   }
   
   public static void Print2DIntegerVector(Vector<Vector<Integer>>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           PrintIntegerVector(Vector.get(i));
           System.out.println("");
       }
   }
   
   public static void Print2DLongVector(Vector<Vector<Long>>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           PrintLongVector(Vector.get(i));
           System.out.println("");
       }
   }
   
   public static void Print2DFloatVector(Vector<Vector<Float>>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           PrintFloatVector(Vector.get(i));
           System.out.println("");
       }
   }
   
   public static void Print2DDoubleVector(Vector<Vector<Double>>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           PrintDoubleVector(Vector.get(i));
           System.out.println("");
       }
   }
   
   public static void Print2DCharacterVector(Vector<Vector<Character>>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           PrintCharacterVector(Vector.get(i));
           System.out.println("");
       }
   }
   
   public static void Print2DStringVector(Vector<Vector<String>>Vector)
   {
       for(int i = 0 ; i < Vector.size() ; i++)
       {
           PrintStringVector(Vector.get(i));
           System.out.println("");
       }
   }
}
