class Solution {
    public boolean isPalindrome(String s) {
        // taking character array to store all the values of string
        char[] ch = new char[s.length()];
       int i = 0; 
       int j = 0;
       // only storing lower case and number values into array
       while(i < ch.length)
       {
        if((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57))
        {
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
            {
                ch[j] = (char)(s.charAt(i) + 32);
                j++;
            }
            else if((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57))
            {
                ch[j] = s.charAt(i);
                j++;
            }
        }
        i++;
       }
         i = 0;
         j--;
         // checking the palindrome or not character array
       boolean flag = true;
       while(i < j)
       {
        if(ch[i] != ch[j])
        {
            flag = false;
            break;
        }
        i++;
        j--;
       }
       // if yes then return true otherwise return false
       if(flag)
       {
        return flag;
       }
       else
       {
        return flag;
       }
    }
}