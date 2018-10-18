import java.util.Arrays;


class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        
        int previous = 0;
        int current = 0;
        
        for (int i=0; i<A.length; i++) {
            current = A[i];
            if (i % 2 == 1) {
                if (current != previous) {
                    return previous;
                }
            } else if (i == A.length-1 && current != previous) {
                return A[i];
            }
            previous = A[i];
        }
        
        return 0;
    }
    
}