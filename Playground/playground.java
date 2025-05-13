import java.util.ArrayList;

class playground {
    public static void main(String[] args) {
        System.out.println(5*1.25);

        Integer n1 = 15;
        Integer n2 = 70;
        Integer n3 = 15;
        String s1 = "computer";
        String s2 = "car";
        String s3 = "pencil";

        System.out.println(n2.compareTo(n1));
        //Positive
        System.out.println(n1.compareTo(n3));
        //Zero
        System.out.println(s1.compareTo(s2));
        //Positive
        System.out.println(s1.compareTo(s3));
        //Negative
        System.out.println(s2.compareTo(s2));
        //Zero

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 5; i >= 1; i--) {
        list.add(i);
        }
        //List now has [5 4 3 2 1]
        System.out.println(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
        list.add(i, 24);
        }
        //Now its 5 24s in indexes 0-4 and 5 4 3 2 1 in 5-9
        System.out.println(list); 
        // what does this print?

        ArrayList<String> strArrList = new ArrayList<>();

        strArrList.add("YES");
        strArrList.add("YES");
        strArrList.add("YES");
        strArrList.add("YES");
        strArrList.add("IS");
        strArrList.add("NO");
        strArrList.add("NO");
        strArrList.add("NO");
        strArrList.add("NO");

        System.out.println(strArrList.contains("IS"));


        for (int i=0; i < strArrList.size(); i++) {
            if(strArrList.get(i) == "IS"){
                System.out.println("FOUND IS AT INDEX: " + i);
            }
        }
        mystery(321);
        //Prints 321
        //if 321 >= 3
        //Mystery(n/10) = 32
        //prints 32
        //if 32 >= 3
        //Mystery(n/10) = 3
        //if 3 >= 3
        //Mystery(n/10) = 0
        //prints 0
        //if 0 % 2 != 0
        //false prints -
        //if 3%2 != 0
        //true prints +
        //if 32%2 != 0
        //False prints -
        //if 321 % 2 != 0
        //true prints +
        System.out.println("");
        System.out.println("End result: " + foo(5));
        //fails if f >= 8
        //Prints Handed: 5
        //creates int;
        //if 5%2 == 0
        //false brings i = foo(5+1)
        //prints handed: 6
        //if 6%2 == 0
        //true brings i=foo(6+2)
        //If f >= 8 true; return f
        //i is = 8 from foo(6+2)
        //Prints Return Value: 8
        //returns 8
        //Stack prints Return Value: 8
        //Finally prints End Result: 8
    }
    public static void mystery(int n) {
        System.out.print(n);
        if (n >= 3) {
        mystery(n / 10);
        }
        if (n % 2 != 0) {
        System.out.print("+");
        } else {
        System.out.print("-");
        }
    }

    public static int foo(int f) {
        if (f >= 8){
        return f;
        }
        System.out.println("Handed " + f);
        int i;
        if (f % 2 == 0)
        i = foo(f + 2);
        else
        i = foo(f + 1);
        System.out.println("Return value: " + i);
        return i;
    }
}
