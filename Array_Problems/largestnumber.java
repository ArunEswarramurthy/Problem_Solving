import java.util.*;
public class largestnumber{

 public static  int getSecondLargest(int[] arr) {
        
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i =0;i<arr.length ; i++){
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
                
            }
            else if(arr[i] <  max && arr[i] > max2){
                max2 = arr[i];
            }
            
        }
        
        
         if(max2 == Integer.MIN_VALUE ){
            return -1;
        }
        else{
           return max2;
        }
//d
        
    }


    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i =0;i<n;i++){
    arr[i] = sc.nextInt();
}
System.out.println(getSecondLargest(arr));

    }
}
