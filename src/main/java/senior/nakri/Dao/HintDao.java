/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package senior.nakri.Dao;

import senior.nakri.bo.Hint;

/**
 * @author yangchuanlian
 * 
 */
public interface HintDao {

    void inset(Hint hint);

    void update(Hint hint);

    void delete(Long hintId);

    public Hint getHintById(Long hintId);
}
