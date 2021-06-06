package com.trainingInner.org;

class Demo{
	void show() {
		System.out.println("Show method demo class");
	}
}

class Flavor1Demo{
	
	static Hello h=new Hello() {

		@Override
		public void show() {
			System.out.println("show method from Flvour1 is called");
			
		}
		
	};
	
	
	
//	static Demo d=new Demo() {
//		void show() {
//			super.show();
//			System.out.println("Flavor1.demo.show");
//		}
//	};
}


interface Hello{
	void show();
}





public class InnerClass {
public static void main(String[] args) {
	Flavor1Demo.h.show();
	
}
}





//class Demo{
//	void show() {
//		System.out.println("Show method demo class");
//	}
//}
//
//class Flavor1Demo{
//	static Demo d=new Demo() {
//		void show() {
//			super.show();
//			System.out.println("Flavor1.demo.show");
//		}
//	};
//}
//
//
//public class InnerClass {
//	public static void main(String[] args) {
//		Flavor1Demo.d.show();
//		
//	}
//}





//class Outer{
//	void outerMethod() {
//		int x=100;
//		System.out.println("Outer method is called");
//		class Inner{
//			void innerMethod() {
//				System.out.println("Inner method is called"+x);
//			}
//		}
//		
//		Inner y=new Inner();
//		y.innerMethod();
//	}
//	
//}
//
//
//public class InnerClass {
//	public static void main(String[] args) {
//		Outer o=new Outer();
//		o.outerMethod();
//	}
//}



//class Outer{
//	void outerMethod() {
//		System.out.println("outer method outer class");
//		
//		
//		class Inner{
//			void innerMethod() {
//				System.out.println("Inner method inner class");
//			}
//		}
//		
//		Inner i=new Inner();
//		i.innerMethod();
//	}
//}
//
//
//
//
//public class InnerClass {
//	
//	public static void main(String[] args) {
//		Outer o=new Outer();
//		o.outerMethod();
//	}
//
//}





//class Outer{
//	class Inner{
//		public void show() {
//			System.out.println("Show from Outer->Inner");
//		}
//	}
//}
//
//
//
//public class InnerClass {
//
//	public static void main(String[] args) {
//		Outer.Inner inner=new Outer().new Inner();
////		System.out.println(inner);
//		inner.show();
//	}
//}