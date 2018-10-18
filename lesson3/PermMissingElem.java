import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int current = 0;
        int previous = 0;
        
        if (A.length == 0 || A[0] != 1) {
            return 1;
        }
        
        for (int i=0; i<A.length; i++) {
            current = A[i];
            if (i > 0) {
                if (current != previous+1) {
                    return previous+1;
                }
            }
            previous = A[i];
        }
        return A.length+1;
    }
}