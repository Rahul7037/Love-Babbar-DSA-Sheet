import java.util.*;
public class Main {
    public static boolean findSumZero(int arr[], int n){
        /* Time Complexity:- O(N)
           Space Complexity:- O(N);
        */
        HashSet<Integer> a = new HashSet<>();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]==0 || a.contains(sum) || sum == 0){
                return true;
            }
            a.add(sum);
        }
        return false;
    }
    

    public static void main(String[] args){
        
        int arr[] = {4 ,2 ,-3 ,1 ,6};
        int n = arr.length;
       System.out.print(findSumZero(arr,n));
    }
}