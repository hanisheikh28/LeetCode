import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // use a set to store unique intersection elements
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {   // use nums2.length
                if (nums1[i] == nums2[j]) {           // compare nums1[i] with nums2[j]
                    set.add(nums1[i]);                // add value (unique by Set)
                }
            }
        }

        // convert Set<Integer> to int[]
        int[] a = new int[set.size()];
        int k = 0;
        for (int val : set) {
            a[k++] = val;
        }
        return a;
    }
}
