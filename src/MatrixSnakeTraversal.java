public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {

        int k = 0;
        int length = input.length;

        int[] array = new int[length * input[0].length];

        for (int row = 0; row < input[0].length; row++) {
            if (row % 2 == 0) {
                for (int i = 0; i < length; i++) {
                    array[k] = input[i][row];
                    k++;
                }
            } else if (row % 2 != 0) {
                for (int i = length - 1; i >= 0; i--) {
                    array[k] = input[i][row];
                    k++;
                }
            }
        }
        return array;
    }
}