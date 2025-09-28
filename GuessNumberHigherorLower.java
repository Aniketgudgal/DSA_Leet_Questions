public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1, high = n; // the user enter the number
        
        while (low <= high) {
            int mid = low + (high - low) / 2;  // avoid overflow calculate the mid point of the array
            int res = guess(mid); // generated number by system
            
            if (res == 0) {
                return mid; // found the number
            } else if (res < 0) {
                high = mid - 1; // target is smaller
            } else {
                low = mid + 1; // target is larger
            }
        }
        
        return -1; // should never reach here
    }
}