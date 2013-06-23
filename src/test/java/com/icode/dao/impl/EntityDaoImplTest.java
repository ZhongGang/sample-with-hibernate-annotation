package com.icode.dao.impl;

import com.icode.core.model.Shop;
import com.icode.web.startup.HibernateStartupConfig;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-23
 * Time: 下午1:41
 */
@ContextConfiguration(classes = HibernateStartupConfig.class)
public class EntityDaoImplTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    private SessionFactory sessionFactory;

    @Test
    @Transactional
    public void testSaveOrUpdate() throws Exception {
        Shop shop = new Shop("Shop1", "Shop111111111");
        sessionFactory.getCurrentSession().persist(shop);
    }
}
