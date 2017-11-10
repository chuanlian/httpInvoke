package senior.genId;

import org.apache.log4j.Logger;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class IDGenerator {

    /**
     * log for this class
     */
    private static Logger logger = Logger.getLogger(IDGenerator.class);
    private static AtomicInteger currIndex = new AtomicInteger(0);

    /**
     * 初始化一个实例id
     * 系统的不重复实例id由db指定，需要依赖datacenter中的common包
     * 否则，就有千分之一的概率重复
     */
    private static String instanceID = "";
    private static int intInstanceID = 0;

    static {
        intInstanceID = new Random().nextInt(1000);
        instanceID = ("000" + String.valueOf(intInstanceID));
        instanceID = instanceID.substring(instanceID.length() - 3, instanceID.length());
        logger.info("instance id is inited with random value " + instanceID);
    }

    /**
     * 19位ID，前面13位是毫秒，后6位取纳秒9-15位，保证下毫秒的比上毫秒的大
     * lastedId用于防重复，极限情况在一个jvm冲突时，递归到不冲突为止
     *
     * @return 主键id字符串
     */
    public static String generateBigIntStringKey() {
        int tempIndex = currIndex.incrementAndGet() % 1000;
        long id = System.currentTimeMillis();
        id = (id * 1000 + intInstanceID) * 1000 + tempIndex;
        return String.valueOf(id);
    }

    /**
     * 以bigint为字段类型的主键生成器
     * 返回的key组成： <br>
     * <ol>
     * <li>12位 "yyMMddHHmmss"为格式的时间字符串</li>
     * <li>1位随机数字(0~9)</li>
     * <li>6位纳秒后缀字符串</li>
     * </ol>
     *
     * @return 主键id
     */
    public static Long generateBigIntKey() {
        return Long.valueOf(generateBigIntStringKey());
    }

    /**
     * @return
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }


    public static String getInstanceID() {
        return instanceID;
    }

    public static void setInstanceID(String instanceID) {
        IDGenerator.instanceID = instanceID;
        int tempID = IDGenerator.intInstanceID;
        try {
            tempID = Integer.parseInt(instanceID);
            IDGenerator.intInstanceID = tempID;
        } catch (Exception e) {
            logger.error("instance id be seted as " + instanceID, e);
        }
        logger.info("instance id be seted as " + instanceID);
    }

    public static void main(String args[]) {
        System.out.println(IDGenerator.intInstanceID);
        System.out.println(IDGenerator.generateBigIntStringKey());


        for (int k = 1; k < 100; k++) {
            System.out.println(System.currentTimeMillis());
        }
    }

}
