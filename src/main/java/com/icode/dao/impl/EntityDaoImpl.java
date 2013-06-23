package com.icode.dao.impl;

import com.icode.core.model.AbstractEntity;
import com.icode.dao.EntityDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-23
 * Time: 上午1:32
 */
public class EntityDaoImpl implements EntityDao {

    @Autowired
    protected SessionFactory sessionFactory;


    @Override
    public <T extends AbstractEntity> void saveOrUpdate(T t) {
        sessionFactory.getCurrentSession().persist(t);
    }

    @Override
    public <T extends AbstractEntity> T findByGuid(Class<T> clazz, String guid) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }
}
