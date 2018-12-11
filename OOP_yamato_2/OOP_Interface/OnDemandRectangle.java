public class OnDemandRectangle implements Rectangle{
	public OnDemandRectangle(final double width, final double height){
		this.width = width;
		this.height = height;
	}

	final private double width;
	final private double height;

	//長方形の
	public double getWidth(){return width;}
	//長方形の高さ
	public double getHeight(){return height;}
	//長方形の面積
	public double getArea() {return width * height;}
	//対角線の長さ
	public double getDiagonal() {return Math.hypot(width, height);}
	//周の長さ
	public double getPerimeter() {return width*2 + height*2;}

	public Rectangle updWidth(final double width) {
		return new OnDemandRectangle(width,this.height);
	}
	public Rectangle updHeight(final double height) {
		return new OnDemandRectangle(this.width,height);
	}
}
