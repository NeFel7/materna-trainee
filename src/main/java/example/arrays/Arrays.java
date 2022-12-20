package example.arrays;

public class Arrays {
    public static void main(String[] args) {
        double[] arr = new double[]{1, 2, 3, 4, 5};
        reverse(arr);
    }
    public static void reverse(double[] numbers) {


        for (int i = 0; i < (numbers.length - 1- i); i++) {
            double temp = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp;
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
}
