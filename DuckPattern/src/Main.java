
public class Main {

	public static void main(String[] args) {

      Duck du = new White();
      du.setBehavior(new Fly(),new Quack(),new Swim());
      
      du.flyBehavior.fly();

		

	}

}
