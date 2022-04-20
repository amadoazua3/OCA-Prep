package exam5;

/*
    Profit class causes compilation error as it complains about duplicate default
    methods: Profitable1.profit() and Profitable2.profit(). To rectify this error
    abstract class Profit must override the profit() method.

    default keyword for method is allowed only inside the interface and default
    methods are implicitly public. So overriding method should use public modifier
    and shouldn't use default keyword.

    If you want to invoke the default method implementation from the overriding
    method, then the correct syntax is: [Interface_name].super.[default_method_name].

    Hence, `Profitable1.super.profit();` will invoke the default method of Profitable1
    interface and `Profitable2.super.profit();` will invoke the default method of
    Profitable2 interface.

    Based on above points, let's check all the options one by one:

    No need for any modifications, code compiles as is: ✗


    Replace / *INSERT* / with below code:

            double profit() {

            return 50.0;

            }: ✗

            profit() method must be declared with public access modifier.



            Replace / *INSERT* / with below code:

    public default double profit() {

            return 50.0;

            }: ✗

    default keyword for method is allowed only inside the interface.



            Replace / *INSERT* / with below code:

    protected double profit() {

            return 50.0;

            }: ✗

            profit() method must be declared with public access modifier.



            Replace / *INSERT* / with below code:

    public double profit() {

            return Profitable1.profit();

            }: ✗

            Profitable1.profit(); causes compilation error as correct syntax is: Profitable1.super.profit();



            Replace / *INSERT* / with below code:

    public double profit() {

            return Profitable2.super.profit();

            }: ✓

            It compiles successfully.
*/


public abstract class Profit implements Profitable1, Profitable2 {

    public double profit() {
        return Profitable2.super.profit();
    }
}
