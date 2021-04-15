/**
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.
*/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        int N = A.length;
        // put all the values of A in a new set
        for (int a : A) {
            set.add(a);
        }
        for (int i = 1; i < N + 1; i++) {
            // if it's not in the set then we've found the missing element!
            if (!set.contains(i)) {
                return i;
            }
        }
        return N + 1;
    }
}
