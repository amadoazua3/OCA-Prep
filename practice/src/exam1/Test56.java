package exam1;

/*
    'append' method is overloaded in StringBuilder class: append(String),
    append(StringBuffer) and append(char[]) etc.

    In this case compiler gets confused as to which method `append(null)` can be tagged
    because String, StringBuffer and char[] are not related to each other in multilevel
    inheritance. Hence `sb.append(null)` causes compilation error.
*/
//public class Test56 {
//    public static void main(String[] args) {
//
//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.append(null).length());
//    }
//
//}
