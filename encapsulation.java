import java.util.Scanner;
class encapsulation{
	void add(int a,int b){
		int c=a+b;
		System.out.println(a+" + "+b+" = "+c);
		}
	void sub(int a,int b){
		int c=a-b;
		System.out.println(a+" - "+b+" = "+c);
		}
	void mul(int a,int b){
		int c=a*b;
		System.out.println(a+" * "+b+" = "+c);
		}
	void div(int a,int b){
		int c=a/b;
		System.out.println(a+" / "+b+" = "+c);
		}	
	public static void main (String args[]){
		encapsulation obj=new encapsulation();
		Scanner scan=new Scanner(System.in);
		System.out.print("please enter the first number = ");
		int a=scan.nextInt();
		System.out.print("please enter the second number = ");
		int b=scan.nextInt();
		scan.nextLine();
		System.out.print("please enter the arthmetic operation symbol = ");
		String sy=scan.nextLine();
		switch(sy){
			case "+":
				obj.add(a,b);
				break;
			case "-":
				obj.sub(a,b);
				break;
			case "*":
				obj.mul(a,b);
				break;
			case "/":
				obj.div(a,b);
				break;
			default:
				System.out.println("please enter a valid input");
				break;
				}
			}
		} 