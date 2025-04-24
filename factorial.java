import java.util.Scanner;
class factorial{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("please enter the nth number ");
		int n=scan.nextInt();
		int fact=1;
		int i=1;
		while (i<=n){
			fact=fact*i;
			i++;
			}
		System.out.println("the factorial of "+n+" is "+fact);
		}
	}