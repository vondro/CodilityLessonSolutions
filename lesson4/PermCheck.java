import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int previous = 0;
        if (A.length == 0) {
            return 0;
        }
        for (int i=0; i<A.length; i++) {
            if (i == 0) {
                // first run
                previous = A[i];
                if (A[i] != 1) {
                    return 0;
                }
            } else {
                if (previous+1 != A[i]) {
                    return 0;
                }
            }
            previous = A[i];
        }
        return 1;
        
    }
}