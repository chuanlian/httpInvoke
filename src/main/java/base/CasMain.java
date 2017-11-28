package base;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CasMain {

    private static final String name;
    private static String sex = "男";

    static {
        name = "dsafs";
    }

    public static void main(String[] args) {

        System.out.println(name);
        sex = "女";
        System.out.println(sex);
        System.out.println(1 << 4);
        Map<String, String> map = new ConcurrentHashMap<String, String>();
        map.put("a", "a");
        map.get("a");
        map.remove("a");
        System.out.println(JSON.toJSON(map));

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("a", "a");
        map2.get("a");
        map2.remove("a");
        System.out.println(JSON.toJSON(map2));
        return;
    }

    static class test {
        private String name;

        test(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
