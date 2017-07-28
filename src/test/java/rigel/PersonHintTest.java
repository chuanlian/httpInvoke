/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package rigel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.baidu.rigel.ipangu.center.personhint.client.exporter.PersonHintExporter;
import com.baidu.rigel.ipangu.center.personhint.client.vo.PersonHintContactVo;
import com.baidu.rigel.ipangu.center.personhint.client.vo.PersonHintInfoVo;
import com.baidu.rigel.ipangu.center.personhint.client.vo.PersonHintSiteVo;
import com.baidu.rigel.ipangu.center.personhint.client.vo.PersonHintVo;

/**
 * @author yangchuanlian
 * 
 */
public class PersonHintTest {

    @Test
    public void addHintTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        PersonHintExporter personHintExporter = (PersonHintExporter) context.getBean("personHintExporter");

        PersonHintInfoVo personHintInfoVo = setPersonHintInfoVo();
        Map<String, String> map = personHintExporter.addPersonHint(personHintInfoVo);
        if (map != null) {
            System.out.println(JSON.toJSON(map));
        }
    }

    private PersonHintInfoVo setPersonHintInfoVo() {
        PersonHintInfoVo personHintInfoVo = new PersonHintInfoVo();
        PersonHintVo personHintVo = new PersonHintVo();
        personHintVo.setCname("test");
        personHintVo.setAddPosid("12312");
        personHintVo.setAddUcid("12321213213");
        personHintVo.setColor(0L);
        personHintVo.setRemark("");
        personHintVo.setSourceId(4L);
        personHintVo.setStat(0L);
        personHintInfoVo.setPersonHintVo(personHintVo);

        List<PersonHintSiteVo> personHintSiteVo = new ArrayList<PersonHintSiteVo>();
        PersonHintSiteVo personHintSiteVo2 = new PersonHintSiteVo();
        personHintSiteVo2.setSiteUrl("http://www.baidu.com");
        personHintSiteVo.add(personHintSiteVo2);
        personHintInfoVo.setPersonHintSiteVo(personHintSiteVo);

        List<PersonHintContactVo> personHintContactVo = new ArrayList<PersonHintContactVo>();
        PersonHintContactVo personHintContactVo2 = new PersonHintContactVo();
        personHintContactVo2.setCname("test");
        personHintContactVo2.setPhoneNum("13811991543");
        personHintContactVo.add(personHintContactVo2);

        personHintInfoVo.setPersonHintContactVo(personHintContactVo);
        return personHintInfoVo;
    }
}
