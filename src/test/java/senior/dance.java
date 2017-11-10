/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package senior;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

/**
 * @author yangchuanlian
 * 
 */
public class dance {
    List<Fatuid> fatuids = new ArrayList<Fatuid>();

    @Before
    public void Setup() {
        Fatuid fatuid1 = new Fatuid();
        fatuid1.setFatuid("adsfasfas1");
        fatuids.add(fatuid1);
        //Fatuid fatuid2 = new Fatuid();
        //fatuid2.setFatuid("sadfadsf2");
        //fatuids.add(fatuid2);
    }

    @Test
    public void test() {
        for (int k = 0; k < 50; k++) {
            int size = fatuids.size();
            Random random = new Random();
            int index = random.nextInt(size);
            Fatuid fatuid = fatuids.get(index);
            System.out.println(fatuid.getFatuid());
        }
    }

    class Fatuid {

        private String fatuid;

        public String getFatuid() {
            return fatuid;
        }

        public void setFatuid(String fatuid) {
            this.fatuid = fatuid;
        }

    }

}
