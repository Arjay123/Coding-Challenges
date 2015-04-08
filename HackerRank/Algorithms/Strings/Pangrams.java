import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
    
    public static final int SUB_INDEX = 97; //ascii value of lowercase 'a', used to get index in alpha array
    public static void main(String[] args) {
        
        boolean [] alpha = new boolean[26]; //checks for letters used
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); //read line in
        
        fillAlpha(input.replace(" ", "").toLowerCase(), alpha); //fill alpha w/ true values
        
        //print results
        if(checkPangram(alpha))
            System.out.println("pangram");
        else
            System.out.println("not pangram");
            
        
   }
    
    // checks input string and updates boolean array if a letter is used
    public static void fillAlpha(String input, boolean[] alpha){
        for(char c: input.toCharArray()) //convert string to character array
            //subtract int(c) by ascii value of lowercase 'a' to get index
            alpha[(int)c - SUB_INDEX] = true; 
    }
    
    //checks boolean array if all values true
    public static boolean checkPangram(boolean[] alpha){
        for(boolean b: alpha)
            if(!b) return false;
        return true;
    }
}





