import java.util.*;
import java.io.*;

/**
 * This program finds the word in a text file with the largest number of consecutive vowels.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsecutiveVowels
{
    public static void main(String[] args){
        String vowellyWord = mostConsecutiveVowelsInDictionary("words.txt");
        System.out.println("The most vowelly word is : " + vowellyWord );
           
    }
    
    
    /**
     * Reads words in from a text file: fileName
     * 
     * Returns the word in this file with the most consecutive vowels (in case of ties,
     * returns any word amongst the ties)
     */
    private static String mostConsecutiveVowelsInDictionary(String fileName)
    {
        // TODO 
        // complete this method
        
        // Location of file to read
        File file = new File(fileName);
        // TODO
        // You probably need a few variable initialization statements here
        
        try 
        {
 
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine())
            {
                // reads in the next word in the file
                String word = scanner.nextLine();
                
                // TODO
                // The bulk of your logic goes here
                // Be sure to call the method countConsecutiveVowels() here
              
            }

            scanner.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return ""; // delete this line of code
       
    }
    
    /**
     * returns the count of the largest number of consecutive vowels in str
     * e.g. countConsecutiveVowels("copious") returns 3
     * e.g. countConsecutiveVowels("baaabaabaaaa") returns 4
     * e.g. countConsecutiveVowels("sequoia") returns 4
     * e.g  countConsecutiveVowels("aebioubab") returns 3
     */
    static int countConsecutiveVowels(String str){
        // How might this string help you? 
        // You may use this string if you feel it's helpful
        String vowels = "aeiou";
        // TODO
       
        return 0; // delete this line of code
    }
        
        
}
    
    
    

