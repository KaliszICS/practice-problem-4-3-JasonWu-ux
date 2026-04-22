public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {

		Rectangle rect1 = new Rectangle();
		System.out.println("Rectangle 1 (default): length = " + rect1.getLength() + 
						  ", width = " + rect1.getWidth());
		
		Rectangle rect2 = new Rectangle(10);
		System.out.println("Rectangle 2 (one param): length = " + rect2.getLength() + 
						  ", width = " + rect2.getWidth());
		
		Rectangle rect3 = new Rectangle(6, 12);
		System.out.println("Rectangle 3 (two params): length = " + rect3.getLength() + 
						  ", width = " + rect3.getWidth());
		System.out.println();
	}

	public static void q2() {
		
		Chair chair1 = new Chair();
		System.out.println("Chair 1 (default): legs = " + chair1.getLegs() + 
						  ", material = " + chair1.getMaterial());
		
		Chair chair2 = new Chair(3);
		System.out.println("Chair 2 (one param): legs = " + chair2.getLegs() + 
						  ", material = " + chair2.getMaterial());
		
		Chair chair3 = new Chair(6, "metal");
		System.out.println("Chair 3 (two params): legs = " + chair3.getLegs() + 
						  ", material = " + chair3.getMaterial());
		System.out.println();
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}
}

	// Rectangle Class
	class Rectangle {
	private double length;
	private double width;
	
	// Constructor 1: No parameters - sets length to 4, width to 8
	public Rectangle() {
		this.length = 4;
		this.width = 8;
	}
	
	// Constructor 2: One parameter - sets length, width defaults to 8
	public Rectangle(double length) {
		this.length = length;
		this.width = 8;
	}
	
	// Constructor 3: Two parameters - sets both length and width
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// Getters
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
}

	// Chair Class
	class Chair {
	private int legs;
	private String material;
	
	// Constructor 1: No parameters - sets legs to 4, material to "wood"
	public Chair() {
		this.legs = 4;
		this.material = "wood";
	}
	
	// Constructor 2: One parameter - sets legs, material defaults to "wood"
	public Chair(int legs) {
		this.legs = legs;
		this.material = "wood";
	}
	
	// Constructor 3: Two parameters - sets both legs and material
	public Chair(int legs, String material) {
		this.legs = legs;
		this.material = material;
	}
	
	// Getters
	public int getLegs() {
		return legs;
	}
	
	public String getMaterial() {
		return material;
	}
}
