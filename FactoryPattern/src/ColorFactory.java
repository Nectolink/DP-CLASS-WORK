
public class ColorFactory extends AbstractFactory {
	
	 
	    public IColor getColor(String color) {
	   
	      if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	         
	      }else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
	      
	      return null;
	   }

		@Override
		IShape getShape(String shape) {
			// TODO Auto-generated method stub
			return null;
		}

}
