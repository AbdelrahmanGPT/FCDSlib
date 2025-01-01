/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import static FCDSlib.Utility.*;
import static FCDSlib.Format.*;

/**
 *
 * @author AAMY
 */
public class StartExit {
    public static void StartProgram(String Message)
   {
       SectionBanner(Message , 2 , "-" , 60) ;
   }
   
   public static void StartProgram(String Message , int TabsNumber)
   {
       SectionBanner(Message , TabsNumber , "-" , 60) ;
   }
   
   public static void StartProgram(String Message , int TabsNumber , String LineStyle)
   {
       SectionBanner(Message , TabsNumber , LineStyle , 60) ;
   }
   
   public static void StartProgram(String Message , int TabsNumber , String LineStyle , int LineLength)
   {
       SectionBanner(Message , TabsNumber , LineStyle , LineLength) ;
   }
   
   public static void ExitProgram(String Message)
   {
       SectionBanner(Message , 2 , "-" , 60) ;
       Exit() ;
   }
   
   public static void ExitProgram(String Message , int TabsNumber)
   {
       SectionBanner(Message , TabsNumber , "-" , 60) ;
       Exit() ;
   }
   
   public static void ExitProgram(String Message , int TabsNumber , String LineStyle)
   {
       SectionBanner(Message , TabsNumber , LineStyle , 60) ;
       Exit() ;
   }
   
   public static void ExitProgram(String Message , int TabsNumber , String LineStyle , int LineLength)
   {
       SectionBanner(Message , TabsNumber , LineStyle , LineLength) ;
       Exit() ;
   }
}
