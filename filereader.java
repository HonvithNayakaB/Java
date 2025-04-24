import java.io.*;
import java.util.Scanner;
class filereader{
	public static void main(String args[]){
		try{		
		FileReader obj=new FileReader("hon.txt");
		Scanner scan=new Scanner(obj);
		while(scan.hasNextLine()){
			String data=scan.nextLine();
			System.out.println(data);
			}
		}
	catch (IOException e){
		System.out.println("an io exception occured ");
		}
	}
}
