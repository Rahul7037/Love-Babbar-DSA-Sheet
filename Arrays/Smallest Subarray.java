public class Main
{
    public static int smallestSubWithSum(int arr[], int n, int x) {
        /* Time Complexity:- O(n)
         Space Complexity:- O(1);
        */
        
        
        
        int min_length = n+1; // Initialize with a value greater than the array length
        int sum = 0; // Variable to track the sum of the current subarray
        int left = 0; // Left pointer to track the start of the subarray
        
        // Loop through the array
        for(int i=0; i<n; i++){
            sum += arr[i]; // Add the current element to the sum
            
            // If the sum becomes greater than the given value x, update the min_length
            while(sum > x){
                min_length = Math.min(min_length, i-left+1); // Update the min_length
                sum -= arr[left]; // Remove the element at the left pointer from the sum
                left++; // Move the left pointer to the right
            }
        }
        
        // If min_length is still greater than the array length, return 0
        if(min_length == n+1){
            return 0;
        }
        
        return min_length; // Return the min_length of the subarray
    }
	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 6, 0, 19};
		int n = arr.length;
		int x = 51;
		System.out.print(smallestSubWithSum(arr,n,x));
	}
}
