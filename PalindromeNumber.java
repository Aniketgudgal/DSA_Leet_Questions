class Solution {
    public boolean isPalindrome(int x)
    {
        int rev = 0,temp;
        temp = x;
        if(x<0)
            return false;
        while(x != 0) // -121
        {
        int rem;
        rem = x % 10; //-121
        rev = rev*10 + rem; // -121
        x = x /10;
        }
        
        if (temp == rev)
        {   //flag = true; 
            return true;
        }
        else
        {
            return false;
        }
       //return flag;
    
    }
}