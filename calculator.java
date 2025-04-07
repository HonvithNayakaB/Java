import java.util.Scanner;
public class calculator {
    public void add(int a,int b){
        int c=a+b;
        System.out.println("the addition of "+a+" + "+b+" = "+c);
    }  
    public void sub(int a,int b){
        int c=a-b;
        System.out.println("the subtraction of "+a+" - "+b+" = "+c);
    }  
    public void mul(int a,int b){
        int c=a*b;
        System.out.println("the multiplication of "+a+" * "+b+" = "+c);
    }
    public void div(int a,int b){
        int c=a/b;
        System.out.println("the division of "+a+" / "+b+" = "+c);
    }
    public static void main(String arsg[]){
        calculator obj=new  calculator();
        Scanner input=new Scanner(System.in);
        System.out.print("please enter the first valid integer = ");
        int num1=input.nextInt();
        System.out.print("please enter the second valid input = ");
        int num2=input.nextInt();
        System.out.print("please enter the valid operator ( + , - , * , / ) = ");
        char opt=input.next().charAt(0);
        switch (opt){
            case '+':
            obj.add(num1,num2);
            break;
            case '-':
            obj.sub(num1,num2);
            break;
            case '*':
            obj.mul(num1,num2);
            break;
            case '/':
            obj.div(num1,num2);
            break;
            default :
            System.out.println("pleae enter a valid operator ");
        }
    }
}
