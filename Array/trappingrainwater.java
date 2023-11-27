package Array;

public class trappingrainwater {
    public static void main(String args[])
    {
        int height[]={4,2,0,6,3,2,5};
        //System.out.println(trappedrainwater(height));
        System.out.println(trappingrainwater(height));

    }
    // public static int trappedrainwater(int height[])
    // {
    //     //calculate left max boundary -array
    //     int leftMax[]=new int[height.length];
    //     leftMax[0]=height[0];
    //     for(int a=1;a<height.length;a++)
    //     {
    //        leftMax[a]=Math.max(height[a],leftMax[a-1]);
    //     }  
    //     //calculate right max boundary -array
    //     int rightMax[]=new int[height.length];
    //     rightMax[height.length-1]=height[height.length-1];
    //     for(int a=height.length-2;a>=0;a--)
    //     {
    //         rightMax[a]=Math.max(height[a],rightMax[a+1]);
    //     }
    //     //loop
    //     int trappedwater=0;                 
    //     for(int i=0;i<height.length;i++)
    //     {
    //         //water level=min(leftmax boundary,rightmax boundary)
    //        int waterLevel=Math.min(leftMax[i],rightMax[i]);
    //         //trappedwater=waterlevel-height
    //         trappedwater+=waterLevel-height[i];
    //     }
    //     return trappedwater;
        
        
    // }
    public static int trappingrainwater(int height[])
    {
        int leftmax  []=new int[height.length];
        leftmax[0]=height[0];
        for(int a=1;a<height.length;a++)
        {
            leftmax[a]=Math.max(height[a],leftmax[a-1]);

        }
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int a=height.length-2;a>=0;a--)
        {
            rightmax[a]=Math.max(height[a],rightmax[a+1]);

        }
        int trappedwater=0;
        for(int i=0;i<height.length;i++)
        {
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;

    }
    
}
