package inheritance;


public class HeirarchicalChildB extends HeirarchicalParentA{

	public static void main(String[] args) {
		
		HeirarchicalChildB obj =new HeirarchicalChildB();
		obj.display();
		obj.display1();

	}
	public void display1()
	{
		System.out.println("Child class");
	}

}
