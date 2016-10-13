package za.co.practice.listSortObj;

import java.util.Comparator;

public class Employee implements Comparable<Employee>
{
    /**
     * Static class
     */
    /*public static class ReverseDesignationComparator implements Comparator<Employee>
    {
        @Override
        public int compare(Employee e1, Employee e2)
        {
            return - (e1.getDesignation().compareTo(e2.getDesignation()));
        }
    }*/

    private int id;
    private String name;
    private String  designation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    @Override
    public int compareTo(Employee e)
    {
        /**
         * Sort by Id (Integer)
         * To use reverse order by Id -(this.getName().compareTo(e.getName()))
         */
//        return this.id - e.getId();

        /**
         * Sort by Name (String)
         */
//        return this.getName().compareTo(e.getName());

        /**
         * In case the name is equal for 2 employees then sort as per designation
         */
        if (this.name.compareTo(e.getName()) == 0)
        {
            return this.designation.compareTo(e.getDesignation());
        }
        else
        {
            return this.name.compareTo(e.getName());
        }
    }
}
