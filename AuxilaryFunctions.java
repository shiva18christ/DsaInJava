public class AuxilaryFunctions {
    public int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int getMinValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);

    }

    public static void main(String[] args) {
        AuxilaryFunctions function = new AuxilaryFunctions();
        int[] array = {34, 43, 75, 12, 87, 33};
        int max = function.getMaxValue(array);
        System.out.println("The maximum value in the array is:" + max);
        int min = function.getMinValue(array);
        System.out.println("The minimum value in the array is:" + min);
        function.swap(23,32);

    }
}
