
public class abstractcls {
	public  class Practice{ //it must be abstract class//

	    abstract void();//abstarct mehod//
	        {

	        }

	    }
	}
public abstract class ClassOne {

	public void printSomething()
	{
		System.out.println("Hello in abstract class");
	}
}
class CreateClassOne {

	public static void main(String[] args)
	{
		// instance of abstract
		// class "ClassOne"
		ClassOne obj = new ClassOne(); //abstarct class cant be instantiated so it throws error??
	}
	import java.io.IOException;
	abstract class MyClass {
	   public abstract void display();
	   public abstract void setName(String name);
	   public abstract void setAge(int age);
	}
	public class AbstractClassExample extends MyClass{ //NOT DECLARING THE SUB CLASS AS ABSTRACT SO IT SHOWS COMPILE TIME ERROR//
	   public void display(){ 
	      System.out.println("This is the subclass implementation of the display method ");
	   }
	   public static void main(String args[]) {
	      new AbstractClassExample().display();
	   }
	}
	abstract class MyClass {
		   public abstract void display();
		   public abstract void setName(String name);
		   public abstract void setAge(int age);
		}
		public abstract class AbstractClassExample extends MyClass{
		   public void display(){
		      System.out.println("This is the subclass implementation of the displaymethod ");
		   }
		}

}


}
