public class RectangleAreaUser {
	public static void main(final String[] args){
		//長方形を生成する
		final Rectangle rect1 = new Rectangle(10.0, 20.0);
		final Rectangle rect2 = new Rectangle(30.0, 40.0);
		final Rectangle hypot = new Rectangle(40.0, 50.0);
		//rectの面積を表示する
		//System.out.println("面積："+rect.getArea());
		printTwoRectsArea(rect1,rect2);
		//対角線の長さを表示させる
		printHypot(hypot);
	}

	public static void printHypot(final Rectangle hypot){
		System.out.println("対角線："+ hypot.getDiagonal());
	}	

	public static void printTwoRectsArea(final Rectangle rect1, final Rectangle rect2){
		System.out.println("面積１："+rect1.getArea());
		System.out.println("面積２："+rect2.getArea());
	}
}
