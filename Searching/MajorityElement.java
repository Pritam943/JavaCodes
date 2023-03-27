//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution

{

    static int majorityElement(int a[], int size)

    {

           HashMap<Integer,Integer> map = new HashMap<>();
  
        for(Integer i:a)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }
        for(Integer j:map.keySet())
        
        //Hash_Map.get(Object key_element) =  retrive value
        
        {
            
            if(map.get(j) > size/2)
            {
               return j;
            }
        }
        return -1; 

    }

    }
