import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        // // YOUR CODE HERE
        // return false;
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        // // YOUR CODE HERE
        // return false;
        if (i >= list.size() - 1) {
            return true;
        }
        else if (list.get(i+1) < list.get(i)) {
            return false;
        }
        else {
            return isSortedRec(list, i+1);
        }
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        // // YOUR CODE HERE
        // return false;
        return hasCountCopiesRec(arr, x, count, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        // // YOUR CODE HERE
        // return false;
        if (i == arr.length) {
            return (count == 0);
        }
        else if (arr[i] == x) {
            return hasCountCopiesRec(arr, x, count-1, i+1);
        }
        else {
            return hasCountCopiesRec(arr, x, count, i+1);
        }
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        // // YOUR CODE HERE
        // return false;
        return binarySearchRec(arr, num, 0, arr.length-1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        // // YOUR CODE HERE
        // return false;
        int middleIndex = lowerBound + (upperBound - lowerBound)/2;

        if (lowerBound > upperBound) {
            return false;
        }
        else if (arr[middleIndex] < num) {
            return binarySearchRec(arr, num, middleIndex+1, upperBound);
        }
        else if (arr[middleIndex] > num) {
            return binarySearchRec(arr, num, lowerBound, middleIndex-1);
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
