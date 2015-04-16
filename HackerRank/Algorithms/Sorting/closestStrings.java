/*
Problem Statement

Sorting is often useful as the first step in many different tasks. The most common task is to make finding things easier, but there are other uses, as well.

Challenge 
Given a list of unsorted integers, A={a1,a2,…,aN}, can you find the pair of elements that have the smallest absolute difference between them? If there are multiple pairs, find them all.

Input Format 
The first line of input contains a single integer, N, representing the length of array A. 
In the second line, there are N space-separated integers, a1,a2,…,aN, representing the elements of array A.

Output Format 
Output the pairs of elements with the smallest difference. If there are multiple pairs, output all of them in ascending order, all on the same line (consecutively) with just a single space between each pair of numbers. If there's a number which lies in two pair, print it two times (see the sample case #3 for explanation).

Constraints

2≤N≤200000
−107≤ai≤107
ai≠aj,where 1≤i<j≤N
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine()); //get integer input
        long [] arr = new long[size]; //declare arr
        
        //get array elements
        int i = 0;
        while(sc.hasNext()){
            arr[i++] = Long.parseLong(sc.next());
        }
        
        Arrays.sort(arr);
        System.out.println(closestNumbers(arr));
       
    }
    
    //returns string of pairs of elements that have the smallest difference
    public static String closestNumbers(long [] arr){
        long minSub = 0;
        String result = "";
        for(int i = 1; i < arr.length; i++){
            long sub = arr[i] - arr[i-1];
            String elements = arr[i - 1] + " " + arr[i];
            
            if(i == 1){
                minSub = sub;
                result = elements;
            }
            else
            {   
                //if smaller, replace
                if(sub < minSub){
                    minSub = sub;
                    result = elements;
                }//if equal, add
                else if(sub == minSub){
                    result += " " + elements;
                }
            }
        }
        return result;
    }
    
    
   
}