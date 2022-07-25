package chapter1;

public class Identifiers {

    public static void main(String[] args) {

        // Following are legal

        String okidentifier;
        String $OK2Identifier;
        String _alsoOK1d3ntifi3r;
        String __SStillOkbutKnotsonice$;

        // Following are not legal

//        String 3DPointClass;        // Can NOT begin with a number
//        String hollywood@vine;      // @ is not a letter, digit, $ or _
//        String *$coffee;            // * is not a letter, digit, $ or _
//        String public;              // public is a reserved word

    }

}

/*
    There are only three rules to remember for legal identifiers:

    ■ The name must begin with a letter or the symbol $ or _.

    ■ Subsequent characters may also be numbers.

    ■ You cannot use the same name as a Java reserved word. As you
    might imagine, a reserved word is a keyword that Java has reserved
    so that you are not allowed to use it. Remember that Java is case
    sensitive, so you can use versions of the keywords that only differ
    in case. Please don’t, though.
*/