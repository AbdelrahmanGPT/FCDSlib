/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import java.util.ArrayList;
import java.util.Vector;
import static FCDSlib.ArrayM.* ;
import static FCDSlib.Utility.* ;

/**
 *
 * @author AAMY
 */
public class StringsM {
    public static boolean IsAlphabeticLetter(char Characterv)
    {
       return Character.isAlphabetic(Characterv) ;
   }
   
    public static boolean IsLetter(char Characterv)
    {
       return Character.isLetter(Characterv) ;
   }
   
    public static boolean IsCapitalLetter(char Characterv)
    {
       return Character.isUpperCase(Characterv);
   }
   
    public static boolean IsUpperLetter(char Characterv)
    {
       return Character.isUpperCase(Characterv);
   }
   
    public static boolean IsUpperCaseLetter(char Characterv)
    {
       return Character.isUpperCase(Characterv);
   }
   
    public static boolean IsSmallLetter(char Characterv)
    {
       return Character.isLowerCase(Characterv);
   }
   
    public static boolean IsLowerLetter(char Characterv)
    {
       return Character.isLowerCase(Characterv);
   }
   
    public static boolean IsLowerCaseLetter(char Characterv)
    {
       return Character.isLowerCase(Characterv);
   }
   
    public static boolean IsDigit(char Characterv)
    {
       return Character.isDigit(Characterv) ;
   }
   
    public static boolean IsLetterOrDigit(char Characterv)
    {
       return Character.isLetterOrDigit(Characterv);
   }
   
    public static boolean IsAlphabeticLetterCharacter(char Characterv)
    {
       return Character.isAlphabetic(Characterv) ;
   }
   
    public static boolean IsLetterCharacter(char Characterv)
    {
       return Character.isLetter(Characterv) ;
   }
   
    public static boolean IsCapitalLetterCharacter(char Characterv)
    {
       return Character.isUpperCase(Characterv);
   }
   
    public static boolean IsUpperLetterCharacter(char Characterv)
    {
       return Character.isUpperCase(Characterv);
   }
   
    public static boolean IsUpperCaseLetterCharacter(char Characterv)
    {
       return Character.isUpperCase(Characterv);
   }
   
    public static boolean IsSmallLetterCharacter(char Characterv)
    {
       return Character.isLowerCase(Characterv);
   }
   
    public static boolean IsLowerLetterCharacter(char Characterv)
    {
       return Character.isLowerCase(Characterv);
   }
   
    public static boolean IsLowerCaseLetterCharacter(char Characterv)
    {
       return Character.isLowerCase(Characterv);
   }
   
    public static boolean IsDigitCharacter(char Characterv)
    {
       return Character.isDigit(Characterv) ;
   }
   
    public static boolean IsLetterOrDigitCharacter(char Characterv)
    {
       return Character.isLetterOrDigit(Characterv);
   }
   
    public static boolean IsStringNumber(String StringLine)
    {
       for(int i = 0 ; i < StringLine.length() ; i++)
       {
           if(!IsDigit(StringLine.charAt(i)))
           {
               return false ;
           }
       }
       
       return true ;
   }
    
    public static boolean IsNumber(String StringLine)
    {
       for(int i = 0 ; i < StringLine.length() ; i++)
       {
           if(!IsDigit(StringLine.charAt(i)))
           {
               return false ;
           }
       }
       
       return true ;
   }
   
    public static char UpperCaseLetter(char Characterv)
    {
       return Character.toUpperCase(Characterv);
   }
   
    public static char LowerCaseLetter(char Characterv)
    {
       return Character.toLowerCase(Characterv);
   }
   
    public static boolean IsVowelLetter(char Letter)
    {
       Letter = LowerCaseLetter(Letter) ;
       return (Letter == 'a' || Letter == 'e' || Letter == 'o' || Letter == 'u' || Letter == 'i') ;
   }
   
    public static boolean IsSpecialCharacter(char Character)
    {
       return (!IsLetter(Character) && !IsDigit(Character));
   }
   
    public static char InvertLetterCase(char Letter)
    {
       return IsUpperCaseLetter(Letter) ? LowerCaseLetter(Letter) : UpperCaseLetter(Letter) ;
   }
   
    public static String CharacterToString(char Characterv)
    {
        return Character.toString(Characterv);
    }
    
    public static char StringToCharacter(String StringLine)
    {
        return StringLine.charAt(0);
    }
    
    public static char StringToCharacter(String StringLine , int CharacterIndex)
    {
        return StringLine.charAt(CharacterIndex );
    }
   
    public static String ByteToString(byte ByteNumber)
    {
        return Byte.toString(ByteNumber);
    }
    
