
import java.util.*;
//Lecture 5 by William Mentzer

class Lecture05 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 05");

        // Self-Check Problems:
        // From Section 11.3:
        // 16. Write the code to declare a Map that associates people’s names with their
        // ages.
        // Add mappings for your own name and age, as well as those of a few friends or
        // relatives.

        Map<String, Integer> nameAgeMap = new TreeMap<>();
        nameAgeMap.put("John", 100);
        nameAgeMap.put("Doe", 200);
        nameAgeMap.put("Jimmy", 40);
        nameAgeMap.put("Johns", 30);
        System.out.println(nameAgeMap.get("John").toString());
        System.out.println(nameAgeMap.values());
        System.out.println(nameAgeMap.size());

        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.print("("+ key + " : " + value + ") |  ");
            
        }

        System.out.println();
        // 18. What keys and values are contained in the following map after this code
        // executes?

        Map<Integer, String> map = new HashMap<>();
        map.put(8, "Eight");
        map.put(41, "Forty-one");
        map.put(8, "Ocho");
        map.put(18, "Eighteen");
        map.put(50, "Fifty");
        map.put(132, "OneThreeTwo");
        map.put(28, "Twenty-eight");
        map.put(79, "Seventy-nine");
        map.remove(41);
        map.remove(28);
        map.remove("Eight");
        map.put(50, "Forty-one");
        map.put(28, "18");
        map.remove(18);

         for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.print("("+ key + " : " + value + ") |  ");
            
        }

        //Im gonna go out on a limb and say first that its a hash map, its gonna be innately disorganized so i cant just copy paste the same display i used for my first treemap and have it be the same every time.
        //Regardless i can tel you the values that will be on in the map itself which i hope is good enough.

        //(8,Ocho),(132,OneThreeTwo),(79, Seventy-nine), (50, Forty-One), (28, 18)

        // 19. Write the output produced when the following method is passed each of the
        // following maps:

        // public static void mystery(Map<String, String> map) {
        // Map<String, String> result = new TreeMap<>();
        // for (String key : map.keySet()) {
        // if (key.compareTo(map.get(key)) < 0) {
        // result.put(key, map.get(key));
        // } else {
        // result.put(map.get(key), key);
        // }
        // }
        // System.out.println(result);
        // }
        // {two=deux, five=cinq, one=un, three=trois, four=quatre}
        // {skate=board, drive=car, program=computer, play=computer}
        // {siskel=ebert, girl=boy, H=T, ready=begin, first=last, begin=end}
        // {cotton=shirt, tree=violin, seed=tree, light=tree, rain=cotton}


        // Exercises:
        // 6. Write a method countUnique that accepts a list of integers as a parameter
        // and returns the number of unique integer values in the list.
        // Use a set as auxiliary storage to help you solve this problem. For example,
        // if a list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method
        // should return 5. The empty list contains 0 unique values.

        ArrayList<Integer> ints = new ArrayList<>();


        // 7. Write a method countCommon that accepts two lists of integers as
        // parameters and returns the number of unique integers that occur in both
        // lists.
        // Use one or more sets as storage to help you solve this problem. For example,
        // if one list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the
        // other list contains the values [–5, 15, 2, –1, 7, 15, 36], your method should
        // return 4 because the elements –1, 2, 7, and 15 occur in both lists.

        // 8. Write a method maxLength that accepts a set of strings as a parameter and
        // that returns the length of the longest string in the list.
        // If your method is passed an empty set, it should return 0.

        // 9. Write a method hasOdd that accepts a set of integers as a parameter and
        // returns true if the set contains at least one odd integer and false
        // otherwise.
        // If passed the empty set, your method should return false.

        // 10. Write a method removeEvenLength that accepts a set of strings as a
        // parameter and that removes all of the strings of even length from the set.

    }
}
