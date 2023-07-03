import java.util.*;
public class Main
{
    public static void sort012(int [] arr, int n){
        /*----------------------Time Complexity:- O(n) and Space:- O(1)-------------*/
        int count_zeros = 0;
        int count_ones = 0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count_zeros++;
            }
            else if(arr[i]==1){
                count_ones++;
            }
        }
        
        for(int i=0;i<count_zeros;i++){
            arr[i] = 0;
        }
        for(int i=count_zeros;i<count_ones;i++){
            arr[i] = 1;
        }
        int k = count_zeros + count_ones;  // After 0's and 1's  add 2's;
        for(int i=k;i<n;i++){
            arr[i] = 2;
        }
        for(int i=0;i<n;i++){
            System.out.printf(arr[i]+ " ");
        }
    }
    
	public static void main(String[] args) {
		int arr[] = {1,2,0,1,0,2};
		int n = arr.length;
		sort012(arr,n);
	}
}
