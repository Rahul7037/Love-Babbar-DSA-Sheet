public class Main {
    public static String shufflString(String s, int[] indices )
    {
        // Your code here

        /* Time Complexity:- O(N)
        Space complexity:- O(N) 
        */
        
        int n = s.length();
        char[] array = new char[n]; 
        for(int i=0;i<n;i++){
            array[indices[i]] = s.charAt(i);
        }
        return String.valueOf(array);
                
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.print(shufflString(s,indices));
    }
}
