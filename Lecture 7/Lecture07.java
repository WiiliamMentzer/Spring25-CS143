
class Lecture07 {
    //Lecture 7 by William Mentzer

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
        System.out.println();

        // Put your answer for #2 here:

        //2. Write a method called writeNums that takes an integer n as a parameter and prints to the console the first n integers starting with 1 in sequential order, separated by commas. 

        writeNums(5);
        System.out.println();


        // Put your answer for #3 here:

        /*
        3. Write a method called writeSequence that accepts an integer n
        as a parameter and prints to the console a symmetric sequence of n numbers composed of descending integers that ends in 1,
        followed by a sequence of ascending integers that begins with 1.  
        */

        writeSequence(5);
        System.out.println();

        // Put your answer for #10 here:
        System.out.println(digitMatch(12, 12));

        // Put your answer for #12 here:
        System.out.println(isReverse("OHIO", "OIHO"));

    }

    public static void writeSequence(int n) throws IllegalArgumentException {
        int instancedInt = 0;

        if (n < 1) {
            throw new IllegalArgumentException("Value cannot be less than 1");
        }

        if (n%2 != 0){
            instancedInt = (n+1)/2;
        } else {
            instancedInt = n/2;
        }

        System.out.print(instancedInt + " ");

        if (n-2 > 1) {
            writeSequence(n-2);
        } else if (n%2 != 0){
            System.out.print(1 + " ");
        }

        System.out.print(instancedInt + " ");
    }

    public static int digitMatch(int n1, int n2) throws IllegalArgumentException {
        if (n1 < 0 || n2 < 0){
            throw new IllegalArgumentException("NO NEGATIVE VALUES ALLOWED");
        } else if (n1 == 0 && n2 == 0){
            return 1;
        } else {
            //Create bank of instanced numbers that match
            int totalNum = 0;
            //Check last digit
            if(n1%10 == n2%10) {
                totalNum++;
            }
            //Check if number has ended and return 0 if no match
            if (n1 / 10 == 0 || n2 / 10 == 0){
                return totalNum;
            }
            return totalNum + digitMatch(n1/10, n2/10);
        }
        //Where was all this recursive gameplay when we were learning recursion?
        //I miss maps if i dont start using them again i just might forget them.
    }

    public static Boolean isReverse(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        StringBuilder strTrans1 = new StringBuilder(s1);
        StringBuilder strTrans2 = new StringBuilder(s2);
        //Ruled out any oopsies with casing
        if (strTrans1.length() != strTrans2.length()) {
            return false;
        } else {
            if (strTrans1.charAt(0) != strTrans2.charAt(strTrans2.length()-1) && strTrans1.length() > 1) {
                return false;
            } else if (strTrans1.length() == 1 && strTrans1.charAt(0) == strTrans2.charAt(0)) {
                return true;
            } else {
                strTrans1.deleteCharAt(0);
                strTrans2.deleteCharAt(strTrans2.length()-1);
                return isReverse(strTrans1.toString(), strTrans2.toString());
            }
        }
    }


    public static void writeNums(int n) throws IllegalArgumentException {
        if ( n < 1 ){
            throw new IllegalArgumentException("Value cannot be less than 1");
        } else {
            if (n > 1) {
                writeNums(n-1);
                System.out.print(", ");
            }
            System.out.print(n);
        }
    }


    public static void starString(int s) throws IllegalArgumentException {
        if (s >= 1) {
            for (int i = s-1; i > 0 ; i--){
                System.out.print("**");
            }
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
