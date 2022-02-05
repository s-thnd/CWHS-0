import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        
        String[] toArray = line.split(",");
        
        for(int i = 0; i < toArray.length; i++){
            System.out.println(toArray[i]);
        }
        
    }
}
