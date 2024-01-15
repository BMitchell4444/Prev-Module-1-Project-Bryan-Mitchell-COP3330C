import java.lang.Math;
public class Circle {
private double radius;

public double getRadius() {
	return radius;
}

public void setRadius (double circRadius) {
	radius = circRadius;
}

public Circle(double circRadius) {
	radius = circRadius;
}

public Circle() {
	radius = 0;
}

public double computeArea() {
	return Math.PI * (radius * radius);
}
}
