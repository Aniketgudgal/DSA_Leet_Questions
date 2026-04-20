class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDist = 0;

        // Compare first house with others
        for (int j = n - 1; j > 0; j--) {
            if (colors[j] != colors[0]) {
                maxDist = Math.max(maxDist, j - 0);
                break;
            }
        }

        // Compare last house with others
        for (int i = 0; i < n - 1; i++) {
            if (colors[i] != colors[n - 1]) {
                maxDist = Math.max(maxDist, (n - 1) - i);
                break;
            }
        }

        return maxDist;
    }
}