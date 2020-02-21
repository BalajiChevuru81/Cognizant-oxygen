package jbr.springmvc.servicehibernate;


import java.util.List;

import jbr.springmvc.model.Login;

import jbr.springmvc.model.User;

public interface UserHibernateService {

 void register(User user);

 User validateUser(Login login);

 List<User> getAlluser();

}