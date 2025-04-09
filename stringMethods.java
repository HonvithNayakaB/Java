import java.util.Scanner;
public class stringMethods {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("please enter the first string = ");
        String s1=scan.nextLine();
        System.out.print("please enter the second string = ");
        String s2=scan.nextLine();
        System.out.println("converting both the strings to uppercase = "+s1.toUpperCase()+" "+s2.toUpperCase());
        System.out.println("converting both the strings to lowercase = "+s1.toLowerCase()+" "+s2.toLowerCase());
        System.out.println("pring the characters at index 2 ="+s1.charAt(2)+" "+s2.charAt(2));
        System.out.print("please enter a character which exists in string 1 = ");
        String c1=scan.nextLine();
        System.out.print("please enter a character which exists in string 2 = ");
        String c2=scan.nextLine();
        System.out.println("replacing "+c1+" from string1 and "+c2+" from string2 with the character z = "+s1.replace(c1,"z")+" "+s2.replace(c2,"z"));
        System.out.println("the lenght of string 1 = "+s1.length());
        System.out.println("the lenght of string 2 ="+s2.length());
        System.out.println("concationation of both the strings = "+s1.concat(s2));
    }
}
