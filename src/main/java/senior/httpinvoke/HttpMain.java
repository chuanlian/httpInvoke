/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package senior.httpinvoke;

import com.alibaba.fastjson.JSON;
import com.baidu.rigel.newcastor.client.vo.Result;
import com.baidu.rigel.newpollux.client.exporter.SearchUpdateDataExporter;
import com.baidu.rigel.newpollux.client.vo.SearchUpdateDataVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * Created by yangchuanlian on 2017/7/28.
 */
public class HttpMain {

    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
                SearchUpdateDataExporter exporter = (SearchUpdateDataExporter) context.getBean("searchUpdateDataExporter");
                SearchUpdateDataVO searchUpdateDataVO = buildSearchUpdateDataVO(args);
                Result<Boolean> result = exporter.addSearchUpdateData(searchUpdateDataVO);
                System.out.println(JSON.toJSONString(result));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /**
     * 构造参数
     *
     * @return
     */
    private static SearchUpdateDataVO buildSearchUpdateDataVO(String[] args) {
        Long leadsId = Long.parseLong(args[0]);
        SearchUpdateDataVO searchUpdateDataVO = new SearchUpdateDataVO();
        searchUpdateDataVO.setPosId(20170622L);
        searchUpdateDataVO.setDataId(leadsId);
        searchUpdateDataVO.setAddTime(Calendar.getInstance().getTime());
        searchUpdateDataVO.setOperation((byte) 0);
        searchUpdateDataVO.setSearchId(21L);
        searchUpdateDataVO.setStatus((byte) 0);
        searchUpdateDataVO.setUpdTime(Calendar.getInstance().getTime());
        return searchUpdateDataVO;
    }
}
