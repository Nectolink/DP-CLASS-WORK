
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Hello World");
	}
	
	// Open-Close Principle - Good example
	 class GraphicEditor {
	 	public void drawShape(Shape s) {
	 		s.draw();
	 	}
	 }
	 
	 abstract class Shape {
	 	abstract void draw();
	 }
	 
	 class Rectangle extends Shape  {
	 	public void draw() {
	 		// draw the rectangle
	 	}
	 } 

}
