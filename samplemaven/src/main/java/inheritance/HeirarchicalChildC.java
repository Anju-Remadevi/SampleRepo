package inheritance;

public class HeirarchicalChildC  extends HeirarchicalParentA{

	public static void main(String[] args) {
		HeirarchicalChildC obj2=new HeirarchicalChildC();
		obj2.display();
		obj2.display2();

	}
	public void display2()
	{
		System.out.println("Child class2");
	}

}
