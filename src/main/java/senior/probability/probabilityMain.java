/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package senior.probability;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by yangchuanlian on 2017/8/3.
 */
public class probabilityMain {


    public static void main(String[] args) {

        List<TestVo> testVos = new ArrayList<TestVo>();

        TestVo testVo1 = new TestVo();
        testVo1.setId(1);
        testVo1.setDesc("a");
        testVos.add(testVo1);

        TestVo testVo2 = new TestVo();
        testVo2.setId(2);
        testVo2.setDesc("b");
        testVos.add(testVo2);

        TestVo testVo3 = new TestVo();
        testVo3.setId(3);
        testVo3.setDesc("c");
        testVos.add(testVo3);

        TestVo testVo4 = new TestVo();
        testVo4.setId(4);
        testVo4.setDesc("d");
        testVos.add(testVo4);

        for (TestVo testVo : testVos) {
            if (testVo.getDesc().equals("c")) {
                testVos.remove(testVo);
            }
        }

        System.out.println(JSON.toJSONString(testVos));

        System.out.println(System.currentTimeMillis());
        System.out.println("1502421284120".length());
        System.out.println("9223372036854775807".length());
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.SECOND));

        for (int k = 0; k < 10; k++) {
            // write(k);
            if (k == 5) {
                return;
            }
            System.out.println(k);
        }


    }

    private static void write(int k) {
        if (k == 5) {
            return;
        }
        System.out.println(k);
    }


}
