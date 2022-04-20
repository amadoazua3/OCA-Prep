package exam5;

/*
    The static method of subclass cannot hide the instance method of superclass. static main(String [])
    method at Line n2 tries to hide the instance main(String []) method at Line n1 and hence Line n2 causes
    compilation error.

    There is no issue with Line n3 as it is a valid syntax to invoke the instance main(String []) method of M class.

    No issue with Line n4 as well as it correctly invokes static main(String []) method of N class.
*/

class M {

//    public void main(String[] args) { // Original code
//        System.out.println("M");
//    }

    public static void main(String[] args) { //Line n1 // Have to add static so the error for line n2 is resolved
        System.out.println("M");
    }
}

class N extends M {

    public static void main(String[] args) { //Line n2 // causes the error
        new M().main(args);
    }
}

public class Test24 {

    public static void main(String[] args) {
        N.main(args); //Line n4
    }

}
