import java.util.*;

public class Find_Maximum_Minimum{



    public  static ArrayList<Integer> getMinMax(int[] arr) {
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;
for(int i = 0 ; i<arr.length;i++){
    if(arr[i]>=max){
        max = arr[i];
    }
     if(arr[i] <=min ){ 
        min = arr[i];
    } 
}
ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);
        return result;
    }
    public static void main(String []arg){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        
        int arr[] = new int[n];
         for(int i =0 ; i<n ; i++ ){
            arr[i] = sc.nextInt();

         } 
         System.out.println(getMinMax(arr));

    }
}