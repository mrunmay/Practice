package za.co.practice.listSortObj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortObj
{
    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "manmay", "manager"));
        employees.add(new Employee(2, "mrunmaya", "associate"));
        employees.add(new Employee(3, "chinmay", "java consultant"));
        employees.add(new Employee(4, "chinmay", "consultant"));
        employees.add(new Employee(5, "chinmay", "get"));

        Collections.sort(employees);

        for (Employee employee : employees)
        {
            System.out.println(employee.getId());
            System.out.println(employee.getName());
            System.out.println(employee.getDesignation());
        }
    }
}
