package za.co.thecompany.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import za.co.thecompany.dao.CommonDao;

import java.io.Serializable;

public class CommonDaoImpl implements CommonDao {

    HibernateTemplate hibernateTemplate;

    public CommonDaoImpl(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public Serializable save(Serializable entity) {
        return hibernateTemplate.save(entity);
    }

    public void delete(Serializable entity) {
        hibernateTemplate.delete(entity);
    }

    public void update(Serializable entity) {
        hibernateTemplate.update(entity);
    }

    public Serializable get(Class<Serializable> entityClass, Long id) {
        return hibernateTemplate.get(entityClass, id);
    }
}
