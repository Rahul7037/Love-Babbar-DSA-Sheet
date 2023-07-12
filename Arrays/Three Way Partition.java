public class Main
{
    public static void threeWayPartition(int arr[], int a, int b)
    {
        // code here
        /* Time Complexity:- O(N)
        Space complexity:- O(1);
        */
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        while(mid <= high){
            if(arr[mid] < a){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] > b){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
            else{
                mid++;
            }
        }
        
    }
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 3, 4};
		int a = 1;
		int b = 2;
		threeWayPartition(arr,a,b);
		System.out.print("1");
	}
}
