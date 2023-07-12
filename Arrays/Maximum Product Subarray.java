import java.util.*;
public class Main {
    public static long maxProduct(int arr[], int n){
        /* Time Complexity:- O(N)
           Space Complexity:- O(N);
        */
        long maximum = Integer.MIN_VALUE;
        long prifix = 1;
        long suffix = 1;
        for(int i=0;i<n;i++){
            if(prifix==0){
                prifix = 1;
            }
            if(suffix==0){
                suffix = 1;
            }
            prifix*=arr[i];
            suffix*=arr[i];
            maximum = Math.max(prifix,Math.max(suffix,maximum));
        }
        return maximum;
    }
    

    public static void main(String[] args){
        
        int arr[] = {6, -3, -10, 0, 2};
        int n = arr.length;
       System.out.print(maxProduct(arr,n));
    }
}