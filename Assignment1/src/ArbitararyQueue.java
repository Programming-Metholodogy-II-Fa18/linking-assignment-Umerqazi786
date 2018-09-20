import java.util.NoSuchElementException;

public class ArbitararyQueue<E> {
	   private DNode<E> head;
	   private DNode<E> tail;

	   private int size;

	   public ArbitararyQueue() // construct an empty deque
	   {
	       head = null;
	       tail = null;
	       size = 0;
	   }

	   public int size() {
	       return size;
	   }

	   public boolean isEmpty() // is the deque empty?
	   {
	       return size == 0;
	   }

	   public void Push(E item) // insert the item at the front
	   {
	       if (item == null)
	           throw new NullPointerException("Item is null");

	       DNode<E> node = new DNode<E>(item, head, null);
	       if (head != null) {
	           head.setPrev(node);
	       }

	       if (tail == null) {
	           tail = node;
	       }

	       head = node;
	       size++;

	   }

	   public void Enqueue(E item) // insert the item at the end
	   {
	       if (item == null)
	           throw new NullPointerException("Item is null");

	       DNode<E> node = new DNode<E>(item, null, tail);
	       if (tail != null) {
	           tail.setNext(node);
	       }

	       tail = node;
	       if (head == null) {
	           head = node;
	       }
	       size++;
	   }

	   public E Pop() // delete and return the item at the front
	   {
	       if (size == 0)
	           throw new NoSuchElementException("Deque is empty");
	      
	       DNode<E> node = head;
	       head = head.getNext();
	       head.setPrev(null);
	       size--;
	       return node.getItem();

	   }

	   public E Dequeue() // delete and return the item at the end
	   {
	       if (size == 0)
	           throw new NoSuchElementException("Deque is empty");
	      
	       DNode<E> node = tail;
	       tail = tail.getPrev();
	       tail.setNext(null);
	       size--;

	       return node.getItem();
	   }

	  class Node{
		  
	  }
	  
public E Traverse(int n) {
	
		DNode<E> current = head;
	int count = 0;
	while(count<n) {
		current=current.getNext();
		if(current==null) {
			throw new IndexOutOfBoundsException("Cannot fint item at index");
		}
	count++;
	}
	return current.getItem();
	
	
}
	      
	   }

	



	class DNode<E> {
	   private E item;
	   private DNode<E> next;
	   private DNode<E> prev;

	   public DNode(E item, DNode<E> next, DNode<E> prev) {
	       this.item = item;
	       this.next = next;
	       this.prev = prev;
	   }

	   public E getItem() {
	       return item;
	   }

	   public void setItem(E item) {
	       this.item = item;
	   }

	   public DNode<E> getNext() {
	       return next;
	   }

	   public void setNext(DNode<E> next) {
	       this.next = next;
	   }

	   public DNode<E> getPrev() {
	       return prev;
	   }

	   public void setPrev(DNode<E> prev) {
	       this.prev = prev;
	   }

	}


