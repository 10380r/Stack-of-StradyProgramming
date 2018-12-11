public class ImmutableRectangle {
	//コンストラクタ
	public ImmutableRectangle(final double width, final double height){
		this.width = width;
		this.height = height;
		if (this.width < 0 || this.height < 0){
			throw new IllegalArgumentException("Negative width not allowed: ");
		}
	}
	//フィールド
	final private double width;
	final private double height;

	//ゲッター群
	public double getWidth() {
		return width;
	}

	public double getHeight(){
		return height;
	}

	public ImmutableRectangle updWidth(final double width){
		return new ImmutableRectangle(width, this.height);
	}
	public ImmutableRectangle updHeight(final double height){
		return new ImmutableRectangle(this.width, height);
	}
}

