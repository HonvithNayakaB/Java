class sound{
    void sound (){
        System.out.println("the animal is making some sound..");
    }
}
class animal extends sound{
    void name(){
        System.out.println("the animal name is a goat..");
    }
}
public class singleInheritance {
    public static void main(String args[]){
        animal obj=new animal();
        obj.name();
        obj.sound();
    }
}
