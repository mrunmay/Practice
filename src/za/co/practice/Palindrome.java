package za.co.practice;

public class Palindrome
{
    public static void main(String[] args)
    {
        Palindrome obj = new Palindrome();
        for (int i = 1; i <= 100; i++)
        {
            if (i == obj.reverse(i))
            {
                System.out.print(i + " ");
            }
        }
    }

    private int reverse(int number)
    {
        int reverse = 0;
        while (number > 0)
        {
            reverse = reverse * 10 + (number % 10);
            number = number / 10;
        }
        return reverse;
    }
}
