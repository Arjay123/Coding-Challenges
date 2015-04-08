import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < testCases; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(b.length() > a.length()){
                String temp = a;
                a = b;
                b = temp;
            }
            //TwoStrings
        }
    }
    
    public static boolean TwoString(String a, String b){
        
    }
    
    
    
}
