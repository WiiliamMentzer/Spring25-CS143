public class ClassInAnotherFile {
   private int x;
   private int y;
   private int z;
   
   public ClassInAnotherFile(int _x, int _y, int _z) {
      x = _x;
      y = _y;
      z = _z;
   }

   public void print() {
      System.out.println("x: " + x );
      System.out.println("y: " + y );
      // TRY ADDING AND REMOVING THIS LINE, AND SEE IF jGRASP "NOTICES" THE CHANGE WHEN YOU RUN LECTURE01.JAVA
      // System.out.println("z: " + z );
   }

}
