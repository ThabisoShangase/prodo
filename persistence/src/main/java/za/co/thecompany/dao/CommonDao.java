package za.co.thecompany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.orm.hibernate5.HibernateTemplate;
import za.co.thecompany.mapping.UserInfo;

import java.io.Serializable;

public interface CommonDao {

    Serializable save(Serializable entity);

    void delete(Serializable entity);

    void update(Serializable entity);

    Serializable get(Class<Serializable> entityClass, Long id);

    UserInfo findUserByUsername(String username);
}
