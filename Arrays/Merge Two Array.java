import java.util.*;
public class Main{
    public static void mergerTwoSortedArray(int[] arr1, int[] arr2, int n1, int n2){
        // Time complexity is O(n1 + n2), and the Space complexity is O(n1 + n2).
        int arr[] = new int[n1+n2];
        int n = arr.length;
        int k =0;
        for(int i=0;i<n1;i++){
            arr[k] = arr1[i];
            k++;
        }
        for(int i=0;i<n2;i++){
            arr[k] = arr2[i];
            k++;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }



    public static void main(String[] args){
        int[] arr1 = {17,8,6,3,4};
        int[] arr2 = {5,6,7,8};
        int n1 = arr1.length;
        int n2 = arr2.length;
        mergerTwoSortedArray(arr1,arr2,n1,n2);
    }
}