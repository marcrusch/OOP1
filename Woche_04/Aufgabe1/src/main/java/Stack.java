public class Stack {
    String[] stack;
    Stack(int capacity) {
        this.stack = new String[capacity];
    }
    public String pop() {
        if(this.size()==0) {
            return null;
        }
        String poppedItem = this.stack[this.size()-1];
        this.stack[this.size()-1] = null;
        return poppedItem;
    }
    public void push(String element)  {
        if(this.isFull()) {
            throw new RuntimeException("Stack is full");
        }
        this.stack[this.size()] = element;
    }
    public int size() {
        int size = 0;
        for (int i = this.stack.length-1; i>=0; i--) {
            if(this.stack[i] == null) {
                continue;
            }
            size = i+1;
            break;
        }
        return size;
    }
    public boolean isFull() {
        return this.stack.length == 0 || this.stack[this.stack.length - 1] != null;
    }
    public boolean isEmpty() {
        return this.stack.length > 0 && this.stack[0] == null;
    }
}
