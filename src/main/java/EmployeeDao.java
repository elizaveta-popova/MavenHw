import java.util.List;

public interface EmployeeDao {

    Integer add (Employee employee);
    Employee getById(int id);
    List<Employee> getAllEmployee();
    void updateEmployee(Employee employee);
    void deleteEmployee (Employee employee);
}
