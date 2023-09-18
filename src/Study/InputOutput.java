package Study;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //создаем объект класса сканнер
        int i;
        System.out.println("Введите целое число: ");
        if(sc.hasNextInt()) { // hasNextInt = true, если считывается целое число
            i = sc.nextInt(); // считывает целое число
            System.out.println(i*2);
        }
        else {
            System.out.println("Введено не целое число!");
        }

        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println(s1 + s2);
    } // сущ-ет еще метод hasNext() - проверяет остались ли какие-то символы в целом
}
