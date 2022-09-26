package comparable_comparator;

class Rectangle implements Shape {
//	int width = 20;
//	int height = 10;
	int depth = 40;
	public int get(){
		return depth;
	}
	public void get(int a) {}
	
}
/*
 *   Shape interface implemented by creating anonymous class strategy
 *  
 *   */

interface Shape{
	int width = 10;
	int height = 20;
	int get();
}

public class Anonymous {
	public static void main(String[] args) {
		Rectangle a = new Rectangle();
		
		// anonymous instance1
		Shape anonymous = new Shape() {
			int depth = 40;
			@Override
			public int get() {
				return width*height*depth;
			}
		};
		
		System.out.println(a.get()); // 40
		System.out.println(anonymous.get()); // 10*20*40
		
		
		
	}
}




