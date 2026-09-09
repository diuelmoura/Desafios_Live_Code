/*
 * CHALLENGE STATEMENT - Insertion Sort
 *
 * Given an array of integers, implement the Insertion Sort algorithm
 * to sort the array in ascending order.
 *
 * The algorithm should modify the original array by inserting each
 * element into its correct position within the already sorted portion
 * of the array.
 *
 * Example:
 *
 * Input:
 * [7, 3, 5, 2]
 *
 * Output:
 * [2, 3, 5, 7]
 *
 * Requirement:
 * Solve the problem using the Insertion Sort algorithm without using
 * an additional array for the sorting process.
 */

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int n = arr.length;
    
        for(int i = 1; i < n; i++){
    
            int key = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > key) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] numeros = {8, 3, 5, 9, 1};

        System.out.println("Before: " + Arrays.toString(numeros));

        insertionSort(numeros);

        System.out.println("After: " + Arrays.toString(numeros));
    }

}

/*
 * The insertionSort method receives an integer array and sorts it
 * in ascending order using the Insertion Sort algorithm.
 *
 * First, I store the length of the array in the variable "n".
 *
 * Then, I iterate through the array starting from index 1 because
 * the first element at index 0 can already be considered sorted.
 *
 * For each iteration, I store the current element in a variable
 * called "key".
 *
 * I also create an auxiliary variable called "j", which starts at
 * the same position as "i". The variable "j" is used to move
 * backwards through the already sorted portion of the array.
 *
 * Inside the while loop, I check two conditions:
 *
 * 1. "j > 0" ensures that I do not move outside the beginning
 *    of the array.
 *
 * 2. "a[j - 1] > key" checks whether the previous element is
 *    greater than the current key.
 *
 * If both conditions are true, I move the previous element one
 * position to the right:
 *
 * a[j] = a[j - 1];
 *
 * Then, I decrement "j" so that I can continue checking the
 * previous elements:
 *
 * j--;
 *
 * When the while loop finishes, "j" represents the correct
 * position where the key should be inserted.
 *
 * Therefore:
 *
 * a[j] = key;
 *
 * inserts the key into its correct position.
 *
 * This process continues until all elements have been processed,
 * leaving the entire array sorted in ascending order.
 *
 * Time Complexity:
 *
 * Best Case: O(n)
 * - Happens when the array is already sorted.
 *
 * Average Case: O(n²)
 *
 * Worst Case: O(n²)
 * - Happens when the array is sorted in reverse order.
 *
 * Space Complexity: O(1)
 * - The algorithm sorts the array in-place and only uses a few
 *   auxiliary variables.
 */