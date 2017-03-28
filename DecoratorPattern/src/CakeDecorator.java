
public abstract class CakeDecorator implements ICake  {
	
	ICake temp;
	public CakeDecorator(ICake cake)
	{
		this.temp = cake;
		}

}
