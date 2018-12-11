public class RectangleAreaUser{
	public static void main(final String[] args){
	//OnDemandRectangleを生成し色々表示する
		describeRectangle(new OnDemandRectangle(10.0, 20.0));
		describeRectangle(new CachingRectangle(30.0,40.0));
		describeRectangle(new Square(10.0));

		final Rectangle rect1 = new OnDemandRectangle(20,30);
		final Rectangle rect2 = modifyRectangle(rect1);
		describeRectangle(rect2);

		final Rectangle squ1 = new Square(30.0);
		final Rectangle squ2 = modifyRectangle(squ1);
		describeRectangle(squ2);
	}

	//長方形の性質を表示する
	public static void describeRectangle(final Rectangle rect){
		System.out.println(
			"幅："+rect.getWidth()+", "+
			"高さ："+rect.getHeight()+", "+
			"面積："+rect.getArea()+", "+
			"対角線の長さ："+rect.getDiagonal()+", "+
			"周の長さ："+rect.getPerimeter()
		);
	}

	public static Rectangle modifyRectangle(final Rectangle rect) {
		return rect.updWidth(10.0).updHeight(20.0);
	}
}
