/**
A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

Write a function that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
*/

class Solution {
    public int solution(int[] A) {
        int diff;
        int P = 1;
        int N = A.length;
        int tape1 = A[0];
        int tape2 = 0;

        // get the first difference when P = 1;
        for (int i = P; i < N; i++) {
            tape2 += A[i];
        }
        diff = Math.abs(tape1 - tape2);

        // get the rest of the differences for each P in N
        while (P < N - 1) {
            tape1 += A[P];
            tape2 -= A[P];
            int newDiff = Math.abs(tape1 - tape2);
            // compare prev and curr differences to get the min difference
            if (diff > newDiff) {
                diff = newDiff;
            }
            P++;
        }
        return diff;
    }
}
