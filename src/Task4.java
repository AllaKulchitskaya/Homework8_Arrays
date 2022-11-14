public class Task4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
            }
            System.out.println(array1[i]);
        }
    }
}
