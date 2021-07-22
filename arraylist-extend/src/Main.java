/**
 * 
 */

/**
 * @author pankaj
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvanceArrayList<String> list = new AdvanceArrayList<String>(2);
		String s1 = new String("1");
		String s2 = new String("2");
		String s3 = new String("3");

		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		list.stream().forEach(System.out::println);
	}

}
