package com.icode.dao;

import com.icode.core.model.AbstractEntity;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-23
 * Time: 上午1:32
 */
public interface EntityDao {

    <T extends AbstractEntity> void saveOrUpdate(T t);

    <T extends AbstractEntity> T findByGuid(Class<T> clazz, String guid);
}
