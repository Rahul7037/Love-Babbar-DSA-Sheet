public class Main
{
     public static int palinArray(int[] a, int n) {

        // code here
        /* Time Complexity:- O(N)
        Space complexity:- O(1);
        */
       
        for (int i = 0; i < n; i++) {
            if (!isPalindrome(a[i])) {
                return 0;
            }
        }
        return 1;
    }
    
    private static boolean isPalindrome(int num) {
        
        
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
    
    
	public static void main(String[] args) {
		int a[] = {111 ,222 ,333, 444, 555};
		int n = a.length;
		palinArray(a,n);
		System.out.print("1");
	}
}
