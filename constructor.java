class constructor{
    String name="Honvith Nayaka B";
    int age=18;
    constructor(){
        System.out.println("this is a Default Constructor");
    }
    constructor(String name){
        this.name=name;
    }
    constructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    constructor(constructor c){
        this.name=c.name;
        this.age=c.age;
    }
    public static void main(String args[]){
        constructor def=new constructor();
        constructor para1=new constructor("mr yogananda");
        constructor para2=new constructor("jamuna",17);
        constructor copy=new constructor(para2);

        System.out.println("hi my name is "+def.name+" and i am "+def.age+" years old ");
        System.out.println("hi my name is "+para1.name+" and i am "+def.age+" years old");
        System.out.println("hi my name is "+para2.name+" and i am "+para2.age+" years old");
        System.out.println("hi my name is "+copy.name+" and i am "+copy.age+" years old");

    }
}