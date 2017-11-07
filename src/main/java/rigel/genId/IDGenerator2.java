package rigel.genId;

import java.util.concurrent.atomic.AtomicInteger;

public class IDGenerator2 {


    private static AtomicInteger currIndex = new AtomicInteger(0);

    /**
     * 实例id
     */
    private static int intInstanceID = 1;
    private static long START_ID = 3000000000000L;


    /**
     * 19位ID，前面13位是毫秒，后6位取纳秒9-15位，保证下毫秒的比上毫秒的大
     * lastedId用于防重复，极限情况在一个jvm冲突时，递归到不冲突为止
     *
     * @return 主键id字符串
     */
    public static String generateBigIntStringKey() {
        int tempIndex = currIndex.incrementAndGet() % 1000;
        long timeStamp = System.currentTimeMillis();
        long uniqueId = ((START_ID + timeStamp) * 1000 + getInstanceID()) * 1000 + tempIndex;
        return String.valueOf(uniqueId);
    }


    public static void main(String args[]) {
        System.out.println(System.currentTimeMillis() + "," + (System.currentTimeMillis() + "").length());
        System.out.println(IDGenerator2.intInstanceID);
        System.out.println(IDGenerator2.generateBigIntStringKey());
        for (int k = 0; k < 100; k++) {
            System.out.println(IDGenerator2.generateBigIntStringKey());
        }
    }

    /**
     * 分配分片ID:最多支持100个集群
     *
     * @return
     */
    public static int getInstanceID() {
        return intInstanceID;
    }
}
