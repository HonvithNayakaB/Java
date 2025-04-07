import java.util.Scanner;
public class OddEven{
    public void check(int a){
        if(a%2==0){
            System.out.println("the number "+a+" is a even number");
        }
        else{
            System.out.println("the number"+a+" is a odd number ");
        }
    }
    public static void main(String args[]){
        OddEven obj=new OddEven();
        Scanner input=new Scanner(System.in);
        System.out.print("please enter a valid integer = ");
        int a=input.nextInt();
        obj.check(a);
    }
}