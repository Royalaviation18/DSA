// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n,m,i;
                    n = sc.nextInt();
                    m = sc.nextInt();
                    int arr[] = new int[n];
                    for(i=0;i<n;i++)
                        arr[i]=sc.nextInt();
                    Sol obj = new Sol();
                    System.out.println(obj.diffSum(n,m,arr));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int diffSum(int n,int m,int arr[])
    {
        //code here.
        // int mainNew[] = arr;
        //sorting the array
        Arrays.sort(arr);
        
        int maxArr=0,minArr=0;
        for(int i=0;i<m;i++){
            // System.out.println(arr[i]);
            minArr = arr[i]+minArr;
            // System.out.println(minArr);
        }
        // System.out.println(arr.length);
        
        
        for(int i=arr.length-1;i>=n-m;i--){
            maxArr = arr[i]+maxArr;
        }
        // System.out.println(maxArr);
        
        return maxArr - minArr;
        
        
        
    }
}


