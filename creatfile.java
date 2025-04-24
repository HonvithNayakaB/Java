import java.io.*;
class creatfile{
	public static void main(String args[]){
		try{
			File obj=new File("hon.txt");
			if(obj.createNewFile()){
				System.out.println("the file is creted succssfully ");
			}
			else{
				System.out.println("the file already exists ");
			}
		}
		catch (IOException e){
			System.out.println("and io exception occured ");
			}
		}
	}
