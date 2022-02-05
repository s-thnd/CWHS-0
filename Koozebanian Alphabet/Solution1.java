import java.io.*;
import java.util.*;

public class Solution {
    
    public static ArrayList<String> nums = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
                                                                               "Q","R","S","T","U","V","W","X","Y","Z"));

    public static void main(String[] args) {           
            
        for(int i = 0; i < nums.size(); i++) {
            System.out.println(getLine());
            nums.add(nums.get(0));
            nums.remove(0);
        }
    }
    
    public static String getLine(){
        String output = "";
        for(int i = 0; i < nums.size(); i++){
            output += nums.get(i);
        }
        return output;
    }
    
}
