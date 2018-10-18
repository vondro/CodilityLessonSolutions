class Solution {
    public int solution(int X, int[] A) {
        int[] count = new int[X];
        int element = 0;
        int missing = X;
        for (int i=0; i<A.length; i++) {
            element = A[i];
            
            if (element > X) {
                continue;
            }
            
            count[element-1] += 1;
            
            if (count[element-1] == 1) {
                missing -= 1;
            }
            
            if (missing == 0) {
                return i;
            }
        }
        return -1;
    }
}