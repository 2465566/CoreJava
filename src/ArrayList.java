import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/**
 * Created by rico on 6/10/17.
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>,
        RandomAccess, Cloneable, java.io.Serializable {

    transient Object[] elementData;
    private int size;

    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    public ArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    public ArrayList(Collection<E> c) {

    }


    @Override
    public E get(int index) {
        rangeCheck(index);
        return (E) elementData[index];
    }

    public boolean add(E e) {// TODO: 6/15/17
        size++;
        elementData[size] = e;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elementData[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size-1; i > 0; i--) {
                if (elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size-1; i > 0; i--) {
                if (o.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("");
    }


}
