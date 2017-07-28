/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package rigel;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author yangchuanlian
 * 
 */
public class LogTest {

    /**
     * log for this class
     */
    private Logger logger = Logger.getLogger(LogTest.class);

    @Before
    public void setUp() {

    }

    @Test
    public void method1() {
        try {
            String smsContext = "您好,恭喜您成功注册百度糯米商家平台帐号,您的账户名是:%s,点击链接%s下载百度糯米商家app,使用该账户名" +
                    "登录即可免费开糯米网店,现在就去下载吧!";
            smsContext = String.format(smsContext, "aaa.@qq.com", "http://b.nuomi.com/");
            String smsContext_utf8 = new String(smsContext.getBytes("GBK2312"), "UTF-8");
            System.out.println(smsContext_utf8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        
      
        
        
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("1");
        sBuilder.append("2");
        sBuilder.append("3");
        sBuilder.append("4");
        System.out.println(sBuilder);
        System.out.println(sBuilder.toString());
        
        String a="ni hao %s,nihao %s";
        a=String.format(a, "a",'n');
        System.out.println(a);
        
        String mobile="13810192343";
        String[] mobilesStrings=new String[]{mobile};
        System.out.println(mobilesStrings.length);
        System.out.println(mobilesStrings[0]);
        
    }

    @Ignore
    @Test
    public void log() {
        System.out.println(new Date().getTime());
        System.out.println(new Random(new Date().getTime()).nextInt());
        Double random = new Random(new Date().getTime()).nextDouble();
        System.out.println(random);
        String name1 = "yangchuanlian";
        String name2 = "YANGCHUANLIAN";

        if (StringUtils.equalsIgnoreCase(name1, name2)) {
            System.out.println("OK");
        }
        // 获得当前目录路径
        String filePath = this.getClass().getResource("/").getPath();
        // 找到log4j.properties配置文件所在的目录(已经创建好)
        filePath = filePath.substring(1).replace("bin", "src");
        System.out.println(filePath);

        PropertyConfigurator.configure(filePath + "log4j.properties");
    }
}
