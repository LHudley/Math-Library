package net.MathLib.lib;

public class All_In_One {


	double side, radius, height, length, width, hypot, area, fah, celcius, kelvin;

	int binary;

	



	// Rectangle area

	public  double rectangleArea(double length, double width) {

		if (length <= 0 || width <= 0) {
	
		System.out.println("Invalid Entry!");
	
		return 0;
	
		}
	
		else {
	
		double area = length * width;
	
		return area;
	
		}

	}


	// Square area

	public  double squareArea(double length) {

	double area = length * length;

	return area;



	}



	// Triangle area

	public  double triangleArea(double base, double height) {

	double area = (base * height) / 2;

	return area;



	}



	// Circle area

	public  double circleArea(double radius) {

	double area = Math.PI * radius * radius;

	return area;



	}



	// trapezoidArea

	public  double trapezoidArea(double base1, double base2, double height) {

	double area = 0.5 * (base1 + base2) * height;

	return area;



	}



	// Ellipse area

	public  double ellipseArea(double x, double y) {

	double area = Math.PI * x * y;

	return area;



	}



	// pentagonArea

	public  double pentagonArea(double side) {

	double area = (Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * side * side) / 4;

	return area;



	}



	// parallelogramArea

	public  double parallelogramArea(double base, double height) {

	double area = base * height;

	return area;



	}



	public  double rhombusArea(double denominator1, double denominator2) {

	double area = (denominator1 * denominator2) / 2;

	return area;



	}



	// hexagonArea

	public  double hexagonArea(double side) {

	
	double area = ((3 * Math.sqrt(3) * (side * side) / 2));


	return area;



	}



	// polygonArea

	public  double polygonArea(int numSides, double side) {

	double area = (numSides * (side * side)) / (4.0 * Math.PI / numSides);

	return area;

	}
	
	
	//Addition of fraction
	public String addFraction(int numerator1, int denominator1, int numerator2, int denominator2) {
	
	int numerator = numerator1 * denominator2 + denominator1 * numerator2;

	int denominator = denominator1 * denominator2;


	return (numerator + "/" + denominator).toString();

	}
	

	// Subtraction of fraction
	public String substractFraction(int numerator1, int denominator1, int numerator2, int denominator2) {
	
	int numerator = numerator1 * denominator2 - denominator1 * numerator2;
	
	int denominator = denominator1 * denominator2;

	return (numerator + "/" + denominator).toString();

	}
	

	//Multiplication of fraction
	public String multiplyFraction(int numerator1, int denominator1, int numerator2, int denominator2) {
	
	int numerator = numerator1 * denominator2;
	
	int denominator = denominator1 * numerator2;

	return (numerator + "/" + denominator).toString();
	}
	

	//Divison of fraction
	
	public String divideFraction(int numerator1, int denominator1, int numerator2, int denominator2) {
	
	int numerator = numerator1 * denominator2;
	
	int denominator = denominator1 * numerator2;

	return (numerator + "/" + denominator).toString();
	}


	//cube volume

	public  double Cube_Volume(double side) {

	return Math.pow(side, 3);

	}



	//box volume

	public  double Box_Volume(double length, double width, double height) {

	return length * width * height;



	}



	//cylinder volume

	public  double Cylinder_Volume(double radius, double height) {

	return Math.PI * Math.pow(radius, 2) * height;



	}



	//cone volume

	public  double Cone_Volume(double radius, double height) {

	return Math.PI * Math.pow(radius, 2) * height / 3;

	}



	//sphere volume

	public  double Sphere_Volume(double radius) {

	return ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));



	}



	//square perimeter

	public  double Square_Perimeter(double side) {

	return side * 4;

	}



	//rectangle perimeter

	public  double Rect_Perimeter(double length, double width) {

	return 2 * (length + width);

	}



	//circle circumference

	public  double  Circum_Circle(double radius) {

	return 2 * Math.PI * radius;

	}



	//pythagorus theorem

	public  double Pythagorus_Theorum(double height, double width) {

	return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

	}



	//Temperature

	public  double CelToFahTemp(double celcius) {

	return (1.8 *celcius + 32);

	}



	public  double celToKel(double celcius) {

	return (celcius + 273.15);

	}



	public  double FahToCel(double fah) {

	return (((fah - 32) * 5) / 9);

	}



	public  double FahToKel( double fah) {

	return (273.15 + ((fah - 32.0) * (5.0/9.0)));

	}
	

	//Binary to decimal

	public  int BinaryToDecimal(String binary){

	return Integer.parseInt(binary,2);



	}


}// end AllInOne


