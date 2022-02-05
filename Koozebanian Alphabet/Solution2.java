import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        String[] output = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R",
                           "S","T","U","V","W","X","Y","Z"};
        int length = output.length;
        
        for (int i = 0; i < 26; i++)
        {
            for(String element : output)
            {
                System.out.print(element);
            }
            System.out.println();
            
            String first = output[0];
            for (int count = 1; count < 26; count++)
            {
                output[count - 1] = output[count];
            }
            output[length - 1] = first;
            
            

        }
    }
}
