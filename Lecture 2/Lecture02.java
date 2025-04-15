import java.util.ArrayList;
import java.util.Arrays;


//Lecture 2
//By William Mentzer for CS143 - Thanks for having me another quarter, cant wait for the rest of the fun this quarter!
class Lecture02 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 02");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("It", "was", "a", "stormy", "night"));
        //["It", "was", "a", "stormy", "night"]
        System.out.println(list.toString());
        
        // Put your answer for #1 here:
        // 1. What is an ArrayList? In what cases should you use an ArrayList rather
        // than an array?
        //You would want to create an ArrayList when storing objects and when you need an array that can fluctuate in size.
        // Do note that i know primatives can be turned into objects via wrappers so it isnt an object vs primative duel its mainly due to the fluctuating size.

        // Put your answer for #3 here:
        // 3. Write the code to declare an ArrayList containing these elements. What is
        // the size of the list? What is its type?
        //The code in question creates a size of 4 but the index does start at 0 so reaching size 4 means you would need arrList[3] . The type is String. Since String is an object the arraylist is type string.

        // Put your answer for #4 here:
        // 4. Write code to insert two additional elements, "dark" and "and", at the
        // proper places in the list to produce the following ArrayList as the result:
        // ["It", "was", "a", "dark", "and", "stormy", "night"]

        //You need to add it to spot 4 (index 3 in this instance) and then add "and" to spot 5 (index 4).
        list.add(3, "dark");
        list.add(4, "and");
        System.out.println(list.toString());

        

        // Put your answer for #5 here:
        // 5. Write code to change the second element’s value to "IS", producing the
        // following ArrayList as the result:
        // ["It", "IS", "a", "dark", "and", "stormy", "night"]

        //Use set in spot 2 (index 1) to replace was with IS
        list.set(1, "IS");
        System.out.println(list.toString());

        // Put your answer for #7 here:
        // 7. Write code to declare an ArrayList holding the first 10 multiples of 2: 0,
        // 2, 4,..., 18. Use a loop to fill the list with the proper elements.
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i=0; i < 10; i++) {
            numList.add(2 * i);
        }

        System.out.println(numList.toString());

        // Put your answer for #9 here:
        // 9. Write code to print out whether or not a list of Strings contains the
        // value "IS". Do not use a loop.
        System.out.println(list.contains("IS"));
        list.contains("IS");


        // Put your answer for #14 here:
        // 14. What is a wrapper class? Describe the difference between an int and an
        // Integer.
        
        //HUGE DIFFERENCE, a prmative gets wrapped in a wrapper and turns it into an object reference type instead of a prative value type. an int is the primative version and an Integer is the wrapper that envelops the int and turns it into an object.

        // Put your answer for #13 here:
        // 13. The code that follows does not compile. Why not? Explain how to fix it.

        //Huge mistake using int instead of Integer, also added  new ArrayList<Integer> im kind of curious if you can make an array list, empty it our and then assign it any object you want or if you have to put ints since you initially declare it as an Integer type. Does it inhereit the Integer from the getgo?

        //OLD: ArrayList<int> numbers = new ArrayList<>();
        //NEW:
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add(19);
        System.out.println(numbers);

        // Put your answer for #15 here:
        // 15. Write the output produced when the following method is passed each of the
        // following lists:

        // A. [2, 6, 1, 8]
        // B. [30, 20, 10, 60, 50, 40]
        // C. [-4, 16, 9, 1, 64, 25, 36, 4, 49]

        /*

        A: [1, 2, 6, 8]
        B: [10, 30, 40, 20, 60, 50]
        C: [-4, 1, 25, 4, 16, 9, 64, 36, 49]

        */
    }
}
