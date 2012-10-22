package njulistsetlabs;

import java.util.*;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Neil Urban
 * Version: 1.0
 */

public class Employee implements Comparable {
    
    /**
     * Lab 1 was to create equals, hashCode, toString, and compareTo methods in
     * the employee class. Install and imported apache library and javadoc to
     * be able to access compareTo method.
     */
    
    private String lastName;
    private String firstName;
    private String ssn;
    private String employeeID;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    /**
     * To demonstrate the importance of overiding this method, which is
     * inherited from the Object class, try commenting it out, as well as
     * the hashCode method below. Does object comparison work as expected?
     * Does the Set remove duplicates correctly? The answer to both questions
     * will be "no".
     *
     * NOTE: Whenever you override equals you MUST also override hashCode
     * (see below). Both methods should be based on the same class properties.
     *
     * @param obj - the target object to which you are comparing the current
     * object (this).
     *
     * @return true if equal (based on the implementation of this method);
     * false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if ((this.ssn == null) || (other.ssn == null)) {
            return false;
        } else if(!this.ssn.equals(other.ssn)) {
            return false;
        }

        return true;
    }

    /**
     * Whenever you override equals you MUST override this method as well.
     * A hashcode is a calculated value that optimizes the way various "Hash"
     * based data structures store and retrieve data. Without a correctly
     * implemented hashCode method, storage and retrieval will be unreliable
     * and slow. This method relies on a proper implementation of equals to
     * resolve collisions (two objects with identical hashCodes but different
     * from the perspective of equals). Both methods should be based on the
     * same class properties.
     *
     * @return the hash value which may or may not be unique among similar
     * objects. The hash value is only used to determine a "bucket" used by
     * "Hash" structures for storage. A bucket is not a memory location;
     * rather it is a symbolic pointer to a group of objects. The quality
     * of the hash value (the odds of it being unique) determines that
     * speed and reliability of the storage/retrieval capabilities of a Hash
     * structure.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.ssn != null ? this.ssn.hashCode() : 0);
        return hash;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee)o;
        
        return new CompareToBuilder()
               .append(this.employeeID, e.employeeID)
               .toComparison();
    }

    
}
