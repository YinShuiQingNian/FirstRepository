//‘≤¿‡
class Circle
{
	private int r;//∞Îæ∂
	Circle(int r)
	{
		this.r=r;
	}
	public double getArea()
	{
		return 3.14*r*r;
	}
}
//æÿ–Œ¿‡
class JuXing
{
	private int width;
	private int height;
	JuXing(int width,int height)
	{
		this.width=width;
		this.height=height;
	}
	public double getArea()
	{
		return width*height;
	}
}
class AbstractDemo 
{
	public static void main(String[] args) 
	{
		System.out.println(new Circle(10).getArea());
		System.out.println(new JuXing(10,10).getArea());
	}
}
