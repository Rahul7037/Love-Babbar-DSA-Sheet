import java.util.*;
public class Main
{
    public static void moveAllNegative(int [] arr, int n){
        /*----------------------Time Complexity:- O(n) and Space:- O(1)-------------*/
        
        
                            /*----  Efficient Approach ---- */
      int j = 0;
      for(int i=0;i<n;i++){
          if(arr[i]<0){
              if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
              }
              j++;
          }
      }
      for(int i=0;i<n;i++){
          System.out.printf(arr[i] + " ");
      }
       
       
       
                                /*---- Using Two Pointer Approch */
       int left = 0;
       int right = n-1;
       
       while(left <= right){
           
           //---- if the left pointer and the right pointer element is negative
           if(arr[left]<0 && arr[right]<0){
               left++;
           }
           
           //---- if the left pointer element is positive and the right pointer element is negative
            else if(arr[left]>0 && arr[right]<0){
               int temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
               left++;
               right--;
           }
           
           // elements are positive
           else if(arr[left]>0 && arr[right]>0){
               right--;
           }
           else{
               left++;
               right--;
           }
       }
       for(int i=0;i<n;i++){
           System.out.printf(arr[i] + " ");
       }
    }
    
	public static void main(String[] args) {
		int arr[] = {-2,4,6,-7,9,-3};
		int n = arr.length;
		moveAllNegative(arr,n);
	}
}
