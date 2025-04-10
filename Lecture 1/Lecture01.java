import java.util.*;

class Lecture01 {
   public static void main(String[] args) {
      System.out.println("Hello from lecture 01");

      // SELF-CHECK PROBLEMS:
      // Note: you may need to put some of your answers inside comments

      // Put your answer for #1 here:
      //
      // Copy and paste the output from when you first cloned (downloaded) and ran
      // this program
      // (in other words, when you run this program, what does it print?
      // Copy that output into this file, right here, in a comment

      /*
      Hello from lecture 01
      Point p1 is at: ( 1.0, 1.0 )
      Point p2 is at: ( 4.0, 7.0 )
      Distance between them is: 17.48528137423857
      p2 is closer to the origin
      p3 is closer to the origin
      */

      // Where did you find information to help you with this question?
      // One way might be to locate where in the textbook are the main topics for this question covered.
      // You also might find information online

      //I found this information from the terminal after i ran the program?

      // Put your answer for #2 here:
      // Where did you find information to help you with this question?
      for (int i = 1; i <= 100; i++) {
         System.out.print(i);
      }
      //Last quarter's lectures from CS142

      // Put your answer for #3 here:
      // Where did you find information to help you with this question?
      for (int i = 0; i < 6; i++) {
         for (int j = 0; j < i; j++) {
             System.out.print("*");
         }
         System.out.println();
      }

      // Put your answer for #4 here:
      // Where did you find information to help you with this question?
      Scanner userInput = new Scanner(System.in);
      System.out.println("How many rows would you like to print? ");
      int totalNum = userInput.nextInt();
      System.out.println(totalNum);
      for (int i = 0; i < totalNum; i++) {
         for (int j = 0; j < i+1; j++) {
             System.out.print(j + " ");
         }
         System.out.println();
      }


      // Put your answer for #5 here:
      // Where did you find information to help you with this question?

      System.out.println("How many grades would you like to store? ");
      Double[] gradeArr = new Double[userInput.nextInt()];
      for (int i = 0; i < gradeArr.length; i++) {
          System.out.println("Next grade? ");
         gradeArr[i] = userInput.nextDouble();
      }
      double gradeAverage = 0.0;
      for (int i = 0; i < gradeArr.length; i++) {
          gradeAverage += gradeArr[i];
      }
      gradeAverage /= gradeArr.length;
      System.err.println("The average grade is " + gradeAverage);


      // Put your answer for "printf debugging - an example" here:
      // Leave a comment here that describes how the version with the printing helped you to figure out what was going wrong with the code

      // Where did you find information to help you with this question?


      // You will need to UNcomment the following code, then run it, to figure out the error
      float sum1 = buggyCodeNoPrinting( 2.0f );
      System.out.println("Sum from 0 to 2 is: " + sum1);

      float sum2 = buggyCodeWithPrinting( 2.0f );
      System.out.println("Sum from 0 to 2 is: " + sum2);


      // Put your answer for "Adding your own printf debugging statements" here:
      DebuggingExercise();
      // First, add a bunch of System.out.println statements to DebuggingExercise() and the Point class to help you
      // identify an error(s).

      // Second, leave a comment here that describes how the print statements helped you to figure out what was going wrong with the code

      // Where did you find information to help you with this question?


      // Put your answer for "Working with multiple files in jGRASP" here:
      // UNcomment the following lines of code, then run this file, then try changing ClassInAnotherFile and re-run THIS file.  Did jGRASP pick up the changes?
      // ClassInAnotherFile didItChange = new ClassInAnotherFile(1, 2, 3);
      // didItChange.print();

      // Leave leave your quick comment here explaining what you needed to do in order to make a change in ClassInAnotherFile.java,
      // but still have this main() method here in Lecture01.java use that newly changed version.


      // Put your answer for #6 here:
      // Where in the textbook are the main topics for this question covered?
      // NOTE: The definition of the Food class should go OUTSIDE the Lecture01
      // class. A good place to put this is at the end of the file.
      // NOTE 2: Make sure that you create a couple of Food objects here in main()
      // and test out all the methods that you write.
      //
      // For here in Lecture 01 you'll be given some code to test out your class:
      // (If you name your methods differently then modify this code so it compiles and runs)
      //
      //Food candy = new Food("Candy", 7, 4.5);
      //System.out.println("Name: " + candy.getName() ); // make sure this prints Candy
      //candy.setName("Candy Cane");
      //System.out.println("Name: " + candy.getName() ); // make sure this prints Candy Cane
      //candy.print(); // make sure it prints out Candy Cane, 7 calories, 4.5 rating

      // If you added getCalories/setCalories then add code to make sure they work
      // If you added getRating/setRating then add code to make sure they work
   }


   public static float buggyCodeNoPrinting( float upTo ) {
      float f = 0.0f;
      float sum = 0.0f;

      while( f <= upTo ) {
         sum += f;
         f += 0.1f;
      }

      return sum;
   }

   public static float buggyCodeWithPrinting( float upTo ) {
      System.out.println("====== buggyCodeWithPrinting");
      float f = 0.0f;
      float sum = 0.0f;

      System.out.println("upTo: " + upTo + " f: " + f + " sum: " + sum);

      while( f <= upTo ) {
         sum += f;
         f += 0.1f;
         System.out.println("upTo: " + upTo + " f: " + f + " sum: " + sum);
      }

      System.out.println("Got a sum of: " + sum);
      return sum;
   }

   // Make sure that you leave your System.out.println statements here in DebuggingExercise() !!
   public static void DebuggingExercise() {
      Point p1 = new Point(1, 1);
      Point p2 = new Point (4, 7);
      Point p3 = new Point(4, 7);
      Point origin = new Point(0, 0);

      System.out.println("Point p1 is at: " + p1 );
      System.out.println("Point p2 is at: " + p2 );

      double dist = p1.distanceBetween(p2);
      System.out.println("Distance between them is: " + dist );

      double p1DistToOrigin = origin.distanceBetween( p1 );
      double p2DistToOrigin = origin.distanceBetween( p1 );

      if( p1DistToOrigin < p2DistToOrigin ) {
         System.out.println("p1 is closer to the origin");
      } else {
         System.out.println("p2 is closer to the origin");
      }

      p2DistToOrigin = origin.distanceBetween( p2 );
      double p3DistToOrigin = origin.distanceBetween( p3 );

      if( p2DistToOrigin < p3DistToOrigin ) {
         System.out.println("p2 is closer to the origin");
      } else {
         System.out.println("p3 is closer to the origin");
      }
   }

}

// Placing the Food class below this line is a good place for it
class Food {
    // Put your code for the constructor, getName/setName, and print methods here
    // Optionally, you can also write getCalories/setCalories, and get/setRating
}

// This is used in one of the 'printf debugging' exercises
// Make sure that you leave your System.out.println statements and here in the Point class !!
class Point {
   private double x;
   private double y;

   public Point(double _x, double _y) {
      x = _x;
      y = _y;
   }

   public String toString() {
      return "( " + x + ", " + y + " )";
   }

   public double distanceBetween( Point otherPoint ) {
      double dist = 0.0;
      double a = this.x - otherPoint.x;
      a = Math.sqrt( Math.abs( a ) );
      double aa = this.y - otherPoint.y;
      aa = Math.sqrt( Math.abs( aa ) );
      double b = this.x - otherPoint.y;
      b = Math.sqrt( b );
      double c = a + aa;
      c = Math.pow( c, 2 );
      // Now we have things the way we want them

      return c;
   }


}
