
//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int hash_size = sc.nextInt();
            int array_size = sc.nextInt();

            int arr[] = new int[array_size];
            for (int i = 0; i < array_size; i++)
                arr[i] = sc.nextInt();

            // int hash_table[] = new int[hash_size];
            // for(int i = 0; i < hash_size; i++)
            // hash_table[i] = -1;
            Solution obj = new Solution();
            int hash_table[] = obj.linearProbing(hash_size, arr, array_size);

            for (int i = 0; i < hash_size; i++)
                System.out.print(hash_table[i] + " ");

            System.out.println();

        }
    }

}
// } Driver Code Ends

class Solution {
    // Function to fill the array elements into a hash table
    // using Linear Probing to handle collisions.
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray) {
        // Your code here
        int hash_table[] = new int[hash_size];

        // Storing -1 all indexes in the hash table.

        for (int i = 0; i < hash_size; i++) {
            hash_table[i] = -1;
        }

        for (int h = 0; h < sizeOfArray; h++) {

            int key = arr[h] % hash_size;
            int curr = key;

            while (hash_table[key] != -1 && hash_table[key] != arr[h]) {

                key = (key + 1) % hash_size;

                if (key == curr)
                    break;

            }
            if (hash_table[key] == -1) {
                hash_table[key] = arr[h];
            }

        }

        return hash_table;
    }

}