public class Array {

    private int[] data;
    private int size;

    //构造函数
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    //无参构造函数
    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //向所有元素最后加一个新元素
    public void addLast(int e) {
        add(size, e);
    }

    public void addFirst(int e) {
        add(0, e);
    }

    //在第index位置插入元素e
    public void add(int index, int e) {
        if(size == data.length)
            throw new IllegalArgumentException("Add failed. Array is full");
        if(index < 0 || index >size)
            throw new IllegalArgumentException("Add failed.");
        for(int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
        data[index] = e;
        size++;
    }
}
