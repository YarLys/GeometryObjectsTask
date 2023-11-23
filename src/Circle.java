public class Circle extends GeometryObject {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    void setScale(double scale) {
        this.r *= scale;
    }

    @Override
    double getSquare() {
        return (Math.PI * r * r);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
