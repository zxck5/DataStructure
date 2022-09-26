package comparable_comparator;

import java.util.Comparator;

public class StudentComparable implements Comparable<StudentComparable>,Comparator<StudentComparable> {
	 
	int age;			
	int classNumber;
	
	StudentComparable(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
	
	@Override
	public int compareTo(StudentComparable o) {
    /*
	// this logic is embedded.
		if(this.age > o.age) {
			return 1;
		}
		
		else if(this.age == o.age) {
			return 0;
		}
		
		else {
			return -1;
		}
	}
	*/
		return this.age-o.age;
		
	}
	/*
	 * 
	 * [Comparable Interface]
		1. it enables to compare with other class variable
		2. Override compareTo 
	 * 
	 * 
	 * 
	 * */

	@Override
	public int compare(StudentComparable o1, StudentComparable o2) {
		// TODO Auto-generated method stub
		
		
		if (o1.classNumber>o2.classNumber) {
			return 1;
			
		} else if (o1.classNumber < o2.classNumber) {
			return -1;
		
		} else {
			return 0;
		}
	}
}
