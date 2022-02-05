import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        while(scan.hasNextInt()){
            if(scan.nextInt() % 2 == 0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
        
    }
}
