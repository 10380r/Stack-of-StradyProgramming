public class ImmutableRectangleUser{
	public static void main(String[] args){
		final ImmutableRectangle rect1 = new ImmutableRectangle(10.0,20.0);
		final ImmutableRectangle rect2 = modifyRectangle(rect1);
		describeRectangle(rect1);
		describeRectangle(rect2);
	}
	
	// ImmutableRectangleの値をコンソールに書く
	public static void describeRectangle(final ImmutableRectangle rect){
		System.out.println("値："+rect.getWidth()+"高さ："+rect.getHeight());
	}

	//ImmutableRectangleの値を変更する
	public static ImmutableRectangle modifyRectangle(final ImmutableRectangle rect){
		return rect.updWidth(50.0).updHeight(50.0);
	}
}

