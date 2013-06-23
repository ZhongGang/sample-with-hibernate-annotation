package com.icode.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-22
 * Time: 下午4:11
 */
@Entity
@Table(name = "shop")
public class Shop extends AbstractEntity {
    @Column
    private String name;

    @Column
    private String description;

    public Shop() {
    }

    public Shop(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
