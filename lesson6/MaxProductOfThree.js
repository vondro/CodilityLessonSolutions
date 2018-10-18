function solution(A) {
    A.sort((a, b) => a - b);
    var result = 0;
    
    // either there are two big negative numbers at the beginning
    var negative = A[0] * A[1] * A[A.length-1];
    
    // or we use the last 3 biggest positive numbers
    var positive = A[A.length-1] * A[A.length-2] * A[A.length-3];
    
    if (negative > positive) {
        result = negative;
    } else {
        result = positive;
    }
    
    return result;
}