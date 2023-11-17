package w3schools.switchStatement;

public class SwitchDemo {
    public static void main(String[] args) {

        String username = "James";
        switch (username) {
            case "Doe":
                System.out.println("Username is Doe");
                break;
            case "John":
                System.out.println("Username is John");
                break;
            case "James":
                System.out.println("Username is James");
                break;
        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}