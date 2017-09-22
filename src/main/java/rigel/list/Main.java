package rigel.list;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TestVo testVo = new TestVo();
        testVo.setId(11);
        testVo.setType(1);


        List<TestVo> testVos1 = new ArrayList<TestVo>();
        testVos1.add(testVo);


        System.out.println(JSON.toJSON(testVos1));

        testVo.setType(2);

        System.out.println(JSON.toJSON(testVos1));


    }
}
