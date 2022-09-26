package comparable_comparator;
import java.util.Comparator;



public class Comparator1 {
	
	
	// comparator implemented by anonymous class. 
	public static Comparator<StudentComparable> comp2 = new Comparator<StudentComparable>() {
		
		@Override
		public int compare(StudentComparable o1, StudentComparable o2) {
			// TODO Auto-generated method stub
			return o1.classNumber-o2.classNumber;
		}
		
	};
	// we can set up differently.
	public static Comparator<StudentComparable> comp3 = new Comparator<StudentComparable>() {

		@Override
		public int compare(StudentComparable o1, StudentComparable o2) {
			// TODO Auto-generated method stub
			return o1.age-o2.age;
		}
	};
	
	// we can even create function that passes comparator
	public static int useComparator(StudentComparable a, StudentComparable b, Comparator<StudentComparable> comp) {
		return comp.compare(a, b);
		
	}
	
	public static void main(String[] args) {
		
		StudentComparable s1 = new StudentComparable(12,2);
		StudentComparable s2 = new StudentComparable(16,1);
		int result = useComparator(s1,s2, (StudentComparable a, StudentComparable b)-> (a.age - b.age));
		System.out.println(result); // -4
		// s1.age < s2.age
		
		StudentComparable a = new StudentComparable(17,2);
		StudentComparable b = new StudentComparable(16,1);
	
		ClassName cn = new ClassName();
		if (cn.compare(a,b) == 1) {
			System.out.println("a > b");
		} else if (cn.compare(a, b) == 0) {
			System.out.println("a == b");
		} else {
			System.out.println("b > a");
		}
		
		StudentComparable c = new StudentComparable(18,3);
		c.compare(a, b); // this is inconvenient use. we have to create c instance to compare a and b.
		a.compare(a, b); // this is another way to not create new instance.
		/*
		 * Is there a more efficient way to not generate c and compare the two?
		 * Using an anonymous object (class)"-> 'Object whose name is not defined'
		 * So what does undefined name mean?
		 * When we create a class, we define a name after the class keyword. 
		 * But, is it possible to define a class without a name? == impossible
		 * 
		 * However, like our concerns, there are cases when only a specific implementation part is used separately,
		 *  or a partial function needs to be temporarily changed.
		 * 
		 *  Anonymous objects can be used in this case.
		 *
		 *
				
		 * */
		// case 1: created as local variable in main function.
		Comparator<StudentComparable> comp1 = new Comparator<StudentComparable>() {

			@Override
			public int compare(StudentComparable o1, StudentComparable o2) {
				// TODO Auto-generated method stub
				return o1.classNumber-o2.classNumber;
			}
		};
		
		// case2 : created as global variable in the class 'Comparator1'
		if (comp2.compare(a,b) >0) {
			System.out.println("a > b");
		} else if (comp2.compare(a, b) == 0) {
			System.out.println("a == b");
		} else {
			System.out.println("b < a");
		}
		/*
		 
There is one more benefit to using anonymous objects. 
An anonymous object is like a new class with no name defined.
When you inherit (implement) a class, just as you can create any number or multiples by changing the name,
so is the anonymous object. 
It's just that it doesn't have a name.
In other words, if you change the name of the variable that points to the anonymous object, you can freely create any number of them.
 In the example above, the size was compared based on the class.
If you want to do case comparison, you can create another anonymous object with comparing different targets.
// ex ) comp1(anonymous class) ->compare by age , comp2 --> height, .....
		 * */
		
		
		
	}
	
}

class ClassName implements Comparator<StudentComparable> {

	@Override
	public int compare(StudentComparable o1, StudentComparable o2) {
		
		if (o1.classNumber>o2.classNumber) {
			return 1;
		
		} else if (o1.classNumber < o2.classNumber) {
			return -1;
		
		} else {
			return 0;
		}
	}
	
}
