package MiniProject;
public class AList<T> implements list<T> {    // implements the list.java
	private T listArray[];
	private static final int DEFAULT_SIZE = 10; 
	private int maxSize;
	private int listSize;
	private int curr;
	
	@SuppressWarnings("unchecked")
	public AList(int maxSize) {
		this.maxSize = maxSize;
		listSize = 0;
		curr = -1;
		listArray = (T[])new Object[maxSize];
		
	}
	
	public AList() {
		this (DEFAULT_SIZE);
		
	}
	
	public void clear() {
    	listSize = 0 ;
    	curr = -1;
    }
    
 
    public boolean insert(T it) {
    	if (listSize >= maxSize) {
    		return false;
    	}
    	for (int i = listSize -1; i >= curr; i --) {
    		listArray[i+1] = listArray[i];
    	}
    	listArray[curr] = it;
    	listSize++;
    	return false;
    	}
    	 
    
    //Append "it" at the end of the list
    // list's capacity should not be exceeded
    public boolean append(T it) {
    	if (listSize >=  maxSize) {
    		return false;
    	} 
    	listArray[listSize++] =it;
    	return true;
    }
    
    // remove and return the current element
    public T remove() {
    	if (curr < 0 || curr > listSize - 1) {
    		return null;
    	}
    	T it = listArray[curr];
    	for  (int i=curr + 1; i < listSize; i++) {
    		listArray[i-1] = listArray [i];
    	}
    	listSize--;
    	return it;
    }
    
    // set the current position to the start of the list
    public void moveToStart() {
    	 curr = 0;
    }
    
    // set the current position to the end of the list
    public void moveToEnd() {
    	 curr = listSize - 1;
    }
    
    // move the current position one step left,
    // no change if already at beginning
    public void prev() {
    	if (curr > 0) {
    		curr--;
    	}
    }
    
    // move the current position one step right,
    // no change if already at end
    public void next() {
    	if (curr < listSize -1) {
    		curr ++;
    	}
    }
    
    // return the number of elements in the list
    public int length() {
    	return listSize;
    }
    
    // return the position of the current element
    public int currPos() {
    	return curr;
    }
    
    // set the current position to "pos"
    public boolean moveToPos(int pos) {
    	if (pos < 0 || pos > listSize -1 ) {
    		return false;
    	}
    	curr =pos;
    	return true;
    }
    
    // return true if current position is at end of the list
    public boolean isAtEnd() {
    	 return true;
    }
    
    // return the current element
    // return the current element
    public T getValue() {
    		if (curr<0 || curr > listSize -1) {
    			return null;
    		}
    		return listArray[curr];
    }
    // show all elements in the list
    public void show(){
    		for (int i = 0; i < listSize; i++) {
    			System.out.print(listArray[i]+ " ");
    		}
    		System.out.println();
    }
    public void showAll() {
    		int i;
    		for (moveToStart(), i =0; i < listSize; next(), i ++) {
    			System.out.print(getValue()+ " ");
    		}
    		System.out.println();
    }
    
    // find an element with k
    // return true if the element exists. Otherwise, false
    public boolean find(T k) {
    		int i ;
    		for (moveToStart(), i =0; i < listSize; next (), i++	) {
    			if (getValue ().equals(k) ) {
    				System.out.println( i + 1);
    				return true;
    			}
    		}
    		return false;
    }
}
    
    // show all elements in the list
   