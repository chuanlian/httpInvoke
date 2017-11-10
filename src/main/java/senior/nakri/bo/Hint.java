/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package senior.nakri.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yangchuanlian
 * 
 */
public class Hint implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long hintId;
    private String companyName;
    private Date createTime;

    public Long getHintId() {
        return hintId;
    }

    public void setHintId(Long hintId) {
        this.hintId = hintId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Hint [hintId=" + hintId + ", companyName=" + companyName + ", createTime=" + createTime + "]";
    }

}
