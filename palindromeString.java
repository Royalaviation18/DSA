//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        int len = S.length();
        char ch;
        String rev="";
        for(int i=0;i<S.length();i++){
            ch = S.charAt(i);
            rev = ch+rev; 
        }
        // System.out.println(rev);
        if(S.equals(rev)){
            return 1;
        }
    return 0;
    }
};
