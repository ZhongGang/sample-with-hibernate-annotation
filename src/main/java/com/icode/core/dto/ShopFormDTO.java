package com.icode.core.dto;

import com.icode.core.model.Shop;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-22
 * Time: 下午11:11
 */
public class ShopFormDTO {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Shop toShop() {
        return new Shop(this.name, this.description);
    }
}
