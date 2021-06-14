import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.Random;

public class Puzzling{

    public static ArrayList<Integer> arrsum(int[] arr){
        int sum = 0;
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        for (int i = 0;  i < arr.length;  i++){
            sum = sum + arr[i];
            if (arr[i]> 10){
                newarr.add(arr[i]);
            }
        }
        
        System.out.println(sum);
        return newarr;
    }

    public static String[] shuffeArray(String[] arr) {
		Random r = new Random();
		for(int i = 0; i < arr.length/2; i++) {
			String temp = arr[i];
			int randomIndex = r.nextInt(arr.length - i) + i;
			arr[i] = arr[randomIndex];
			arr[randomIndex] = temp;
		}
        return arr;
	}
    public static ArrayList<String> stringarr(String[] arr){
        shuffeArray(arr);
        ArrayList<String> newarr = new ArrayList<String>();
        for (int i =0; i<arr.length; i++){
            String temp = arr[i];
            int strlength = temp.length();
            if (strlength > 5 ){
                newarr.add(arr[i]);
            }
        }
        System.out.println(newarr);
        return newarr;
    }

    public static char[] shuffechars(char[] arr) {
		Random r = new Random();
		for(int i = 0; i < arr.length/2; i++) {
			char temp = arr[i];
			int randomIndex = r.nextInt(arr.length - i) + i;
			arr[i] = arr[randomIndex];
			arr[randomIndex] = temp;
		}
        return arr;
	}


        public static void alphabets(char[] arr){
        shuffechars(arr);
        System.out.println(String.format("%s is first", arr[0]));
		System.out.println(String.format("%s is last", arr[25]));
        if (arr[0]== 'a' || arr[0] == 'e' || arr[0] == 'i' || arr[0] == 'o' || arr[0] == 'u' ){
            System.out.println("This is a vowel");
        }    
    }
        public static Integer generateRandom(){
            Random rand = new Random();
            int rand_int = rand.nextInt(45)+55;
            return rand_int;
        }
        public static ArrayList<Integer> generateintarray(){
            ArrayList<Integer> newarr = new ArrayList<Integer>();
            for (int i =0; i<10; i++){
                Random rand = new Random();
                int rand_int = rand.nextInt(45)+55;
                newarr.add(rand_int);
            }
            Collections.sort(newarr);
            return newarr;
        }

        public static String generatestr(char[] chars, int length){
            String newstr = "";
            for (int i =0; i<length; i++){
                Random rand = new Random();
                int rand_int = rand.nextInt(26);
                newstr = newstr + chars[rand_int];
            }
            System.out.println(newstr);
            return newstr;
        }


        public static ArrayList<String> generate_str_array(char[] chars, int length, int str_length){
            ArrayList<String> newarr = new ArrayList<String>();
            for (int i =0; i<length; i++){
                String new_str =  generatestr(chars, str_length);
                newarr.add(new_str);
            }
            return newarr;
        }
    }
    
    
