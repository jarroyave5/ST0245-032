import java.util.Random;
import java.util.concurrent.TimeUnit;
public class MergeSort
{
  public static int []a;
  public static void mergeSort(int[] a, int n) {
    if (n < 2) {
      return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid]; 
    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid); 
    merge(a, l, r, mid, n - mid);
  }
  public static void merge(int[]a, int[]l, int[]r, int left, int right) {  
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
  }
  public static void main(String[] args){
     for(int i=1;i <= 21; i++){
       long start=System.nanoTime();
       int n = 10000*i;
       a = new int[n];
        for(int j = 0; j < a.length; j++){
        a[j] = ((int)(Math.random() * 1000) + 1);   
       }          
       mergeSort(a,10000*i);
       long end= System.nanoTime();
       System.out.println(end-start);
       System.out.println("");
     }
  }
} 
