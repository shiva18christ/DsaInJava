import java.util.Arrays;
class Demo{
    public static void main(String[] args){
        int[] arr={11,22,33,44};
        System.out.println("original array:"+ Arrays.toString(arr));
        int[] reversed=reverse(arr);
        System.out.println("Reversed array :"+Arrays.toString(reversed));
    }
    private static int[] reverse(int[] arr){
        int i=0;int j=arr.length-1;
        while(i<j){
            int c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
            i++;
            j--;
        }
        return arr;
    }
}