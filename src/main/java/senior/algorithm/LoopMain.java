package senior.algorithm;


import org.apache.commons.lang.StringUtils;

/**
 * 实现回文判断
 */
public class LoopMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isLoopWord("abcdedcba", 0));
        System.out.println(isLoopWord("abcddcba", 0));
        System.out.println(8 / 2);
        System.out.println(9 / 2);
    }

    private static boolean isLoopWord(String word, int index) {
        if (StringUtils.isBlank(word)) {
            return false;
        }
        if (word.charAt(index) == word.charAt(word.length() - 1 - index)) {
            if (index == (word.length() + 1) / 2) {
                return true;
            }
            return isLoopWord(word, index + 1);
        } else {
            return false;
        }
    }
}
