package w3schools.variablesAndDataTypes;

public class DeclareMultipleVariables {
    public static void main(String[] args) {
        //You can declare just like these
        int x = 5;
        int y = 6;
        int z = 7;
        System.out.println(x + y + z);

        //Or declare like this one (in single line)
        int a = 5, b = 6, c = 7;
        System.out.println(a + b + c);

        //You can also assign the same value to multiple variables in one line
        int d, e, f;
        d = e = f = 50;
        System.out.println(d + e + f);
    }
}