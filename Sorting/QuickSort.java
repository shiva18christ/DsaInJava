package Sorting;

import java.util.Arrays;

public class QuickSort {
    public int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;

    }
    public void quicksort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int pivot=partition(arr,low,high);
        quicksort(arr,low,pivot-1);
        quicksort(arr,pivot+1,high);
    }
    public static void main(String[] args){
        QuickSort sort=new QuickSort();
        int arr[]={5,3,1,9,8,2,4,7};
        int low=0;
        int high= arr.length-1;
        sort.quicksort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
}
