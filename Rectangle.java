import java.util.Scanner ;
public class Rectangle {
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setLength(double rectLength) {
		length = rectLength;
	}
	
	public void setWidth (double rectWidth) {
		width = rectWidth;
	}
	
	public Rectangle(double rectLength, double rectWidth) {
		length = rectLength;
		width = rectWidth;
	}
	
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public double computeArea() {
		return length * width;
	}

	
 	public static void main(String[] args) {
 		double rLength = 0;
 		double rWidth = 0;
 		double cRadius = 0;
 		Scanner scan = new Scanner(System.in);
 		
 		System.out.print("Enter rectangle 1's length: ");
 		rLength = scan.nextDouble();
 		System.out.print("\nEnter rectangle 1's width: ");
 		rWidth = scan.nextDouble();
 		
 		Rectangle rect1 = new Rectangle(rLength, rWidth);
 		
 		Rectangle rect2 = new Rectangle();
 		
 		System.out.print("\nEnter rectangle 2's length: ");
 		rLength = scan.nextDouble();
 		System.out.print("\nEnter rectangle 2's width: ");
 		rWidth = scan.nextDouble();
 		
 		rect2.setLength(rLength);
 		rect2.setWidth(rWidth);
 		
 		System.out.print("\nEnter circle 1's radius: ");
 		cRadius = scan.nextDouble();
 		
 		Circle circ1 = new Circle(cRadius);
 		
 		Circle circ2 = new Circle();
 		
 		System.out.print("\nEnter circle 2's radius: ");
 		cRadius = scan.nextDouble();
 		
 		circ2.setRadius(cRadius);
 		
 		Output.rectOutput(rect1);
 		Output.rectOutput(rect2);
 		
 		Output.circOutput(circ1);
 		Output.circOutput(circ2);
	}

}
