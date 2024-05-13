package gitlearning;

public class AverageCalculator {

	    
	    // Method to calculate average of 3 integer numbers
	    public static double average(int num1, int num2, int num3) {
	        return (num1 + num2 + num3) / 3.0;
	    }
	    
	    // Method to calculate average of 3 float numbers
	    public static double average(float num1, float num2, float num3) {
	        return (num1 + num2 + num3) / 3.0;
	    }
	    
	 // Method to calculate the area of a circle
	    public static double calculateArea(int radius) {
	        return Math.PI * radius * radius;
	    }

	    // Method to calculate the area of a rectangle
	    public static double calculateArea(double length, double width) {
	        return length * width;
	    }
	 // Method to calculate the area of a square
	    public static double calculateArea(double side) {
	        return side * side;
	    }
	    
	    public static void main(String[] args) {
	        int intNum1 = 10, intNum2 = 20, intNum3 = 30;
	        float floatNum1 = 10.5f, floatNum2 = 20.5f, floatNum3 = 30.5f;
	        
	        // Calculating average of integers
	        double intAverage = average(intNum1, intNum2, intNum3);
	        System.out.println("Average of integers: " + intAverage);
	        
	        // Calculating average of floats
	        double floatAverage = average(floatNum1, floatNum2, floatNum3);
	        System.out.println("Average of floats: " + floatAverage);
	        
	        double circleArea = calculateArea(5.0); // Circle with radius 5
	        System.out.println("Area of circle: " + circleArea);

	        double rectangleArea = calculateArea(4.0, 6.0); // Rectangle with length 4 and width 6
	        System.out.println("Area of rectangle: " + rectangleArea);

	        double squareArea = calculateArea(4.0); // Square with side 4
	        System.out.println("Area of square: " + squareArea);
	    }
	}


