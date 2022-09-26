package anonymousFunction;

public class Example {
	
	static int doAddition(int n1, int n2, Math math) {
		return math.sum(n1, n2);
	}
	
	
	public static void main(String[] args) {
		
		int result = doAddition(10,20,new Math() {

			@Override
			public int sum(int n1, int n2) {
				// TODO Auto-generated method stub
				return n1+n2;
			}
		}); 
		
		System.out.println("result = " + result);
//			
		
		// using lamda expression.
		int result2 = doAddition(10,20,(int n1,int n2) -> n1+n2);
		System.out.println("result2 using lamda expression = " + result2);
		
		
		
		
	}
}
