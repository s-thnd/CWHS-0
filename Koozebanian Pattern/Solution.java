import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numCases = scan.nextInt();
        
        for(int k = 0; k < numCases; k++)
        {
            int length = scan.nextInt();
            int usableLength = (length) + (length - 1);
            String[][] output = getArray(usableLength, usableLength);

            
            for(int rows = 0; rows < usableLength; rows++)
            {
                for(int cols= 0; cols < usableLength; cols++)
                {
                    System.out.print(output[rows][cols]);
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
    
    public static String[][] getArray(int leng, int wid)
    {
        String[][] draw = new String[leng][wid];
        int lowest = draw[0].length / 2;
        int highest = draw[0].length/2;
        
        for(int i = 0; i < leng; i++)
        {
            for(int j = 0; j < wid; j++)
            {
                if( j >= lowest && j <= highest)
                    draw[i][j] = "*";
                else
                    draw[i][j] = "-";
            }
            
            if(i < leng/2)
            {
                lowest--;
                highest++;
            }
            else
            {
                lowest++;
                highest--;
            }
        }
        
        return draw;
    }
}
