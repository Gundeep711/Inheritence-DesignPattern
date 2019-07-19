import javax.swing.plaf.synth.SynthScrollBarUI;

public class Square implements Shape {
	//properties
	int width;
	int height;
	String color;
	
	public Square(int h, int w, String c) {
		this.height=h;
		this.width=w;
		this.color=c;
	}
	
	public void sayHello() {
		System.out.println("I am a "+this.color+" square.");
	}
	
	//getters and setters

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void calculatedArea() {
		int area=this.height*this.width;
		System.out.println("My area is "+area);
	}
	
	
	
	


}
