import java.util.*;
public class Main {
    public static List<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3){
        /* Time Complexity:- O(N) length of third Array
        Space Complexity :- O(M) M is Number of common Element
        */
        
        List<Integer> answer = new ArrayList<>();
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i=0;i<n1;i++){
            set1.add(A[i]);
        }
        for(int i=0;i<n2;i++){
            set2.add(B[i]);
        }
        
        for(int i=0;i<n3;i++){
            if(set1.contains(C[i]) && set2.contains(C[i])){
                answer.add(C[i]);
            }
        }
        return answer;
    }
    

    public static void main(String[] args){
        
        int A[] = {1, 5, 10, 20, 40, 80};
        int B[] = {6, 7, 20, 80, 100};
        int C[] = {3, 4, 15, 20, 30, 70, 80, 120};
        int n1 = A.length;
        int n2 = B.length;
        int n3 = C.length;
       
       
       List<Integer> answer = commonElements(A,B,C,n1,n2,n3);

        if (answer.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Common elements: " + answer);
        }
    }
}