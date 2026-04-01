class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indexes = new Integer[n];
        for(int i = 0; i < n; i++)
        {
            indexes[i] = i;
        }
        Arrays.sort(indexes, new Comparator<Integer>()
        {
            public int compare(Integer a, Integer b)
            {
                return positions[a] - positions[b];
            }
        });
        List<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int index: indexes)
        {
            if(directions.charAt(index) == 'R')
            {
                stack.push(index);
            }
            else
            {
                boolean isSurived = true;
                while(!stack.isEmpty())
                {
                    int topIndex = stack.peek();
                    if(directions.charAt(topIndex) == 'L')
                    {
                        isSurived = true;
                        break;
                    }
                    else if(healths[topIndex] > healths[index])
                    {
                        isSurived = false;
                        healths[index] = 0;
                        healths[topIndex] -= 1;
                        break;
                    }
                    else if(healths[index] > healths[topIndex])
                    {
                        isSurived = true;
                        healths[topIndex] = 0;
                        healths[index] -= 1;
                        stack.pop();
                    }
                    else
                    {
                        isSurived = false;
                        healths[topIndex] = 0;
                        healths[index] = 0;
                        stack.pop();
                        break;
                    }
                }
                if(isSurived)
                {
                    stack.push(index);
                }
            }
        }
        for(int i = 0; i < n; i++)
        {
            if(healths[i] > 0)
            {
                res.add(healths[i]);
            }
        }
        return res;
    }
}