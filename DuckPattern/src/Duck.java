
 abstract class Duck {

	Quackable quackBehavior;
	Flyable flyBehavior;
	Swimable swimBehavior;
	
	public Duck() {
	}

	public void setBehavior(Flyable fb , Quackable qb , Swimable sm) {
		flyBehavior = fb;
		quackBehavior = qb;
		swimBehavior = sm;
	}

	

	abstract void display();

	void dislay() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
