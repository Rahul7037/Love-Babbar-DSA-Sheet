import java.util.*;
public class Main
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	public static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here

       /* Time Complexity:- O(Nlogn);
        Space Complexity:- O(1);
        */
	    if(N==0){
	        return 0;
	        
	    }
	    
	    Arrays.sort(arr);
	    int longStreat = 1;
	    int currentStreat = 1;
	    for(int i=1;i<N;i++){
	        if(arr[i]!=arr[i-1]){
	            if(arr[i] == arr[i-1]+1){
	                currentStreat+=1;
	            }
	            else{
	                longStreat = Math.max(currentStreat,longStreat);
	                currentStreat=1;
	            }
	        }
	    }
	    int answer = Math.max(longStreat,currentStreat);
	    return answer;
	}

    public static void main(String[] args){
        int arr[] =  {2,6,1,9,4,5,3};
        int N = arr.length;
        System.out.print(findLongestConseqSubseq(arr,N));
    }
}