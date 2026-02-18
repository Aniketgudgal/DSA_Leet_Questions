class Solution {
    public String multiply(String num1, String num2) {
        int[] result = new int[num1.length() + num2.length()];
        for(int i = num1.length() - 1; i >= 0; i--)
        {
            int k = i;
            int carry = 0;
            for(int j = num2.length() - 1; j >= 0; j--)
            {
                int p1 = num1.charAt(i) - '0'; // i variable for first string
                int p2 = num2.charAt(j) - '0'; // j variable for second string
                int prod = p1*p2;
                int position1 = i+j;
                int position2 = i+j+1;
                int sum = prod + result[position2];

                result[position2] = sum % 10;
                result[position1] += sum / 10; 
            }
        }
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        for(int i = 0; i < result.length; i++)
        {
            if(!(sb.length() == 0 && result[i] == 0))
            {
                sb.append(result[i]);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}