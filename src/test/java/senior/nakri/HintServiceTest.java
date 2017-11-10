/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package senior.nakri;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

import senior.nakri.service.impl.HintServiceImpl;
import senior.nakri.Dao.HintDao;
import senior.nakri.bo.Hint;
import senior.nakri.service.HintService;

/**
 * @author yangchuanlian
 * 
 */
public class HintServiceTest {

    @InjectMocks
    private HintService hintService = new HintServiceImpl();

    @Mock
    private HintDao hintDao;

    private Hint hint = new Hint();

    @Before
    public void Setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void inset() {
        PowerMockito.doNothing().when(hintDao).inset(Mockito.any(Hint.class));
        hintService.inset(hint);
    }

    @Test
    public void update() {
        PowerMockito.doNothing().when(hintDao).update(Mockito.any(Hint.class));
        hintService.update(hint);
    }

    @Test
    public void delete() {
        PowerMockito.doNothing().when(hintDao).delete(Mockito.anyLong());
        hintService.delete(1100L);
    }

    @Test
    public void getHintById() {
        Mockito.when(hintDao.getHintById(Mockito.anyLong())).thenReturn(hint);
        Hint result = hintService.getHintById(111L);
        Assert.assertNotNull(result);
    }
}
