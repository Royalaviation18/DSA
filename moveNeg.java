//Move all negative numbers to beginning and positive to end with constant extra space

import java.util.*;
class test{
    
   public static void main(String args[]){
       int ar[] ={1, 2,  -4, -5, 2, -7, 3,2, -6, -8, -9, 3, 2,  1};
       move(ar);
       for(int i=0;i<ar.length;i++){
           System.out.println(ar[i]);
       }
       
   }
   
   static void move(int ar[]){
       int low = 0;
       int high = ar.length-1;
       while(low<high){
           if(ar[low]<=0){
               low ++;
           }
           else{
               swap(ar,low,high--);
           }
       }
       
   }
   public static void swap(int ar[],int low,int high){
       int temp = ar[low];
       ar[low]= ar[high];
       ar[high] = temp;
   }
}
