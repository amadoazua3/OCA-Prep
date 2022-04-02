package exam1;

/*
    It is a pass-by-reference scheme

    Initially, msg = "Happy New Year!"

    Call to method change(Message) doesn't modify the msg property of passed object
    rather it creates another Message object and modifies the msg property of new
    object to "Happy Holidays!"

    So, the instance of Message referred by obj remains unchanged.
    Hence in the output, you get:

    Happy New Year!
    Happy New Year!
*/

public class Test7 {

//    public static void change(Message m){
//        m = new Message();
//        m.msg = "Happy Holidays!";
//    }
//
//    public static void main(String[] args) {
//        Message obj = new Message();
//        obj.print();
//        change(obj);
//        obj.print();
//    }
}
