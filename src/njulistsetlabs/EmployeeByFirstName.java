package njulistsetlabs;

import java.util.Comparator;

/**
 *
 * @author Neil Urban
 * Version: 1.0
 */
public class EmployeeByFirstName implements Comparator<Employee> {
//class implements Comparator with generic type Employee.
    
    //class must override compare method -- which, in this case, compares
    //the first names of two employee objects -- o1, o2.
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
    
}
