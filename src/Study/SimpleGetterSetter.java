package Study;
/*
В Java геттер и сеттер — это два обычных метода, которые используются для
получения значения поля класса или его изменения (т.е. доступ к пер-ной извне).
*/
public class SimpleGetterSetter {
    private int number;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        SimpleGetterSetter obj = new SimpleGetterSetter();
        obj.setNumber(10);
        int number = obj.getNumber();
        System.out.println(number); //можно проще = System.out.println(obj.getNumber());
    }
}
