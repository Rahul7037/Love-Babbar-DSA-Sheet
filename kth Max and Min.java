import java.util.*;
public class Main
{
    public static void kthMinAndMax(int [] arr, int n, int k){
        /*----------------------Time Complexity:- O(nLogn) and Space:- O(1)-------------*/
        //First Sort the Array 
        Arrays.sort(arr);  //if you want Using Any Another Sorting Algorithm to sort an array
        System.out.println(k+" Smallest element is:- "+ arr[k-1]);
        System.out.println(k+" largest element is:- "+ arr[n-k]);
    }
    
	public static void main(String[] args) {
		int arr[] = {4,9,3,7,8,54,23,71};
		int n = arr.length;
		int k = 2;
		kthMinAndMax(arr,n,k);
	}
}
