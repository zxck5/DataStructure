package generic;


class ClassName3<E>{
	
	private E element;
	
	public void setElement(E e) {
		this.element=e;
	}
	public E getElement() {
		return element;
	}
}
class ClassName4<T,K>{
	private T element;
	private K element2;
	
	public T getElement() {
		return element;
	}
	
	public void setElement(T element) {
		this.element = element;
	}
	
	
	public K getElement2() {
		return element2;
	}
	public void setElement2(K element2) {
		this.element2 = element2;
	}
	
	public <V> V genericMethod1(V o) {
		return o;
	}
	// it works. because <>generic-> K type is independent type from K in className4
	public static <K> K genericMethod2(K o) {
		return o;
	}
	// error.
//	public static T genericMethod3(T o) {
//		return o;
//	}
	
	
}

public class Basic {
	public static void main(String[] args) {
		
		///선언부///
		ClassName2<String,Integer> a = new ClassName2<String, Integer>();
		// T is string. K is Integer. ClassName2 is defined as public class ClassName2<T,K> {}.
		// type parameter -> primitive X wrapper class O. Reference Type only. int, double, char X
		
		
		///Generic class///
		
		ClassName<String> b = new ClassName<String>(); // b created as ClassName.  
		
		System.out.println("b's class :"+b.getClass().getName());
		
		
		ClassName3<String> cn = new ClassName3<String>(); // ClassName3
		cn.setElement("This guy is String");
		System.out.println("cn element:"+cn.getElement());
		System.out.println("type of cn element :"+cn.getElement().getClass().getName());
		System.out.println("--------------------------");
		//cn.setElement(10); 오류. 해당 인스턴스 cn은 String 문자가 쓰였기 때문에 함수 사용 불가.
		//cn.setElement(10); error. The function cannot be used in the instance cn because String characters are used.
		ClassName3<Integer> cn2 = new ClassName3<Integer>(); 
		//To use an integer as an element, you need to create a new instance and specify its type.
		
		cn2.setElement(10);
		System.out.println("cn2 element"+cn2.getElement());
		System.out.println("cn2 element의 type:"+cn2.getElement().getClass().getName());
		System.out.println("--------------------------");
		
		// what if we want to specify two types in one instance?
		ClassName4<Integer,String> cn3 = new ClassName4<Integer,String>();
		cn3.setElement(10);// Integer
		System.out.println("cn3 T element:"+cn3.getElement());
		System.out.println("cn3 T element Type:"+cn3.getElement().getClass().getName());
		cn3.setElement2("this is string");// String
		System.out.println("cn3 K element:"+cn3.getElement2());
		System.out.println("cn3 K element Type:"+cn3.getElement2().getClass().getName());
		//for example, hashmap<Key,Value> is same case.
		
		
		//제네릭 메소드//
		System.out.println("--------------------------------------------");
		System.out.println("this is generic method.");
		// can return generic type 
		System.out.println("returning V value:"+cn3.genericMethod1(10));
		System.out.println("returning V type:"+cn3.genericMethod1(10).getClass().getName());
		System.out.println("--------------------------------------------");
		System.out.println("returning V value:"+cn3.genericMethod1("helloWorld"));
		System.out.println("returning V type:"+cn3.genericMethod1("helloWorld").getClass().getName());
		System.out.println("--------------------------------------------");		
		System.out.println("returning V value:"+cn3.genericMethod1(cn));
		System.out.println("returning V type:"+cn3.genericMethod1(cn).getClass().getName());
		
		//
		//therefore, we can declare any generic type aside from the types that are defined in the class by using this return generic method.
		/*
		 * now here is a problem. This kind of method is commonly used as static method. But when we use static method, when program start,
		 * the memory is going to be appeared in static as this program begins. So if the type is not declared at the beginning, it will
		 * cause an error.
		 * So how do we make it into static method? How will we able to declare a type for generic for static memory? 
		 * 
		 * 
		 * .public static <E> E returnValue(E e){}
		 * Therefore, if you want to have a method that uses generics as a static method, 
		 * you must use a generic independent of the generic class.
		 * ClassName4<T,K>  K is different K with static method genericMethod2<K>
		 * */
		System.out.println("test1: returning static method Vtype:"+ClassName4.genericMethod2("helloWorld"));
		// it is working. However, if we don't set <>generic at first, and want to return the type T, it has initial error.
		// error --> System.out.println("test2: returning static method Ttype:"+ClassName4.genericMethod3(3));
	}
}
