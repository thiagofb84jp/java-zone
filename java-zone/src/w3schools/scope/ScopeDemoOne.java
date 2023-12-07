package w3schools.scope;

public class ScopeDemoOne {
    public static void main(String[] args) {
        //code block CANNOT use x here
        int x = 100;
        //code block CAN use x here
        System.out.println(x);
    }
}
