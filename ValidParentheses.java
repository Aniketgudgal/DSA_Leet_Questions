import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> al = new Stack<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                al.push(s.charAt(i));
            }
            else
            {
                if(!al.isEmpty())
                {
                    if((al.peek() == '{' && s.charAt(i) == '}') || (al.peek() == '[' && s.charAt(i) == ']') || (al.peek() == '(' && s.charAt(i) == ')'))
                    {
                        al.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        return al.isEmpty();
    }
}