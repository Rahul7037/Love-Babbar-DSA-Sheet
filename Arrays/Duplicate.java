import java.util.*;

public class Main
{
    
    public static int duplicate(int[] arr, int n){

        // Time Complexity of O(N) and Space Complexity:- O(N)
        HashSet<Integer> a = new HashSet<>();
        for(int i=0;i<n;i++){
            int temp = arr[i];
            if(a.contains(temp)){
                return temp;
            }
            a.add(temp);
        }
        return 1;
    }




/*-------------------------Optimize Solution-------------------*/

    public static int duplicate(int[] arr, int n) {
        // Time Complexity of O(N) and Space Complexity:- O(1)
        
        int slow = arr[0];
        int fast = arr[0];

        // Move slow pointer 1 step at a time and fast pointer 2 steps at a time
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // Find the entry point of the cycle
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }


	public static void main(String[] args) {
		int[] arr = {1,3,4,2,2};
		int n = arr.length;
		System.out.print(duplicate(arr,n));
	}
}
