function solution(A) {
    if (A.length < 3 || A == undefined) {
        return 0;
    }
    
    A.sort((a, b) => a - b);

    for (var i=0; i<A.length-2; i++) {
        if (A[i] + A[i+1] > A[i+2]) {
            return 1;
        }
    }
    return 0;
}