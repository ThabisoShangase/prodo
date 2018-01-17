package za.co.thecompany.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import za.co.thecompany.dao.CommonDao;
import za.co.thecompany.mapping.UserInfo;

import java.io.Serializable;
import java.util.List;

public class CommonDaoImpl implements CommonDao {

    HibernateTemplate hibernateTemplate;

    public CommonDaoImpl(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public Serializable save(Serializable entity) {
        return hibernateTemplate.save(entity);
    }

    @Override
    public void delete(Serializable entity) {
        hibernateTemplate.delete(entity);
    }

    @Override
    public void update(Serializable entity) {
        hibernateTemplate.update(entity);
    }

    @Override
    public Serializable get(Class<Serializable> entityClass, Long id) {
        return hibernateTemplate.get(entityClass, id);
    }

    @Override
    public UserInfo findUserByUsername(String username) {
        List<UserInfo> users = (List<UserInfo>)hibernateTemplate.findByNamedQueryAndNamedParam("FIND_USER_BY_USERNAME", "username", username);
        if(!users.isEmpty()) {
            return users.get(0);
        }
        return null;
    }
}
