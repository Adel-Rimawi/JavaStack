public class StringManipulationTest {
    
    public static void main(String[] args) {
// 1
        StringManipulation manipulator = new StringManipulation();
        String newstr = manipulator.Trim_concacat("    Hello     ","     World    ");
        System.out.println(newstr); 
// 2
        char letter = 'o';
        Integer a = manipulator.index_of("Coding", letter);
        Integer b = manipulator.index_of("Hello World", letter);
        Integer c = manipulator.index_of("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c);
// 3
    String word = "Hello";
    String subString = "llo";
    String notSubString = "world";
    Integer d = manipulator.index_of_string(word, subString);
    Integer e = manipulator.index_of_string(word, notSubString);
    System.out.println(a); // 2
    System.out.println(b); // null



// 4  

    String wordq4 = manipulator.concatSubstring("Hello", 1, 2, "world");
    System.out.println(wordq4); 

}

}       



