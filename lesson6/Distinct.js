function solution(A) {
    if (A.length === 0) {
        return 0;
    }
    
    A.sort((a, b) => a - b);
    
    var previous = A[0];
    // there will be at least one distinct value for N >= 1 
    var distinct = 1;
    
    for (var i=1; i<A.length; i++) {
        if (A[i] != previous) {
            distinct++;
        }
        previous = A[i];
    }
    
    return distinct;
}