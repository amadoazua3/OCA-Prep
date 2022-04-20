package exam5;

/*
    'profitPercentage' variable of Profitable interface is implicitly public, static and final.

    Line n1 defines the instance variable 'profitPercentage' of Business class. There is no error at Line n1.

    Super type reference variable can refer to an instance of Sub type, therefore no issues at Line n2 as well.

    Even though correct syntax for accessing interface variable is by using Interface name, such as
    Profitable.profitPercentage but reference variable also works. obj.profitPercentage doesn't cause any
    compilation error.

    As, obj is of Profitable type, hence obj.profitPercentage points to the 'profitPercentage' variable of
    Profitable type. Given code compiles successfully and on execution prints 42.0 on to the console.
*/

interface Profitable {
    double profitPercentage = 42.0;
}

class Business implements Profitable {
    double profitPercentage = 50.0; //Line n1
}

public class Test18 {

    public static void main(String[] args) {
        Profitable obj = new Business(); //Line n2
        System.out.println(obj.profitPercentage); //Line n3
    }

}
