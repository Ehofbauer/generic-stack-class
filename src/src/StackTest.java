/**
 * Test class for Stack.
 *
 * @author Elias Hofbauer
 * @version 23-02-2025
 */
public class StackTest {
    public static void main(String[] args) {
        try {
            Stack<Integer> numberStack = new Stack<>();
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);
            System.out.println("Number Stack (list): " + numberStack.list());
            System.out.println("Popped: " + numberStack.pop());
            System.out.println("Peek: " + numberStack.peek());

            Stack<String> textStack = new Stack<>();
            textStack.push("Hello");
            textStack.push("World");
            System.out.println("Text Stack (list): " + textStack.list());
            System.out.println("Popped: " + textStack.pop());

        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}