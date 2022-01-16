import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/* https://leetcode.com/problems/two-sum/ */


class Solution {

    public int[] twoSum(int[] ints, int target) {
        int[] result = new int[2];
        for (int i = 0; i < ints.length; i++) {
            boolean found = false;
            result[0] = i;
            int left = target - ints[i];
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == left && i != j) {
                    result[1] = j;
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
        return result;
    }

}
