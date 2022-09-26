package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Lesson {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","c"));
		list.stream()
			.filter(x -> x.equals("b"))
			.forEach(System.out::println);
		
		System.out.println(
				list.stream()
				.filter("b"::equals)
				.findAny()
				);
		list.stream()
			.filter("b"::equals)
			.forEach(System.out::println);
		
		String [] array = new String[] {"a","b","c"};
		Stream<String> stream1 = Arrays.stream(array);
		Stream<String> stream2 = Arrays.stream(array,1,3); // index 1~2
		stream2.forEach(t -> {System.out.print(t + " ");});
		System.out.println();
		stream1.forEach(System.out::print);
		
		
		
		
	}
}
