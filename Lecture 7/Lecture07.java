
class Lecture07 {

    public static void main(String[] args) {
        System.out.println("Hello from lecture 07");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments
        // Put your answer for #8 here:
        //A stack is the order in which the processes are completed in. This relates to reccursion. Think of a recursive method like a pez dispenser.
        //Every time we call the pez dispenser we add one candy to dispenser.
        // Put your answer for #9 here:
        // 9. What would be the effect if the code for the reverse method were changed to the following?
        // public static void reverse(Scanner input) {
        //     if (input.hasNextLine()) {
        //         // recursive case (nonempty file)
        //         String line = input.nextLine();
        //         System.out.println(line);     // swapped order
        //         reverse(input);               // swapped order
        //     }
        // }
        //The satck would buid up before printing anything out. It would run until end of file, instead of printing line by line it will print end of file and then work its way backwards.
        // Put your answer for #10 here:
        // 10. What would be the effect if the code for the reverse method were changed to the following?
        // public static void reverse(Scanner input) {
        //     if (input.hasNextLine()) {
        //         // recursive case (nonempty file)
        //         reverse(input);                      // moved this line
        //         String line = input.nextLine();
        //         System.out.println(line);
        //     }
        // }
        //This would infinite loop because what would happen is its online checking if the file has next line and then recursive case into if it has next line, into has next line. Its saying Hey Does 1 goto 2? cool, check if 1 goes to 2 again. Only nextLine() checks the scanner for next line.
        // Put your answer for #11 here:
        //The following method is an attempt to write a recursive pow method to compute exponents. What is wrong with the code? How can it be fixed?
        // public static int pow(int x, int y) {
        //     return x * pow(x, y - 1);
        // }
        //You can fix this by not allowing y to be zero, whats gonna happen is that its gonna loop infinitely and head into the negatives and make x zero. 
        //you can add a
        /*
        if (y > 0){
            x *= pow(x, y - 1)

        }
        return x;
         */
        // Put your answer for #17 here:
        // 17. The following method has a bug that leads to infinite recursion. What correction fixes the code?
        //Adds the digits of the given number.
        //Example: digitSum(3456) returns 3+4+5+6 = 18
        // public static int digitSum(int n) {
        //     if (n > 10) {
        //         // base case (small number)
        //         return n;
        //     } else {
        //         // recursive case (large number)
        //         return n % 10 + digitSum(n / 10);
        //     }
        // }
        //turn the n > 10 ino n < 10, for small numbers
        // EXERCISES:
        // Put your answer for #1 here:

        /*
        1. Write a recursive method called starString that accepts an integer as a parameter and prints to the console a string of stars (asterisks) that is 2n (i.e., 2 to the nth power) long. For example,

            starString(0) should print * (because 20 == 1)
            starString(1) should print ** (because 21 == 2)
            starString(2) should print **** (because 22 == 4)
            starString(3) should print ******** (because 23 == 8)
            starString(4) should print **************** (because 24 == 16)

        The method should throw an IllegalArgumentException if passed a value less than 0.
         */
        starString(4);

        // Put your answer for #2 here:
        // Put your answer for #3 here:
        // Put your answer for #10 here:
        // Put your answer for #12 here:
    }

    public static void starString(int s) throws IllegalArgumentException {
        if (s >= 1) {
            System.out.print("**");
            if ((s - 1) > 0) {
                starString(s - 1);
            }
        } else if (s == 0) {
            System.out.print("*");
        } else {
            throw new IllegalArgumentException("Value cannot be less than the value 0");
        }
    }
}
