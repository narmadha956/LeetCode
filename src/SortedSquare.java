import java.util.ArrayList;

public class SortedSquare {

    public static int[] sortedSquares(int[] A) {

        int[] B = new int[A.length];

        for (int i = 1; i < A.length; i++) {
            B[i] = A[i] * A[i];

        }

        ArrayList<Integer> sorted =new ArrayList<>();

        return B;

    }

    public static void main(String[] args) {

        int a[] = {8, 0, -1};
        System.out.println(sortedSquares(a));
    }

}

