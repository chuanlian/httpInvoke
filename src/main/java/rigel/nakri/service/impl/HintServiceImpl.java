/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package rigel.nakri.service.impl;

import javax.annotation.Resource;

import org.springframework.util.Assert;

import rigel.nakri.Dao.HintDao;
import rigel.nakri.bo.Hint;
import rigel.nakri.service.HintService;

/**
 * @author yangchuanlian
 * 
 */
public class HintServiceImpl implements HintService {

    @Resource(name = "hintDao")
    private HintDao hintDao;

    @Override
    public Hint getHintById(Long hintId) {
        Assert.notNull(hintId, "hintId is null");
        return hintDao.getHintById(hintId);
    }

    @Override
    public void inset(Hint hint) {
        hintDao.inset(hint);
    }

    @Override
    public void update(Hint hint) {
        hintDao.update(hint);
    }

    @Override
    public void delete(Long hintId) {
        hintDao.delete(hintId);
    }

}
