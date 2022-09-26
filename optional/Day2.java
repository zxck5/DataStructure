package optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Day2 {
	public static void main(String[] args) {
		String name = "hello";
		if (name != null) {
			System.out.println(name.length());
		}
		
		Optional<String> check = Optional.of(name);
		check.ifPresent(n -> System.out.println(n.length()));
		
		// or else
		
		String name2 = null;
		Optional<String> ofNullable = Optional.ofNullable(name2);
		System.out.println(ofNullable);
		// empty
		
		// orElse
		name2 = ofNullable.orElse("I am else");
		System.out.println(name2);
		
		//orElseGet
		name2 = null;
		Optional<String> check2 = Optional.ofNullable(name2);
		name2 = check2.orElseGet(() -> "I am else2");
		System.out.println(name2);
		
	}
	
}
