/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import java.util.Vector;
import static FCDSlib.StringsM.*;

/**
 *
 * @author AAMY
 */
public class Format {
    public static String Tabs(int TabsNumber)
   {
       String Tabs = "" ;
       
       for(int i = 0 ; i < TabsNumber ; i++)
       {
           Tabs += "\t" ;
       }
       
       return Tabs ;
   }
   
   public static String NewLines(int NewLinesNumber)
   {
       String NewLines = "" ;
       
       for(int i = 0 ; i < NewLinesNumber ; i++)
       {
           NewLines += "\n" ;
       }
       
       return NewLines ;
   }
   
   public static String Line(String LineStyle , int LineLength)
   {
       String Line = "" ;
       
       for(int i = 0 ; i < LineLength ; i++)
       {
           Line += LineStyle ;
       }
       
       return Line ;
   }
   
   
   public static String SectionBanner(String SectionName)
   {
       return SectionBanner(SectionName , 2 , "-" , 60) ;
   }
   public static String SectionBanner(String SectionName , int TabsNumber)
   {
       return SectionBanner(SectionName , TabsNumber , "-" , 60) ;
   }
   public static String SectionBanner(String SectionName , int TabsNumber , String LineStyle)
   {
       return SectionBanner(SectionName , TabsNumber , LineStyle , 60) ;
   }
   
   public static String SectionBanner(String SectionName , int TabsNumber , String LineStyle , int LineLength)
   {
       String AllSectionBanner = "" ;
       
       String SectionBannerLine = Line(LineStyle , LineLength) ;
       
       AllSectionBanner += ("\n" + SectionBannerLine + "\n");
       AllSectionBanner += (Tabs(TabsNumber) + SectionName);
       AllSectionBanner += ("\n" + SectionBannerLine + "\n");
       
       return AllSectionBanner ;
   }
   
   public static void PrintSectionBanner(String SectionName)
   {
       System.out.println(SectionBanner(SectionName));
   }
   public static void PrintSectionBanner(String SectionName , int TabsNumber)
   {
       System.out.println(SectionBanner(SectionName, TabsNumber));
   }
   public static void PrintSectionBanner(String SectionName , int TabsNumber , String LineStyle)
   {
       System.out.println(SectionBanner(SectionName, TabsNumber, LineStyle));
   }
   public static void PrintSectionBanner(String SectionName , int TabsNumber , String LineStyle , int LineLength)
   {
       System.out.println(SectionBanner(SectionName, TabsNumber, LineStyle, LineLength));
   }
   
   
   public static String LineWithNewLines()
   {
       return LineWithNewLines("_", 60, 2, 2, 1 );
   }
   public static String LineWithNewLines(String LineStyle)
   {
       return LineWithNewLines(LineStyle, 60, 2, 2, 1 );
   }
   public static String LineWithNewLines(String LineStyle , int LineLength )
   {
       return LineWithNewLines(LineStyle, LineLength, 2, 2, 1 );
   }
   public static String LineWithNewLines(String LineStyle , int LineLength , int StartNewLinesNumber)
   {
       return LineWithNewLines(LineStyle, LineLength, StartNewLinesNumber, 2, 1 );
   }
   public static String LineWithNewLines(String LineStyle , int LineLength , int StartNewLinesNumber , int EndNewLinesNumber)
   {
       return LineWithNewLines(LineStyle, LineLength, StartNewLinesNumber, EndNewLinesNumber, 1 );
   }
   
   public static String LineWithNewLines(String LineStyle , int LineLength , int StartNewLinesNumber , int EndNewLinesNumber , int LinesNumber)
   {
       String Linev = Line(LineStyle , LineLength) ;
       String StartNewLines = NewLines(StartNewLinesNumber) ;
       String EndNewLines = NewLines(EndNewLinesNumber) ;
       String FullLine = StartNewLines + Linev + EndNewLines ;
       
       String AllLine = "";
       
       for(int i = 0 ; i < LinesNumber ; i++)
       {
           AllLine += (FullLine);
       }
       
       return AllLine ;
   }
   
   
   public static void PrintLineWithNewLines( )
   {
       PrintLineWithNewLines("_", 60, 2, 2, 1);
   }
   public static void PrintLineWithNewLines(String LineStyle  )
   {
       PrintLineWithNewLines(LineStyle, 60, 2, 2, 1);
   }
   public static void PrintLineWithNewLines(String LineStyle , int LineLength  )
   {
       PrintLineWithNewLines(LineStyle, LineLength, 2, 2, 1);
   }
   public static void PrintLineWithNewLines(String LineStyle , int LineLength , int StartNewLinesNumber  )
   {
       PrintLineWithNewLines(LineStyle, LineLength, StartNewLinesNumber, 2, 1);
   }
   public static void PrintLineWithNewLines(String LineStyle , int LineLength , int StartNewLinesNumber , int EndNewLinesNumber )
   {
       PrintLineWithNewLines(LineStyle, LineLength, StartNewLinesNumber, EndNewLinesNumber, 1);
   }
   public static void PrintLineWithNewLines(String LineStyle , int LineLength , int StartNewLinesNumber , int EndNewLinesNumber , int LinesNumber)
   {
       System.out.println(LineWithNewLines(LineStyle , LineLength , StartNewLinesNumber , EndNewLinesNumber , LinesNumber));
   }
   