    public static int StringToByte(String StringNumber)
    {
        return Byte.parseByte(StringNumber) ;
    }
    
    public static String IntegerToString(int IntegerNumber)
    {
        return Integer.toString(IntegerNumber);
    }
    
    public static int StringToInteger(String StringNumber)
    {
        return Integer.parseInt(StringNumber) ;
    }
    
    public static String ShortToString(short ShortNumber)
    {
        return Short.toString(ShortNumber) ;
    }
    
    public static short StringToShort(String StringNumber)
    {
        return Short.parseShort(StringNumber);
    }
    
    public static String LongToString(long LongNumber)
    {
        return Long.toString(LongNumber) ;
    }
    
    public static long StringToLong(String StringNumber)
    {
        return Long.parseLong(StringNumber) ;
    }
    
    public static String FloatToString(float FloatNumber)
    {
        return Float.toString(FloatNumber) ;
    }
    
    public static float StringToFloat(String StringNumber)
    {
        return Float.parseFloat(StringNumber) ;
    }
    
    public static String DoubleToString(double DoubleNumber)
    {
        return Double.toString(DoubleNumber);
    }
   
    public static double StringToDouble(String StringNumber)
    {
        return Double.parseDouble(StringNumber) ;
    }
    
    public static String BooleanToString(boolean BooleanValue)
    {
        return Boolean.toString(BooleanValue);
    }

    public static boolean StringToBoolean(String StringValue)
    {
       return Boolean.parseBoolean(StringValue) ;
       
    }
    
    public static void PrintFirstLetterOfEachWordInString(String StringLine)
    {
        boolean IsFirstLetter = true ;
        
        for(int i = 0 ; i < StringLine.length() ;i++)
        {
            if(IsFirstLetter && IsLetter(StringLine.charAt(i)) && StringLine.charAt(i) != ' ')
            {
                System.out.print(StringLine.charAt(i) + " ");
            }
            
            IsFirstLetter = (StringLine.charAt(i) == ' ' || !IsLetter(StringLine.charAt(i)) ? true : false) ;
        }
    }
    
    public static String UpperCaseFirstLetterInEachWordInString(String StringLine)
    {
        boolean IsFirstLetter = true ;
        
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsFirstLetter && StringLine.charAt(i) != ' ' && IsLetter(StringLine.charAt(i)))
            {
                 UpdatedString += UpperCaseLetter(StringLine.charAt(i));
            }
            
            else
            {
                UpdatedString += StringLine.length() ;
            }
            
