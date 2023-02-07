

//User function Template for Java

class Solution
{
    // complete the function
    public static int sumOfDigits(int n)
    {
        // add your code here
        if(n<=9){
            return n;
        }
        
        return  (n%10) + sumOfDigits(n/10);
    }
}
