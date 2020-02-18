class A{
	int x=10;
}
class B extends A{
	int y=20,z=40;
	void m1(){
		int x=50;
		int z=30;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(super.x);
		System.out.println(this.x);
	}
	
}	
class C extends B{
	int l=56;
	void m2(){
		
		System.out.println(x);
		System.out.println(y);
		
	}
}
class D extends A{
	int y=20;
	int z=30;
}


class body{
	public static void main(String arg[]){
		C c=new C();
		D d=new D();
        System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		System.out.println(c.l);
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d.z);
		
		}
}