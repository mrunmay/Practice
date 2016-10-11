package za.co.practice;

public class ReverseString
{
    public static void main(String[] args)
    {
        ReverseString obj = new ReverseString();
        String str = "noon";
        System.out.println(obj.reverse(str));

        if (str.equals(obj.reverse(str)))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }

    private String reverse(String str)
    {
        if ((str == null) || (str.length() <= 1))
        {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
