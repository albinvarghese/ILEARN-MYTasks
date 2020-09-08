package com.uviqo.com.ILearSignUp.Repository;




import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uviqo.com.ILearSignUp.Model.User;



@Repository
public class UserDAOImpl {

    @Autowired
    private EntityManager em;

    public User save(User user) {
        Session session = em.unwrap(Session.class);
        session.persist(user);
        return user;
    }

}