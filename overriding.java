class test1{
	void run(){
		System.out.println("the vehical is running safely ");
	}
}
class test2 extends test1{
	void run (){
		System.out.println("the vehical is running correctly ");
	}
}
class overriding {
	public static void main (String args[]){
		test2 obj=new test2();
		obj.run();
		}
	}