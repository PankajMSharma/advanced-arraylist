import static org.junit.Assert.assertEquals;  
import org.junit.Test;

/*
 * 
 * You need to have JUnit and  jar in class path to run this file
 */
public class AdvanceArrayListTest {
	
	@Test
	public void testAddWithSizeLimit() {
		AdvanceArrayList<String> list = new AdvanceArrayList<String>(1);
		String s1 = new String("1");
		String s2 = new String("2");
		String s3 = new String("3");

		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		assertEquals("Testing limited size of list", 1, list.size());  
	}
	
	@Test
	public void testAddWithNoSizeLimit() {
		AdvanceArrayList<String> list = new AdvanceArrayList<String>();
		String s1 = new String("1");
		String s2 = new String("2");
		String s3 = new String("3");

		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		assertEquals("Testing size of list", 3, list.size());  
	}
	
	@Test(expected = NotInsertableException.class)
	public void testRedundancyInAdd() {
		AdvanceArrayList<String> list = new AdvanceArrayList<String>();
		String s1 = new String("1");

		list.add(s1);
		list.add(s1);
	}
}







