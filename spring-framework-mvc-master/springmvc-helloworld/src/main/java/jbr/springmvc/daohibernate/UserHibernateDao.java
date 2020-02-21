package jbr.springmvc.daohibernate;

import java.util.List;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface UserHibernateDao {
  void register(User user);
  User validateUser(Login login);
  List<User> getAlluser();
 }