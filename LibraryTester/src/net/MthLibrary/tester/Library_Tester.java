package net.MthLibrary.tester;

import net.MathLib.lib.All_In_One;

public class Library_Tester {


	public static void main(String[] args) {

	All_In_One a = new All_In_One();

	System.out.printf("The area of the rectangle is: %.2f\n", a.rectangleArea(2.0, 3.5));

	System.out.printf("The area of the square is: %.2f\n", a.squareArea(27.0));

	System.out.printf("The area of the triangle is: %.2f\n", a.triangleArea(13.0, 9.5));

	System.out.printf("The area of the circle is: %.2f\n", a.circleArea(14.7));

	System.out.printf("The area of the trapezoid is: %.2f\n", a.trapezoidArea(13.3, 14.5, 18.3));

	System.out.printf("The area of the ellipse is: %.2f\n", a.ellipseArea(9.2, 6.7));

	System.out.printf("The area of the pentagon is: %.2f\n", a.pentagonArea(22.4));

	System.out.printf("The area of the parallelogram is: %.2f\n", a.parallelogramArea(23.0, 9.5));

	System.out.printf("The area of the rhombus is: %.2f\n", a.rhombusArea(42.6, 33.9));

	System.out.printf("The area of the hexagon is: %.2f\n", a.hexagonArea(24.2));

	System.out.printf("The area of the polygon is: %.2f\n", a.polygonArea(7, 6.5));

	System.out.println("3/4 + 2/7 = " + a.addFraction(3, 4, 2, 7));

	System.out.println("3/4 - 2/7 = " + a.substractFraction(3, 4, 2, 8));

	System.out.println("3/4 x 2/7 = " + a.multiplyFraction(3, 4, 2, 8));

	System.out.println("3/4 ÷ 2/7 = " + a.divideFraction(3, 4, 2, 8));

	System.out.printf("The volume of the cube is: %.2f\n", a.Cube_Volume(5.0));

	System.out.printf("The volume of the box is: %.2f\n",  a.Box_Volume(4.0, 6.0, 8.0));

	System.out.printf("The volume of the cylinder is: %.2f\n", a.Cylinder_Volume(3.0, 10.0));

	System.out.printf("The volume of the cone is: %.2f\n", a.Cone_Volume(7.0, 25.0));

	System.out.printf("The volume of the sphere is: %.2f\n", a.Sphere_Volume(15.0));

	System.out.printf("The perimeter of the square is: %.2f\n", a.Square_Perimeter(12.0));

	System.out.printf("The perimeter of the rectangle is: %.2f\n", a.Rect_Perimeter(25.0, 35.0));

	System.out.printf("The circumference of the circle is: %.2f\n", a.Circum_Circle(18.0));

	System.out.printf("The pythagorus theorum hypotnus is: %.2f\n", a.Pythagorus_Theorum(17.0, 29.0));

	System.out.printf("The celcius to fahrenheit temperature is: %.2f\n", a.CelToFahTemp(32.0));

	System.out.printf("The celcius to kelvin temperature is: %.2f\n", a.celToKel(47.0));

	System.out.printf("The fahrenheit to celcius temperature is: %.2f\n", a.FahToCel(84.0));

	System.out.printf("The fahrenheit to kelvin temperature is: %.2f\n", a.FahToKel(77.0));

	System.out.printf("The binary code to decimal is: " + a.BinaryToDecimal("1010101"));

	}// end main


}// end LibTester






