import java.util.*;

public class Main
{
    
    public static int maxSubArraySum(int[] arr, int n){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max = Math.max(max,sum);
            if(max<0){
                return sum;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,-2,5};
		int n = arr.length;
		System.out.print(maxSubArraySum(arr,n));
	}
}
