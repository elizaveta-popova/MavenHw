import java.sql.*;

public class Application {
    public static void main(String[] args) throws SQLException {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        Employee employee = new Employee(1, "Max", "Fray", "male", 34, 3);
       employeeDao.getAllEmployee().forEach(System.out::println);

       Integer employeeId = employeeDao.add(employee);
        System.out.println(employeeDao.getAllEmployee());
        employeeDao.updateEmployee(employeeDao.getById(employeeId));
        employeeDao.deleteEmployee(employeeDao.getById(employeeId));
        System.out.println(employeeDao.getById(3));
        }
    }
