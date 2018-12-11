public class Square implements Rectangle{
	public Square(final double length) {
		this.length = length;
	}

	final private double length;

	//長方形の幅
	public double getWidth(){return length;}
	//長方形の高さ
	public double getHeight(){return length;}
	//長方形の面積
	public double getArea() {return Math.pow(length,2);}
	//対角線の長さ
	public double getDiagonal() {return Math.hypot(length, length);}
	//周の長さ
	public double getPerimeter() {return (length*2)*2;}

	public Rectangle updWidth(final double width) {
//		throw new UnsupportedOperationException("TODO");
		return new OnDemandRectangle(width,this.length);
	}

	public Rectangle updHeight(final double height) {
//		throw new RuntimeException("TODO");
		return new OnDemandRectangle(this.length, height);
	}
}
