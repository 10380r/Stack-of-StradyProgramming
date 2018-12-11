public interface Rectangle{
	//長方形の面積
	public double getWidth();
	//長方形の高さ
	public double getHeight();
	//長方形の面積
	public double getArea();
	//対角線の長さ
	public double getDiagonal();
	//長方形の周の長さ
	public double getPerimeter();
	//セッター
	public Rectangle updWidth(final double width);
	public Rectangle updHeight(final double height);
}
