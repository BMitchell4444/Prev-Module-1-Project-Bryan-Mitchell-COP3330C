
public class Output {
public static void rectOutput(Rectangle rect) {
	System.out.print("Rectangle with sides: ");
	System.out.print(rect.getLength());
	System.out.print(" and ");
	System.out.print(rect.getWidth());
	System.out.print(" has area ");
	System.out.println(rect.computeArea());
}

public static void circOutput(Circle circ) {
	System.out.print("Circle with radius: ");
	System.out.print(circ.getRadius());
	System.out.print(" has area ");
	System.out.println(circ.computeArea());
}
}
