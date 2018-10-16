class Solution {
    public int[] solution(int[] A, int K) {

        // rotation by N times where N==A.length produces the same array
        // empty or single value arrays can be also returned right away
        if (K == 0 || A.length == 0 || A.length == 1) {
            return A;
        } else {
            int[] res = new int[A.length];
        
            // optimization - no need to rotate more times than is the size of array
            K = K % A.length;

            // diff - number of elements from the head of A that will be at the tail of res
            int diff = A.length-K;
            
            // System.out.println(diff);
            
            for (int i=0; i<A.length; i++) {
                if (i < diff) {
                    // push diff elements of head of A to the tail of res
                    res[i+K] = A[i];
                } else {
                    // push tail push the rest of A to the head of res
                    res[i-diff] = A[i];
                }
            }
            return res;
            
        }
    }
}