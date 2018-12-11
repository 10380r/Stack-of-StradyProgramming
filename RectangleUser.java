public class Rectangle {
    // 幅と高さを指定して長方形を生成する
    public Rectangle(final double width, final double height) {    // (1)
      this.width  = width;
      this.height = height;
    }

    final private double width;
    final private double height;

    // 長方形の幅
    public double getWidth() {
        return width;
    }

    //長方形の高さ
    public double getHeight() {
        return height;
    }
}
