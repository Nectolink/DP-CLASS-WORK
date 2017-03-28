
public class ShapeFactory extends AbstractFactory {

	 
	   public IShape getShape(String shapeType){
	      
		   if(shapeType == null){
	         
			   return null;
	      }		
		   
	      if(shapeType.equals("CIRCLE")){
	       
	    	  return new Circle();
	         
	      } else if(shapeType.equals("TRIANGLE")){
	       
	    	  return new Triangle();
	         
	      } else if(shapeType.equals("SQUARE")){
	         
	    	  return new Square();
	      }
	      
	      return null;
	   }

	@Override
	IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
