class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> al = new ArrayList<>();
        int i = 1;
        while(i <= n)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                al.add("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                al.add("Fizz");
            }
            else if(i % 5 == 0)
            {
                al.add("Buzz");
            }
            else
            {
                al.add(Integer.toString(i));
            }
            i++;
        }
        return al;
    }
}