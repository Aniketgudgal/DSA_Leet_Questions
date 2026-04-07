class Robot {
    List<int[]> cells;
    int count;
    public Robot(int width, int height) {
        cells = new ArrayList<>();
        count = 0;
        cells.add(new int[]{0,0,3});

        for(int i = 1; i < width; i++)
        {
            cells.add(new int[]{i,0,0});
        }
        for(int j = 1; j < height; j++)
        {
            cells.add(new int[]{width - 1, j,1});
        }
        for(int i = width - 2; i >= 0; i--)
        {
            cells.add(new int[]{i, height - 1, 2});
        }
        for(int j = height - 2; j > 0; j--)
        {
            cells.add(new int[]{0,j,3});
        }
    }
    
    public void step(int num) {
        count += num;
    }
    
    public int[] getPos() {
        int index = count % cells.size();
        int x = cells.get(index)[0];
        int y = cells.get(index)[1];
        return new int[]{x,y};
    }
    
    public String getDir() {
        if(count == 0)
        {
            return "East";
        }
        int index = count % cells.size();
         if(index == 0) {
            return "South";
        }

        int dir = cells.get(index)[2];
        if(dir == 0)
        {
            return "East";
        }
        else if(dir == 1)
        {
            return "North";
        }
        else if(dir == 2)
        {
            return "West";
        }
        else
        {
            return "South";
        }
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */