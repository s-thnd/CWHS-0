import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        
        int numTacos = input.nextInt();
        double taxRate = input.nextDouble();
        
        double subtotal = 0;
        double total = 0;
   
     
        while(numCases > 0){
            
            while(numTacos > 0){
            subtotal += input.nextDouble();
            numTacos--;
            }
        
            total = subtotal * (1+taxRate);
            System.out.printf("Before Tax: $%.2f \n", subtotal);
            System.out.printf("After Tax: $%.2f \n", total);
            
            if(numCases > 1){
                System.out.println("");
            }
            
            if(input.hasNextInt()){
                numTacos = input.nextInt();
            }
            if(input.hasNextDouble()){
                taxRate = input.nextDouble();
            }
            subtotal = 0;
            total = 0;
            numCases--;
            
        }
        
    }
}
