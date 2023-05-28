public class DynamicArrayDS {
    int size;
    int capacity = 10;
    Object[] array;

    public void DynamicArray() {
        this.array = new Object[capacity];
    }
    public void DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

}
