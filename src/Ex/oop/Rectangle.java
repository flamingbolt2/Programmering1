package Ex.oop;

public class Rectangle {
	private float lenght = 1.0f;
	private float width = 1.0f;

	public Rectangle() {
		System.out.println(this.lenght);
	}

	public Rectangle(float lenght, float width) {
		this.lenght = lenght;
		this.width = width;
		
		System.out.println(this.lenght);
	}
}
