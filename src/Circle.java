
public class Circle implements Shape {
	
	private int radius;
	
	public Circle(int r)
	{
		this.radius=r;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void calculatedArea() {
		System.out.println("Radius is "+this.radius);
		System.out.println("Area is "+Math.PI*this.radius*this.radius);
		
	}
	
	
	

}
