package collectionsTest;


public class MyArrayList<E> implements MyList<E>{
	
	private int size;
	private E[] data = null;
	private final float loadFactor = 0.75f;
	
	@SuppressWarnings("unchecked")
	public MyArrayList(int initCapacity){
		data = (E[]) new Object[initCapacity];
	}
	
	public boolean add(E t){
		if(checkCapacity(size)){
			data[size++] = (E)t;
			return true;
		}		
		return false;
	}
	
	public E get(int position){
		if(position>=0){
			return (E)data[position];
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	private boolean checkCapacity(int size){
		if(size == this.data.length ){
			size += (int) (size * loadFactor);
			E[] temp = data;
			data = (E[]) new Object[size];
			int count = 0;
			for(E o : temp){
				data[count] = o;
				count++;
			}
		}
		return true;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public int size() {
		return (size + 1);
	}

}
