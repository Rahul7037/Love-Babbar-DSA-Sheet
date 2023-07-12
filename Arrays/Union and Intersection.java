import java.util.*;
public class Main
{
    public static void unionOfTwoArray(int [] arr1, int arr2[], int n1, int n2){
        /*----------------------Time Complexity:- O(n1+n2) and Space:- O(n1+n2)-------------*/
    
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements from arr1 to the set
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        
        // Add elements from arr2 to the set
        for(int i=0;i<n2;i++){
            set.add(arr2[i]);
        }
        
        // Print the elements of the set (union of the two arrays)
        for (int num : set) {
            System.out.print(num + " ");
        }
        
      
    }
    
    
    public static void interSectionOfTwoArray(int arr1[], int arr2[], int n1, int n2){
        /*----------------------Time Complexity:- O(n1+n2) and Space:- O(n1+n2)-------------*/
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> interSection = new HashSet<>();
        
        for(int i=0;i<n1;i++){
            set1.add(arr1[i]);
        }
        
        for(int i=0;i<n2;i++){
            set2.add(arr2[i]);
        }
        for(int num : set1){
            if(set2.contains(num)){
                interSection.add(num);
            }
        }
        
        for(int num : interSection){
            System.out.print(num + " ");
        }
        
    }
    
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {2,4,6,8};
		int n1 = arr1.length;
		int n2 = arr2.length;
		System.out.println("Union Of Two Array:- ");
		unionOfTwoArray(arr1,arr2,n1,n2);  //Union 
		System.out.println("");
		System.out.println("InterSection of Two Array:- ");
		interSectionOfTwoArray(arr1,arr2,n1,n2);  // InterSection
	}
}
