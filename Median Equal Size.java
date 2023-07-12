import java.util.*;
public class Main
{
    public static int find_median(int[] v, int n)
    {
        // code here
        /* Time Complexity:- O(NLogN)
        Space complexity:- O(1);
        */
       
        Arrays.sort(v);
        if(n%2!=0){
            int size = n-1;
            int median = (size)/2;
            return v[median];
        }
        int size = n;
        int median = (size-1)/2;
        int median2 = size/2;
        int mean =(v[median]+v[median2])/2;
        return mean;
    }
    
    
	public static void main(String[] args) {
		int v[] = {90, 100, 78, 89 ,67};
		int n = v.length;
		int x = find_median(v,n);
		System.out.print(x);
	}
}
