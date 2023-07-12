import java.util.*;
public class Main
{   
    
	public static boolean find3Numbers(int A[], int n, int X)
	{

         /* Time Complexity:- O(NLogN);
        Space Complexity:- O(1);
        */
      if(n<3){
           return false;
       }
      Arrays.sort(A);
      for(int i=0;i<n-2;i++){
          int low = i+1;
          int high = n-1;
          while(low<high){
              int sum = A[i] + A[low] + A[high];
              if(X==sum)    return true;
              else if(X>sum)    low ++;
              else{
                  high--;
              }
          }
          
      }
        return false;
	}

    public static void main(String[] args){
        int A[] =   {1,2,4,3,6};
        int n = A.length;
        int X = 10;
        System.out.print(find3Numbers(A,n,X));
    }
}