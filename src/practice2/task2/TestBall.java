package practice2.task2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(100,100);
        System.out.println(ball);
        ball.move(12, 34);
        System.out.println(ball);

        Scanner sc = new Scanner(System.in);
        ball.setXY(sc.nextInt(), sc.nextInt()); // считываем в setXY строчки с консоли
        System.out.println(ball.getX() + " " + ball.getY());
    }
}
