
class Notes {
	public static void main(String[] args) {
		Triangle tri = new Triangle (1, 2, 3);
		Triangle tri2 = new Triangle();
		Triangle tri3 = new Triangle("a", "b", "c");
		System.out.println(tri.getSide1());
		System.out.println(tri2.getSide1());
		System.out.println(tri3.getSide1());
	}
}
