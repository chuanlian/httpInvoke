/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package rigel.lib;

/**
 * @author yangchuanlian
 * 
 */
public enum StatusEnum {

    NEW(0, "描述");

    private StatusEnum(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    private int id;

    private String desc;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
