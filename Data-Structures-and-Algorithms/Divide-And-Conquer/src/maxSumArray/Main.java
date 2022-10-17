package maxSumArray;

public class Main {

    public static void main(String[] args) {

        int[] example = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};

        printArray(findMaxSubArray(example, 0, example.length-1));

    }

    public static int[] findMaxSubArray(int[] A, int low, int high) {
        int[] output = new int[3];

        //base case
        if(high == low) {
            output[0] = low;
            output[1] = high;
            output[2] = A[low];

            return output;
        } else {
            int mid = (low + high) / 2;
            int[] leftSide = findMaxSubArray(A, low, mid);
            int[] rightSide = findMaxSubArray(A, mid+1, high);
            int[] cross = findCrossMaxArray(A, low, mid, high);

            if(leftSide[2] >= rightSide[2] && leftSide[2] >= cross[2]) {
                return leftSide;
            } else if(rightSide[2] >= leftSide[2] && rightSide[2] >= cross[2]) {
                return rightSide;
            } else {
                return cross;
            }
        }


    }

    public static int[] findCrossMaxArray(int[] A, int low, int mid, int high) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        int maxLeft = -1;

        //check left side
        for(int i = mid; i >= low; i--) {
            sum += A[i];
            if(sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        int maxRight = -1;

        //check right side
        for(int j = mid + 1; j <= high; j++) {
            sum += A[j];
            if(sum > rightSum) {
                rightSum = sum;
                maxRight = j;
            }
        }

        int[] output = {maxLeft, maxRight, leftSum + rightSum};
        return output;
    }


    public static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.println(i);
        }
    }

}
