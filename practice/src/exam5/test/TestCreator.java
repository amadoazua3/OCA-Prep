package exam5.test;

import exam5.Creator;

public class TestCreator {
    public static void main(String[] args) {
        System.out.println(Creator.create());
    }
}

/*
    Which of the above options needs to be done so that on executing TestCreator class,
    "Planet: Earth" is printed on to the console?

    Please note: Unnecessary imports are not allowed.

    1.

    Add below import statement in Creator.java file:

    import com.udayankhattry.galaxy.Planet;



    2.

    Add below import statement in Creator.java file:

    import com.udayankhattry.oca.test.TestCreator;



    3.

    Add below import statement in TestCreator.java file:

    import com.udayankhattry.oca.Creator;



    4.

    Add below import statement in TestCreator.java file:

    import com.udayankhattry.galaxy.Planet;

*/

/*
    Planet is defined in 'galaxy' package, Creator is defined in 'exam5'
    package and TestCreator is defined in 'exam5.test' package.

    Planet class doesn't mention 'Creator' or 'TestCreator' and hence no import statements are needed in Planet class.

    Creator class uses the name 'Planet' in its code and hence Creator class needs to import Planet class using
    'import galaxy.Planet;' statement or 'import galaxy.*;' statement.

    TestCreator class uses the name 'Creator' in its code and hence TestCreator class needs to import Creator class
    using 'import exam5.Creator;' statement or 'import exam5.*;' statement.

    Please note, even though in TestCreator class, `Creator.create()` returns an instance of Planet class but as name
    'Planet' is not used, hence Planet class is not needed to be imported.

    Planet class correctly overrides toString() method, hence when an instance of Planet class is passed to println(...)
    method, as in the below statement:

    System.out.println(Creator.create());

    toString() method defined in the Planet class is invoked, which print "Planet: Earth" on to the console.
*/
