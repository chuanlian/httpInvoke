package senior.algorithm;

/**
 * 实现 斐波那契数列
 */
public class FiboMain {

    public static void main(String[] args) {
        System.out.println("斐波那契数列的前20项为：");
        for (int j = 1; j <= 20; j++) {
            System.out.print(getFibo(j) + "\t");
            if (j % 5 == 0)
                System.out.println();
        }
    }

    private static int getFibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return getFibo(n - 1) + getFibo(n - 2);
    }
}
