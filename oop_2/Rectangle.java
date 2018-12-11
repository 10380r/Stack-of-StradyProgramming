public class Rectangle{
	public Rectangle(final double width, final double height){
		this.width = width;
		this.height = height;
	}

	final private double width;
	final private double height;

	//長方形の幅
	public double getWidth() {return width;}
	//長方形の高さ
	public double getHeight() {return height;}
	//長方形の面積
	public double getArea() {return width * height;}
	//対角線の長さ
	public double getDiagonal() {return Math.hypot(width, height);}
}
