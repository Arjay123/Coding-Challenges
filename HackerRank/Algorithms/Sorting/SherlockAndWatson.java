/*
Problem Statement

John Watson performs an operation called Right Circular Rotation on an integer array [a0,a1,...an−1]. Right Circular Rotation transforms the array from [a0,a1,...an−1] to [aN−1,a0,...,aN−2].

He performs the operation K times and tests Sherlock's ability to identify the element at a particular position in the array. He asks Q queries. Each query consists of one integer, idx, for which you have to print the element at index idx in the rotated array, i.e. aidx.

Input Format 
The first line consists of three integers, N, K, and Q,, separated by a single space. 
The next line contains N space-separated integers which indicate the elements of the array A. 
Each of the next Q lines contains one integer per line denoting idx.

Output Format 
For each query, print the value at index idx in the updated array separated by newline.

Constraints

1≤N≤105
1≤ai ≤105
1≤K≤105
1≤Q≤500
0≤idx≤N−1



*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); // get n
        int k = Integer.parseInt(sc.next()); // get k
        if(k > n)
            k = (k % n);
        int q = Integer.parseInt(sc.next()); //get q
        
        //get array
        int [] arr = new int [n];
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(sc.next());
        
        while(sc.hasNext()){
            int getIndex = Integer.parseInt(sc.next());
                if(getIndex < k)
                    System.out.println(arr[arr.length - (k) + getIndex]);
                else
                    System.out.println(arr[getIndex - k]);
        }
    }
}