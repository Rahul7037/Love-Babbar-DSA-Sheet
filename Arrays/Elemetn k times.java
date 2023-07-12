// Statement:- Given an array of size n and an integer k, find all elements in the array that appear more than n/k times. 

import java.util.*;
public class Main
{   
    
	public static void morethanNdK(int arr[], int N, int k)
	{
         /* Time Complexity:- O(N);
        Space Complexity:- O(N);
        */

	    int x = N/k;
	    
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for(int i=0;i<N;i++){
	        if(!map.containsKey(arr[i])){
	            map.put(arr[i],1);
	        }
	        else{
	            int count = map.get(arr[i]);
	            map.put(arr[i],count+1);
	        }
	    }
	    for(Map.Entry m: map.entrySet()){
	        Integer temp = (Integer)m.getValue();
	        if(temp>x){
	            System.out.print(m.getKey()+ " ");
	        }
	    }
	    
	   
	}

    public static void main(String[] args){
        int arr[] =   {3, 1, 2, 2, 1, 2, 3, 3};
        int N = arr.length;
        int k = 4;
        morethanNdK(arr,N,k);
    }
}
