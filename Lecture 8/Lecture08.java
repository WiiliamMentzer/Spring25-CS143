//Lecture 8 by William Mentzer

class Lecture08 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 08");

        // SELF-CHECK PROBLEMS:
        // Section 13.1: Searching and Sorting in the Java Class Libraries
        // 3. Should you use a sequential or binary search on an array of Point objects,
        // and why?
        //Binary, its just faster to find the object values you are looking for based on how it searches and as long as its sorted. instead oflooking one by one,
        //imagine not finding it in the sorted x values for the first half, well now half that array doesnt need to be wasted on, same rules apply until it finds a matching value
        //then that can just be applied to the y values. instead of sequential that is.

        // 4. Under what circumstances can the Arrays.binarySearch and
        // Collections.binarySearch methods be used successfully?
        
        //When looking through SORTED ARRAYS, ONLY SORTED

        // 5. In what order does the Collections.sort method arrange a list of strings?
        // How could you arrange them into a different order?

        //Usually a .sort() will make the strings appear in order from a to z. Well you could do a reverse after you sort for a z to a sort.
        //Unfortunately Java doesnt have all those sorting algorigtms you listed pre installed so theres not really any way to sort it (I dont include random since it doesnt SORT things it just moves it around  with no intention)

        // Section 13.2: Program Complexity
        // 9. Approximate the runtime of the following code fragment listed in Canvas

        // N/2

        // 10. Approximate the runtime of the following code fragment listed in Canvas

        // N

        // 11. Approximate the runtime of the following code fragment listed in Canvas

        //N^2 + N

        // Section 13.3: Implementing Searching and Sorting Algorithms
        // 16. What is the runtime complexity class of a sequential search on an
        // unsorted array?
        // What is the runtime complexity class of the modified sequential search on a
        // sorted array?

        // O(n) - Unsorted

        // O(log n) - Sorted

        // 17. Why does the binary search algorithm require the input to be sorted?

        //Because it looks at whether the value is bigger or smaller and cuts off half the array every time based on the result so its imperative its sorted so the numbers can be properly checked.

        // 18. How many elements (at most) does a binary search examine if the array
        // contains 60 elements?

        //takes about ~1.77 elements to search for an element so more commonly going to take 2 elements to find the answer but sometimes just one.

        // 19. What indexes will be examined as the middle element by a binary search
        // for the target value 8 when the search is run on the following input arrays?
        // What value will the binary search algorithm return?

        // A. int[] numbers = {1, 3, 6, 7, 8, 10, 15, 20, 30};
        //HUH, if you run a binary search algorithm on this IT FINDS THE INDEX OF THE VALUE IN QUESTION
        //This is going to return index 4 where 8 lies.

        // B. int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        //This is going to return index 7 where 8 lies.

        // C. int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //This is going to return index 7 where 8 lies.

        // D. int[] numbers = {8, 9, 12, 14, 15, 17, 19, 25, 31};
        //This is going to return index 0 where 8 lies.

        // 20. What indexes will be examined as the middle element by a binary search
        // for the target value 8 when the search is run on the following input array?
        // Notice that the input array isn’t in sorted order. What can you say about the
        // binary search algorithm’s result?

        // int[] numbers = {6, 5, 8, 19, 7, 35, 22, 11, 9};
        //Honestly the search algothm wont work, its simply just not sorted. It has NO IDEA where to look because 8 could now be in any position.

        // 23. What modifications would you have to make to the selectionSort method to
        // cause it to sort an array of double values rather than one of integer values?

        //use a hashmap instead.

        // 24. Consider the following array:

        // int[] numbers = {29, 17, 3, 94, 46, 8, –4, 12};
        // After a single pass of the selection sort algorithm (a single swap), what
        // would be the state of the array?

        // A. {–4, 29, 17, 3, 94, 46, 8, 12}
            //[-4, 3, 8, 12, 17, 29, 46, 94]

        // B. {29, 17, 3, 94, 46, 8, 12}
            //[3, 8, 12, 17, 29, 46, 94]

        // C. {–4, 29, 17, 3, 94, 46, 8, –4, 12}
            //[-4, -4, 3, 8, 12, 17, 29, 46, 94]

        // D. {–4, 17, 3, 94, 46, 8, 29, 12}
            //[-4, 3, 8, 12, 17, 29, 46, 94]

        // E. {3, 17, 29, 94, –4, 8, 46, 12}
            //[-4, 3, 8, 12, 17, 29, 46, 94]

        // 25. Trace the execution of the selection sort algorithm as shown in this
        // section when run on the following input arrays.
        // Show each element that will be selected by the algorithm and where it will be
        // moved, until the array is fully sorted.

        // A. {29, 17, 3, 94, 46, 8, –4, 12}
        /*
        Checks 17 < 29
        Checks 3 is < 17
        Checks -4 is < 3
        Swapping Array [29, 17, 3, 94, 46, 8, -4, 12] with index 0 and min index at 6
        New Array: [-4, 17, 3, 94, 46, 8, 29, 12]
        Checks 3 is < 17
        Swapping Array [-4, 17, 3, 94, 46, 8, 29, 12] with index 1 and min index at 2
        New Array: [-4, 3, 17, 94, 46, 8, 29, 12]
        Checks 8 is < 17
        Swapping Array [-4, 3, 17, 94, 46, 8, 29, 12] with index 2 and min index at 5
        New Array: [-4, 3, 8, 94, 46, 17, 29, 12]
        Checks 46 is < 94
        Checks 17 is < 46
        Checks 12 is < 17
        Swapping Array [-4, 3, 8, 94, 46, 17, 29, 12] with index 3 and min index at 7
        New Array: [-4, 3, 8, 12, 46, 17, 29, 94]
        Checks 17 is < 46
        Swapping Array [-4, 3, 8, 12, 46, 17, 29, 94] with index 4 and min index at 5
        New Array: [-4, 3, 8, 12, 17, 46, 29, 94]
        Checks 29 is < 46
        Swapping Array [-4, 3, 8, 12, 17, 46, 29, 94] with index 5 and min index at 6
        New Array: [-4, 3, 8, 12, 17, 29, 46, 94]
        Swapping Array [-4, 3, 8, 12, 17, 29, 46, 94] with index 6 and min index at 6
        New Array: [-4, 3, 8, 12, 17, 29, 46, 94]
        */

        // B. {33, 14, 3, 95, 47, 9, –42, 13}
        /*
        Checks 14 is < 33
        Checks 3 is < 14
        Checks -42 is < 3
        Swapping Array [33, 14, 3, 95, 47, 9, -42, 13] with index 0 and min index at 6
        New Array: [-42, 14, 3, 95, 47, 9, 33, 13]
        Checks 3 is < 14
        Swapping Array [-42, 14, 3, 95, 47, 9, 33, 13] with index 1 and min index at 2
        New Array: [-42, 3, 14, 95, 47, 9, 33, 13]
        Checks 9 is < 14
        Swapping Array [-42, 3, 14, 95, 47, 9, 33, 13] with index 2 and min index at 5
        New Array: [-42, 3, 9, 95, 47, 14, 33, 13]
        Checks 47 is < 95
        Checks 14 is < 47
        Checks 13 is < 14
        Swapping Array [-42, 3, 9, 95, 47, 14, 33, 13] with index 3 and min index at 7
        New Array: [-42, 3, 9, 13, 47, 14, 33, 95]
        Checks 14 is < 47
        Swapping Array [-42, 3, 9, 13, 47, 14, 33, 95] with index 4 and min index at 5
        New Array: [-42, 3, 9, 13, 14, 47, 33, 95]
        Checks 33 is < 47
        Swapping Array [-42, 3, 9, 13, 14, 47, 33, 95] with index 5 and min index at 6
        New Array: [-42, 3, 9, 13, 14, 33, 47, 95]
        Swapping Array [-42, 3, 9, 13, 14, 33, 47, 95] with index 6 and min index at 6
        New Array: [-42, 3, 9, 13, 14, 33, 47, 95]
        */

        // C. {7, 1, 6, 12, –3, 8, 4, 21, 2, 30, –1, 9}
        /*
        Checks 1 is < 7
        Checks -3 is < 1
        Swapping Array [7, 1, 6, 12, -3, 8, 4, 21, 2, 30, -1, 9] with index 0 and min index at 4
        New Array: [-3, 1, 6, 12, 7, 8, 4, 21, 2, 30, -1, 9]
        Checks -1 is < 1
        Swapping Array [-3, 1, 6, 12, 7, 8, 4, 21, 2, 30, -1, 9] with index 1 and min index at 10
        New Array: [-3, -1, 6, 12, 7, 8, 4, 21, 2, 30, 1, 9]
        Checks 4 is < 6
        Checks 2 is < 4
        Checks 1 is < 2
        Swapping Array [-3, -1, 6, 12, 7, 8, 4, 21, 2, 30, 1, 9] with index 2 and min index at 10
        New Array: [-3, -1, 1, 12, 7, 8, 4, 21, 2, 30, 6, 9]
        Checks 7 is < 12
        Checks 4 is < 7
        Checks 2 is < 4
        Swapping Array [-3, -1, 1, 12, 7, 8, 4, 21, 2, 30, 6, 9] with index 3 and min index at 8
        New Array: [-3, -1, 1, 2, 7, 8, 4, 21, 12, 30, 6, 9]
        Checks 4 is < 7
        Swapping Array [-3, -1, 1, 2, 7, 8, 4, 21, 12, 30, 6, 9] with index 4 and min index at 6
        New Array: [-3, -1, 1, 2, 4, 8, 7, 21, 12, 30, 6, 9]
        Checks 7 is < 8
        Checks 6 is < 7
        Swapping Array [-3, -1, 1, 2, 4, 8, 7, 21, 12, 30, 6, 9] with index 5 and min index at 10
        New Array: [-3, -1, 1, 2, 4, 6, 7, 21, 12, 30, 8, 9]
        Swapping Array [-3, -1, 1, 2, 4, 6, 7, 21, 12, 30, 8, 9] with index 6 and min index at 6
        New Array: [-3, -1, 1, 2, 4, 6, 7, 21, 12, 30, 8, 9]
        Checks 12 is < 21
        Checks 8 is < 12
        Swapping Array [-3, -1, 1, 2, 4, 6, 7, 21, 12, 30, 8, 9] with index 7 and min index at 10
        New Array: [-3, -1, 1, 2, 4, 6, 7, 8, 12, 30, 21, 9]
        Checks 9 is < 12
        Swapping Array [-3, -1, 1, 2, 4, 6, 7, 8, 12, 30, 21, 9] with index 8 and min index at 11
        New Array: [-3, -1, 1, 2, 4, 6, 7, 8, 9, 30, 21, 12]
        Checks 21 is < 30
        Checks 12 is < 21
        Swapping Array [-3, -1, 1, 2, 4, 6, 7, 8, 9, 30, 21, 12] with index 9 and min index at 11
        New Array: [-3, -1, 1, 2, 4, 6, 7, 8, 9, 12, 21, 30]
        Swapping Array [-3, -1, 1, 2, 4, 6, 7, 8, 9, 12, 21, 30] with index 10 and min index at 10
        New Array: [-3, -1, 1, 2, 4, 6, 7, 8, 9, 12, 21, 30]
        */

        // D. {6, 7, 4, 8, 11, 1, 10, 3, 5, 9}
        /*
        Checks 4 is < 6
        Checks 1 is < 4
        Swapping Array [6, 7, 4, 8, 11, 1, 10, 3, 5, 9] with index 0 and min index at 5
        New Array: [1, 7, 4, 8, 11, 6, 10, 3, 5, 9]
        Checks 4 is < 7
        Checks 3 is < 4
        Swapping Array [1, 7, 4, 8, 11, 6, 10, 3, 5, 9] with index 1 and min index at 7
        New Array: [1, 3, 4, 8, 11, 6, 10, 7, 5, 9]
        Swapping Array [1, 3, 4, 8, 11, 6, 10, 7, 5, 9] with index 2 and min index at 2
        New Array: [1, 3, 4, 8, 11, 6, 10, 7, 5, 9]
        Checks 6 is < 8
        Checks 5 is < 6
        Swapping Array [1, 3, 4, 8, 11, 6, 10, 7, 5, 9] with index 3 and min index at 8
        New Array: [1, 3, 4, 5, 11, 6, 10, 7, 8, 9]
        Checks 6 is < 11
        Swapping Array [1, 3, 4, 5, 11, 6, 10, 7, 8, 9] with index 4 and min index at 5
        New Array: [1, 3, 4, 5, 6, 11, 10, 7, 8, 9]
        Checks 10 is < 11
        Checks 7 is < 10
        Swapping Array [1, 3, 4, 5, 6, 11, 10, 7, 8, 9] with index 5 and min index at 7
        New Array: [1, 3, 4, 5, 6, 7, 10, 11, 8, 9]
        Checks 8 is < 10
        Swapping Array [1, 3, 4, 5, 6, 7, 10, 11, 8, 9] with index 6 and min index at 8
        New Array: [1, 3, 4, 5, 6, 7, 8, 11, 10, 9]
        Checks 10 is < 11
        Checks 9 is < 10
        Swapping Array [1, 3, 4, 5, 6, 7, 8, 11, 10, 9] with index 7 and min index at 9
        New Array: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11]
        Swapping Array [1, 3, 4, 5, 6, 7, 8, 9, 10, 11] with index 8 and min index at 8
        New Array: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11]  
        */
    }
    
}
