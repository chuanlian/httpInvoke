/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package rigel;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;
import com.baidu.rigel.ipangu.center.hint.client.HintClient;
import com.baidu.rigel.ipangu.center.hint.client.exporter.HintExporter;
import com.baidu.rigel.ipangu.center.hint.client.exporter.HintSourceTagExporter;

/**
 * @author yangchuanlian
 * 
 */
public class HintServiceTest {

    @Ignore
    @Test
    public void getAllHintSourceTagsTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        HintSourceTagExporter hintSourceTagExporter = (HintSourceTagExporter) context.getBean("hintSourceTagExporter");
        Map<String, String> response = hintSourceTagExporter.getAllHintSourceTags(41351L);
        System.out.println(JSON.toJSON(response));
    }

    @Test
    public void queryCustIdsByHintSourceTagTest() {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
            HintExporter hintExporter = (HintExporter) context.getBean("hintExporter");
            Long unitPosId = 41351L;
            String hintSourceTag = "9000000000001";
            Calendar start = Calendar.getInstance();
            start.add(Calendar.DAY_OF_MONTH, -10);
            Calendar end = Calendar.getInstance();
            end.add(Calendar.DAY_OF_MONTH, 10);
            List<Long> response =
                    hintExporter.queryCustIdsByHintSourceTag(unitPosId, hintSourceTag, start.getTime(), end.getTime());
            if (!CollectionUtils.isEmpty(response)) {
                System.out.println(JSON.toJSON(response));
            } else {
                System.out.println("null");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Ignore
    @Test
    public void queryCustIdsByHintSourceTagTest1() {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
            HintClient service = (HintClient) context.getBean("hintClient");
            Long unitPosId = 41351L;
            String hintSourceTag = "9000000000001";
            Calendar start = Calendar.getInstance();
            start.add(Calendar.DAY_OF_MONTH, -10);
            Calendar end = Calendar.getInstance();
            end.add(Calendar.DAY_OF_MONTH, 10);
            service.queryCustIdsByHintSourceTag(unitPosId, hintSourceTag, start.getTime(), end.getTime());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
