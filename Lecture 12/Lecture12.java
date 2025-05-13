import java.util.*;
class Lecture12 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 12");
        /*
        // Self-Check Problems:
        // Section 14.1: Stack/Queue Basics

        // 1. Which of the following statements about stacks and queues is true?
        
        // A. Stacks and queues can store only integers as their data.
           --FALSE, Stacks and queues can handle any object you put in, as long as you do something with it
        // B. A stack returns elements in the same order as they were added (first-in,
        // first-out).
           --FALSE, queue is FIFO
        // C. A queue’s remove method removes and returns the element at the front of the queue.
            --True, remove does remove the front value and returns it at the front of the queue
        // D. Stacks and queues are similar to lists, but less efficient.
            --False, Stacks and Queues use similar methods to lists, and not only that, they are efficient ass well at it too beign their own collection
        // E. The peek method allows access to the element at the bottom of a stack.
            --FALSE, looks at the TOP of the stack instead of the bottom.
        // 2. What is a real-world example of data that could be modeled using a stack?
        // Using a queue?
            --Stack: Picking up a tray in a dining hall, first in first out.
            --Queue: Elevator / line at disneyland where you are put into a QUEUE

        // 3. When you call push on a stack, where is the new element placed relative to
        // the other elements in the stack?
            --Straight to the top of the stack
        // When you call pop, which element from the stack is returned?
            --The top most element from the stack is returned

        // 4. When you call add on a queue, where is the new element placed relative to
        // the other elements in the queue?
            --To the end of the queue it goes when using add
        // When you call remove, which element from the queue is returned?
            --Remove will take the front element and remove it from the queue after returning the value.

        // 5. If you create a new empty stack and push the values 1, 2, and 3 in that
            -- (3, 2, 1)
        // order, and call pop on the stack once, what value will be returned?
            (2, 1)

        // 6. If you create a new empty queue and add the values 1, 2, and 3 in that
        // order, and call remove on the queue once, what value will be returned?
            --(1, 2, 3)
            --remove 
            --(2, 3)
        
        // Section 14.2: Common Stack/Queue Operations

        // 12. Stacks and queues have less functionality than other similar collections
        // like lists and maps.
        // Why are they still useful despite lacking functionality? What possible
        // advantages are there of using a less powerful collection?

        --They are increadibly efficient at what they do. Not only that if we want the objects in question in a certain order another collection would need more work to have the functionality of a queue/ stack

        // 13. What is the output of the following code?
        // Do this by hand to make sure that you understand stacks and queues
        
        Stack<String> s = new Stack<>();
        Queue<String> q = new LinkedList<>();
        s.push("how");
        s.push("are");
        s.push("you");
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        System.out.println(q);
        

        1. We start by creating a stack and a queue.
        2. We add "how" "are" "you" to the stack resulting in ("you", "are", "how")
        3. while the stack isnt empty , add to the queue by popping the top value and adding it to the queue, first "you", then "are", last "how"
        4. Queue now looks like ("you", "are", "how"), and stack is empty from pop
        5. we print out the queue ("you", "are", "how")

        // 14. What is the output of the following code?
        // Do this by hand to make sure that you understand stacks and queues
        */
        Stack s = new Stack<>();
        s.push(7);
        s.push(10);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.push(3);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.peek());
        s.push(8);
        System.out.println(s.pop());
        System.out.println(s.pop());
        /*

        1. New stack s created.
        2. add 7 and 10, now stack is [7, 10]
        3. Print out s.pop, remove 10 and print it out
        4. Print out s.peek, we do not remove 7 we just look at it
        4. add 3 then 5 to stack. now stack is [7, 3, 5]
        5. s.pop and remove value 5. Now stack is [7, 3], also print it out
        6. s.Isempty returns false, print that out
        7. check the size it should be 2, print it out
        8. peek into next value on stack, its 3
        9. add 8 to the stack now stack is [7, 3 ,8]
        10. pop and print out value, value is 8 so now stack is [7, 3], print 8
        11. pop and print out value, value is 3 so now stack is [7], print 3

        // 22. Write a piece of code that prints the elements of a queue of integers,
        // one per line.
        // When your code is done running, the queue should still contain the same
        // contents as it had at the start. In other words, don’t destroy the queue as
        // you print it. If you like, put your code into a method called print that
        // accepts the queue as a parameter.
        */
        Stack ques22Stack = new Stack<Integer>();
        ques22Stack.push(5);
        ques22Stack.push(10);
        ques22Stack.push(15);
        ques22Stack.push(20);
        printStack(ques22Stack);
        System.out.println(ques22Stack);
        /*
        // 23. Write a piece of code that finds and prints the longest string in a stack
        // of strings.
        */
        Stack<String> ques22Stack2 = new Stack<String>();
        ques22Stack2.push("hello");
        ques22Stack2.push("hi");
        ques22Stack2.push("goodbye");
        ques22Stack2.push("howdy");
        System.out.println(ques22Stack2);
        printLongest(ques22Stack2);
        System.out.println(ques22Stack2);
        /*
        // For example, in the stack [hello, hi, goodbye, howdy], the longest string is
        // "goodbye". When your code is done running, the stack should still contain the
        // same contents as it had at the start. In other words, if you destroy the
        // stack as you examine it, restore its state afterward. If you like, put your
        // code into a method called printLongest that accepts the stack as a parameter.
        */
    }

    public static void printLongest(Stack s){
        System.out.println(s);
        Stack ques22TempStack = new Stack<String>();
        String str = "";
        while(!s.isEmpty()) {
            String strTemp = (String) s.peek();
            ques22TempStack.push(s.pop());
            
            if (strTemp.length() > str.length()){
                str = strTemp;
            }
        }
        while(!ques22TempStack.isEmpty()){
            s.push(ques22TempStack.pop());
        }
        System.out.println(str);
    }

    public static void printStack(Stack s){
        Stack ques22TempStack = new Stack<Integer>();
        while(!s.isEmpty()) {
            ques22TempStack.push(s.peek());
            System.out.println(s.pop());
        }
        while(!ques22TempStack.isEmpty()){
            s.push(ques22TempStack.pop());
        }
    }
}
