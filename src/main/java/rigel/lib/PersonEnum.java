/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package rigel.lib;

/**
 * @author yangchuanlian
 * 
 */
public enum PersonEnum {

    NEW(0, "新录入"),

    AUDITED(1, "已审核");

    private PersonEnum(Integer id, String desc) {
        this.value = id;
        this.desc = desc;
    }

    private Integer value;

    private String desc;

    /**
     * @return the value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
