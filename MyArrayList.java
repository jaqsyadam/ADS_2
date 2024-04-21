public class MyArrayList<E> implements MyList<E> {
    private static final int default_capacity = 10;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[default_capacity];
        this.size = 0;
    }
}