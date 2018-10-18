class Solution {
    public int solution(int X, int Y, int D) {
        int mod = (Y - X) % D;
        int div = (Y - X) / D;
        
        if (mod == 0) {
            return div;
        } else {
            return div+1;
        }
    }
    
}