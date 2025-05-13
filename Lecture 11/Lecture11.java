import java.util.*;
class Lecture11 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 11");

        // Self-Check Problems:
        // Section 13.4: Case Study: Implementing Merge Sort

        // 30. Trace the complete execution of the merge sort algorithm when called on
        // each array below.
        // Show the sub-arrays that are created by the algorithm and show the merging of
        // sub-arrays into larger sorted arrays.

        // A. {29, 17, 3, 94, 46, 8, –4, 12}
        /*
        1. {29, 17, 3, 94} {46, 8 -4, 12} - init split in half
        2. {29, 17}{3, 94} {46, 8}{-4,12} - recursion split in half
        3. {29}{17}{3}{94} {46}{8}{-4}{12} - index length 1 achived, now beign sorting check val 1 vs val 2 and store less first in new array
        4. {17, 29}{3, 94} {8, 46}{-4, 12} - resursively sort arrays checking
        5. {3, 17, 29, 94} {-4, 8, 12, 46}
        6. {-4, 3, 8, 12, 17, 29, 46, 94}
        */

        // B. {6, 5, 3, 7, 1, 8, 4, 2}
        /*

        */

        // C. {33, 14, 3, 95, 47, 9, –42, 13}
        /*

        */

        // Exercises:

        // 11. Using the following arrays, trace the complete execution of the merge
        // sort algorithm when called on each array.
        // Show the subarrays that are created by the algorithm and show the merging of
        // subarrays into larger sorted arrays.




        // A. int[] numbers3 = {8, 5, –9, 14, 0, –1, –7, 3};
        // B. int[] numbers4 = {15, 56, 24, 5, 39, –4, 27, 10};

        // 13. Using the following arrays, trace the complete execution of the merge
        // sort algorithm when called on each array.
        // Show the subarrays that are created by the algorithm and show the merging of
        // subarrays into larger sorted arrays.

        // A.
        int[] numbers5 = {22, 44, 11, 88, 66, 33, 55, 77};
        mergeSort(numbers5);
        System.out.println(Arrays.toString(numbers5));



        // B. int[] numbers6 = {–3, -6, -1, -5, 0, -2, -4, -7};
        int[] numbers6 = {-3, -6, -1, -5, 0, -2, -4, -7};
        mergeSort(numbers6);
        System.out.println(Arrays.toString(numbers6));
    }

    public static void merge (int[] result, int[] arr1, int[] arr2) {
        int i1 = 0; // index into left array
        int i2 = 0; // index into right array
        for (int i = 0; i < result.length; i++) {
            if (i2 >= arr2.length || (i1 < arr1.length && arr1[i1] <= arr2[i2])) {
                result[i] = arr1[i1]; // take from left
                i1++;
            } else {
                result[i] = arr2[i2]; // take from right
                i2++;
            }
        }
    }

    public static void mergeSort (int[] a) {
        if (a.length >= 2) {
        // split array into two halves
        int[] left = Arrays.copyOfRange(a, 0, a.length/2) ;
        int[] right = Arrays.copyOfRange(a, a.length/2, a.length) ;
        // sort the two halves
        mergeSort(left);
        mergeSort(right);
        // merge the sorted halves into a sorted whole
        merge(a, left, right);
        }
    }
}
