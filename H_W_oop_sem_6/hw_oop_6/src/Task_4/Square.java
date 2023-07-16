package Task_4;

public class Square extends Rectangle {

    private int sideLength;

    @Override
    public int area() {
      return sideLength * sideLength;
    }

    @Override
    public void setHeight(int height) {
        super.height = sideLength;
    }

    @Override
    public void setWidth(int width) {
        super.width = sideLength;
    }

}
