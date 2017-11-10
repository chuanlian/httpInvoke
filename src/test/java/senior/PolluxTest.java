/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package senior;

import com.alibaba.fastjson.JSON;
import com.baidu.rigel.newcastor.client.vo.Result;
import com.baidu.rigel.newpollux.client.exporter.SearchUpdateDataExporter;
import com.baidu.rigel.newpollux.client.vo.SearchUpdateDataVO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * Created by yangchuanlian on 2017/7/28.
 */
public class PolluxTest {


    @Test
    public void testSendPollux() {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
            SearchUpdateDataExporter exporter = (SearchUpdateDataExporter) context.getBean("searchUpdateDataExporter");
            SearchUpdateDataVO searchUpdateDataVO = new SearchUpdateDataVO();

            searchUpdateDataVO.setPosId(20170622L);
            searchUpdateDataVO.setDataId(1500987018905819280L);
            searchUpdateDataVO.setAddTime(Calendar.getInstance().getTime());
            searchUpdateDataVO.setOperation((byte) 0);
            searchUpdateDataVO.setSearchId(21L);
            searchUpdateDataVO.setStatus((byte) 0);
            searchUpdateDataVO.setUpdTime(Calendar.getInstance().getTime());
            Result<Boolean> result = exporter.addSearchUpdateData(searchUpdateDataVO);
            System.out.println(JSON.toJSONString(result));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
