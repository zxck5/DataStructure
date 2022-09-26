package comparable_comparator;




public class Comparable1 {
	public static void main(String[] args) {
		
		StudentComparable a = new StudentComparable(17,2);
		StudentComparable b = new StudentComparable(15,3);
		int value = a.compareTo(b);
		if (value == 0 ) {
			System.out.println("same");
		} else if (value < 0) {
			System.out.println("b is older");
		} else if (value > 0) {
			System.out.println("a is older");
		}
		
	}
	
	
}
