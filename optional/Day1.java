package optional;

import java.util.Optional;

public class Day1 {
	public static void main(String[] args) {
		
		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());
		//false
		
		String name = "jiwon";
		Optional<String> check1 = Optional.of(name);
		System.out.println(check1.isPresent());
		//true
		
		Optional<String> check2 = Optional.ofNullable(name);
		System.out.println(check2.isPresent());
		//true
		
		
		try {
			Optional<String> check3 = Optional.of(null);
			System.out.println(check3.isPresent());
			System.out.println("work");
			// null PointerException
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
