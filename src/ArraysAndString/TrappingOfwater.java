package ArraysAndString;

public class TrappingOfwater {
    public static void main(String[] args) {
        int[] arr ={1,8,6,2,5,4,8,3,7};
        System.out.println(TrappingN2(arr));
        System.out.println(TrappingNandN(arr));
    }



    private static int TrappingNandN(int[] arr) {
        int leftMaxArray[]= new int[arr.length];
        int rightMaxArray[]= new int[arr.length];
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            leftMaxArray[i]=leftMax;
            leftMax=Math.max(leftMax,arr[i]);

        }
        for(int i=arr.length-1;i>=0;i--)
        {
            rightMaxArray[i]=rightMax;
            rightMax=Math.max(rightMax,arr[i]);

        }

        int Totalwater=0;
        for(int i=1; i<arr.length-1;i++)
        {
            int water=Totalwater+(Math.min(leftMaxArray[i],rightMaxArray[i])-arr[i]);
            Totalwater=Math.max(water,Totalwater);
        }
        return  Totalwater;
    }

    private static int TrappingN2(int[] arr) {
        int Totalwater=0;
        for(int i=1; i<arr.length-1;i++)
        {
            int leftMax=0;
            int rightMax=0;
            for(int j=0;j<i;j++)
            {
                leftMax=Math.max(arr[j],leftMax);
            }

            for(int j=i+1;j<arr.length;j++)
            {
                rightMax=Math.max(arr[j],rightMax);
            }
            int water=Totalwater+(Math.min(leftMax,rightMax)-arr[i]);
            Totalwater=Math.max(water,Totalwater);
        }
        return Totalwater;
    }
}
