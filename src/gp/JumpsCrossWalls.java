package gp;

/*

Number of jumps for a thief to cross walls
A thief trying to escape from a jail. He has to cross N walls each with varying heights (every height is greater
than 0). He climbs X feet every time. But, due to the slippery nature of those walls, every time he slips back by
Y feet. Now the task is to calculate the total number of jumps required to cross all walls and escape from the jail.
 */
public class JumpsCrossWalls {

    public static void main(String args[])
    {
        int x = 10;
        int y = 1;
        int height[] = { 11, 34, 27, 9 };
        int n = height.length;
        System.out.println(jumpcount(x, y, n, height));
    }

    static int jumpcount(int x, int y, int n, int height[])
    {

        int jump=0;
        for(int i=0;i<n;i++)
        {
            jump++; // since all hight are greator than 1 so at least one jump is required
            if(height[i]>x)
            {
                int h=height[i]-(x-y);
                jump=jump+h/(x-y);
                if(h%(x-y)>1)
                    jump++;
            }
        }
        return jump;
    }

}
