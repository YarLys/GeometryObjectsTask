public class Rectangle extends GeometryObject {
    int a;
    int b;
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void setScale(double scale) {
        this.a *= scale;
        this.b *= scale;
    }

    @Override
    double getSquare() {
        return (this.a * this.b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
