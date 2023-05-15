//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        }
    }
}

// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        int n = arr.length();
        
        //step1: initialize count array
        
        int count[] = new int[26];
        
        //step2: count the occurance of each letter.
        
        for(int i=0; i<n;i++){
            
            char c = arr.charAt(i);
            count[c - 'a']++;
        }
        
        //step3: update the count array to solve the actual positions
        
        for(int i=1; i<26; i++){
            count[i] += count[i-1];
        }
        
        //step4: Build the output array
        char[] output  = new char[n];
        for(int i=n-1; i>=0; i--){
            
            char c = arr.charAt(i);
            int index = count[c-'a']-1;
            output[index] = c;
            count[c-'a']--;
        }
        
        //step5: convert the output array to string
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : output){
            sb.append(c);
        }
        
        return sb.toString();
    }
    
}
