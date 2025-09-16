class Solution {
    public boolean isPerfectSquare(int num) {
        int check = (int)Math.sqrt(num); // taking the square root of that number
        int result = check*check; // calculate again square if it is in float the same number is loss and number is not same means this is not perfect square
        if(result == num) // checking the given square and calculated square
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}