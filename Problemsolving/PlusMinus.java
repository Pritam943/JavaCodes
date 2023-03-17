import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    
    int n  = arr.size();
    double min=0 , pos=0, zer=0;
    
    for(int i=0; i<n; i++){
        
        
        if(arr.get(i) < 0){
            min++;
        }
        else if(arr.get(i)>0){
            pos++;
        }
        else{
            zer++;
        }
    }
    
     System.out.printf("%.6f\n",pos/(double)n);
     System.out.printf("%.6f\n",min/(double)n);
     System.out.printf("%.6f\n",zer/(double)n);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
