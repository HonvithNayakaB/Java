class sound{
	void sound(){
		System.out.println("the animal is making some sound ");
		}
	}
class animal extends sound{
	void name(){
		System.out.println("the aniaml is a goat ");
		}	
	}
class singleinheritance{
	public static void main(String args[]){
		animal obj=new animal();
		obj.name();
		obj.sound();
		}
	}
	