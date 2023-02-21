/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.lang.Character;
import java.util.Scanner;
/**
 *
 * @author Jcj
 */
public class  InputValidator
{
    public static String checkNameValidity(String inStr)
    {
        /*Return the error if there is, or nothing if there is no error*/
        boolean hasFullName = false;
        for (char c : inStr.toCharArray())
        {
            if (Character.isDigit(c)) return "Please do NOT enter numbers";
            if (Character.isSpaceChar(c)) hasFullName = true;
        }
        
        return hasFullName? "" : "Please enter both name and surname";
    }
    public static String checkDateValidity(String inputDate)
    {
        Scanner dateFormatScanner = new Scanner(inputDate).useDelimiter("/");
        
        int numTokens = 0;
        while (dateFormatScanner.hasNext())
        {
            numTokens ++;
            String token = dateFormatScanner.next();
            switch (numTokens)
            {
                case 1 ->
                {
                    if (token.length() != 2) return "Day must be in format \"dd\", eg '06'";
                    if (!Character.isDigit(token.charAt(0)) && !Character.isDigit(token.charAt(1))) return "Day must consist of numbers ONLY";
                }
                case 2 ->
                {
                    if (token.length() != 2) return "Month must be in format \"MM\", eg '06'";
                    if (!Character.isDigit(token.charAt(0)) && !Character.isDigit(token.charAt(1))) return "Month must consist of numbers ONLY";
                }
                case 3 ->
                {
                    if (token.length() != 4) return "Year must be in format \"yyyy\", eg '2005'";
                    if (!Character.isDigit(token.charAt(0)) && !Character.isDigit(token.charAt(1)) && !Character.isDigit(token.charAt(2)) && !Character.isDigit(token.charAt(3))) return "Year must consist of numbers ONLY";
                }
                default ->
                {
                        return "You have too many parts to your date";
                }
            }
        }
        
        return "";
    }
}
