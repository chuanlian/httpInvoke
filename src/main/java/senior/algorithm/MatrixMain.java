package senior.algorithm;

/**
 * 顺时针打印一个矩阵
 */
public class MatrixMain {

    public static void main(String[] args) {

        int[][] num = new int[100][100];
        int n = 6;
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = count++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(num[i][j]);
            }
        }

        output(num, 0, n - 1);

    }

    private static void output(int[][] num, int start, int end) {

        if (start > end || end <= 0) return;
        for (int i = start; i <= end; i++) {
            System.out.println(num[start][i]);
        }
        for (int i = start + 1; i <= end; i++) {
            System.out.println(num[i][end]);
        }

        for (int i = end - 1; i >= start; i--) {
            System.out.println(num[end][i]);
        }
        for (int i = end - 1; i > start; i--) {
            System.out.println(num[i][start]);
        }

        output(num, start + 1, end - 1);
    }
}
