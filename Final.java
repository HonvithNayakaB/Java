class bike{
void speed(){
	final int speed=100;
	System.out.println(speed);
	}
final void test(){
	System.out.println("running..");
	}
}
class Final extends bike{
	public static void main(String args[]){
	Final obj=new Final();
	obj.speed();
	obj.test();
	}
}