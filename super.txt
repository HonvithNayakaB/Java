class test1{
	void run(){
		System.out.println("the vehical is runing safely ");
		}
	}
class test2 extends test1{
	void run(){
		System.out.println("the vehical is running fine ");
		}
	void display(){
		run();
		super.run();
		}
	}
class Super{
	public static void main(String args[]){
		test2 obj=new test2();
		obj.display();
		}
	}