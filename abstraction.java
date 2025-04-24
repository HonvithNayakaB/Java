abstract class itel{
	abstract void employeedata();
	}
class employee extends itel{
	void employeedata(){
		String name="Yogi";
		int age = 18;
		int salary = 30000;
		System.out.println("employee name = "+name);
		System.out.println("employee age = "+age);
		System.out.println("employee salary = "+salary);
		}
	}
class abstraction{
	public static void main(String args[]){
	employee obj=new employee();
	obj.employeedata();
	}
}