class sound{
    void sound(){
        System.out.println("the animal is making some sound..");
    }
}
class movement extends sound{
    void movement(){
        System.out.println("the animal moving..");
    }
}
class animal extends movement{
    void name(){
        System.out.println("the animal is a goat");
    }
}
public class multilevelInheritance {
    public static void main(String args[]){
        animal obj=new animal();
        obj.name();
        obj.movement();
        obj.sound();
    }
    
}
