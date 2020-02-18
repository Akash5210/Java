class A{
	int x=20;
	void m1(){
		System.out.println("Hello AK");
	}
}
class B{
	int y=20;
	void m2(){
		System.out.println("Hello Sita");
	}
	A a=new A();
	
}
class C{
	public static void main(String arg[]){
	B b=new B();
	
	System.out.println(b.y);
	b.m2();
	b.a.m1();
	System.out.println(b.a.x);

	}
}