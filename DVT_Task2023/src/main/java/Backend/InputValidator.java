/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.lang.Character;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
                if(!Character.isAlphabetic(c) && (int)c != 32) return false;
            }
        }else if (dataType.equalsIgnoreCase("Date")) 
        {
            try 
            {
                int day = Integer.parseInt(inStr.substring(0, 2));
                int month = Integer.parseInt(inStr.substring(3, 5));
                int year = Integer.parseInt(inStr.substring(6, 10));
            }catch(NumberFormatException e)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean rangeCheck(String inStr, int min, int max)
    {
        return (inStr.length() <= max && inStr.length() >= min);
    }
    public static boolean hasNameCapitals(String nameIn)
    {//strictly for readability:
        char nameStart = nameIn.charAt(0), surnameStart = nameIn.charAt(nameIn.lastIndexOf(" ")+1);
        int numNameStart = (int)nameStart, numSurnameStart = (int)surnameStart; 
        
        return (numNameStart<= 90 && numNameStart >= 65 ) &&  (numSurnameStart <= 90 && numSurnameStart >= 65 );
    }
    public static boolean isFormattedName(String nameIn)
    {
        //should have space and a next letter
        boolean hasSpace = false;
        
        for (char c : nameIn.toCharArray())
        {
            if (Character.isSpaceChar(c)) hasSpace = true;
        }
        try
        {
            return (hasSpace && nameIn.substring(nameIn.lastIndexOf(" ")+1).length() >0);
        }catch (IndexOutOfBoundsException e)
        {
            return false;
        }
    }
    public static boolean isFormattedDate(String inputDate)
    {
        String pattern = "dd/MM/yyyy";
        try
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
            LocalDate inDate = LocalDate.parse(inputDate, dtf);
            
        }catch(DateTimeException e) 
        {
            return false;
        }

        return true;
    }
    public static boolean isValidAge(String inputDate)
    {
        String pattern = "dd/MM/yyyy";
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
        if (input instanceof JFormattedTextField) return isFormattedDate(((JFormattedTextField) input).getText());
        if (input instanceof JTextField) return isFormattedName(((JFormattedTextField) input).getText());
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
