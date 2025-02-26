import java.util.Stack;
import java.util.Collections;
/**
 * This program reads a list of integers from user input, stores them into a stack, sorts them and outputs them in ascending order
 * Java Collections Framework are being utilized to sort the stack
 * Code reuse is utilized through the built-in method(s) such as: Collections.sort()
 * 
 * Java Collections Frameworks Used: 
 * Stack: Last In, First out (LIFO)
 * Collections.sort(): a built-in sorting method from the collections utility class
 * 
 * Code reuse example:
 * Input: 3 1 4 2 5
 * Output: Sorted numbers: [1, 2, 3, 4, 5]
 * 
 * @author Katya Ramsingh
 * @version 1.0.0
 * @since Week 5 of CSC6301
 */
public class SortedStack {
    /**
     * This class receives integers entered by user, stores them in a stack, sorts them and prints them in ascending order
     * @param args Command line arguments containing integers separated by spaces
     */
    //main method begins
     public static void main(String[] args) {
        // creating the empty stack for numbers to be stored
        Stack<Integer> nums = new Stack<>();
        
        // parse integers from command line and push into the stack
        // using push since it is utilized specifically for stack behavior of LIFO
        for (String arg : args) {
            nums.push(Integer.parseInt(arg));
        }
        
        // sorting the stack
        // code reuse happens here
        Collections.sort(nums);
        
        // printing sorted numbers
        System.out.println("Sorted numbers: " + nums);
    }
}

