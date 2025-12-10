import java.util.*;
public class krotate{
    public void rotatearray(int arr , int k ){
        int n = arr.length;
        int kk = k % n;
        if (kk < 0) kk += n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, kk - 1);
        reverse(arr, kk, n - 1);

        System.out.println("Rotated array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        rotateArray(arr, k);
        sc.close();
    }
}
            import java.util.*;

            public class krotate {
                public static void rotateArray(int[] arr, int k) {
                    if (arr == null || arr.length == 0) {
                        System.out.println("Array is empty, nothing to rotate.");
                        return;
                    }

                    int n = arr.length;
                    int kk = k % n;
                    if (kk < 0) kk += n;

                    reverse(arr, 0, n - 1);
                    reverse(arr, 0, kk - 1);
                    reverse(arr, kk, n - 1);

                    System.out.println("Rotated array:");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }

                public static void reverse(int[] arr, int start, int end) {
                    while (start < end) {
                        int temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        start++;
                        end--;
                    }
                }

                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the size of the array:");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter the elements of the array:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Enter the value of k:");
                    int k = sc.nextInt();
                    rotateArray(arr, k);
                    sc.close();
                }
            }