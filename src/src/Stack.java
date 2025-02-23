/**
 * Stack implementation using array
 *
 * @author Elias Hofbauer
 * @version 23-02-2025
 * @param <T>
 */
public class Stack<T> {
    private Object[] elements;
    private int size;
    private int capacity;

    /**
     * Default constructor initializing the stack with a default capacity of 10.
     */
    public Stack() {
        this(10);
    }

    /**
     * Constructor initializing the stack with a given array of elements.
     *
     * @param capacity initial elements to be stored in the stack
     * @throws StackFullException if the provided array exceeds the capacity
     */
    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param element the element to push onto the stack
     * @throws StackFullException if the stack is full
     */
    public void push(T element) throws StackFullException {
        if (size == capacity) {
            throw new StackFullException("Stack is full");
        }
        elements[size++] = element;
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the top element of the stack
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        T element = (T) elements[--size];
        elements[size] = null; // Clear the reference
        return element;
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return the top element of the stack
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[size - 1];
    }

    /**
     * Returns a string representation of all elements in the stack, separated by ';'.
     *
     * @return a string representation of the stack
     */
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }


}
