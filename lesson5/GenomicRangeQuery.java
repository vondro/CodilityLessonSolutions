class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        
        for (int i=0; i<P.length; i++) {
            result[i] = minimal(S.substring(P[i], Q[i]+1));
        }
        
        return result;
    }
    
    public int minimal(String s) {
        // setting worst case based on first character
        int result = convertToImpact(s.charAt(0));
        
        if (result == 1) {
            return 1;
        }

        if (s.length() == 1) {
            return result;
        }
        
        if (s.contains("A")) {
            return 1;
        }
        
        if (result != 2 && s.contains("C")) {
            return 2;
        } 

        if (result != 3 && s.contains("G")) {
            return 3;
        }

        return result;
    }

    public int convertToImpact(char ch) {
        int result = 0;
        switch (ch) {
            case 'A' : result = 1;
            break;
            case 'C' : result = 2;
            break;
            case 'G' : result = 3;
            break;
            case 'T' : result = 4;
            break;
        }
        return result;
    }
}