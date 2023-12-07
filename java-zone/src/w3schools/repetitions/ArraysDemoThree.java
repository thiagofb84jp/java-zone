package w3schools.repetitions;

public class ArraysDemoThree {
    public static void main(String[] args) {
        // declaring an two-dimensional array
        int[][] twoDimArrays = new int[10][20];
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}};

        // access elements
        System.out.println(myNumbers[1][2]); // outputs 7

        // change element value
        myNumbers[1][2] = 9;
        twoDimArrays[1][1] = 56;
        System.out.println(twoDimArrays[1][1]);
        System.out.println(myNumbers[1][2] + "\n"); // outputs 9

        //Loop through an multidimensional array
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        System.out.println();
        //We can do like this too:
        for (int[] myNumber : myNumbers) {
            for (int i : myNumber) {
                System.out.println(i);
            }
        }
    }
}
