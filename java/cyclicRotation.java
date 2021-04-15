// Write a function that given an array A consisting of N integers and an integer K, returns the array A rotated K times.

class Solution {
    public int[] solution(int[] A, int K) {
        int N = A.length;
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            // use mod to find new pos of A[i] in temp
            temp[(i + K)%N] = A[i];
        }
        return temp;
    }
}
