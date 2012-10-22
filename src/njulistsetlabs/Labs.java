package njulistsetlabs;

import java.util.*;

/**
 *
 * @author Neil Urban Version: 1.0
 */
public class Labs {

    public static void main(String[] args) {

        /**
         * Lab #2
         */
        //employee objects
        Employee e1 = new Employee("Urban", "Neil", "111-11-1111");
        Employee e2 = new Employee("Blow", "Joe", "222-22-2222");
        Employee e3 = new Employee("Smith", "Adam", "333-33-3333");
        Employee e4 = new Employee("Doe", "John", "222-22-2222");

        //add objects to a new HashSet
        Set<Employee> hashSet = new HashSet<Employee>();
        hashSet.add(e1);
        hashSet.add(e2);
        hashSet.add(e3);
        hashSet.add(e4);

        //output contents of the HashSet
        System.out.println("Contents of hashSet...");
        for (Employee e : hashSet) {
            System.out.println(e);
        }

        //Pass the HashSet hashSet to a new 
        List<Employee> list = new ArrayList<Employee>(hashSet);

        System.out.println("\nContents of list containing hashSet data...");
        hashSet.clear();
        hashSet.addAll(list);
        for (Employee e : list) {
            System.out.println(e);
        }

        /**
         * Lab #3
         */
        //create a new HashMap object (hashMap) with generic types String and Employee
        //because ssn has a duplicate, it cannot be the key. I've chosen the Last Name
        //field as an alternative, because each employee has a unique last name.
        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Urban", e1);
        hashMap.put("Blow", e2);
        hashMap.put("Smith", e3);
        hashMap.put("Doe", e4);

        System.out.println("\nContents of the HashMap...");
        //create a keyset
        Set<String> hashKeys = hashMap.keySet();
        //for-each loop which outputs the data for each key in the HashMap
        for (String key : hashKeys) {
            Employee found = hashMap.get(key);
            System.out.println(found.toString());
        }

        /**
         * Lab #4
         */
        //create a new TreeMap object (treeMap) with generic types String and Employee;
        //because ssn has a duplicate, it cannot be the key. I've chosen the Last Name
        //field as an alternative, because each employee has a unique last name.
        Map<String, Employee> treeMap = new TreeMap<String, Employee>();
        treeMap.put("Urban", e1);
        treeMap.put("Blow", e2);
        treeMap.put("Smith", e3);
        treeMap.put("Doe", e4);

        System.out.println("\nContents of the HashMap...");
        //create a keyset
        Set<String> treeKeys = treeMap.keySet();
        //for-each loop which outputs the data for each key in the HashMap
        for (String key : treeKeys) {
            Employee found = treeMap.get(key);
            System.out.println(found.toString());
        }

        /**
         * Lab #5
         */
        //add objects to a new TreeSet
        Set<Employee> empTree = new TreeSet<Employee>();
        empTree.add(e1);
        empTree.add(e2);
        empTree.add(e3);
        empTree.add(e4);

        Iterator itr = empTree.iterator();

        System.out.println("\nSize of treeSet..." + empTree.size());
        System.out.println("Contents of treeSet...");
        //output contents of the TreeSet
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
