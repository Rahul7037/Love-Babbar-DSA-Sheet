import java.util.*;
public class Main
{
    public static void printAllDuplicate(String s, int n){

        /* Time Complexity:- O(N+k)
        Space complexity:- O(k) (K is number of Unique character)
        */
       

        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        for (Map.Entry mapElement : map.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());
 
            if (value > 1)
                System.out.println(key + ", count = " + value);
        }
    }
	public static void main(String[] args) {
		String s = "hello"; //Take Any String 
		int n = s.length();
		printAllDuplicate(s,n);
	}
}
