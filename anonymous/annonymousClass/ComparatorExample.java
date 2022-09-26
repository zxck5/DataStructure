package annonymousClass;

import java.util.Comparator;




public class ComparatorExample {
	
	
	// creating annonymous class from Comparator Interface.
	
	static Comparator<Person> comp = new Comparator<>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.height-o2.height;
		}
		
	};
	
	public static void main(String[] args) {
		Person person1 = new Person(100, "Jiwon");
		Person person2 = new Person(200, "Jiwon2");
		
		
		System.out.println(comp.compare(person1, person2)); // -100
		if (comp.compare(person1, person2) > 0) {
			System.out.println("person1 is bigger");
		} else {
			System.out.println("person2 is bigger");
		}
		
		
	}

}
