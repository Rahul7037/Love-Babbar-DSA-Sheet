public class Main {
    public static boolean palindrome(String s) {

        /* Time Complexity:- O(N)
        Space complexity:- O(1);
        */
       
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "kgios";
        System.out.print(palindrome(s));
    }
}
