function solution(A) {
    var minInd = 0;
    var minAvg = Number.MAX_SAFE_INTEGER;
    var avg = 0;
    if (A.length === 2) {
        return 0;
    }
    
    for (var i=0; i<A.length-1; i++) {
        // check two slice
        avg = (A[i] + A[i+1]) / 2;
        if (avg < minAvg) {
            minAvg = avg;
            minInd = i;
        }
        
        // check three slice
        if (i+2 < A.length) {
            avg = (A[i] + A[i+1] + A[i+2]) / 3;
            if (avg < minAvg) {
                minAvg = avg;
                minInd = i;
            }
        }
    }
    return minInd;
}