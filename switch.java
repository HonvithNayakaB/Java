import java.util.Scanner;
class switch{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("plese enter you branch code = ");
		String code =scan.nextLine();
		switch (code){
			case "cs":
				System.out.println("WELCOME TO COMPUTER SCIENCE AND ENGINEERING ");
				break;
			case "ee":
				System.out.println("WELCOME TO ELECTRICAL AND ELETRONIC ");
				break;	
			case "ec":
				System.out.println("WELCOME TO ELECTRICAL AND ELECTRONIC ");
				break;
			default:
				System.out.println("please enter a valid branch code ");
				break;
			}
		}
	}