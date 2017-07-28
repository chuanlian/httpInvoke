/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package rigel;

import java.security.MessageDigest;
import java.util.Calendar;

import org.junit.Test;

import sun.misc.BASE64Encoder;

/**
 * @author yangchuanlian
 * 
 */
public class MessageDigestTest {

    @Test
    public void dateTest() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.HOUR, Integer.MAX_VALUE);
        System.out.println(calendar.getTime());
    }

    @Test
    public void testMd5() throws Exception {
        System.out.println(MD5("yangchuanlian"));
        System.out.println(byte2base64(getByte()));
        System.out.println(Integer.toBinaryString(18));
        System.out.println(Integer.toOctalString(18));
        System.out.println(Integer.toHexString(18));
        getByte();
    }

    /**
     * BASE 64 编码
     * 
     * @param bytes
     * @return
     */
    private String byte2base64(byte[] bytes) {
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(bytes);
    }

    private byte[] getByte() throws Exception {
        String content = "yangchuanlian";
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] bytes = md5.digest(content.getBytes("UTF-8"));
        return bytes;
    }

    private String MD5(String s) {
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
