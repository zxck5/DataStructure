package annonymousClass;

// Why we use anonymous class?

/*
 * if we think it is reasonable to not reuse it after once the program has run, we use it.
 * it is for temporarily use. examples : UI event , Thread class
 * if it is not reusable and if it is no benefits for program maintenance when it is used as extensions
 * if we have to use dummy classes for every request that client make
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */


public class Example1 {
	
	static MyInterface dummyBrother = new MyInterface() {

		@Override
		public void hello() {
			// TODO Auto-generated method stub
			System.out.println("say hello " + this.getClass().getName());
			
		}
		
	};
	
	
	
	public static void main(String[] args) {
		

		
		// dummy annonymous class is initiated in main method of Example1 class.
		MyInterface dummy = new MyInterface () {
			private String name;
			
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("say hello " + this.getClass().getName());
				this.name = (this.getClass().getName());
				
			}

			
		};
		
		dummy.hello();
		// output --> 'say hello annonymousClass.Example1$1'
		
		
		dummyBrother.hello();
		// output --> 'say hello annonymousClass.Example1$1'
		
// we can make an annonymous class for 
		
		
	}
}
