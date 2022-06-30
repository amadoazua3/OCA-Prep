package chapter1;


/*
    If you really need to use two classes with the same name....

    Sometimes you really do want to use Date from two different packages. When
    this happens, you can pick one to use in the import and use the other's fully
    qualified class name to specify that it's special. For example:

*/

//import java.util.Date;
//
//public class Conflicts {
//
//    Date date;
//    java.sql.Date sqlDate;
//
//}

/*
    Or you could have neither with an import and always use the fully qualified class name:
*/

public class Conflicts {

    java.util.Date date;
    java.sql.Date sqlDate;

}