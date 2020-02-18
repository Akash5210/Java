class A
{
	public void m1(){
      System.out.println("Hello akash");	
    }
}
class anmonous{
	public static void main(String arg[]){
	int x=10;
   
    class B extends A{
		 void m3(){
			 System.out.println("You are in class b");
		 }
	 }
     
 
     B b=new B();
     b.m3(); 
     b.m1();	
     System.out.println(x);
	 A a=new A(){
		 public void  m1(){
			 System.out.println("Anamonous class");
		 }
	 };
	 
     a.m1(); 
	}
}