import java.io.*;
class filewrite{
	public static void main(String args[]){
		try{
			FileWriter obj=new FileWriter("hon.txt");
			obj.write("this content is added using the filewriter");
			System.out.println("the text is succss appended to file");
			obj.close();
			}
		catch (IOException e){
			System.out.println("and io exception occrue");
			}
		}
	}