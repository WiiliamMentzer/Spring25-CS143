
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
        System.out.println();

        //Im gonna go out on a limb and say first that its a hash map, its gonna be innately disorganized so i cant just copy paste the same display i used for my first treemap and have it be the same every time.
        //Regardless i can tel you the values that will be on in the map itself which i hope is good enough.

        //(8,Ocho),(132,OneThreeTwo),(79, Seventy-nine), (50, Forty-One), (28, 18)

        // 19. Write the output produced when the following method is passed each of the
        // following maps:

        // public static void mystery(Map<String, String> map) {
        // Map<String, String> result = new TreeMap<>();
        // for (String key : map.keySet()) {
        //     if (key.compareTo(map.get(key)) < 0) {
        //     result.put(key, map.get(key));
        //     } else {
        //     result.put(map.get(key), key);
        //     }
        // }
        // System.out.println(result);
        // }

        // {two=deux, five=cinq, one=un, three=trois, four=quatre}
        // {skate=board, drive=car, program=computer, play=computer}
        // {siskel=ebert, girl=boy, H=T, ready=begin, first=last, begin=end}
        // {cotton=shirt, tree=violin, seed=tree, light=tree, rain=cotton}
        
        /*
            This should in turn Create a new map, then take each key value from the original map.
            IF the original key is shorter than the value of the mapped key's value, copy the pair to the result.
            If the length of the original key is longer than value of the pair, swap the key and value and copy it to results.
            Its basically making shorter word first, then longer number.

            Results: (not in order of how tree map sorts through puts. Just the values that are gonna be in it.)
            {two=deux, five=cinq, un=one, three=trois, four=quatre}
            {skate=board, car=drive, program=computer, computer=play}
            {ebert=siske, boy=girl, H=T, ready=begin, last=first, end=beginning}
        */

        // Exercises:
        // 6. Write a method countUnique that accepts a list of integers as a parameter
        // and returns the number of unique integer values in the list.
        // Use a set as auxiliary storage to help you solve this problem. For example,
        // if a list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method
        // should return 5. The empty list contains 0 unique values.

        ArrayList<Integer> arrListStore = new ArrayList<>();
        arrListStore.add(3);
        arrListStore.add(7);
        arrListStore.add(3);
        arrListStore.add(-1);
        arrListStore.add(2);
        arrListStore.add(3);
        arrListStore.add(7);
        arrListStore.add(2);
        arrListStore.add(15);
        arrListStore.add(15);

        Set<Integer> setStore1 = new HashSet<>();
        Iterator<Integer> iterate = arrListStore.iterator();
        while (iterate.hasNext()) {
            setStore1.add(iterate.next());
        }

        Integer uniqueNumIntegers = setStore1.size();

        System.out.println("Ints displayed here : " + setStore1);
        System.out.println("Unique Ints displayed here : " + uniqueNumIntegers);

        // 7. Write a method countCommon that accepts two lists of integers as
        // parameters and returns the number of unique integers that occur in both
        // lists.
        // Use one or more sets as storage to help you solve this problem. For example,
        // if one list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the
        // other list contains the values [–5, 15, 2, –1, 7, 15, 36], your method should
        // return 4 because the elements –1, 2, 7, and 15 occur in both lists.

        Set<Integer> blackListStore = new HashSet<>();

        ArrayList<Integer> arrListStore2 = new ArrayList<>();
        arrListStore2.add(-5);
        arrListStore2.add(15);
        arrListStore2.add(2);
        arrListStore2.add(-1);
        arrListStore2.add(7);
        arrListStore2.add(15);
        arrListStore2.add(36);

        System.out.println("Ints displayed here : " + setStore1);
        System.out.println("Ints displayed here : " + arrListStore2);

        Integer uniqueElementsInts = 0;

        Iterator<Integer> iterateSecondList = arrListStore2.iterator();
        while (iterateSecondList.hasNext()) {
            Integer currentTestNum = iterateSecondList.next();
            if( setStore1.contains(currentTestNum) && !blackListStore.contains(currentTestNum) ) {
                uniqueElementsInts++;
                blackListStore.add(currentTestNum);
            }
        }


        System.out.println("Unique Elements in both lists : " + uniqueElementsInts);

        // 8. Write a method maxLength that accepts a set of strings as a parameter and
        // that returns the length of the longest string in the list.
        // If your method is passed an empty set, it should return 0.

        Set<String> strSet = new HashSet<>();
        strSet.add("You");
        strSet.add("Should");
        strSet.add("play");
        strSet.add("Marathon(1994)");

        System.out.println("Strings displayed here : " + strSet);

        maxLength(strSet);





        // 9. Write a method hasOdd that accepts a set of integers as a parameter and
        // returns true if the set contains at least one odd integer and false
        // otherwise.
        // If passed the empty set, your method should return false.

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(12);
        integerSet.add(14);
        integerSet.add(16);
        integerSet.add(17);
        integerSet.add(20);
        integerSet.add(22);
        integerSet.add(24);

        System.out.println("Ints displayed here : " + integerSet);

        System.out.println(hasOdd(integerSet));


        // 10. Write a method removeEvenLength that accepts a set of strings as a
        // parameter and that removes all of the strings of even length from the set.


        Set<String> strSet2 = new HashSet<>();
        strSet2.add("wee");
        strSet2.add("we");
        strSet2.add("are");
        strSet2.add("ar");
        strSet2.add("all");
        strSet2.add("al");
        strSet2.add("==");
        strSet2.add("===");

        System.out.println("Strings displayed here : " + strSet2);

        strSet2 = removeEvenlength(strSet2);

        System.out.println("Strings displayed here after evens removal : " + strSet2);
    }

    public static Integer maxLength(Set<String> str) {
        System.out.println(str);
        Integer longestStringLength = 0;
        Iterator<String> iterateStringList = str.iterator();

        while(iterateStringList.hasNext()){
            String currInteratedString = iterateStringList.next();
            if(currInteratedString.length() > longestStringLength){
                longestStringLength = currInteratedString.length();
            }
        }
        System.out.println(longestStringLength);
        return longestStringLength;
    }


    public static Boolean hasOdd (Set<Integer> ints) {
        Boolean hasOddBoolean = false;
        Iterator<Integer> iterateIntList = ints.iterator();

        while(iterateIntList.hasNext()){
            Integer currInteratedInteger = iterateIntList.next();
            if(currInteratedInteger % 2 != 0){
                hasOddBoolean = true;
            }
        }
        return hasOddBoolean;
    }

    public static Set<String> removeEvenlength(Set<String> str){
        Iterator<String> iterateStringList = str.iterator();

        while(iterateStringList.hasNext()){
            String currInteratedString = iterateStringList.next();

            if(currInteratedString.length() % 2 == 0) {
                str.remove(currInteratedString);
                iterateStringList = str.iterator();
            }
        }
        return str;
    }

}
