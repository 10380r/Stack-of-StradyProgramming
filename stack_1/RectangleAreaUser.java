public class RectangleAreaUser {
	public static void main(final String[] args){
		final  Rectangle rect = new Rectangle(10.0, 20.0);
		final double area = rect.getWidth() * rect.getHeight();
		//面積を表示
		System.out.println("面積："+ area);
	}
}
