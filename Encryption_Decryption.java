/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FCDSlib;

import static java.lang.Math.pow;
import java.util.Vector;
import static FCDSlib.StringsM.*;

/**
 *
 * @author AAMY
 */
public class Encryption_Decryption {
    
    private static int EncryptLetterASCIICode(char Character)
    {
	if (Character >= 65 && Character <= 90)
	{
		return Character - 64;
	}

	else if (Character >= 97 && Character <= 122)
	{
		return Character - 70;
	}

	else if (Character >= 32 && Character <= 64)
	{
		return Character + 21;
	}

	else if (Character >= 91 && Character <= 96)
	{
		return Character - 5;
	}

	else if (Character >= 123 && Character <= 126)
	{
		return Character - 31;
	}
        
        return 0 ;
    }

    private static String EncryptDecimalNumber(int DecimalNumber)
    {
	int [] TernaryArray = new int[5];

	int TernaryArrayCounter = 4;

	while (DecimalNumber > 0)
	{
		TernaryArray[TernaryArrayCounter--] = DecimalNumber % 3;
		DecimalNumber /= 3;
	}

	String EncryptedNumberString = "";

	for (int i = 0; i < 5; i++)
	{
		if (TernaryArray[i] == 0)
		{
			EncryptedNumberString += "U";
		}

		else if (TernaryArray[i] == 1)
		{
			EncryptedNumberString += "J";
		}

		else if (TernaryArray[i] == 2)
		{
			EncryptedNumberString += "Q";
		}
	}

	return EncryptedNumberString;

    }

private static String EncryptCharacter(char Character)
{
	return EncryptDecimalNumber(EncryptLetterASCIICode(Character));
}

private static char DecryptLetterASCIICode(int EncryptedASCIICode)
{
	if (EncryptedASCIICode >= 1 && EncryptedASCIICode <= 26)
	{
		return (char)(EncryptedASCIICode + 64);
	}

	else if (EncryptedASCIICode >= 27 && EncryptedASCIICode <= 52)
	{
		return (char)(EncryptedASCIICode + 70);
	}

	else if (EncryptedASCIICode >= 53 && EncryptedASCIICode <= 85)
	{
		return (char)(EncryptedASCIICode - 21);
	}

	else if (EncryptedASCIICode >= 86 && EncryptedASCIICode <= 91)
	{
		return (char)(EncryptedASCIICode + 5);
	}

	else if (EncryptedASCIICode >= 92 && EncryptedASCIICode <= 95)
	{
		return (char)(EncryptedASCIICode + 31);
	}
        
        return ' ' ;
}

private static int DecryptTernaryNumber(String TernaryNumber)
{
	int DecimalNumber = 0;

	for (int i = 0; i < TernaryNumber.length(); i++)
	{
		DecimalNumber += pow(3, TernaryNumber.length() - 1 - i) * StringsM.DigitCharacterToNumber(TernaryNumber.charAt(i));
	}

	return DecimalNumber;
}

private static String DecryptCharacterToken(String CharacterToken)
{
	String TernaryNumber = "";

	for (int i = 0; i < CharacterToken.length(); i++)
	{
		if (CharacterToken.charAt(i) == 'U')
		{
			TernaryNumber += "0";
		}

		else if (CharacterToken.charAt(i) == 'J')
		{
			TernaryNumber += "1";
		}

		else if (CharacterToken.charAt(i) == 'Q')
		{
			TernaryNumber += "2";
		}
	}

	return TernaryNumber;
}

private static char DecryptCharacter(String CharacterToken)
{
	return DecryptLetterASCIICode(DecryptTernaryNumber(DecryptCharacterToken(CharacterToken)));
}

public static String EncryptText(String Text)
	{
		String EncryptedText = "";

		for (int i = 0; i < Text.length(); i++)
		{
			EncryptedText += EncryptCharacter(Text.charAt(i)) + " ";
		}

		return EncryptedText = EncryptedText.substring(0, EncryptedText.length() - 1);
	}

public static String DecryptText(String EncryptedText)
	{
		String DecryptedText = "";

		Vector<String>EncryptedTokens = StringsM.SplitStringWordsToVector(EncryptedText, " ");

		for (String CharacterToken : EncryptedTokens)
		{
			DecryptedText += DecryptCharacter(CharacterToken);
		}

		return DecryptedText;
	}

public static String EncryptText_CAESAR(String Text, short EncryptionKey)
{
    StringBuilder Result = new StringBuilder() ;
    
	for (int i = 0; i < Text.length(); i++)
	{
            Result.append((char)(Text.charAt(i) + EncryptionKey));
            
		
	}

	return Result.toString();
}

public static String DecryptText_CAESAR(String Text, short DecryptionKey)
{
    StringBuilder Result = new StringBuilder();
    
	for (int i = 0; i < Text.length(); i++)
	{
		Result.append((char)(Text.charAt(i) - DecryptionKey));
	}

	return Result.toString();
}
    
}
