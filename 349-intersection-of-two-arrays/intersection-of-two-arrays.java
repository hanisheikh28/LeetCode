import java.util.*;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // put all elements of nums1 in a set
        Set<Integer> set1 = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        }

        // check nums2 against set1, store unique intersection in another set
        Set<Integer> resultSet = new HashSet<>();
        for (int x : nums2) {
            if (set1.contains(x)) {
                resultSet.add(x);   // set automatically keeps only unique values
            }
        }

        // convert result set to int[]
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int x : resultSet) {
            result[i++] = x;
        }
        return result;
    }
}
