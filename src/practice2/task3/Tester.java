package practice2.task3;
import java.util.ArrayList;
public class Tester {
    private Circle[] circles;
    private int numCircles;

    public Tester(int maxCircles) {
        circles = new Circle[maxCircles];
        numCircles = 0;
    }

    public void addCircle(Circle circle) {
        circles[numCircles] = circle;
        numCircles++;
    }

    public int getNumCircles() {
        return numCircles;
    }

    public Circle getCircle(int i) {
        return circles[i];
    }

    public static void main(String[] args) {
        Point newPoint = new Point(3, 7);
        Circle newCircle = new Circle(newPoint, 5);
        Tester test = new Tester(10);

        test.addCircle(newCircle);
        System.out.println("Number of circles: " + test.getNumCircles());
        System.out.println("Circle radius: " + test.getCircle(0).getRadius());
    }
}