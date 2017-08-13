package collectionsTest;

public interface MyList<E> {
	
	boolean add(E e);
	
	boolean remove(Object o);
	
	Object get(int index);
	
	int size();

}
