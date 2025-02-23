public class Stack<T> {
    private Object[] elements;
    private int size;
    private int capacity;


    public Stack() {
        this(10);
    }

    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
    }

    public void push(T element) throws StackFullException {
        if (size == capacity) {
            throw new StackFullException("Stack is full");
        }
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        T element = (T) elements[--size];
        elements[size] = null; // Clear the reference
        return element;
    }

    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[size - 1];
    }

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
