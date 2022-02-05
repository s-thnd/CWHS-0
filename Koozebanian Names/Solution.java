import java.io.*;
import java.util.*;

public class Solution {

    public static Scanner input = new Scanner(System.in);
    public static String line =  "";
    
    public static void main(String[] args) {
    
    while(input.hasNextLine()){
        line = input.nextLine();
        System.out.println(switchLetters());
    }
        
        
    }
    
    public static String switchLetters(){
        
        Scanner split = new Scanner(line);
        String word = "";
        String output = "";
        
        
        
        while(split.hasNext()){
            word = split.next();
            String first = word.substring(0, 1);
            String last = word.substring(word.length()-1, word.length());
            String middle = word.substring(1, word.length()-1);
            output +=  last + middle + first + " ";
        }
        
        return output;
        
    }
    
}
