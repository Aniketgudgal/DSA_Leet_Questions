import java.util.HashSet;
import java.util.ArrayList;
class Solution {
    public int sumOfUnique(int[] nums) {
         HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int x : nums) {
            if (!unique.add(x)) {
                duplicate.add(x);
            }
        }

        int sum = 0;
        for (int x : unique) {
            if (!duplicate.contains(x)) {
                sum += x;
            }
        }

        return sum;
    }
}