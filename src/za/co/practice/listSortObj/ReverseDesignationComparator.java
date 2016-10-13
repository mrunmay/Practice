package za.co.practice.listSortObj;

import java.util.Comparator;

public class ReverseDesignationComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee e1, Employee e2)
    {
        return - (e1.getDesignation().compareTo(e2.getDesignation()));
    }
}
