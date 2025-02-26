import java.util.LinkedList;
import java.util.Collections;
/**
 * This program reads a list of integers from user input, stores them into a linked list, sorts them and outputs them in ascending order
 * Java Collections Framework are being utilized to sort the linked list
 * Code reuse is utilized through the built-in method(s) such as: Collections.sort()
 * Java Collections Frameworks Used: 
 * LinkedList: a list that allows insertions and deletions
 * Collections.sort(): a built-in sorting method from the collections utility class
 * Code reuse example:
 * Input: 3 1 4 2 5
 * Output: Sorted numbers: [1, 2, 3, 4, 5]
 * @author Katya Ramsingh
 * @version 1.0.0
 * @since Week 4 of CSC6301
 */
public class SortedLinkedList {
    /**
     * This class receives integers entered by user, stores them in a linked list, sorts them and prints them in ascending order
     * @param args Command line arguments containing integers separated by spaces
     */
    //main method begins
     public static void main(String[] args) {
        // creating the empty linked list for numbers to be stored
        LinkedList<Integer> nums = new LinkedList<>();
        
        // parse integers from command line
        for (String arg : args) {
            nums.add(Integer.parseInt(arg));
        }
        
        // sorting the linked list
        // code reuse happens here
        Collections.sort(nums);
        
        // printing sorted numbers
        System.out.println("Sorted numbers: " + nums);
    }
}

