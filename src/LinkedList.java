import java.util.AbstractSequentialList;
import java.util.Deque;
import java.util.List;

/**
 * Created by rico on 6/15/17.
 */
public class LinkedList<E>  extends AbstractSequentialList<E>
        implements List<E>, Deque<E>, Cloneable, java.io.Serializable
 {
     transient int size = 0;
     transient Node<E> first;
     transient Node<E> last;

     public LinkedList() {

     }



     private static class Node<E> {
         E item;
         Node<E> next;
         Node<E> prev;

         Node(Node<E> prev, E element, Node<E> next) {
             this.item = element;
             this.next = next;
             this.prev = prev;
         }
     }
}
