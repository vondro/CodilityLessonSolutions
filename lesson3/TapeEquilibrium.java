class Solution {
    public int solution(int[] A) {
        if (A.length == 0) {
            // error, empty array
            return -1;
        }
        
        int minimalRes = 0;
        int first = A[0];
        int second = sum(A, 1, A.length);
        int result = 0;
        for (int i=0; i<A.length-1; i++) {
             if (i == 0) {
                // first iteration
                result = Math.abs(first - second);
                minimalRes = result;
            } else {
                first += A[i];
                second -= A[i];
                result = Math.abs(first - second);
                if (result <= minimalRes) {  
                    minimalRes = result;
                }
            }   
        }
        return minimalRes;
    }
    
    public int sum(int[] A, int start, int end) {
        int sum = 0;
        for (int i=start; i<end; i++) {
            sum += A[i];
        }
        return sum;
    }
    
}