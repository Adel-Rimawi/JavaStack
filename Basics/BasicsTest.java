public class BasicsTest{
// 1 
    public static void main(String[] args) {
        Basics manipulator = new Basics();
    //     int print_to = 255;
    //     manipulator.printnum(255, 1);
    //     }
// 2 
        // manipulator.printnum(255, 2);
// 3
        // int sum = manipulator.sum(255, 1);
// 4
        int[] myArray = {4, 8, 8, 5, 9,20,5,-5};
        // manipulator.loop(myArray);
// 5
        // int max = manipulator.max(myArray);
        // System.out.println(max);

// 6
        // int greater = manipulator.greater_than(myArray, 6);
        // System.out.println(greater);


// 7 weird result must check later
//         int[] square = manipulator.square(myArray);
//         System.out.println(square);

// 8 
    int avg =  manipulator.arravg(myArray);
    System.out.println(avg);
// 9 again weird result, i think it's because of returning arr[]
    int[] eliminateneg =  manipulator.eliminate_negative(myArray);
    System.out.println(eliminateneg);
    }

}