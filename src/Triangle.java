public class Triangle extends GeometryObject {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void setScale(double scale) {
        this.a *= scale;
        this.b *= scale;
        this.c *= scale;
    }

    @Override
    double getSquare() {
        int p = this.a + this.b + this.c;
        return (Math.sqrt((p - this.a) * (p - this.b) * (p - this.c) * p));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
