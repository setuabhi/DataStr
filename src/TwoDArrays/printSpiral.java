package TwoDArrays;

public class printSpiral {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {1, 2, 3,  0, 9},
                        {4, 5, 6, -1, 9},
                        {7, 8, 9, -5, 9},
                        {10,11,12,-7, 9}
                };
        printSpiralMethod(arr);
    }
    static void printSpiralMethod(int[][] arr)
    {
        int sr=0,sc=0;
        int er= arr.length-1, ec=arr[0].length-1;
        System.out.println(arr[sr][sc] + " "+ arr[er][ec]);

        while(sr<=er && sc<=ec)
        {
            for(int i= sc;i<=ec;i++)
            {
                System.out.print(arr[sr][i]+" ");
            }
            for(int i=sr+1;i<=er;i++)
            {
                System.out.print(arr[i][ec]+" ");
            }
            for(int i= ec-1; i>=sc; i--)
            {
                System.out.print(arr[er][i]+" ");
            }
            for(int i= er-1; i>sr; i--)
            {
                System.out.print(arr[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }
}
