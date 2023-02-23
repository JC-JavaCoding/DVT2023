/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.lang.Character;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
/**
 *
 * @author Jcj
 */
public class  InputValidator extends InputVerifier
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
    public static boolean isFormattedName(String nameIn)
    {
        for (char c : nameIn.toCharArray())
        {
            if (Character.isSpaceChar(c)) return true;
        }
        return false;
    }
    public static boolean isFormattedDate(String inputDate, String pattern)
    {
        try
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
            LocalDate inDate = LocalDate.parse(inputDate, dtf);//parse(inputDate);
            
        }catch(DateTimeException e) 
        {
            return false;
        }

        return true;
    }
    public static boolean isValidAge(String inputDate, String pattern)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        LocalDate inDate = LocalDate.parse(inputDate, dtf);//parse(inputDate);
        
        if (inDate.isBefore(LocalDate.of(LocalDate.now().getYear()- 18, 12, 31)) &&//for 18 years of age at least
        inDate.isAfter(LocalDate.of(LocalDate.now().getYear()- 120, 1, 1)) )
            return true;//cannot be older than 120 
        return false;
    }
    public static boolean isLength(String input, int minLength, int maxLength)
    {
        return (input.length() <= maxLength && input.length() >= minLength);
    }

    @Override
    public boolean verify(JComponent input)
    {
        if (input instanceof JFormattedTextField) return isFormattedDate(((JFormattedTextField) input).getText(), "dd/MM/YYYY");
        if (input instanceof JTextField) return isFormattedName(((JFormattedTextField) input).getText());
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
