public class Main {
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here

        /* Time Complexity:- O(N)
        Space complexity:- O(N)  // Using Concate 
        */
        if(s1.length()!=s2.length()){
            return false;
        }
        String str = s1+s1; //Concat String
        return str.contains(s2);

                
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        System.out.print(checkRotation(s1,s2));
    }
}