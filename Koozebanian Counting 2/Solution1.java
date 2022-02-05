import java.io.*;
import java.util.*;

public class Solution {
    
    public static ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

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
