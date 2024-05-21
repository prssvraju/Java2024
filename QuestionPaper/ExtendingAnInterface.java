interface ParentInterface{
	void parentMethod();
}
interface ChildInterface extends ParentInterface{
	void childMethod();
    
}
class ImplementingClass implements ChildInterface{
	
	public void childMethod() {
		System.out.println("Child Interface method!!");
	}
	
	public void parentMethod() {
		System.out.println("Parent Interface mehtod!");
	}
}

public class ExtendingAnInterface {

	public static void main(String[] args) {

		ImplementingClass obj = new ImplementingClass();
		
		obj.childMethod();
		obj.parentMethod();

	}

}