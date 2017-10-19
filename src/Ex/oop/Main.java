package Ex.oop;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(3.0f, 4.0f);

		System.out.println(rectangle1.getLenght());

		rectangle1.setLenght(75.45f);

		System.out.println(rectangle1.getLenght());

		System.out.println(rectangle1.getArea());
		
		System.out.println(rectangle1.toString());

	}

}
