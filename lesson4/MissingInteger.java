import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int smallest = 1;
        for (int i=0; i<A.length; i++) {
            if (A[i] == smallest) {
                smallest += 1;
            }
        }
        return smallest;
    }
}