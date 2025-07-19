package DSA;

public class Slinding_Window {
    public static void main(String [] agrs)
    {
       //Problem:
        //Given an array of integers, find the maximum sum of any subarray of size K.
        //[1,4,2,10]=17
        //[4,2,10,23]=17-1+23=39
        //[2,10,23,3]=39-4+3=38
        //[10,23,3,1]=38-2+1=37
        //[23,3,1,0]=38-10+0=28
        //[3,1,0,20]=28-23+20=25

        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4;
        int n=arr.length;
        // step 1 find the window sum
        int windowSum = 0;
        for(int i=0;i<k;i++)
        {
            windowSum+=arr[i];
        }
        int maxsum=windowSum;
        //// Step 2: Slide the window from index K to n-1
        for (int i=k;i<n;i++)
        {
            windowSum=windowSum-arr[i-k]+arr[i];
            if(windowSum>maxsum)
            {
                maxsum=windowSum;
            }
        }
System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxsum);

    }
}
