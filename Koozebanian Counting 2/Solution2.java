import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] output = {0,1,2,3,4,5,6,7,8,9};
        
        for(int i = 0; i < 10; i++)
        {
            for (int element : output)
                System.out.print(element);
            
            int first = output[0];
            
            for (int count = 1; count < output.length; count++)
            {
                output[count - 1] = output[count];
            }
            
            output[output.length - 1] = first;
            System.out.println();
        }
    }
}
