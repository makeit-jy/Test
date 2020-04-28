//200427 Sort�ϴ� �޼���鸸 ���� Ŭ������ ���ΰ� FileManager�� �з���.

package pack1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Sort {
   
   /*************   Sort Ŭ������ ������ ������   *************/
//   int[] arr;      // ���ڵ� ������ ���� �迭
//   String data;    // ����������� ���� arr�迭�� ���ڵ��� ��ȯ�ؼ� ������ String�� ���� data    
//   int size;       // �迭�� ũ��
   int minIdx;     // ������ ���� �ʿ��� ������
   int minNum;
   final int INF = 2147483647;
   /* * * * * * * * * * * * * * * * * * * * * * * * * */
   
   
   /* Sort Ŭ������ ������ �Լ��� */
   /* fileReader,fileWriter,selection,insertion,merge,quick,print */
   
   int[] selection(int[] a) {   // �Ű����� �ִ� ������ �ٲ�
      int p = 0;
      while(p < a.length) {
         minIdx = 0;
         minNum = INF;
         
         for(int i=p; i<a.length; i++) {
            if(minNum > a[i]) {
               minNum = a[i];
               minIdx = i;
            }
         }
         
         int temp = a[minIdx];
         a[minIdx] = a[p];
         a[p] = temp;   
                                 
         p++;         
      }      
      System.out.println("(2)���ĿϷ� (����selection).");
      return a;
   }
   
//   void insertion() {
//	   for(int i=0; i<size; i++) {
//    	 int temp = arr[i];
//    	 
//    	 for(int j=0; j<i; j++) { //[0 ~ i-1]
//    		 if(arr[j] >= temp) {
//    			 for(int k=i; k>j; k--) { //[i ~ j+1]
//    				 arr[k] = arr[k-1];
//    			 }
//    			 arr[j] = temp;
//    			 j=size;//break; // j = 999999; j=size;
//    		 }
//    	 }	   
//		   
//	   }
//	   System.out.println("(2)���ĿϷ� (����insertion).");   
//   }

//   void merge(int data[], int p, int q, int r){                                                               
//	    int i=p, j=q+1, k=p;
//	    int tmp[data.length()];
//	    while(i<=q && j<=r){
//	        if(data[i]<=data[j])
//	            tmp[k++] = data[i++];
//	        else
//	            tmp[k++] = data[j++];
//	    }
//	    while (i<=q)
//	        tmp[k++] = data[i++];
//	    while (j<=r)
//	        tmp[k++] = data[j++];
//	    for(int i = p; i <= r; i++){
//	        data[i] = tmp[i];
//	    }
//   }
   
   public static void mergeSort(int[] arr) {
       sort1(arr, 0, arr.length);
 	   System.out.println("(2)���ĿϷ� (�պ�merge)."); 
   }

   private static void sort1(int[] arr, int low, int high) {
       if (high - low < 2) {
           return;
       }

       int mid = (low + high) / 2;
       sort1(arr, 0, mid);
       sort1(arr, mid, high);
       merge(arr, low, mid, high);
   }

   private static void merge(int[] arr, int low, int mid, int high) {
       int[] temp = new int[high - low];
       int t = 0, l = low, h = mid;

       while (l < mid && h < high) {
           if (arr[l] < arr[h]) {
               temp[t++] = arr[l++];
           } else {
               temp[t++] = arr[h++];
           }
       }

       while (l < mid) {
           temp[t++] = arr[l++];
       }

       while (h < high) {
           temp[t++] = arr[h++];
       }

       for (int i = low; i < high; i++) {
           arr[i] = temp[i - low];
       }
   }
   
   //void quick() {
   
    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
 	   	System.out.println("(2)���ĿϷ� (��quick)."); 
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
   
 //  }

}
