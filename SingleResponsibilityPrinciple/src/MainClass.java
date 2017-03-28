
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A class should have only one reason to change.

	}
	// single responsibility principle - good example
	interface Animal
	{
		public void eat();
		public void speak();
		
	}
	
	interface Race
	{
		public void run();
	}
	
	class Dog implements Animal
	{
		public void speak()
		{
			System.out.println("Wao Wao");
		}
		public void eat()
		{
			System.out.println("Meat");
		}
	}
}
