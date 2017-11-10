package senior.algorithm;


/**
 * 打印一个字符数组的所有排列
 */
public class RankMain {


    public static void main(String[] args) {
        char[] strArray = {'a', 'b', 'c'};
        rank(strArray, 0);
    }

    private static void rank(char[] strArray, int i) {
        char temp;
        if (strArray == null || i > strArray.length || i < 0) {
            return;
        } else if (i == strArray.length) {
            System.out.println(strArray);
        } else {
            for (int j = i; j < strArray.length; j++) {
                temp = strArray[j];
                strArray[j] = strArray[i];
                strArray[i] = temp;
                rank(strArray, i + 1);
                temp = strArray[j];
                strArray[j] = strArray[i];
                strArray[i] = temp;
            }
        }
    }

}

