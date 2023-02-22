/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.lang.Character;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        
        
        return "";
    }
    public static boolean hasValue(String input)
    {
        return false;
    }
    public static boolean isCorrectDataType(String inStr, String dataType)
    {
        if (dataType.equalsIgnoreCase("Integer"))
        {
            try 
            {
                int num = Integer.parseInt(inStr);
            }catch(NumberFormatException e)
            {
                return false;
            }
        }else if (dataType.equalsIgnoreCase("String"))
        {
            if (inStr.equals("true") || inStr.equals("false")) return false;
            
            for (char c : inStr.toCharArray())
            {
                if(!Character.isAlphabetic(c)) return false;
            }
        }
        return true;
    }
    public static boolean rangeCheck(String inStr, int min, int max)
    {
        
        return false;
    }
    public static boolean isFormatted(String inputDate, String pattern)
    {
        try
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
            LocalDate inDate = LocalDate.parse(inputDate, dtf);//parse(inputDate);
        }catch(DateTimeException e) 
        {
            return false;
        }
//        Scanner dateFormatScanner = new Scanner(inputDate).useDelimiter("/");
//        
//        int numTokens = 0;
//        while (dateFormatScanner.hasNext())
//        {
//            numTokens ++;
//            String token = dateFormatScanner.next();
//            switch (numTokens)
//            {
//                case 1 ->
//                {
//                    if (token.length() != 2) return false;
//                    if (!Character.isDigit(token.charAt(0)) && !Character.isDigit(token.charAt(1))) return false;
//                }
//                case 2 ->
//                {
//                    if (token.length() != 2) return false;
//                    if (!Character.isDigit(token.charAt(0)) && !Character.isDigit(token.charAt(1))) return false;
//                }
//                case 3 ->
//                {
//                    if (token.length() != 4) return false;
//                    if (!Character.isDigit(token.charAt(0)) && !Character.isDigit(token.charAt(1)) && !Character.isDigit(token.charAt(2)) && !Character.isDigit(token.charAt(3))) return false;
//                }
//                default ->
//                {
//                        return false;
//                }
//            }
//        }
        return true;
    }
    public static boolean isLength(String input, int maxLength)
    {
        return input.length() <= maxLength;
    }
}
