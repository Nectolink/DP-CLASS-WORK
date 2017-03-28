
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        IShape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        IColor color1 = colorFactory.getColor("RED");
		color1.fill();
	}

}
