package ArraysAndString;

/**
 * nLogn approcah will be Arrays.sort then find
 */
public class secondLargest {

    public static void main(String[] args) {
        int[] array = {-1,-2,-7,4,5,8,10};
        System.out.println(secondLargestNo(array));
        System.out.println(thirdLargestNo(array));
        System.out.println(secondMinimumNo(array));
    }

    private static int secondMinimumNo(int[] array) {
        int min= Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0; i<array.length;i++)
        {


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
        return secondMin;
    }

    private static int secondLargestNo(int[] array) {
        int secondMax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>=max)
            {
                secondMax=max;
                max=array[i];
            } else if (array[i]>secondMax) {
                secondMax=array[i];
            }
        }
        return secondMax;
    }

    private static int thirdLargestNo(int[] array) {
        int thirdMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
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
            else if (array[i]>thirdMax ) {
                thirdMax=array[i];
            }
        }
        return thirdMax;
    }
}
