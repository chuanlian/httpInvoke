/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package rigel.nakri.service;

import rigel.nakri.bo.Hint;

/**
 * @author yangchuanlian
 * 
 */
public interface HintService {

    void inset(Hint hint);

    void update(Hint hint);

    void delete(Long hintId);

    Hint getHintById(Long hintId);
}
