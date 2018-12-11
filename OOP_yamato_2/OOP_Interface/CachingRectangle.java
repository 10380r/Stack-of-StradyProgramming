public class CachingRectangle implements Rectangle{
	public CachingRectangle(final double width, final double height){
		this.width = width;
		this.height = height;
		this.area = width*height;
		this.diagonal = Math.hypot(width, height);
		this.perimeter = width*2 + height*2;
	}
	final private double width;
	final private double height;
	final private double area;
	final private double diagonal;
	final private double perimeter;

	//長方形の幅
	public double getWidth(){return width;}
	//長方形の高さ
	public double getHeight(){return height;}
	//長方形の面積
	public double getArea(){return area;}
	//対角線の長さ
	public double getDiagonal(){return diagonal;}
	//周の長さ
	public double getPerimeter(){return perimeter;}

	public Rectangle updWidth(final double width) {
		return new CachingRectangle(width, this.height);
	}
	public Rectangle updHeight(final double height) {
		return new CachingRectangle(this.width, height);
	}
}
