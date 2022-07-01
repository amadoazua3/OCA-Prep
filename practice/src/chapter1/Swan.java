package chapter1;

public class Swan {

    int numberEggs;     // instance variable

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1;      // set variable
        System.out.println(mother.numberEggs);      // read variable
    }

}

/*
    Reading and Writing Object Fields I

    It's possible to read and write instance variables directly from
    the caller. Reading a variable is known as "setting" it. This class
    sets numberEggs to 1.
*/