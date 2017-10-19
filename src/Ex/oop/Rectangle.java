package Ex.oop;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;

	public Rectangle() {
		System.out.println(this.length);
	}

	public Rectangle(float lenght, float width) {
		this.length = lenght;
		this.setWidth(width);
	}

	public float getLenght() {
		return length;
	}

	public void setLenght(float lenght) {
		this.length = lenght;

	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getArea() {
		return this.width * this.length;

	}

	public double getPerimeter() {
		return 2 * (width * length);

	}

	public String toString() {
		return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
	}
}
