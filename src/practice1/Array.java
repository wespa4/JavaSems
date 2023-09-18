package practice1;

public class Array {
    public static void main(String[] args) {
        double sum = 0;
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = i;
            sum += i;
        }
        double average = sum / array.length;
        System.out.println(sum);
        System.out.println(average);
    }
}
