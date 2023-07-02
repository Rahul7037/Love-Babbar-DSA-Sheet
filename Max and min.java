import java.util.*;
public class Main
{
    public static void minAndmax(int [] arr, int n){
        /*----------------------Time Complexity:- O(n) and Space:- O(1)-------------*/
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]<minimum){
                minimum = arr[i];
            }
            else if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        System.out.println("Smallest Element is:- " + minimum);
        System.out.print("Largest Element is:- " + maximum);
    }
    
	public static void main(String[] args) {
		int arr[] = {6,25,7,3,2};
		int n = arr.length;
		minAndmax(arr,n);
	}
}
