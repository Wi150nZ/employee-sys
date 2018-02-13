import com.ibm.beans.Employee;
import com.ibm.dao.EmployeeDAO;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> employees = dao.getAllEmployees();

        for (Employee employee: employees) {
            System.out.println(employee.getID());
        }

////      the nuke entry
//        dao.deleteEmployee(11);
//        dao.deleteEmployee(21);
//        dao.deleteEmployee(22);
//        dao.deleteEmployee(25);
//        dao.deleteEmployee(26);
        employees = dao.getAllEmployees();

        for (Employee employee: employees) {
            System.out.println(employee.getID());
        }

    }
}
