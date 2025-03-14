package superkeyword;

public class SuperMethodChild extends SuperMethod{

	public static void main(String[] args) {
		
		SuperMethodChild obj =new SuperMethodChild();
		obj.display1();
		
	}
	public void display1()
	{
		System.out.println("child");
		super.display();
	}

}
