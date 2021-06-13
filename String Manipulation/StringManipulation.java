

public class StringManipulation {
// 1
    public static String Trim_concacat(String str1 ,String str2){
        return str1.trim().concat(str2.trim());
    }

// 2
    public static Integer index_of(String str1 , char c){
        int a = str1.indexOf(c);
        if (a == -1){
            return null;
        }
        return a;
    }

// 3
    public static Integer index_of_string(String str1 , String c){
        int a = str1.indexOf(c);
        if (a == -1){
            return null;
        }
        return a;
    }

// 4
    public static String concatSubstring(String substr, int start, int end, String mainstr){
        String sub = substr.substring(start, end);
        String result =  sub.concat(mainstr);
        return result;
    }
}