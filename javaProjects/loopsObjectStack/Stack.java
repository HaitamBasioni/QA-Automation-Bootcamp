public class Stack {
    private int[] array;
    private int top;
    private static final int MAX_CAPACITY = 10;

    public Stack() {
        this.array = new int[MAX_CAPACITY];
        this.top = -1; // Initialize the top index to -1 (empty stack)
    }

    // Add an element to the top of the stack
    public void push(int item) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full. Cannot push more elements.");
        }
        top++; // Increment top index
        array[top] = item; // Store the item at the top position
    }

    // Return the top element without removing it from the stack
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return array[top]; // Return the top element without changing the stack
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1; // Stack is empty when top index is -1
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == MAX_CAPACITY - 1; // Stack is full when top index is equal to the last index of the array
    }

    // Return the number of elements in the stack
    public int size() {
        return top + 1; // The number of elements is equal to top index + 1
    }

    // Get the element at a specific index without removing it from the stack
    public int getElementAt(int index) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
        return array[index];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Push 10 numbers into the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        // Print the elements of the stack without removing them
        System.out.println("Stack contents:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            int element = stack.getElementAt(i);
            System.out.println(element);
        }
    }
}
