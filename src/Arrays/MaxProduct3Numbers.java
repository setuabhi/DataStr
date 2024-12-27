package Arrays;

import java.util.Arrays;

public class MaxProduct3Numbers {
    public static void main(String[] args) {
        int[] array = {-3,10,2,-8,4,-6};
        System.out.println(maxProductN3(array));
        System.out.println(maxProductNLOGN(array));
        System.out.println(maxProductN(array));
    }

    private static int maxProductN(int[] array) {
        int thirdMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;

        int min= Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>=max)
            {
                thirdMax=secondMax;
                secondMax=max;
                max=array[i];
            } else if (array[i]>=secondMax) {
                thirdMax=secondMax;
                secondMax=array[i];
            }
            else if (array[i]>thirdMax) {
                thirdMax=array[i];
            }

            if(array[i]<=min)
            {
                secondMin=min;
                min=array[i];
            }

            else if(array[i]<secondMin)
            {
                secondMin=array[i];
            }
        }
        return Math.max(max*secondMax*thirdMax,max*min*secondMin);

    }

    private static int maxProductNLOGN(int[] array) {
        Arrays.sort(array);
        return Math.max(array[array.length-1]*array[array.length-2]*array[array.length-3],
                array[0]*array[1]*array[array.length-1]);
    }

    private static int maxProductN3(int[] array) {
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<array.length-2;i++)
        {
            for(int j=i+1;j<array.length-1;j++)
            {
                for(int k=j+1;k<array.length;k++)
                {
                    int currentSum=array[i]*array[j]*array[k];
                    maxProduct= Math.max(currentSum, maxProduct);
                }
            }
        }
        return maxProduct;
    }


}
