/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package rigel.nakri;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import rigel.nakri.utils.MyStringUtil;

/**
 * 
 * @author yangchuanlian
 * 
 */
// ① 标注使用PowerRunner运行test（powermock会修改字节码）
@RunWith(PowerMockRunner.class)
public class HelloTest {

    @Test
    @PrepareForTest({ MyStringUtil.class })
    public void test() {
        PowerMockito.mockStatic(MyStringUtil.class);
        PowerMockito.when(MyStringUtil.uppercase("abc")).thenReturn("ABC");
        Assert.assertEquals("ABC", MyStringUtil.uppercase("abc"));
    }
}
