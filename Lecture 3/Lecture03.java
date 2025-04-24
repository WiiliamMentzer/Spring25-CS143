//Lecture03 by William Mentzer

class Lecture03 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 03");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // 21. Consider the following variable declarations:
        // Integer n1 = 15;
        // Integer n2 = 7;
        // Integer n3 = 15;
        // String s1 = "computer";
        // String s2 = "soda";
        // String s3 = "pencil";

        // Indicate whether the result of each of the following comparisons is positive,
        // negative, or 0:

        // A:
        // n1.compareTo(n2)
        // B:
        // n3.compareTo(n1)
        // C:
        // n2.compareTo(n1)
        // D:
        // s1.compareTo(s2)
        // E:
        // s3.compareTo(s1)
        // F:
        // s2.compareTo(s2)

        // 22. Use the compareTo method to write code that reads two names from the
        // console and prints the one that comes first in alphabetical order. For
        // example, the program’s output might look like the following:

        // Type a name: Tyler Durden
        // Type a name: Marla Singer
        // Marla Singer goes before Tyler Durden

        // 23. Write code to read a line of input from the user and print the words of
        // that line in sorted order, without removing duplicates. For example, the
        // program output might look like the following:

        // Type a message to sort:  to be or not to be that is the question
        // Your message sorted: be be is not or question that the to to

        // EXERCISES:

        //  20. Implementing the compareTo method.
        //  The Canvas page for this ICE contains the details for this exercise.
        //  Remember that you'll need to put the code for the CalendarDate class somewhere
        //  else in this file (so that this file will compile).
        //  AND ALSO
        //  put code here (in main() ) that tests out your code.
        //
        //
        //  Some tests you should write code for:
        //  Create two CalendarDate objects and call CompareTo on them, and make sure that you're getting back the correct result.
        //  Try the following combinations:
        //  * Exact same date (same year, month, day)
        //  * Same year and month, but one is before the other.
        //      Make sure that compareTo returns a negative number,
        //      then reverse them and make sure that compareTo returns a positive number
        //  * Same year and day, but one month is before the other
        //      Make sure that compareTo return a negative number, then reverse the order and make sure you get back a positive number
        //  * Same year and one month is before the other make sure you still get the correct results from compareTo even when
        //      the earlier month has a day that is earlier than the other month
        //      the earlier month has a day that is LATER than the other month
        //          Again, for each of these two cases make sure you can get both negative and postive numbers correctly (so a total of 4 combinations)
        //  * One date has an earlier year than the other, but the same month & day
        //      Make sure you correctly get positive and negative return values
        //  * One date has an earlier year, and an earlier month (or a later month), and the same day
        //  * One date has an earlier year, and earlier month, and earlier day
        //
        //  Clearly, there are a lot of combinations that you can test here
        //  and, at the same time,
        //  there's few enough combintations that you can actually test more (or even all of them)
        //
    }
}

// Put your code for the CalendarDate class here
// Start by copying this from the Canvas page
// then modify the class to use the year as well as the month and day
