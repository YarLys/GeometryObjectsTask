abstract class GeometryObject implements Comparable<GeometryObject> {
    abstract void setScale(double scale);

    abstract double getSquare();

    @Override
    public int compareTo(GeometryObject o) {
        if (this.getSquare() < o.getSquare()) return -1;
        else {
            if (this.getSquare() > o.getSquare()) return 1;
            else return 0;
        }
    }
}
