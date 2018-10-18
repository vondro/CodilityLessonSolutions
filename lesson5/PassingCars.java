class Solution {
    public int solution(int[] A) {
        int[] prefixSums = new int[A.length+1];
        int sum = 0;
        for (int i=1; i<=A.length; i++) {
            prefixSums[i] = prefixSums[i-1] + A[i-1];
        }
        
        for (int i=0; i<A.length; i++) {
            if (A[i] != 0) {
                continue;
            }
            
            sum += getPairsCount(prefixSums, i);
            
            if (sum > 1000000000) {
                return -1;    
            }
        }
        return sum;
    }
    
    public int getPairsCount(int[] prefixSums, int index) {
        return prefixSums[prefixSums.length-1] - prefixSums[index];
    }
}