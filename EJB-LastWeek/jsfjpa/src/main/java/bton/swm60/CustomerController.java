package bton.swm60;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.transaction.UserTransaction;

@ManagedBean
public class CustomerController {

//@Resource(name = "jdbc/__default")
  private DataSource dataSource;
//@PersistenceUnit(unitName = "customerPersistenceUnit")
@PersistenceContext (unitName="customerPersistenceUnit")
EntityManager em;
//private EntityManagerFactory entityManagerFactory;
  @Resource
  private UserTransaction utx;
  @ManagedProperty(value = "#{customer}")
  private Customer customer;

  public String saveCustomer() {
    String returnValue = "customer_saved";
    try {
      utx.begin();
      em.persist(customer);
      utx.commit();
    } catch (Exception e) {
      e.printStackTrace();
      returnValue = "error_saving_customer";
    }

    return returnValue;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
