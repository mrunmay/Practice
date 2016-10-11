package za.co.practice;

public class StrToInt
{
    public static void main(String[] args)
    {
        StrToInt obj = new StrToInt();
        String str = "12345";

        System.out.println(obj.convert(str));

    }

    private int convert(String str)
    {
        int num = 0;
        int i = 0;
        while (i < str.length())
        {
            num = num * 10;
            num = num + str.charAt(i++) - '0';
        }
        return num;
    }
}
