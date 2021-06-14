import java.util.*;

public class Basics{
// 1 + 2
    public static void printnum(Integer num , Integer num2){
        for (int i = 1;  i < num;  i = i +num2){
            System.out.println(i);
        }
    }
// 3 
    public static Integer sum(Integer num , Integer num2){
        int sum = 0;
        for (int i = 0;  i < num;  i = i +num2){
            sum =  sum + i;
            System.out.println(String.format("New number: %d, Sum: %d", i, sum));
        }
        return sum;
    }
// 4
    public static void loop(int[] arr){
        
        for (int i = 0;  i < arr.length;  i++){
            System.out.println(arr[i]);
        }

    }

    public static Integer max(int[] arr){
        int max = 0;
        for (int i = 0;  i < arr.length;  i++){
            if ( arr[i]>max){
                max = arr[i];
            }
        }
    return max;
    }
// 5  
    public static int greater_than(int[] arr, int y){
        int counter = 0;
        for (int i = 0;  i < arr.length;  i++){
            if (arr[i]> y){
                counter++;
            }
        }
        return counter;
    }

    public static int[] square(int[] arr){
        
        for (int i = 0;  i < arr.length;  i++){
            arr[i] = arr[i]*arr[i];
        }
        return arr;
    }
    public static Integer arrsum(int[] arr){
        int sum = 0;
        for (int i = 0;  i < arr.length;  i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static Integer arravg(int[] arr){
        int a = arr.length;
        return arrsum(arr)/a;
    }

    public static int[] eliminate_negative(int[] arr){
        
        for (int i = 0;  i < arr.length;  i++){
            if (arr[i]< 0){
                arr[i] = 0;
            }
        }
        return arr;
    }


    
    public static Integer min(int[] arr){
        int min = 0;
        for (int i = 0;  i < arr.length;  i++){
            if ( arr[i]<min){
                min = arr[i];
            }
        }
    return min;
    }

    public static String info(int[] arr){
        String info = String.format("Max: %d, Min: %d Avg: %d", max(arr), min(arr), arravg(arr));
        return info;
    }

    public static int[] arrShifting(int[] arr){
        int last = arr.length-1;
        
        for (int i = 0;  i < arr.length-1;  i++){
            arr[i]= arr[i+1];
        }
        arr[last] = 0;
        // for(int i =0; i< arr.length ; i++){
        //     System.out.println(arr[i]);
        // }
        System.out.println(Arrays.toString(arr)); //the array is displayed wierdly
        return arr;
    }
}

