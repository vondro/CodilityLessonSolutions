class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxValue = 0;
        int base = 0;
        int index = 0;
        for (int i=0; i<A.length; i++) {
            index = A[i]-1;
            if (A[i] <= N) {
                if (counters[index] < base) {
                    counters[index] = base;
                }
                
                counters[index] +=1;
                
                if (maxValue < counters[index]) {
                    maxValue = counters[index];
                }
            } else if (A[i] == N+1) {
                base = maxValue;
            }
        }
        setMax(counters, base);
        return counters;
    }
    
    public void setMax(int[] counters, int base) {
        for (int i=0; i<counters.length; i++) {
            if (counters[i] < base) {
                counters[i] = base;
            }
        }
    }
    
}