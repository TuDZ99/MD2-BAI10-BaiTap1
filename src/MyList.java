import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private final static int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[size];
    }

    private void ensureCapa() {
        if (size > elements.length) {
            int biggerSize = size * 2 + 1;
            elements = Arrays.copyOf(elements, biggerSize);
        }
    }

    public void add(E o) {
        size += 1;
        ensureCapa();
        elements[size - 1] = o;
    }

    public boolean add(int index, Object o) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = o;
            return true;
        }
        return false;
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return (E) elements[index];
        }
        return null;
    }

    @Override
    public MyList clone() {
        MyList<E> clone = new MyList<>(elements.length);
        for (Object x : elements) {
            clone.add((E) x);
        }
        return clone;
    }
    public E[] getElements(){
        return (E[]) this.elements;
    }
    public int size(){
        return size;
    }
    public void clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public int indexOf (E e){
        for (int i = 0; i < size;i ++){
            if (elements[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    public boolean contains(E o){
        for (Object x : elements){
            if (o.equals(x)){
                return true;
            }
        }
        return false;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }
    }