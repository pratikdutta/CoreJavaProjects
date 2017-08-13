package collectionsTest;

public class MyLinkedList<E> implements MyList<E>{
	
	private Node head;
	private Node firstNode;
	private Node newNode;
	private int size = -1;
	
	class Node{
		Node linkedNode;
		Object dataUnit;
		int position;
		
		public Node(){}
		
		public Node(Node n){
			linkedNode = n.linkedNode;
			dataUnit = n.dataUnit;
			position = n.position;
		}
	}
	
	public MyLinkedList(){
		head = new Node();
	}
	

	@Override
	public boolean add(E e) {
		if(e!= null){
			head.dataUnit = e;
			size++;
			head.position = size;
			newNode = new Node();
			head.linkedNode = newNode;
			if(head.position == 0){
				firstNode = head;
			}
			head = head.linkedNode;
			
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		
		return false;
	}

	@Override
	public E get(int index) {
		if(index<-1){
			throw new IndexOutOfBoundsException();
		}else{
			Node temp = new Node(firstNode);
			while(temp.position < index){
				temp = temp.linkedNode;
			}
			return (E) temp.dataUnit;
		}
	}
	
	
	public int size() {
		return (size + 1);
	}
	

}
