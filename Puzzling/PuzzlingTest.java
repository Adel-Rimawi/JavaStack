import java.util.ArrayList;
public class PuzzlingTest{
    public static void main(String[] args){
        Puzzling manipulator = new Puzzling();
        ArrayList<String> test = new ArrayList<String>();


        // ArrayList<Integer> numbers = new ArrayList<Integer>();
        // int[] nums = {3,5,1,2,7,9,8,13,25,32};
        



        // test = manipulator.arrsum(nums);
        // System.out.println(test);

        String[] str_arr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        test = manipulator.stringarr(str_arr);


        char[] chars= {'a', 'b','c' , 'd', 'e', 'f', 'g', 'h','i', 'j','k','l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        manipulator.alphabets(chars);
        int random_int = manipulator.generateRandom();
        System.out.println(random_int);

        ArrayList<Integer> int_list = new ArrayList<Integer>();
        int_list = manipulator.generateintarray();
        System.out.println(int_list);


    String new_str = manipulator.generatestr(chars, 10);

    ArrayList<String> strings = new ArrayList<String>();
    strings = manipulator.generate_str_array(chars, 10, 3);
    System.out.println(strings);
    }
}