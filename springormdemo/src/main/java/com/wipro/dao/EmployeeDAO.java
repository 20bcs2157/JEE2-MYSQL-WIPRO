package com.wipro.dao;




import com.wipro.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public class EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional // ✅ Added at method level
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(employee);
    }

    @Transactional
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Employee", Employee.class).list();
    }

    @Transactional
    public Employee getEmployeeById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }
}
