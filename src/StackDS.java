import java.util.Stack;

public class StackDS {
    // Stack = is a LIFO (LAST IN FIRST OUT) , Stores data into the sort
    // of "vertical tower" , the last entered data will be the first to be affected.

    StackDS() {
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("DOM");
        stack.push("REDDEAD2");

        System.out.println(stack.empty()); // Check if the stack is empty

        stack.pop(); // REDDEAD2 Will be deleted because it's the last element in the stack , LIFO LAST IN FIRST OUT :)

        System.out.println(stack.peek()); // The result is DOM because now it's the last element in the stack after deleting REDDEAD2

        System.out.println(stack.search("DOM"));


    }
}
