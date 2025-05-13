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
            17 vs 29, add 17, last index compareator reached add 29
            3 vs 94, add 3, last index comparator reached add 94
            (SWAP SIDES)
            46 vs 8, add 8, last index comparator reached add 46
            -4 vs 12, add -4, last index comparator reached add 12
        4. {17, 29}{3, 94} {8, 46}{-4, 12} - resursively sort arrays checking
            3 vs 17 -> add 3 first, index arr2 moves forward
            17 vs 94 -> add 17 first, index arr1 moves forward
            29 vs 94 -> add 29 first, index arr1 cannot move forward, Length reached
            94 vs . -> add 94, index arr2 cannot move forward, Length reached
            (SWAP SIDES)
            8 vs -4 -> add -4 first, index arr2 moves forward
            8 vs 12 -> add 8 first, index arr1 moves forward
            46 vs 12 -> add 12 first, index arr2 cannot move forward, length reached
            46 vs . -> add 46, index arr1 cannot move forward, Length reached
        5. {3, 17, 29, 94} {-4, 8, 12, 46}
            3 vs -4 -> add -4 first, index arr2 moves forward
            3 vs 8 -> add 3 first, index arr1 moves forward
            17 vs 8 -> add 8 first, index arr2 moves forward
            29 vs 12 -> add 12 first, index arr2 moves forward
            29 vs 46 -> add 29 first, index arr1 moves forward
            94 vs 46 -> add 46 first, index arr2 cannot move forward, length reached
            96 vs . -> add 96, index arr1 cannot move forward, Length reached
        6. FIN: {-4, 3, 8, 12, 17, 29, 46, 94}
        */

        // B. {6, 5, 3, 7, 1, 8, 4, 2}
        /*
            1. {6, 5, 3, 7} {1, 8, 4, 2} - init split in half
            2. {6, 5}{3, 7} {1, 8}{4, 2} - recursion split in half
            3. {6}{5}{3}{7} {1}{8}{4}{2} - index length 1 achived, now beign sorting check val 1 vs val 2 and store less first in new array
            4. {5, 6}{3, 7} {1, 8}{2, 4}
            5. {3, 5, 6, 7} {1, 2, 4, 8}
            6. FIN: {1, 2, 3, 5, 5, 6, 7, 8}
        */

        // C. {33, 14, 3, 95, 47, 9, –42, 13}
        /*
            1. {33, 14, 3, 95} {47, 9, -42, 13} - init split in half
            2. {33, 14}{3, 95} {47, 9}{-42, 13} - recursion split in half
            3. {33}{14}{3}{95} {47}{9}{-42}{13} - index length 1 achived, now beign sorting check val 1 vs val 2 and store less first in new array
            4. {14, 33}{3, 95} {9, 47}{-42, 13}
            5. {3, 14, 33, 95} {-42, 9, 13, 47}
            6. FIN: {-42,3, 9, 13, 14, 33, 47, 95}         
        */

        // Exercises:

        // 11. Using the following arrays, trace the complete execution of the merge
        // sort algorithm when called on each array.
        // Show the subarrays that are created by the algorithm and show the merging of
        // subarrays into larger sorted arrays.




        // A. int[] numbers3 = {8, 5, –9, 14, 0, –1, –7, 3};
        /*
            1. {8, 5, -9, 14} {0, -1, -7, 3} - init split in half
            2. {8, 5}{-9, 14} {0, -1}{-7, 3} - recursion split in half
            3. {8}{5}{-9}{14} {0}{-1}{-7}{3} - index length 1 achived, now beign sorting check val 1 vs val 2 and store less first in new array
            4. {5, 8}{-9, 14} {-1, 0}{-7, 3}
            5. {-9, 5, 8, 14} {-7, -1, 0, 3}
            6. FIN: {-9, -7, -1, 0, 3, 5, 8, 14}         
        */

        // B. int[] numbers4 = {15, 56, 24, 5, 39, –4, 27, 10};
        /*
            1. {15, 56, 24, 5} {39, -4, 27, 10} - init split in half
            2. {15, 56}{24, 5} {39, -4}{27, 10} - recursion split in half
            3. {15}{56}{24}{5} {39}{-4}{27}{10} - index length 1 achived, now beign sorting check val 1 vs val 2 and store less first in new array
            4. {15, 56}{5, 24} {-4,39}{10, 27}
            5. {5, 15, 24, 56} {-4, 10, 27, 39}
            6. FIN: {-4, 5, 1-, 15, 24, 27, 39, 56}         
        */

        // 13. Using the following arrays, trace the complete execution of the merge
        // sort algorithm when called on each array.
        // Show the subarrays that are created by the algorithm and show the merging of
        // subarrays into larger sorted arrays.

        // A.
        int[] numbers5 = {22, 44, 11, 88, 66, 33, 55, 77};
        mergeSort(numbers5);
        System.out.println(Arrays.toString(numbers5));

        /*
            1. {22, 44, 11, 88} {66, 33, 55, 77} - init split in half
            2. {22, 44}{11, 88} {66, 33}{55, 77} - recursion split in half
            3. {22}{44}{11}{88} {66}{33}{55}{77} - index length 1 achived, now beign sorting check val 1 vs val 2 and store less first in new array
            4. {22, 44}{11, 88} {33, 66}{55, 77}
            5. {11, 22, 44, 88} {33, 55, 66, 77}
            6. FIN: {11, 22, 33, 44, 55, 66, 77, 88}         
        */



        // B. int[] numbers6 = {–3, -6, -1, -5, 0, -2, -4, -7};
        int[] numbers6 = {-3, -6, -1, -5, 0, -2, -4, -7};
        mergeSort(numbers6);
        System.out.println(Arrays.toString(numbers6));
        /*
            1. {-3, -6, -1, -5} {0, -2, -4, -7} - init split in half
            2. {-3, -6}{-1, -5} {0, -2}{-4, -7} - recursion split in half
            3. {-3}{-6}{-1}{-5} {0}{-2}{-4}{-7} - index length 1 achived, now beign sorting check val 1 vs val 2 and store less first in new array
            4. {-6, -3}{-5, -1} {-2, 0}{-7, -4}
            5. {-6, -5, -3, -1} {-7, -4, -2, 0}
            6. FIN: {-7, -6, -5, -4, -3, -2, -1, 0}         
        */
    }


    //Added Merge and MergeSort to help visualize code in IDE, removed 
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