            IsFirstLetter = (StringLine.charAt(i) == ' ' || !IsLetter(StringLine.charAt(i)) ? true : false) ;
        }
        
        return  UpdatedString ;
    }
    
    public static String LowerCaseFirstLetterInEachWordInString(String StringLine)
    {
        boolean IsFirstLetter = true ;
        
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsFirstLetter && StringLine.charAt(i) != ' ' && IsLetter(StringLine.charAt(i)))
            {
                 UpdatedString += LowerCaseLetter(StringLine.charAt(i));
            }
            
            else
            {
                UpdatedString += StringLine.length() ;
            }
            
            IsFirstLetter = (StringLine.charAt(i) == ' ' || !IsLetter(StringLine.charAt(i)) ? true : false) ;
        }
        
        return  UpdatedString ;
    }
    
    public static String UpperCaseAllString(String StringLine)
    {
        return StringLine.toUpperCase();
    }
    
    public static String LowerCaseAllString(String StringLine)
    {
        return StringLine.toLowerCase();
    }
    
    public static String InvertAllLettersCaseInString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsLetter(StringLine.charAt(i)))
            {
                UpdatedString += InvertLetterCase(StringLine.charAt(i)) ;
            }
            
            else
            {
                UpdatedString += StringLine.charAt(i);
            }
        }
        
        return UpdatedString ;
    }
    
    enum WhatToCountInString {
     CapitalLetters , SmallLetters , VowelLetters , AllLetters  , Digits , SpecialCharacters , AllCharacters   
    }
    
    public static int CountSmallLettersInString(String StringLine)
    {
        int SmallLettersCounter = 0 ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsSmallLetter(StringLine.charAt(i)))
            {
                SmallLettersCounter++ ;
            }
        }
        
        return SmallLettersCounter ;
    }
    
    public static int CountCapitalLettersInString(String StringLine)
    {
        int CapitalLettersCounter = 0 ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsCapitalLetter(StringLine.charAt(i)))
            {
                CapitalLettersCounter++ ;
            }
        }
        
        return CapitalLettersCounter ;
    }
    
    public static int CountVowelLettersInString(String StringLine)
    {
        int VowelLettersCounter = 0 ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsVowelLetter(StringLine.charAt(i)))
            {
                VowelLettersCounter++ ;
            }
        }
        
        return VowelLettersCounter ;
    }
    
    public static int CountAllLettersInString(String StringLine)
    {
        int AllLettersCounter = 0 ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsLetter(StringLine.charAt(i)))
            {
                AllLettersCounter++ ;
            }
        }
        
        return AllLettersCounter ;
    }
    
    public static int CountDigitsInString(String StringLine)
    {
        int DigitsCounter = 0 ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsDigit(StringLine.charAt(i)))
            {
                DigitsCounter++ ;
            }
        }
        
        return DigitsCounter ;
    }
    
    public static int CountSpecialCharactersInString(String StringLine)
    {
        int SpecialCharactersCounter = 0 ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsSpecialCharacter(StringLine.charAt(i)))
            {
                SpecialCharactersCounter++ ;
            }
        }
        
        return SpecialCharactersCounter ;
    }
    
    public static int CountAllCharactersInString(String StringLine)
    {
      return StringLine.length();
  }
  
    public static int CountCharactersInString(String StringLine)
    {
      return StringLine.length() ;
  }
  
    public static int CountCharactersInString(String StringLine , WhatToCountInString WhatToCountInString)
    {
      switch(WhatToCountInString)
      {
          case CapitalLetters : 
              return CountCapitalLettersInString(StringLine);
          case SmallLetters : 
              return CountSmallLettersInString(StringLine);
          case VowelLetters : 
              return CountVowelLettersInString(StringLine);
          case AllLetters : 
              return CountAllLettersInString(StringLine);
          case Digits : 
              return CountDigitsInString(StringLine);
          case SpecialCharacters : 
              return CountSpecialCharactersInString(StringLine);
          case AllCharacters : 
              return CountAllCharactersInString(StringLine);
      }
      
      return StringLine.length();
  }
    
    public static int CharacterFrequencyInString(char Character , String StringLine )
    {
        int CharacterFrequencyCounter = 0 ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(Character == StringLine.charAt(i))
            {
                CharacterFrequencyCounter++ ;
            }
        }
        
        return CharacterFrequencyCounter ;
    }
    public static int LetterFrequencyInString(char Letter , String StringLine )
    {
        int LetterFrequencyCounter = 0 ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(Letter == StringLine.charAt(i))
            {
                LetterFrequencyCounter++ ;
            }
        }
        
        return LetterFrequencyCounter ;
    }
    
    public static int LetterFrequencyInString(char Letter , String StringLine , boolean MatchCase )
    {
        int LetterFrequencyCounter = 0 ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            
            if(MatchCase)
            {
                
                if(Letter == StringLine.charAt(i))
                {   
                    LetterFrequencyCounter++ ;
                } 
            
            }
            
            else
            {
                if(UpperCaseLetter(Letter) == UpperCaseLetter(StringLine.charAt(i)))
                {
                    LetterFrequencyCounter++ ;
                }
                    
            }
            
        }
        
        return LetterFrequencyCounter ;
    }
    
    public static String EraseString(String StringLine , int StartIndex , int CharactersNumber)
    {
         String UpdatedString = "" ;
         
         for(int i = 0 ; i < StringLine.length() ; i++)
         {
             
             if(!(i >= StartIndex && i <= StartIndex + CharactersNumber - 1))
             {
                 UpdatedString += StringLine.charAt(i);
             }
             
         }
         
         return UpdatedString ;
    }
    
    public static int CountWordsInString(String StringLine , String Delimiter)
    {
        int WordsCounter = 0 ;
        
        int DelimiterPosition = 0 ;
        
        String Word = "" ;
        
        while((DelimiterPosition = StringLine.indexOf(Delimiter)) != -1)
        {
            Word = StringLine.substring(0, DelimiterPosition) ;
            
            if(!Word.isEmpty())
            {
                WordsCounter++ ;
            }
            
            StringLine = EraseString(StringLine , 0 , DelimiterPosition + Delimiter.length()) ;
        }
        
        if(!StringLine.isEmpty())
        {
            WordsCounter++ ;
        }
        
        return WordsCounter ;
    }
    
    public static int CountWordsInString(String StringLine)
    {
        int WordsCounter = 0 ;
        
        int DelimiterPosition = 0 ;
        
        String Word = "" ;
        
        while((DelimiterPosition = StringLine.indexOf(" ")) != -1)
        {
            Word = StringLine.substring(0, DelimiterPosition) ;
            
            if(!Word.isEmpty())
            {
                WordsCounter++ ;
            }
            
            StringLine = EraseString(StringLine , 0 , DelimiterPosition + 1) ;
        }
        
        if(!StringLine.isEmpty())
        {
            WordsCounter++ ;
        }
        
        return WordsCounter ;
    }
    
    public static Vector<String> SplitStringWordsToVector(String StringLine , String Delimiter)
    {
        int DelimiterPosition = 0 ; 
        String Word = "" ;
        Vector<String> WordsVector = new Vector<String>() ;
        
        while((DelimiterPosition = StringLine.indexOf(Delimiter)) != -1)
        {
            Word = StringLine.substring(0 , DelimiterPosition) ;
            
            if(!Word.isEmpty())
            {
                WordsVector.add(Word) ;
            }
            
            StringLine = EraseString(StringLine, 0, DelimiterPosition + Delimiter.length()) ;
        }
        
        if(!StringLine.isEmpty())
        {
            WordsVector.add(StringLine) ;
        }
        
        return WordsVector ;
        
    }
    
    public static ArrayList<String> SplitStringWordsToArrayList(String StringLine , String Delimiter)
    {
        int DelimiterPosition = 0 ;
        String Word = "" ;
        ArrayList<String> WordsArrayList = new ArrayList<String>() ;
        
        while((DelimiterPosition = StringLine.indexOf(Delimiter)) != -1)
        {
            Word = StringLine.substring(0, DelimiterPosition);
            
            if(!Word.isEmpty())
            {
                WordsArrayList.add(Word) ;
            }
            
            StringLine = EraseString(StringLine, 0, DelimiterPosition + Delimiter.length());
        }
        
        if(!StringLine.isEmpty())
        {
            WordsArrayList.add(StringLine) ;
        }
        
        return WordsArrayList ;
    }
    
    public static String[] SplitStringWordsToArray(String StringLine , String Delimiter)
    {
        int DelimiterPosition = 0 ; 
        String Word = "" ;
        String[] WordsArray = new String[0] ;
        
        while((DelimiterPosition = StringLine.indexOf(Delimiter)) != -1)
        {
            Word = StringLine.substring(0, DelimiterPosition) ;
            
            if(!Word.isEmpty())
            {
                WordsArray = AddArrayElement(Word , WordsArray) ;
            }
            
            StringLine = EraseString(StringLine , 0 , DelimiterPosition + Delimiter.length()) ;
        }
        
        if(!StringLine.isEmpty())
        {
            WordsArray = AddArrayElement(StringLine, WordsArray);
        }
        
        return WordsArray ;
    }
    
    public static Vector<String> SplitStringWordsToVector(String StringLine)
    {
        int DelimiterPosition = 0 ; 
        String Word = "" ;
        Vector<String> WordsVector = new Vector<String>() ;
        
        while((DelimiterPosition = StringLine.indexOf(" ")) != -1)
        {
            Word = StringLine.substring(0 , DelimiterPosition) ;
            
            if(!Word.isEmpty())
            {
                WordsVector.add(Word) ;
            }
            
            StringLine = EraseString(StringLine, 0, DelimiterPosition + 1) ;
        }
        
        if(!StringLine.isEmpty())
        {
            WordsVector.add(StringLine) ;
        }
        
        return WordsVector ;
        
    }
    
    public static ArrayList<String> SplitStringWordsToArrayList(String StringLine)
    {
        int DelimiterPosition = 0 ;
        String Word = "" ;
        ArrayList<String> WordsArrayList = new ArrayList<String>() ;
        
        while((DelimiterPosition = StringLine.indexOf(" ")) != -1)
        {
            Word = StringLine.substring(0, DelimiterPosition);
            
            if(!Word.isEmpty())
            {
                WordsArrayList.add(Word) ;
            }
            
            StringLine = EraseString(StringLine, 0, DelimiterPosition + 1);
        }
        
        if(!StringLine.isEmpty())
        {
            WordsArrayList.add(StringLine) ;
        }
        
        return WordsArrayList ;
    }
    
    public static String[] SplitStringWordsToArray(String StringLine)
    {
        int DelimiterPosition = 0 ; 
        String Word = "" ;
        String[] WordsArray = new String[0] ;
        
        while((DelimiterPosition = StringLine.indexOf(" ")) != -1)
        {
            Word = StringLine.substring(0, DelimiterPosition) ;
            
            if(!Word.isEmpty())
            {
                WordsArray = AddArrayElement(Word , WordsArray) ;
            }
            
            StringLine = EraseString(StringLine , 0 , DelimiterPosition + 1) ;
        }
        
        if(!StringLine.isEmpty())
        {
            WordsArray = AddArrayElement(StringLine, WordsArray);
        }
        
        return WordsArray ;
    }
    
    public static String JoinStringsFromVector(Vector<String>StringVector , String Separator)
    {
        String StringLine = "" ;
        
        for(String Word : StringVector)
        {
            StringLine += (Word + Separator);
        }
        
        return StringLine.substring(0, StringLine.length() - Separator.length()) ;
    }
    
    public static String JoinStringsFromArrayList(ArrayList<String>StringArrayList , String Separator)
    {
        String StringLine = "" ;
        
        for(String Word : StringArrayList)
        {
            StringLine += (Word + Separator);
        }
        
        return StringLine.substring(0, StringLine.length() - Separator.length()) ;
    }
    
    public static String JoinStringsFromArray(String [] StringArray , String Separator)
    {
        String StringLine = "" ;
        
        for(String Word : StringArray)
        {
            StringLine += (Word + Separator);
        }
        
        return StringLine.substring(0 , StringLine.length() - Separator.length()) ;
    }
    
    public static String JoinStringsFromVector(Vector<String>StringVector)
    {
        String StringLine = "" ;
        
        for(String Word : StringVector)
        {
            StringLine += (Word + " ");
        }
        
        return StringLine.substring(0, StringLine.length() - 1) ;
    }
    
    public static String JoinStringsFromArrayList(ArrayList<String>StringArrayList)
    {
        String StringLine = "" ;
        
        for(String Word : StringArrayList)
        {
            StringLine += (Word + " ");
        }
        
        return StringLine.substring(0, StringLine.length() - 1) ;
    }
    
    public static String JoinStringsFromArray(String [] StringArray)
    {
        String StringLine = "" ;
        
        for(String Word : StringArray)
        {
            StringLine += (Word + " ");
        }
        
        return StringLine.substring(0 , StringLine.length() - 1) ;
    }
    
    public static String JoinStringsFromVectorInReversedOrder(Vector<String> StringVector , String Separator)
    {
        String StringLine = "" ;
        
        for(int i = StringVector.size() - 1 ; i >= 0 ; i--)
        {
            StringLine += (StringVector.get(i) + Separator);
        }
        
        return StringLine.substring(0 , StringLine.length() - Separator.length()) ;
    }
    
    public static String JoinStringsFromArrayListInReversedOrder(ArrayList<String>StringArrayList , String Separator)
    {
        String StringLine = "" ;
        
        for(int i = StringArrayList.size() - 1 ; i >= 0 ; i--)
        {
            StringLine += (StringArrayList.get(i) + Separator) ;
        }
        
        return StringLine.substring(0 , StringLine.length() - Separator.length()) ;
    }
    
    public static String JoinStringsFromArrayInReversedOrder(String [] StringArray , String Separator)
    {
        String StringLine = "" ;
        
        for(int i = StringArray.length - 1 ; i >= 0 ; i--)
        {
            StringLine += (StringArray[i] + Separator) ;
        }
        
        return StringLine.substring(0 , StringLine.length() - Separator.length()) ;
    }
    
    public static String RemoveStringAdditionalSeparators(String StringLine , String Separator)
    {
        Vector<String>WordsVector = SplitStringWordsToVector(StringLine, Separator);
        
        return JoinStringsFromVector(WordsVector, Separator) ;
    }
    
    public static String RemoveStringAdditionalSpaces(String StringLine)
    {
        Vector<String>WordsVector = SplitStringWordsToVector(StringLine, " ");
        
        return JoinStringsFromVector(WordsVector, " ") ;
    }
   
    public static String ReverseString(String StringLine)
    {
        String ReversedString = "" ;
        
        for(int i = StringLine.length() - 1 ; i >= 0 ; i--)
        {
            ReversedString += StringLine.charAt(i) ;
        }
        
        return ReversedString ;
    }
    
    public static String ReverseStringCharacters(String StringLine)
    {
        String ReversedString = "" ;
        
        for(int i = StringLine.length() - 1 ; i >= 0 ; i--)
        {
            ReversedString += StringLine.charAt(i) ;
        }
        
        return ReversedString ;
    }
    
    public static String ReverseStringWords(String StringLine , String Separator) 
    {
        String ReveresedWordsString = "" ;
        
        Vector<String> WordsVector = SplitStringWordsToVector(StringLine, Separator) ;
        
        return JoinStringsFromVectorInReversedOrder(WordsVector, Separator) ;
    }
    
    public static String TrimLeft(String StringLine)
    {
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(StringLine.charAt(i) != ' ')
            {
                return StringLine = StringLine.substring(i, StringLine.length() - i) ;
            }
        }
        
        return "" ;
    }
    
    public static String TrimRight(String StringLine)
    {
        for(int i = StringLine.length() - 1 ; i >= 0 ; i--)
        {
            if(StringLine.charAt(i) != ' ')
            {
                return StringLine.substring(0, i+1) ;
            }
        }
        
        return "";
    }
    
    public static String Trim(String StringLine)
    {
        return StringLine.trim();
    }
    
    enum WhatToRemoveFromString { rCapitalLetters, rSmallLetters, rVowelLetters, rAllLetters, rDigits
                                    , rSpecialCharacters , rAllCharacters };
    
    public static String RemoveCapitalLettersFromString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < UpdatedString.length() ; i++)
        {
            if(!IsCapitalLetter(StringLine.charAt(i)))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String RemoveSmallLettersFromString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < UpdatedString.length() ; i++)
        {
            if(!IsSmallLetter(StringLine.charAt(i)))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String RemoveVowelLettersFromString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(!IsVowelLetter(StringLine.charAt(i)))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String RemoveAllLettersFromString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(!IsLetter(StringLine.charAt(i)))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String RemoveDigitsFromString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(!IsDigit(StringLine.charAt(i)))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String RemoveSpecialCharactersFromString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(!IsSpecialCharacter(StringLine.charAt(i)))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String RemoveAllCharactersFromString(String StringLine)
    {
        return "" ;
    }
    
    public static String RemoveCharactersFromString(String StringLine ,WhatToRemoveFromString WhatToRemoveFromString)
    {
        switch(WhatToRemoveFromString)
      {
          case rCapitalLetters : 
              return RemoveCapitalLettersFromString(StringLine);
          case rSmallLetters : 
              return RemoveSmallLettersFromString(StringLine);
          case rVowelLetters : 
              return RemoveVowelLettersFromString(StringLine);
          case rAllLetters : 
              return RemoveAllLettersFromString(StringLine);
          case rDigits : 
              return RemoveDigitsFromString(StringLine);
          case rSpecialCharacters : 
              return RemoveSpecialCharactersFromString(StringLine);
          case rAllCharacters : 
              return RemoveAllCharactersFromString(StringLine);
          
      }
        
        return "" ;
    }
    
    public static String RemoveCharactersFromString(String StringLine)
    {
        return RemoveCharactersFromString(StringLine , WhatToRemoveFromString.rAllCharacters) ;
    }
    
    public static String RemoveLetterFromString(char Letter , String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(Letter != StringLine.charAt(i))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString;
    }
    
    public static String RemoveLetterFromString(char Letter , String StringLine , boolean MatchCase)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(MatchCase)
            {
                if(Letter != StringLine.charAt(i))
                {
                    UpdatedString += StringLine.charAt(i) ;
                }
            }
            
            else 
            {
                if(UpperCaseLetter(Letter) != UpperCaseLetter(StringLine.charAt(i)))
                {
                    UpdatedString += StringLine.charAt(i) ;
                }
            }
            
        }
        
        return UpdatedString;
    }
    
    public static String RemoveCharactersFromString(char Character , String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(Character != StringLine.charAt(i))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String RemoveWordsFromString(String Word , String StringLine)
    {
        Vector<String>StringVector = SplitStringWordsToVector(StringLine, " ") ;
        
        String UpdatedString = "" ;
        
        for(String Token : StringVector)
        {
            if(!Token.equals(Word))
            {
                UpdatedString += (Token + " ") ;
            }
        }
        
        return UpdatedString.substring(0 , UpdatedString.length() - 1) ;
    }
    public static String RemoveWordsFromString(String Word , String StringLine , String Separator)
    {
        Vector<String>StringVector = SplitStringWordsToVector(StringLine, Separator) ;
        
        String UpdatedString = "" ;
        
        for(String Token : StringVector)
        {
            if(!Token.equals(Word))
            {
                UpdatedString += (Token + Separator) ;
            }
        }
        
        return UpdatedString.substring(0 , UpdatedString.length() - Separator.length()) ;
    }
    
    public enum WhatToGetFromString { gCapitalLetters, gSmallLetters, gVowelLetters, gAllLetters, gDigits
                                    , gSpecialCharacters , gAllCharacters };
    
    public static String GetCapitalLettersFromString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < UpdatedString.length() ; i++)
        {
            if(IsCapitalLetter(StringLine.charAt(i)))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String GetSmallLettersFromString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < UpdatedString.length() ; i++)
        {
            if(IsSmallLetter(StringLine.charAt(i)))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String GetVowelLettersFromString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsVowelLetter(StringLine.charAt(i)))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String GetAllLettersFromString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsLetter(StringLine.charAt(i)))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String GetDigitsFromString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsDigit(StringLine.charAt(i)))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String GetSpecialCharactersFromString(String StringLine)
    {
        String UpdatedString = "" ;
        
        for(int i = 0 ; i < StringLine.length() ; i++)
        {
            if(IsSpecialCharacter(StringLine.charAt(i)))
            {
                UpdatedString += StringLine.charAt(i) ;
            }
        }
        
        return UpdatedString ;
    }
    
    public static String GetAllCharactersFromString(String StringLine)
    {
        return StringLine ;
    }
    
    public static String GetCharactersFromString(String StringLine ,WhatToGetFromString WhatToGetFromString)
    {
        switch(WhatToGetFromString)
      {
          case gCapitalLetters : 
              return GetCapitalLettersFromString(StringLine);
          case gSmallLetters : 
              return GetSmallLettersFromString(StringLine);
          case gVowelLetters : 
              return GetVowelLettersFromString(StringLine);
          case gAllLetters : 
              return GetAllLettersFromString(StringLine);
          case gDigits : 
              return GetDigitsFromString(StringLine);
          case gSpecialCharacters : 
              return GetSpecialCharactersFromString(StringLine);
          case gAllCharacters : 
              return GetAllCharactersFromString(StringLine);
          
      }
        
        return "" ;
    }
     
    public static String GetCharactersFromString(String StringLine)
    {
       return GetCharactersFromString(StringLine , WhatToGetFromString.gAllCharacters) ;
    }
    
    public static String ReplaceCharacterInString(String StringLine , char ReplacedCharacter , char ReplacingCharacter , boolean MatchCase)
    {
        if(MatchCase)
        {
            return StringLine.replace(ReplacedCharacter, ReplacingCharacter) ;
        }
        
        else
        {
            String UpdatedString = "" ;
            
            for(int i = 0 ; i < StringLine.length() ; i++)
            {
                if(UpperCaseLetter(StringLine.charAt(i)) == UpperCaseLetter(ReplacedCharacter))
                {
                    UpdatedString += ReplacingCharacter ;
                }
                
                else
                {
                    UpdatedString += StringLine.charAt(i) ;
                }
            }
            
            return UpdatedString ;
        }
        
        
    }
    
    public static String ReplaceCharacterInString(String StringLine , char ReplacedCharacter , char ReplacingCharacter)
    {
        return StringLine.replace(ReplacedCharacter, ReplacingCharacter) ;
    }
    
    public static String ReplaceWordsInString(String StringLine , String Separator , String ReplacedWord , String ReplacingWord , boolean MatchCase)
    {
        String UpdatedString = "" ;
        
        Vector<String> StringVector = SplitStringWordsToVector(StringLine , Separator);
        
        for(String Word : StringVector)
        {
            if(MatchCase)
            {
                if(Word.equals(ReplacedWord))
                {
                    UpdatedString += (ReplacingWord + Separator) ; 
                }
                
                else
                {
                    UpdatedString += (Word + Separator);
                }
            }
            
            else
            {
                if(Word.equalsIgnoreCase(ReplacedWord))
                {
                    UpdatedString += (ReplacingWord + Separator) ;
                }
                
                else
                {
                    UpdatedString += (Word + Separator) ;
                }
            }
        }
        
        return UpdatedString ;
    }
    
    public static String ReplaceWordsInString(String StringLine , String Separator , String ReplacedWord , String ReplacingWord )
    {
        return ReplaceWordsInString(StringLine, Separator, ReplacedWord, ReplacingWord, true) ;
    }
    public static String ReplaceWordsInString(String StringLine , String ReplacedWord , String ReplacingWord , boolean MatchCase)
    {
        return ReplaceWordsInString(StringLine, " ", ReplacedWord, ReplacingWord, MatchCase) ;
    }
    public static String ReplaceWordsInString(String StringLine , String ReplacedWord , String ReplacingWord)
    {
        return ReplaceWordsInString(StringLine, " ", ReplacedWord, ReplacingWord, true) ;
    }
    
    private enum RandomCharacter {CapitalLetter , SmallLetter , Letter , Digit , SpecialCharacter , Character};
    
    private static RandomCharacter ConvertStringInterfaceToRandomCharacterEnum(String StringInterface)
    {
        if(StringInterface.equalsIgnoreCase("Capital Letter"))
        {
            return RandomCharacter.CapitalLetter ;
        }
        
        else if(StringInterface.equalsIgnoreCase("Small Letter"))
        {
            return RandomCharacter.SmallLetter;
        }
        
        else if(StringInterface.equalsIgnoreCase("Letter"))
        {
            return RandomCharacter.Letter;
        }
        
        else if(StringInterface.equalsIgnoreCase("Digit"))
        {
            return RandomCharacter.Digit ;
        }
        
        else if(StringInterface.equalsIgnoreCase("Special Character"))
        {
            return RandomCharacter.SpecialCharacter ;
        }
        
        else if (StringInterface.equalsIgnoreCase("Character"))
        {
            return RandomCharacter.Character ;
        }
        
        return RandomCharacter.Character ;
    }
    
    public static char GenerateRandomCharacter(int StartASCIICode , int EndASCIICode)
    {
        return (char)(RandomNumber(StartASCIICode , EndASCIICode)) ; 
    }
    public static char GenerateRandomCharacter(char StartCharacter , char EndCharacter)
    {
        return GenerateRandomCharacter(StartCharacter, EndCharacter);
    }
    
    public static char GenerateRandomCharacter()
    {
        return GenerateRandomCharacter(32, 126) ;
    }
    
    public static char GenerateRandomCapitalLetter()
    {
        return GenerateRandomCharacter(65, 90);
    }
    
    public static char GenerateRandomSmallLetter()
    {
        return GenerateRandomCharacter(97, 122);
    }
    
    public static char GenerateRandomLetter()
    {
        int RandomResult = RandomNumber(1 , 2) ;
        
        if(RandomResult == 1)
        {
            return GenerateRandomCapitalLetter();
        }
        
        else
        {
            return GenerateRandomSmallLetter();
        }
        
    }
    public static char GenerateRandomDigitCharacter()
    {
        return GenerateRandomCharacter(48, 57);
    }
    
    public static char GenerateRandomSpecialCharacter()
    {
        int RandomResult = RandomNumber(1 , 4) ;
        
        if(RandomResult == 1)
        {
            return GenerateRandomCharacter(32, 47) ;
        }
        
        else if(RandomResult == 2)
        {
            return GenerateRandomCharacter(58, 64) ;
        }
        
        else if(RandomResult == 3)
        {
            return GenerateRandomCharacter(91, 96) ;
        }
        
        else
        {
            return GenerateRandomCharacter(123, 126);
        }
    }
    
    public static char GenerateRandomCharacter(RandomCharacter RandomCharacter)
    {
        switch(RandomCharacter)
        {
            case CapitalLetter : 
                return GenerateRandomCapitalLetter();
            case SmallLetter : 
                return GenerateRandomSmallLetter();
            case Letter : 
                return GenerateRandomLetter();
            case Digit : 
                return GenerateRandomDigitCharacter();
            case SpecialCharacter : 
                return GenerateRandomSpecialCharacter();
            case Character : 
                return GenerateRandomCharacter();
        }
        
        return GenerateRandomCharacter() ;
    }
    
    public static String GenerateRandomWord(int WordLength)
    {
        String RandomWord = "" ;
        
        for(int i = 0 ; i < WordLength ; i++)
        {
            RandomWord += GenerateRandomCharacter();
        }
        
        return RandomWord ;
    }
    public static String GenerateRandomWord(int WordLength , RandomCharacter RandomCharacter)
    {
        String RandomWord = "" ;
        
        for(int i = 0 ; i < WordLength ; i++)
        {
            RandomWord += GenerateRandomCharacter(RandomCharacter);
        }
        
        return RandomWord ;
    }
    
    public static String DuplicateString(String StringLine , String Separator , int RepititionNumber)
    {
        String DuplicatedString = "" ;
        
        for(int i = 0 ; i < RepititionNumber ; i++)
        {
            DuplicatedString += (StringLine + Separator) ; 
        }
        
        return DuplicatedString.substring(0 , DuplicatedString.length() - Separator.length()) ;
    }
    
    public static String DuplicateString(String StringLine , int RepititionNumber)
    {
        String DuplicatedString = "" ;
        
        for(int i = 0 ; i < RepititionNumber ; i++)
        {
            DuplicatedString += StringLine ; 
        }
        
        return DuplicatedString ;
    }
    public static String DuplicateStringWithSpaces(String StringLine , int RepititionNumber)
    {
        String DuplicatedString = "" ;
        
        for(int i = 0 ; i < RepititionNumber ; i++)
        {
            DuplicatedString += (StringLine + " ") ; 
        }
        
        return DuplicatedString.substring(0, DuplicatedString.length() - 1) ;
    }
    
    public static int DigitCharacterToNumber(char CharacterDigit)
    {
        return CharacterDigit - '0' ;
    }
}
