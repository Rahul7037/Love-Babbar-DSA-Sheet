import java.util.*;
public class Main {
    public static int getPairsCount(int[] arr, int n, int k) {

        /*---Time Complexity:- O(N^2) and Space Complexity:- O(1);--*/
        int count = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])==k){
                    count++;
                }
            }
        }
        return count;
    }



    /*            Optimize Solution            */
    /*--------------Time Complexity:- O(N) and Space:- O(N)*/
    public static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            int x = k-arr[i];
            if(map.containsKey(x)){
                count+=map.get(x);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }


    public static void main(String[] args){
        int[] arr = {1,5,7,1};
        int n = arr.length;
        int k = 6;
        System.out.print(getPairsCount(arr,n,k));
    }
}