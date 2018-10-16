class Solution {
    public int solution(int N) {
        String s = Integer.toBinaryString(N);
        // System.out.println(s);
        int maxGap = 0;
        int zeroCount = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (zeroCount > maxGap) {
                    maxGap = zeroCount;
                }
                zeroCount = 0;
            } else if (s.charAt(i) == '0') {
                zeroCount++;
            }
        }
        
        return maxGap;
    }
}