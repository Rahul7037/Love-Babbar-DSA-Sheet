import java.util.*;
public class Main
{   
    
	public static int find3Numbers(int A[], int n, int M)
	{
	    /* Time Complexity:- O(NLognN)
           Space Complexity:- O(1);
        */
	    
        Arrays.sort(A);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=n-M;i++){
            int d = A[i+M-1] - A[i];
            if(d<min){
                min = d;
            }
        }
        return min;
        
	}

    public static void main(String[] args){
        int A[] =   {3, 4, 1, 9, 56, 7, 9, 12};  //Number of choclate in Each Packet;
        int n = A.length;
        int M = 5;  // Number of Student;
        System.out.print(find3Numbers(A,n,M));
    }
}