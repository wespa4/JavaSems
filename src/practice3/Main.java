package practice3;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты класса Double с помощью метода valueOf()
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("2.718");

        // Преобразовываем значения типа String к типу double с помощью метода Double.parseDouble()
        String str = "1.618";
        double d3 = Double.parseDouble(str);

        // Преобразовываем объект класса Double ко всем примитивным типам
        double d4 = d1.doubleValue();
        float f1 = d2.floatValue();

        System.out.println("d1 = " + d1);

        // Преобразоваем литерал типа double к строке
        String d5 = Double.toString(2.302);
        System.out.println("d5 = " + d5);
    }
}