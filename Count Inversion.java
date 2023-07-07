public class Main
{
    public static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        if(N==1){
            return 0;
        }
        long c = 0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i]>arr[j] && i<j){
                    c++;
                }
            }
        }
        return c;
        
    }

    public static void main(String[] args){
        long[] arr = {2,4,1,3,5};
        long N = arr.length;
        long answer = inversionCount(arr,N);
        System.out.print("Inversion Count is:- "answer);
    }
}