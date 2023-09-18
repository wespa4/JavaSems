package Study; // пакет - папка
import java.util.Random; // импортируем описание класса из пакета java.util.
import java.util.Scanner;
public class Car {
    private int speed; // переменная состояния объекта
    private int maxSpeed;
    // создаем констурктор. он позволяет инициализировать объект перед тем как начать им пользоваться
    public Car(int speed, int maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        System.out.println("Объект готов");
    }

    public void start() { // функция, описывающая поведение объекта
        System.out.println("Я начал ехать");
    }
    public void stop() {
        System.out.println("Я остановился");
    }
    // добавим новый метод для того, чтобы авто могло менять свое поведение - изменять тек. скорость
    public void setSpeed(int speed) {
        this.speed = speed;
        /*
        if (speed < maxSpeed) { // задаем ограничение на ввод с помощью условия
            this.speed = speed;
        }
        else {
            System.out.println("Вы передали слишком большую скорость");
        } */
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static void main(String[] args) { // метод
        var myCar = new Car(100, 500); // создаем объект класса Car
        Scanner sc = new Scanner(System.in);
        int mySpeed = sc.nextInt();
        if (mySpeed < 500) { // задаем ограничение на ввод с помощью условия
            myCar.setSpeed(mySpeed);
        }
        else {
            System.out.println("Вы передали слишком большую скорость");
        }
        myCar.start();
        System.out.println(myCar.getSpeed());
        myCar.stop();
        System.out.println(myCar.getMaxSpeed());
        // пример вывода рандомного числа
        var random = new Random(); // создаем объект класса Random
        System.out.println("рандомное число = " + random.nextInt());// nextInt = метод, возвращающий инт

    }
}

