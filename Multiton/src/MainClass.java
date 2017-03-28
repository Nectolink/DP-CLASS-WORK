
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multiton m = Multiton.getOject();
		

		
	}

}
class Multiton
{
	
	private  static Multiton multiObj;
	
	
	private Multiton()
	{
		System.out.println("This is an Object");
		
	}
	
	public static Multiton getOject()
	{
		int count = 3;
	if (multiObj <= count)
	{
		multiObj = new Multiton();
		
	}
	else {return multiObj;}
		
		
		
		return multiObj;	
	}
	}
