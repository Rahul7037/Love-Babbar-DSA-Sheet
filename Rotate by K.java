import java.util.*;
public class Main
{
    public static void rotateByOneK(int [] arr, int n, int k){
        /*----------------------Time Complexity:- O(n) and Space Complexity:- O(1)-------------*/
        k = k%n;

        // Reverse the entire array
        reverse(arr,0,n-1);

        // Reverse the first k elements
        reverse(arr,0,k-1);

        // Reverse the remaining elements from index k to n-1
        reverse(arr,k,n-1);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
        int k  = 3;
		rotateByOneK(arr,n,k);
	}
}
