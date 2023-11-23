import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GeometryObject[] objects = new GeometryObject[]{new Rectangle(4, 5),
        new Triangle(5, 7, 8), new Circle(10)};
        Arrays.sort(objects);
        System.out.println(Arrays.toString(objects));
        objects[0].setScale(5);
        Arrays.sort(objects);
        System.out.println(Arrays.toString(objects));
    }
}