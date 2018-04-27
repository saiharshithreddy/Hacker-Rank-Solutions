/*
Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. 
For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

Input format
The first line contains an integer, T, denoting the number of test cases. 
Each test case, T, is comprised of a single line with an integer, n, which can be arbitrarily large or small.

Output Format

For each input variable n and appropriate primitive datatype, you must determine if the given primitives are capable of storing it. If yes, then print:


*/




import java.util.*;
import java.io.*;
import java.math.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767)System.out.println("* short"); // (-32768<short<32767)
                if(x>=-Math.pow(2,31) && x<=Math.pow(2,31)-1)System.out.println("* int"); // (-2^31<int<2^31-1)
                if(x>=-Math.pow(2,63) && x<=Math.pow(2,63)-1)System.out.println("* long"); //(-2^63<long<2^63-1)
                else{ 
                    
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
