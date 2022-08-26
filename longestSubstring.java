//Longest Palindrome in a String

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.longestPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestPalindrome(String S){
        // code here
        int low,high;
        int start=0,end =1;
        for(int i=1;i<S.length();i++){
            low = i-1;
            high = i;
            
            while(low>=0 && high<S.length() && S.charAt(low)==S.charAt(high)){
                if(high-low+1> end){
                    start = low;
                    end = high - low +1;
                }
                low--;
                high++;
            }
        
        
        //odd
  
            low = i-1;
            high = i+1;
            
            while(low>=0 && high<S.length() && S.charAt(low)==S.charAt(high)){
                if(high-low+1> end){
                    start = low;
                    end = high - low +1;
                }
                low--;
                high++;
            }
        
        }
        
        return S.substring(start,start+end);
        
    }
}
