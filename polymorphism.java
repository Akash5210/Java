class A{
	int x=10;
	private static void m1(){
		System.out.println("Hello A ");
	}
	void m2(){
		System.out.println("Hi Akash ");
	}
}
class B extends A{
	int y=20;
	static void m1(){
		System.out.println("Hello B ");
	}
	void m3(){
		System.out.println("Hi Bhuban ");
	}
	
	
}	


class iron{
	public static void main(String arg[]){
		B b=new B();
        b.m1();
		b.m2();
		b.m3();
		}
}