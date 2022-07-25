package chapter1;

public class Finalizer {

    protected void finalize() {
        System.out.println("Calling finalize");
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }

}

/*
    Java allows objects to implement a method called finalize() that might get called.
     This method gets called if the garbage collector tries to collect the object. If
     the garbage collector doesn’t run, the method doesn’t get called. If the garbage
     collector fails to collect the object and tries to run it again later, the method
     doesn’t get called a second time.

     In practice, this means you are highly unlikely to use it in real projects. Luckily,
     there isn’t much to remember about finalize() for the exam. Just keep in mind that
     it might not get called and that it definitely won’t be called twice.

     The reason is that the program exits before there is any need to run the garbage collector.
     While f is eligible for garbage collection, Java has better things to do than take out
     the trash constantly. For the exam, you need to know that this finalize() call could
     run zero or one time.
*/