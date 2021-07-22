import java.util.ArrayList;

/**
 * 
 */

/**
 * @author pankaj
 *
 */
public final class AdvanceArrayList<E> extends ArrayList<E> {
	private static int MAX_LIMIT = -1;
	
	public AdvanceArrayList() {
		super();
	}

	public AdvanceArrayList(int limit) {
		super();
		MAX_LIMIT = limit;
	}
	
	public boolean add(E element) throws NotInsertableException {
		synchronized (this) {
			this.elementExists(element);
			
			if (-1 != MAX_LIMIT && MAX_LIMIT == super.size()) {
				this.removeFirstElement();
			}
			return super.add(element);
		}
	}
	
	public void add(int index, E element) throws NotInsertableException {
		
		synchronized (this) {
			this.elementExists(element);
			
			if (-1 != MAX_LIMIT && MAX_LIMIT == super.size()) {
				this.removeFirstElement();
			}
			
			super.add(index, element);
		}
	}
	
	private void elementExists(E element) throws NotInsertableException {
		if (super.contains(element)) {
			throw new NotInsertableException("Could not insert element", null);
		}
	}
	
	private void removeFirstElement() {
		super.remove(0);
	}
}
