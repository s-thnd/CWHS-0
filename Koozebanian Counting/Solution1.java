//This solution utilizes an ArrayList and lambdas. Other solutions are also available in this folder.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        
        list.replaceAll(n -> n+1);
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        
    }
}
