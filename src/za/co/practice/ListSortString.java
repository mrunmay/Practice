package za.co.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortString
{
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<String>();
        strings.add("Mrunmaya");
        strings.add("Manmay");
        strings.add("Chinmay");

        Collections.sort(strings);

        for (String str : strings)
        {
            System.out.println(str);
        }
    }
}
