class data{
static int x=52;//can be called by class name
static String y="TATA";
int z=10;
static{
	System.out.println("static block loads first");
}
static{
	System.out.println("multiple static block can be run inside the class");
}
void show(){
	System.out.println(y);
}
{
	System.out.println("1st Initilise block load and execute successfully before constructor");
}
data(){
	System.out.println("constructor has run successfully after Initilise block.It can also call using chaining");
}
data(int d){
	this();
	int z=d;		
	System.out.println("it will print value of z="+z);
}
{
	System.out.println("2nd Initilise block load and execute just after 1st");
}
}
class practic{
public static void main(String s[]){
System.out.println("Hello akash");
data a= new data();
data.x=20;
System.out.println(data.x);
a.show();
data b= new data(20);

}
}