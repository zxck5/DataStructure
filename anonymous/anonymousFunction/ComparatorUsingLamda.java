package anonymousFunction;

import java.util.Comparator;

import annonymousClass.Person;

public class ComparatorUsingLamda {
	
	
	public static int useComparator(Person p1, Person p2,Comparator<Person> comp) {
		return comp.compare(p1, p2);
	}
	
	public static void main(String[] args) {
		Person person1 = new Person(100, "Jiwon");
		Person person2 = new Person(200, "Jiwon2");
		
		useComparator(person1,person2,(Person p1,Person p2)-> (p1.height - p2.height));
		
	}
}	
