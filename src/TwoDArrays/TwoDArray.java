package TwoDArrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {4, 5, 6, -1},
                        {7, 8, 9, -5},
                        {10,11,12,-7}
                };
        System.out.println(arr.length + " " + arr[1].length);
  //    rotateNinetyClockN2N2(arr);
        rotateNinetyClockN21(arr);
        System.out.println("Done");
        printZigZag(arr);
        int[][] matrix={{1}};
        searchMatrix(matrix,1);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length,columns=matrix[0].length;
        int end=rows*columns-1, start=0;
        boolean output=false;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(matrix[mid/columns][mid%columns]==target)
            {
                output=true;
                break;
            }
            else if(matrix[mid/columns][mid%columns]>target)
            {
                end--;
            }
            else
            {
                start++;
            }

        }
        return output;
    }

    private static void rotateNinetyClockN21(int[][] arr) {
        TransposeMatrix.transpose(arr);
        TransposeMatrix.reverseArray(arr);
        System.out.println("Transpose Done");
    }

    // Time n2 and space n2
    static void rotateNinetyClockN2N2(int[][] arr)
    {
        int roatedArray[][]= new int[arr[0].length][arr.length];

        int k=0,l=0;
        for (int j=0;j<arr[0].length;j++) {
            int colum[] = new int[arr.length];
            for (int i = arr.length - 1; i >= 0; i--) {
                colum[k]=arr[i][j];
                k++;
            }
            k=0;
            roatedArray[l]=colum;
            l++;
        }
        System.out.println("DO");
    }
        static void printZigZag(int[][] arr)
        {
            int reverseFlag = 1;
            for (int j = 0; j < arr[0].length; j++) {
                if (reverseFlag > 0) {
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println("");

                } else {
                    for (int i = arr.length - 1; i > -1; i--) {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println("");
                }
                reverseFlag = reverseFlag * -1;
            }
        }
    }

