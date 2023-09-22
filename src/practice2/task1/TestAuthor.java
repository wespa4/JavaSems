package practice2.task1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] main) {
        Author author = new Author( "Ann","anDelm@mail.ru", 'F');
        System.out.println(author);

        author.setEmail("anDelm@yandex.ru"); // задаем полю другое значение сеттером
        System.out.println(author);

        Scanner sc = new Scanner(System.in); // реализуем задание полю другого значения через ввод с консоли
        String newEmail = sc.nextLine(); // считываем строку с консоли в новую переменнуюв
        author.setEmail(newEmail); // сеттим в поле новую переменную
        System.out.println(author);

        System.out.println(author.getName() + " " + author.getEmail() + " " + author.getGender()); // выводим поля геттами
    }

}