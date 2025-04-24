interface sound{
	void sound();
	}
class dog implements sound{
	public void name (){
		System.out.println("the animal is a dog ");
		}
	public void sound(){
		System.out.println("the dog is barking ");
		}
	}

class lion implements
 sound{
	public void name(){
		System.out.println("the animal is a lion ");
		}
	public void sound(){
		System.out.println("the lion is roaring ");
		}
	}
class hierarchicalinheritance{
	public static void main (String args[]){
		dog obj1=new dog();
		obj1.name();
		obj1.sound();
		lion obj2=new lion();
		obj2.name();
		obj2.sound();
		}
	}