   public static String LineWithoutNewLines()
   {
       return LineWithoutNewLines("_", 60 , 1) ;
   }
   
   public static String LineWithoutNewLines(String LineStyle )
   {
       return LineWithoutNewLines(LineStyle , 60 , 1) ;
   }
   
   public static String LineWithoutNewLines(String LineStyle , int LineLength)
   {
       return LineWithoutNewLines(LineStyle , LineLength , 1) ;
   }
   
   public static String LineWithoutNewLines(String LineStyle , int LineLength , int LinesNumber)
   {
       String Linev = Line(LineStyle , LineLength) ;
       
       String AllLine = "" ;
       
       for(int i = 0 ; i < LinesNumber ; i++)
       {
           AllLine += (Linev + "\n");
       }
       
       return AllLine ;
   }
   
   public static void PrintLineWithoutNewLines()
   {
       PrintLineWithoutNewLines("_" , 60 , 1) ;
   }
   public static void PrintLineWithoutNewLines(String LineStyle )
   {
       PrintLineWithoutNewLines(LineStyle , 60 , 1) ;
   }
   public static void PrintLineWithoutNewLines(String LineStyle , int LineLength)
   {
       PrintLineWithoutNewLines(LineStyle , LineLength , 1) ;
   }
   public static void PrintLineWithoutNewLines(String LineStyle , int LineLength , int LinesNumber)
   {
       System.out.println(LineWithoutNewLines(LineStyle , LineLength , LinesNumber));
   }
   
   public static String FormatDescription(String Description )
   {
       return FormatDescription(Description, 8, 1, " ") ;
   }
   
   public static String FormatDescription(String Description , int WordsPerSentence )
   {
       return FormatDescription(Description, WordsPerSentence, 1, " ") ;
   }
   
   public static String FormatDescription(String Description , int WordsPerSentence , int NewLinesNumber )
   {
       return FormatDescription(Description, WordsPerSentence, NewLinesNumber, " ") ;
   }
   
   public static String FormatDescription(String Description , int WordsPerSentence , int NewLinesNumber , String Separator)
   {
       String FormattedDescription = "" ;
       
       Vector<String>DescriptionWords = SplitStringWordsToVector(Description, Separator);
       
       int i = 0 ;
       
       for(String DescriptionWord : DescriptionWords)
       {
           if(i == WordsPerSentence)
           {
               i = 0 ;
               FormattedDescription += NewLines(NewLinesNumber) ;
           }
           
           FormattedDescription += DescriptionWord + Separator ;
           i++ ;
       }
       
       return FormattedDescription ; 
   }
   
   public static void PrintFormattedDescription(String Description)
   {
       PrintFormattedDescription(Description, 8, 1, " ");
   }
   
   public static void PrintFormattedDescription(String Description , int WordsPerSentence)
   {
       PrintFormattedDescription(Description, WordsPerSentence, 1, " ");
   }
   
   public static void PrintFormattedDescription(String Description , int WordsPerSentence , int NewLinesNumber , String Separator)
   {
       System.out.println(FormatDescription(Description , WordsPerSentence , NewLinesNumber , Separator));
   }
   
   public static void PrintFormattedDigit(int Number , int DigitSpaces)
   {
       System.out.printf("%0" + Integer.toString(DigitSpaces) + "d" , Number);
   }
   
   public static void PrintFormattedDigit(byte Number , int DigitSpaces)
   {
       System.out.printf("%0" + Integer.toString(DigitSpaces) + "d" , Number);
   }
   
   public static void PrintFormattedDigit(short Number , int DigitSpaces)
   {
       System.out.printf("%0" + Integer.toString(DigitSpaces) + "d" , Number);
   }
   
   public static void PrintFormattedDigit(long Number , int DigitSpaces)
   {
       System.out.printf("%0" + Integer.toString(DigitSpaces) + "d" , Number);
   }
   
   public static void PrintFormattedFloat(float Number , int FloatingPoint)
   {
       System.out.printf("%." + Integer.toString(FloatingPoint) + "f" , Number);
   }
   public static void PrintFormattedDouble(double Number , int FloatingPoint)
   {
       System.out.printf("%." + Integer.toString(FloatingPoint) + "f" , Number);
   }
   public static void PrintFormattedDigitWithNewLine(int Number , int DigitSpaces)
   {
       System.out.printf("%0" + Integer.toString(DigitSpaces) + "d\n" , Number);
   }
   public static void PrintFormattedDigitWithNewLine(byte Number , int DigitSpaces)
   {
       System.out.printf("%0" + Integer.toString(DigitSpaces) + "d\n" , Number);
   }
   public static void PrintFormattedDigitWithNewLine(short Number , int DigitSpaces)
   {
       System.out.printf("%0" + Integer.toString(DigitSpaces) + "d\n" , Number);
   }
   public static void PrintFormattedDigitWithNewLine(long Number , int DigitSpaces)
   {
       System.out.printf("%0" + Integer.toString(DigitSpaces) + "d\n" , Number);
   }
   
   public static void PrintFormattedFloatWithNewLine(float Number , int FloatingPoint)
   {
       System.out.printf("%." + Integer.toString(FloatingPoint) + "f\n" , Number);
   }
   public static void PrintFormattedDoubleWithNewLine(double Number , int FloatingPoint)
   {
       System.out.printf("%." + Integer.toString(FloatingPoint) + "f\n" , Number);
   }
}
